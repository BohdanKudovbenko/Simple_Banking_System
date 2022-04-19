package banking;

import java.util.Random;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {


    public static void createNewDatabase(String fileName) {

        String url = "jdbc:sqlite:card.s3db";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static int bankAccountMenu() {
        System.out.println("1. Create an account\n" +
                "2. Log into account\n" +
                "0. Exit");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static int balanceMenu() {
        System.out.println("1. Balance\n" +
                "2. Log out\n" +
                "0. Exit");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static String enterCard() {
        System.out.println("Enter your card number: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }


    private static String enterPin() {
        System.out.println("Enter your PIN:");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }


    public static void main(String[] args) {
        createNewDatabase("card.db");
        Random random = new Random();

        boolean isOn = true;
        boolean isLoggedIn = false;

        class BankAccount {
            private String card;
            private String pin;

            public String getCard() {
                return card;
            }

            private int intervalLength(int lower, int upper) {
                int intervalLength = upper - lower + 1;
                return (random.nextInt(intervalLength) + lower);
            }

            private String genCard() {
                int lower = 111_111_111;
                int upper = 888_888_888;

                int checkSum;
                int sum = 0;

                card = "400000" + String.format("%09d", intervalLength(lower, upper));

                String[] arrayString = card.split("(?<=\\G.{1})");

                for (int i = 0; i < arrayString.length; i++) {
                    int temp = Integer.parseInt(arrayString[i]);
                    if (i % 2 == 0) {
                        temp = temp * 2;
                    }
                    if (temp > 9) {
                        temp = temp - 9;
                    }
                    sum += temp;
                }


                checkSum = (10 - sum % 10) % 10;

                String[] arrayString2 = new String[arrayString.length + 1];
                System.arraycopy(arrayString, 0, arrayString2, 0, arrayString.length);

                arrayString2[arrayString2.length - 1] = String.valueOf(checkSum);

                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < arrayString2.length; i++) {
                    sb.append(arrayString2[i]);
                }
                return sb.toString();


            }


            public void setCard() {
                this.card = genCard();
            }

            public String getPin() {
                return pin;
            }

            public void setPin() {
                pin = String.format("%04d", random.nextInt(9999));

            }


        }


        BankAccount bank1 = new BankAccount();

        while (isOn == true && isLoggedIn == false) {

            switch (bankAccountMenu()) {
                case 1:
                    bank1.setCard();
                    System.out.println("Your card has been created");
                    System.out.println("Your card number:");
                    System.out.println(bank1.getCard());
                    bank1.setPin();
                    System.out.println("Your card PIN:");
                    System.out.println(bank1.getPin() + "\n");
                    break;
                case 2:
                    //loginAccount;
                    String tempCardNumber = enterCard();
                    String tempCardPin = enterPin();
                    if (bank1.getCard().equals(tempCardNumber) && (bank1.getPin().equals(tempCardPin))) {
                        isLoggedIn = true;
                        System.out.println("You have successfully logged in!\n");
                        while (isOn == true && isLoggedIn == true) {
                            switch (balanceMenu()) {
                                case 1:
                                    // balance
                                    System.out.println("Balance: 0\n");
                                    break;
                                case 2:
                                    // log out
                                    isLoggedIn = false;
                                    System.out.println("You are successfully logged out!\n");
                                    break;
                                case 0:
                                    // exit
                                    System.out.println("Bye!\n");
                                    return;
                                default:
                                    System.out.println("Unknown value");
                            }
                        }

                    } else {
                        System.out.println("Wrong card number or pin!\n");
                    }
                    break;
                case 0:
                    System.out.println("Bye!\n");
                    isOn = false;
                    break;
                default:
                    System.out.println("Unknown value");
            }
        }


    }

}



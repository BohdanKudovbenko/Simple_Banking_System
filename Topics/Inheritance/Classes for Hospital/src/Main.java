

class Person {
    protected String name;
    protected int yearOfBirth;
    protected String address;

}

class Employee extends Person {
    protected String contractNumber;
    protected Long salary;

}

class Doctor extends Employee {
    protected String degree;

}

class Patient extends Person {
    protected String diagnose;
}
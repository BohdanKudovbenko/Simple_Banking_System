
class BigIntegerConverter {

    /**
     * @param number string representing the number
     * @return BigInteger instance
     */
    public static Number getBigInteger(String number) {
        // java.math.BigInteger bg = new java.math.BigInteger(String.valueOf(x * 200));
        return new java.math.BigInteger(number);

    }
}
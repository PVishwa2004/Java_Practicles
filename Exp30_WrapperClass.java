public class Exp30_WrapperClass {
    public static void main(String[] args) {
        // Example 1: Integer.valueOf()
        int intValue = 10;
        Integer integerValue = Integer.valueOf(intValue);
        System.out.println("Integer value of intValue: " + integerValue);

        // Example 2: Double.parseDouble()
        String doubleString = "3.14";
        Double doubleValue = Double.parseDouble(doubleString);
        System.out.println("Parsed double value: " + doubleValue);

        // Example 3: Character.isDigit()
        char character = '7';
        boolean isDigit = Character.isDigit(character);
        System.out.println("Is character a digit? " + isDigit);

        // Example 4: Boolean.compare()
        Boolean bool1 = true;
        Boolean bool2 = false;
        int compareResult = Boolean.compare(bool1, bool2);
        System.out.println("Comparison result: " + compareResult);

        // Example 5: Long.toHexString()
        long longValue = 123456789L;
        String hexString = Long.toHexString(longValue);
        System.out.println("Hexadecimal representation: " + hexString);
    }
}

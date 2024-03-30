public class Exp32_StringClass {
    public static void main(String[] args) {
        // Example 1: length()
        String str1 = "Hello";
        int length = str1.length();
        System.out.println("Length of the string \"" + str1 + "\" is: " + length);

        // Example 2: charAt()
        char charAtIndex2 = str1.charAt(2);
        System.out.println("Character at index 2 in \"" + str1 + "\" is: " + charAtIndex2);

        // Example 3: substring()
        String substring = str1.substring(2);
        System.out.println("Substring from index 2 onwards in \"" + str1 + "\" is: " + substring);

        // Example 4: toUpperCase()
        String upperCaseStr = str1.toUpperCase();
        System.out.println("Uppercase of \"" + str1 + "\" is: " + upperCaseStr);

        // Example 5: indexOf()
        String str2 = "world";
        int indexOfSubstring = str1.indexOf("lo");
        int indexOfSubstring2 = str1.indexOf(str2);
        System.out.println("Index of substring \"lo\" in \"" + str1 + "\" is: " + indexOfSubstring);
        System.out.println("Index of substring \"" + str2 + "\" in \"" + str1 + "\" is: " + indexOfSubstring2);
    }
}

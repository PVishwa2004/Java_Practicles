public class Exp33_StringBufferClass {
    public static void main(String[] args) {
        // Example 1: append()
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        System.out.println("After append: " + stringBuffer);

        // Example 2: insert()
        stringBuffer.insert(5, " Java");
        System.out.println("After insert: " + stringBuffer);

        // Example 3: delete()
        stringBuffer.delete(5, 10);
        System.out.println("After delete: " + stringBuffer);

        // Example 4: reverse()
        stringBuffer.reverse();
        System.out.println("After reverse: " + stringBuffer);

        // Example 5: replace()
        stringBuffer.replace(0, 5, "Hi");
        System.out.println("After replace: " + stringBuffer);
    }
}

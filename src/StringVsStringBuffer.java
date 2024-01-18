public class StringVsStringBuffer {
    public static void main(String[] args) {
        // Using String
        String str = "Hello";
        str += " ";
        str += "World";
        System.out.println("String: " + str);

        // Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World");
        System.out.println("StringBuffer: " + stringBuffer.toString());
    }
}

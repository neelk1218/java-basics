public class PrimitiveDataTypes {
    public static void main(String[] args) {

        // Integer type primitives
        byte byteValue = 100;          // 1 byte
        short shortValue = 32000;      // 2 bytes
        int intValue = 100000;         // 4 bytes
        long longValue = 9876543210L;  // 8 bytes

        // Floating point primitives
        float floatValue = 10.5f;      // 4 bytes
        double doubleValue = 99.99;    // 8 bytes

        // Character and boolean
        char charValue = 'A';          // 2 bytes
        boolean booleanValue = true;   // true / false

        // Output
        System.out.println("byte value    : " + byteValue);
        System.out.println("short value   : " + shortValue);
        System.out.println("int value     : " + intValue);
        System.out.println("long value    : " + longValue);
        System.out.println("float value   : " + floatValue);
        System.out.println("double value  : " + doubleValue);
        System.out.println("char value    : " + charValue);
        System.out.println("boolean value : " + booleanValue);
    }
}

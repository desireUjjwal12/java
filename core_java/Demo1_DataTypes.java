class Demo1_DataTypes{
    public static void main(String[] args) {
        // Primitive Data Types
        byte byteVar = 100;               // 1 byte
        short shortVar = 30000;           // 2 bytes
        int intVar = 100000;              // 4 bytes
        long longVar = 10_00_00_00_000L;      // 8 bytes (suffix L is required)

        float floatVar = 10.5f;           // 4 bytes (suffix f is required)
        double doubleVar = 20e10;     // 8 bytes

        char charVar = 'A';               // 2 bytes (Unicode character)
        boolean boolVar = true;           // 1 bit (true/false), In java int cannot be converted to boolean

        // Reference Data Type
        String stringVar = "Hello, Java!"; // String is a class (non-primitive)

        System.out.println("Byte Value: " + byteVar);
        System.out.println("Short Value: " + shortVar);
        System.out.println("Int Value: " + intVar);
        System.out.println("Long Value: " + longVar);
        System.out.println("Float Value: " + floatVar);
        System.out.println("Double Value: " + doubleVar);
        System.out.println("Char Value: " + charVar);
        System.out.println("Boolean Value: " + boolVar);
        System.out.println("String Value: " + stringVar);
    }
}    

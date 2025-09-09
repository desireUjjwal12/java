class Demo1_DataTypes{
    public static void main(String[] args) {
        // 🔹 Primitive Data Types
        byte byteVar = 100;               // 1 byte
        short shortVar = 30000;           // 2 bytes
        int intVar = 100000;              // 4 bytes
        long longVar = 10000000000L;      // 8 bytes (suffix L is required)

        float floatVar = 10.5f;           // 4 bytes (suffix f is required)
        double doubleVar = 20.123456;     // 8 bytes

        char charVar = 'A';               // 2 bytes (Unicode character)
        boolean boolVar = true;           // 1 bit (true/false)

        // 🔹 Reference Data Type
        String stringVar = "Hello, Java!"; // String is a class (non-primitive)

        // 🔹 Print all variables
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


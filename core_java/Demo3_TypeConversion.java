public class Demo3_TypeConversion {
    int a = 257;
    byte b = (byte) a; // explicit casting
    // byte range is -128 to 127, so 257-256 = 1
    float f = 10.5f;
    int i = (int) f; // explicit casting, decimal part will be truncated
    double d = f; // implicit casting, float to double

    byte num1 = 10;
    byte num2 = 30;

    int result = num1 * num2; // implicit casting, byte to int during multiplication (Type Promotion)

    public static void main(String[] args) {
        Demo3_TypeConversion obj = new Demo3_TypeConversion();
        System.out.println("Value of a: " + obj.a);
        System.out.println("Value of b (after casting a to byte): " + obj.b);
        System.out.println("Value of f: " + obj.f);
        System.out.println("Value of i (after casting f to int): " + obj.i);
        System.out.println("Value of d (after implicit casting f to double): " + obj.d);
        System.out.println("Result of num1 * num2 (after implicit casting byte to int): " + obj.result);
    }
}

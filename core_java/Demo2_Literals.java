// literals --> A literal is fixed value that you assign to a variable.
public class Demo2_Literals {
    int num1 = 0b101; // binary literal
    int num2 = 010; // octal literal
    int num3 = 10; // decimal literal
    int num4 = 0x10; // hexadecimal literal
    float f1 = 10.5f; // float literal
    double d1 = 10.5; // double literal
    char c1 = 'A'; // character literal
    String str1 = "Hello"; // string literal
    boolean b1 = true; // boolean literal
    public static void main(String[] args) {
        Demo2_Literals obj = new Demo2_Literals();
        System.out.println("Binary literal: " + obj.num1);
        System.out.println("Octal literal: " + obj.num2);
        System.out.println("Decimal literal: " + obj.num3);
        System.out.println("Hexadecimal literal: " + obj.num4);
        System.out.println("Float literal: " + obj.f1);
        System.out.println("Double literal: " + obj.d1);
        System.out.println("Character literal: " + obj.c1);
        System.out.println("String literal: " + obj.str1);
        System.out.println("Boolean literal: " + obj.b1);
    }
}

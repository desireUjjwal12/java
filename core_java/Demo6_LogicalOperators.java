public class Demo6_LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND (&&)
        System.out.println("a && b = " + (a && b));  // true AND false → false
        System.out.println("a && true = " + (a && true));  // true AND true → true

        // Logical OR (||)
        System.out.println("a || b = " + (a || b));  // true OR false → true
        System.out.println("b || false = " + (b || false));  // false OR false → false

        // Logical NOT (!)
        System.out.println("!a = " + (!a));  // NOT true → false
        System.out.println("!b = " + (!b));  // NOT false → true

        // Using in expressions
        int x = 10, y = 20, z = 30;
        System.out.println("(x < y) && (y < z) = " + ((x < y) && (y < z))); // true && true → true
        System.out.println("(x > y) || (y < z) = " + ((x > y) || (y < z))); // false || true → true
        System.out.println("!((x + y) > z) = " + (!((x + y) > z))); // !(30 > 30) → !(false) → true
    }
}

public class Demo8_Loops {
    public static void main(String[] args) {
        
        // 🔹 1. while loop (prints numbers 1 to 5)
        int i = 1;
        System.out.println("While Loop:");
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        // 🔹 2. for loop (prints numbers 1 to 5)
        System.out.println("\nFor Loop:");
        for (int j = 1; j <= 5; j++) {
            System.out.println("j = " + j);
        }

        // 🔹 3. do-while loop (prints numbers 1 to 5)
        int k = 1;
        System.out.println("\nDo-While Loop:");
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);
    }
}

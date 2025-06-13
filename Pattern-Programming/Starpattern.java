public class Starpattern {

    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
    // Step 1: Print spaces
    for (int space = 1; space <= n - i; space++) {
        System.out.print(" ");
    }

    // Step 2: Print stars with space after each
    for (int star = 1; star <= i; star++) {
        System.out.print("* ");
    }

    // Move to next line
    System.out.println();
}

    }
}
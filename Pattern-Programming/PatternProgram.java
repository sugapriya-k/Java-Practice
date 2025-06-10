
public class PatternProgram {

    public static void main(String[] args) {
        int n = 6, i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j || j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        numbertriangle(n);
    }

    public static void numbertriangle(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}

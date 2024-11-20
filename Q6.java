public class Q6 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Veuillez fournir un nombre d'étoiles en paramètre.");
            return;
        }
        try {
            int n = Integer.parseInt(args[0]);
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("Y");
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("Le paramètre doit être un entier.");
        }
    }
}

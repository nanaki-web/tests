import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        System.out.println("Donner le nombre de ligne pour réaliser le triangle");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        for (int i = 0; i < nb; i++)
        {
            for (int j = 0; j < nb - i; j++)
            {
                System.out.println(" ");
            }
            for (int k = 0; k <= i; k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}

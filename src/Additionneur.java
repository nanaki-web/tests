import java.util.Scanner;



public class Additionneur {
    public static void main(String[] args) {
        System.out.println("donner un nombre1");
        Scanner sc = new Scanner(System.in);
        int nombre1 = sc.nextInt();
        System.out.println("Donner un nombre2");
        Scanner nb2 = new Scanner(System.in);
        int nombre2 =nb2.nextInt();
        int resultat = nombre1 + nombre2;
        System.out.println(nombre1 +"+"+ nombre2 +"=" + resultat);

    }
}

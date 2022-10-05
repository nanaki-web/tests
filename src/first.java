import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        System.out.println("Bonjour qui es-tu?");
        Scanner sc = new Scanner(System.in);
        String  nom = sc.next();
        System.out.println("Bonjour "+nom);
    }
}

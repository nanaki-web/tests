
import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        System.out.println("donner la température en Fahrenheit");
        Scanner sc = new Scanner(System.in);
        int Fahrenheit = sc.nextInt();
        float x = (float) 1.8;
        int Celsius = (int) ((Fahrenheit - 32) / x);
        System.out.println("La valeur de  "+  Fahrenheit + "Fahrenheit est egal à  " + Celsius + " Celsius" );
    }
}

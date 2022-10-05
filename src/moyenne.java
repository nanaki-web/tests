

public class moyenne {
    public static void main(String[] args) {
        int n3 = 11 , n2 = 6 , n1 = 10 ;
        int resultat3 = n3 * 3;
        int resultat2 = n2 * 2;
        int resultat1 = n1 * 1;
        int coefficientTotal = 3+2+1;
        float totalResultat = resultat1 + resultat2 + resultat3;

        double moyenne = totalResultat / coefficientTotal;
        double resultat = Math.round(moyenne * 100.0) / 100.0;
        System.out.println(resultat);
    }
}

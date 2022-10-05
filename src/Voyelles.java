public class Voyelles {
    public static void main(String[] args) {
        String chaine = "Triangle";
        int voyelle = 0;
        int taille = chaine.length();
        for (int i = 0; i < taille; i++)
        {
            char lettre = chaine.charAt(i);
            if( lettre == 'a' || lettre == 'e' || lettre == 'i' || lettre == 'o' || lettre == 'u' || lettre == 'y')
            {
                voyelle++;
            }

        }
        System.out.println("Nombre de voyelles: " + voyelle);
    }
}

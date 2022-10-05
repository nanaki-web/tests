public class Lait {
    public static void main(String[] args) {
        int nx = 0 ;
        for (nx = 0 ; nx < 10 ; nx++)
        {
            if(nx == 5)
                continue;
            //revient au début de la boucle avec nx=6
            System.out.println("lait");
        }
    }
}

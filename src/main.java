import java.util.ArrayList;

/**
 * Classe main du programme.
 */
public class main {
    /**
     * Main.
     *
     */
    public static void main(String[] args){
        int choix;
        Animaux a1 = new Animaux(12, 0.2, "canard");
        Animaux a2 = new Animaux(3, 0.3, "poulet");
        Animaux a3 = new Animaux(11, 0.2, "canard");
        Animaux a4 = new Animaux(15, 0.2, "poulet");
        Animaux a5 = new Animaux(17, 0.1, "canard");

        ArrayList <Animaux> listeAnimaux = new ArrayList<>();

        listeAnimaux.add(a1);
        listeAnimaux.add(a2);
        listeAnimaux.add(a3);
        listeAnimaux.add(a4);
        listeAnimaux.add(a5);


        Terminal.ecrireString("La vente concerne quel animal ?\n1 - Canard\n2 - Poulet\n");
        choix = Terminal.lireInt();
        // Asking the user to choose between a duck or a chicken.
        if (choix == 1) {
            Terminal.ecrireStringln(Canard.calculPrixCanard());
        } else if(choix == 2) {
            Terminal.ecrireStringln(Poulet.calculPrixPoulet());
        }

    }

}

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * The type Poulet.
 */
public class Poulet extends Animaux {
    /**
     * The Prix de jour.
     */
    static double prixDeJour;

    /**
     * La quantite de viande souhaitee.
     */
    static double quantite = 0;

    /**
     * Instantiates a new Poulet.
     *
     * @param numeroId   the numero id
     * @param poidsJeune the poids jeune
     * @param type       the type
     */
    public Poulet(int numeroId, int poidsJeune, String type) {
        super(numeroId, poidsJeune, type);
    }

    /**
     * Demand prix de jour double.
     *
     * @return the double
     */
    public static double demandPrixDeJour(){
        Terminal.ecrireStringln("Entrez le prix au kilogramme : ");
        prixDeJour = Terminal.lireDouble();
        return prixDeJour;
    }
    /**
     * Quantite souhaitee double.
     *
     * @return the double
     */
    public static double quantiteAbattue(){
        Terminal.ecrireStringln("Combien pèse la bête abattue ?");
        quantite = Terminal.lireDouble();
        return quantite;
    }
    /**
     * Calcul prix canard double.
     *
     * @return the double
     */
    public static String calculPrixPoulet(){
        DecimalFormat df = new DecimalFormat("###.###");
        return "le prix est de : " + df.format(demandPrixDeJour()*quantiteAbattue()) + "€";
    }
}

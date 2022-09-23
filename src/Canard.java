import java.text.DecimalFormat;

/**
 * class Canard.
 */
public class Canard extends Animaux{
    /**
     * Le prix au kg.
     */
    static double prixDeJour;
    /**
     * La quantite de viande abattue.
     */
    static double quantite = 0;

    /**
     * Instantiates a new Canard.
     *
     * @param numeroId   the numero id
     * @param poidsJeune the poids jeune
     * @param type       the type
     */
    public Canard(int numeroId, double poidsJeune, String type) {
        super(numeroId, poidsJeune, type);
    }

    /**
     * Demande le prix du jour double.
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
    public static String calculPrixCanard(){
        DecimalFormat df = new DecimalFormat("###.###");
        return "le prix est de : " + df.format(demandPrixDeJour()*quantiteAbattue()) + "€";
    }

}

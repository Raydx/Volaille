/**
 * It's a class that creates an animal object with a number, weight and type.
 */
import java.util.ArrayList;

/**
 * The type Animaux.
 */
public class Animaux {
    /**
     * The Numero id.
     */
    int numeroId;
    /**
     * The Poids jeune.
     */
    double poidsJeune;
    /**
     * The Type.
     */
    String type;

    /**
     * Instantiates a new Animaux.
     *
     * @param numeroId   the numero id
     * @param poidsJeune the poids jeune
     * @param type       the type
     */
    public Animaux(int numeroId, double poidsJeune, String type) {
        this.numeroId = numeroId;
        this.poidsJeune = poidsJeune;
        this.type = type;
    }

    /**
     * Type animaux.
     */
    public static void typeAnimaux(){
    ArrayList <Animaux> listeAnimaux = new ArrayList<>();
      for (int i = 0; i < listeAnimaux.size(); i++) {
        if(listeAnimaux.get(i).type.equals("canard")){

        }
    }
    }

}

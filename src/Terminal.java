import java.io.*;
import java.util.*;

/**
 * The Terminal class allows to realize its first Java programs by allowing to display in the console of execution of data of different type, and by allowing to enter on the keyboard data of different type. <BR>
 * It also allows to read and write a text file This class contains only static methods.
 */
public class Terminal{

    // Le buffer standard  de lecture = le clavier
    private static BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));


    /**
     * Lire fichier texte string [ ].
     *
     * @param nomFichier the nom fichier
     * @return the string [ ]
     */
    public static String[] lireFichierTexte(String nomFichier)
    {
        try{
            File fichier = new File(nomFichier);
            FileInputStream fis = new FileInputStream(new File(nomFichier));

            byte[] buffer = new byte[(int)fichier.length()];
            fis.read(buffer);
            fis.close();
            String str = new String(buffer);

            // On enleve le caract�re '\r' code 13 qui est ajout� en Windows
            // Les fins de ligne dans un fichier texte cr�� sous Windows
            //  se termine par \r\n.
            // Il faut enlever le \r car il a des effets perturbant sur
            //  la m�thode System.out.print et est pris comme un caract�re de plus
            //  qu'il faut �liminer
            //
            String texte = str.replaceAll(""+(char)(13),"");

            // Les lignes du fichier sont mises dans un tableau
            //
            String[] mots = texte.split("\n");

            return(mots);
        }
        catch(Exception ex)
        {
            exceptionHandler(ex);
        }
        return null;
    }

    /**
     * Ecrire fichier.
     *
     * @param nomFichier the nom fichier
     * @param strbuf     the strbuf
     */
    public static void ecrireFichier(String nomFichier,
                                     StringBuffer strbuf)
    {
        try{
            File fichier = new File(nomFichier);
            FileOutputStream fos = new FileOutputStream(new File(nomFichier));

            byte[] buffer = strbuf.toString().getBytes();
            fos.write(buffer);
            fos.close();
        }
        catch(Exception ex)
        {
            exceptionHandler(ex);
        }
    }

    /**
     * Lire string string.
     *
     * @return the string
     */
    public static String lireString() // Lire un String
    {
        String tmp="";
        char C='\0';
        try {
            tmp = in.readLine();
        }
        catch (IOException e)
        {
            exceptionHandler(e);
        }
        return tmp;
    }

    /**
     * Lire int int.
     *
     * @return the int
     */
    public static int lireInt()  // Lire un entier
    {
        int x=0;
        try {
            x=Integer.parseInt(lireString());
        }
        catch (NumberFormatException e) {
            exceptionHandler(e);
        }
        return x ;
    }

    /**
     * Lire boolean boolean.
     *
     * @return the boolean
     */
    public static boolean lireBoolean()  // Lire un entier
    {
        boolean b = true;
        try {
            b = Boolean.valueOf(lireString()).booleanValue();
        }
        catch (NumberFormatException e) {
            exceptionHandler(e);
        }
        return b;
    }

    /**
     * Lire double double.
     *
     * @return the double
     */
    public  static double lireDouble()  // Lire un double
    {
        double x=0.0;
        try {
            x=Double.valueOf(lireString()).doubleValue();
        }
        catch (NumberFormatException e) {
            exceptionHandler(e);
        }
        return x ;
    }

    /**
     * Lire char char.
     *
     * @return the char
     */
    public  static char lireChar()  // Lire un caractere
    {
        String tmp=lireString();
        if (tmp.length()==0)
            return '\n';
        else
        {
            return tmp.charAt(0);
        }
    }


    /**
     * Ecrire string.
     *
     * @param s the s
     */
    public static void ecrireString(String s){ // Afficher un String
        System.out.print(s);
    }

    /**
     * Ecrire stringln.
     *
     * @param s the s
     */
    public static void ecrireStringln(String s) // Afficher un String
    {
        ecrireString(s);
        sautDeLigne();
    }

    /**
     * Ecrire int.
     *
     * @param i the
     */
    public static void ecrireInt(int i)  // Afficher un entier
    {
        ecrireString(""+i);
    }


    /**
     * Ecrire intln.
     *
     * @param i the
     */
    public static void ecrireIntln(int i)  // Afficher un entier
    {
        ecrireString(""+i);
        sautDeLigne();
    }


    /**
     * Ecrire boolean.
     *
     * @param b the b
     */
    public static void ecrireBoolean(boolean b){
        ecrireString(""+b);
    }


    /**
     * Ecrire booleanln.
     *
     * @param b the b
     */
    public static void ecrireBooleanln(boolean b){
        ecrireString(""+b);
        sautDeLigne();
    }


    /**
     * Ecrire double.
     *
     * @param d the d
     */
    public  static void ecrireDouble(double d)  // Afficher un double
    {
        ecrireString(""+d);
    }

    /**
     * Ecrire doubleln.
     *
     * @param d the d
     */
    public  static void ecrireDoubleln(double d)  // Afficher un double
    {
        ecrireDouble(d);
        sautDeLigne();
    }

    /**
     * Ecrire char.
     *
     * @param c the c
     */
    public  static void ecrireChar(char c)  // Afficher un caractere
    {
        ecrireString(""+c);
    }

    /**
     * Ecrire charln.
     *
     * @param c the c
     */
    public  static void ecrireCharln(char c)  // Afficher un caractere
    {
        ecrireChar(c);
        sautDeLigne();
    }

    /**
     * Saut de ligne.
     */
    public static void sautDeLigne(){
        try{
            System.out.println();
        }catch(Exception ex){
            exceptionHandler(ex);
        }
    }


    /**
     * Exception handler.
     *
     * @param ex the ex
     */
    protected static void exceptionHandler(Exception ex){
        TerminalException err = new TerminalException(ex);
        throw err;
    }


    /**
     * Ecrire exception.
     *
     * @param ex the ex
     */
    public static void ecrireException(Throwable ex){
        ecrireString(ex.toString());
        ex.printStackTrace(System.out);
    }
}


/**
 * The type Terminal exception.
 */
class TerminalException extends RuntimeException{
    /**
     * The Ex.
     */
    Exception ex;

    /**
     * Instantiates a new Terminal exception.
     *
     * @param e the e
     */
    TerminalException(Exception e){
        ex = e;
    }
}



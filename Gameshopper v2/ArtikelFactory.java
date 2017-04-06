
/**
 * Write a description of class ArtikelFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArtikelFactory
{
    public static Artikel getArtikel(String artikelType)
    {
        if(artikelType == null)
        {
            return null;
        }
        if(artikelType.equalsIgnoreCase("Game"))
        {
            return new Game();
        }
        else if(artikelType.equalsIgnoreCase("Accesoire"))
        {
            return new Accesoire();
        }
        else if(artikelType.equalsIgnoreCase("Console"))
        {
            return new Console();
        }
        
        return null;
    }
}

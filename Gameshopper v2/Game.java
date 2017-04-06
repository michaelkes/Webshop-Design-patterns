
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game implements Artikel
{
    private String naam;
    private double prijs;
    private int voorraad;
    
    public Game()
    {
    }
    
    @Override
    public void maakArtikel(String naam, double prijs, int voorraad)
    {
        this.voorraad = voorraad;
        System.out.println("Game:");
        System.out.println("Beschrijving:"+ " " + naam);
        System.out.println("Prijs:"+ " " + prijs);
        System.out.println("Aantal op voorraad:"+ " " + voorraad);
    }

        
    @Override
    public int bestel(int aantal)
    {
        int totaal;
        totaal =  voorraad - aantal;
        System.out.println("Nieuwe voorraad" + " " + totaal);
        System.out.println("----------------------------------------");
        
        return 0;
    }
}

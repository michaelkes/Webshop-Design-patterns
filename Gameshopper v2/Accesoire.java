
/**
 * Write a description of class Accesoire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Accesoire implements Artikel
{
    private int voorraad;
    
    @Override
    public void maakArtikel(String naam,double prijs, int voorraad)
    {
        this.voorraad = voorraad;
        
        System.out.println("Dit is een accesoire");
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


/**
 * Write a description of class Shop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop
{
   private String naam;
   private double prijs;
   private int voorraad;
   
    
   public Shop()
   {
      
       ArtikelFactory artikelFactory = new ArtikelFactory();
   }
 
   
   
   public void maakGame(String Titel, double prijs, int voorraad)
   {
       this.naam = Titel;
       this.prijs = prijs;
       this.voorraad = voorraad;
       
       /*Maak een Game vanuit de factory*/
        Artikel Game1 = ArtikelFactory.getArtikel("Game");
        Game1.maakArtikel(Titel, prijs, voorraad);
   }
   
   public void maakAccesoire(String Titel, double prijs, int voorraad)
   {
       this.naam = Titel;
       this.prijs = prijs;
       this.voorraad = voorraad;
       
       /*Maak een Game vanuit de factory*/
        Artikel Accesoire1 = ArtikelFactory.getArtikel("Accesoire");
        Accesoire1.maakArtikel(Titel, prijs, voorraad);
   }
   
   public void maakConsole(String Titel, double prijs, int voorraad)
   {
       this.naam = Titel;
       this.prijs = prijs;
       this.voorraad = voorraad;
       
       /*Maak een Game vanuit de factory*/
        Artikel Console1 = ArtikelFactory.getArtikel("Console");
        Console1.maakArtikel(Titel, prijs, voorraad);
   }
    
    
}

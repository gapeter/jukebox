package jukeboxpkg;
import java.util.ArrayList;
import java.util.List;

/**
 * Jukebox  is a Jukebox class 
 * @author George Peter (gpeter@yahoo.com)
 * @version 0.1 13 Feb 2019
 */ 

public class Jukebox {
    
   Database db;
   
   int creditCard;
   
   /**
    * Instantiates a new jukebox.
    */
   public Jukebox(){
   }
   
   /**
    * Instantiates a new jukebox.
    *
    * @param db the db
    * @param creditCard the credit card
    */
   public Jukebox(Database db, int creditCard) {
      super();
      this.db = db;
      this.creditCard = creditCard;
   }   
   
   /**
    * Gets the db.
    *
    * @return the db
    */
   public Database getDb() {
      return db;
   }
   
   /**
    * Sets the db.
    *
    * @param db the new db
    */
   public void setDb(Database db) {
      this.db = db;
   }
   
   /**
    * Gets the credit card.
    *
    * @return the credit card
    */
   public int getCreditCard() {
      return creditCard;
   }
   
   /**
    * Sets the credit card.
    *
    * @param creditCard the new credit card
    */
   public void setCreditCard(int creditCard) {
      this.creditCard = creditCard;
   }
   
   /**
    * Checks if is valid credit card.
    *
    * @return true, if is valid credit card
    */
   public boolean isValidCreditCard(){
      if(creditCard>0)
         return true;
      else
         return false;
   }
   
   /**
    * Play.
    *
    * @param i the i
    */
   void play(int i) {
         Song song=db.getSongList(i);
         song.play();
   }
   
   /**
    * Play.
    */
   void play() {
      for (int index=0;index<db.getSongList().size();index++)
      {
         Song song=db.getSongList(index);
         trace("Currently Playing :"+song.getName());
         song.play();
      }
   }
   
   private void trace(String s){
      System.out.println(s);
   }
   
   
   /**
    * The main method.
    *
    * @param args the arguments
    */
   //Driver
   public static void main(String[] args){
      Song song1=new Song("Kadhal Cricket", "Kharesma Ravichandran", 
            "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
      Song song2=new Song("Kannala Kannala", "Kaushik Krish", 
            "Thani Oruvan", "Kannala.mp3", "Mp3", 215);
      Song song3=new Song("Kadhal Cricket", "Kharesma Ravichandran",
            "Thani Oruvan", "D://Cricket.mp3", "Mp3", 214);
      List<Song> tempSongList= new ArrayList<Song>();
      tempSongList.add(song1);
      tempSongList.add(song2);
      tempSongList.add(song3);
      
      Database tempDB= new Database(tempSongList);
      Jukebox j= new Jukebox(tempDB, -123);
      
      //Validation of Credit Card
      System.out.println("Validity of CC : "+j.isValidCreditCard());
      j.getDb().toString();

      System.out.println("\nDeleting Song @ index 2");
      //Deleting Song @ index 2
      j.getDb().removeSong(2);
      j.getDb().toString();
      
      System.out.println("Playing the SongList");
      j.play();
      
      System.out.println("Playing Song @ index 2");
      j.play(2);
   }   
}
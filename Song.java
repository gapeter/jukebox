package jukeboxpkg;

import java.io.FileInputStream;
import javazoom.jl.player.Player;

/**
 * Song is a Song class 
 * <pre>
 *   Song song1=new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
 * </pre>
 * @author George Peter (gpeter@yahoo.com)
 * @version 0.1 13 Feb 2019
 * @see java.io.File
 * @see java.io.FileInputStream
 * @see java.util.ArrayList
 * @see java.util.List
 * @see java.util.Scanner
 */

public class Song {
   
   /** The name. */
   String name;
   
   /** The artist. */
   String artist;
   
   /** The album. */
   String album;
   
   /** The url. */
   String url;
   
   /** The format. */
   String format;
   
   /** The duration. */
   // Duration of Song in seconds
   int duration;
   
   /**
    * Instantiates a new song.
    */
   public Song(){
      
   }
   
   /**
    * Instantiates a new song.
    *
    * @param name the name
    * @param artist the artist
    * @param album the album
    * @param url the url
    * @param format the format
    * @param duration the duration
    */
   public Song(String name, String artist, String album, String url,
         String format, int duration) {
      super();
      this.name = name;
      this.artist = artist;
      this.album = album;
      this.url = url;
      this.format = format;
      this.duration = duration;
   }

   /**
    * Gets the name.
    *
    * @return the name
    */
   public String getName() {
      return name;
   }

   /**
    * Sets the name.
    *
    * @param name the new name
    */
   public void setName(String name) {
      this.name = name;
   }

   /**
    * Gets the artist.
    *
    * @return the artist
    */
   public String getArtist() {
      return artist;
   }

   /**
    * Sets the artist.
    *
    * @param artist the new artist
    */
   public void setArtist(String artist) {
      this.artist = artist;
   }

   /**
    * Gets the album.
    *
    * @return the album
    */
   public String getAlbum() {
      return album;
   }

   /**
    * Sets the album.
    *
    * @param album the new album
    */
   public void setAlbum(String album) {
      this.album = album;
   }

   /**
    * Gets the url.
    *
    * @return the url
    */
   public String getUrl() {
      return url;
   }

   /**
    * Sets the url.
    *
    * @param url the new url
    */
   public void setUrl(String url) {
      this.url = url;
   }
 
   /**
    * Gets the format.
    *
    * @return the format
    */
   public String getFormat() {
      return format;
   }

   /**
    * Sets the format.
    *
    * @param format the new format
    */
   public void setFormat(String format) {
      this.format = format;
   }

   /**
    * Gets the duration.
    *
    * @return the duration
    */
   public int getDuration() {
      return duration;
   }

   /**
    * Sets the duration.
    *
    * @param duration the new duration
    */
   public void setDuration(int duration) {
      this.duration = duration;
   }
   
   /**
    * Checks if is long.
    *
    * @return true, if is long
    */
   public boolean isLong() {
      return duration>50;
   }
   

   @Override
   public String toString() {
      return "Name: " + this.getName() + "\t" +
             "Artist:" + this.getArtist() + "\t" + 
             "Album:" + this.getAlbum() + "\t" +
             "Format:" + this.getFormat() + "\t" +
             "Duration:" + this.getDuration();
   }
   
   /**
    * Play.
    */
   public void play(){
      try{
         FileInputStream fis = new FileInputStream(this.getUrl());
         Player playMP3 = new javazoom.jl.player.Player(fis);
         playMP3.play();
      }catch(Exception e){
          System.out.println(e);
       }
   }
      
      /**
       * The main method.
       *
       * @param args the arguments
       */
      //Driver
      public static void main(String[] args){
         System.out.println("Creating Song Object");
         Song song1=new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
         System.out.println("Playing Song");
         song1.play();
         
      }   
}
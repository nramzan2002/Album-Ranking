public class Album{
   private String albumName;
   private String artistName;
   private int yearOfRelease;
   /**
   no-arg constructor
   */
   public Album()
   {
      albumName = "";
      artistName = "";
      yearOfRelease = 0;
   }
   /**
   Constructor for Album class
   @param albumName The name of the album
   @param artistName The name of the artist 
   @param yearOfRelease The year when album was released 
   */
   public Album(String albumName, String artistName, int yearOfRelease)
   {
      this.albumName = albumName;
      this.artistName = artistName;
      this.yearOfRelease = yearOfRelease;
   }
   /**
   Copy Constructor
   @param a a Album object to be copied
   */
   public Album(Album a)
   {
      this.albumName = a.albumName;
      this.artistName = a.artistName;
      this.yearOfRelease = a.yearOfRelease;
   }
   /**
   @return the name of the album
   */
   public String getAlbumName()
   {
      return albumName;
   }
   /**
   @return the name of the artist
   */
   public String getArtistName()
   {
      return artistName;
   }
   /**
   @return the year of release of the album
   */
   public int yearOfRelease()
   {
      return yearOfRelease;
   }
   /**
   @param albumName the name of the album
   */
   public void setAlbumName(String albumName)
   {
      this.albumName = albumName;
   }
   /**
   @param artistName the name of the artist
   */
   public void setArtistName(String artistName)
   {
      this.artistName = artistName;
   }
   /**
   @param yearOfRelease the year of release of the album
   */
   public void setYearOfRelease(int yearOfRelease)
   {
      this.yearOfRelease = yearOfRelease; 
   }
   /**
   @return a String representation of the Album object
   */
   public String toString()
   {
      return String.format("Album: " + albumName +
                           "\nArtist: " + artistName + "\nYear of Release: " + yearOfRelease);
   }
}  
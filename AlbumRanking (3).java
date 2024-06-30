public class AlbumRanking{
   private int personalRating;
   private int numAlbumsSold;
   private Album album;
   /**
   no-arg constructor
   */
   public AlbumRanking()
   {
      personalRating = 0;
      numAlbumsSold = 0;
      album = new Album();
   }
   /**
   A Constructor for the AlbumRanking class
   @param personalRating the rating of a person
   @param numAlbumsSold the number of albums sold
   @param a the album located on this AlbumRanking 
   */
   public AlbumRanking(int personalRating, int numAlbumsSold, Album album)
   {
      this.personalRating = personalRating;
      this.numAlbumsSold = numAlbumsSold;
      this.album = new Album(album);//to avoid a security hole
   }
   /**
   @return the personal rating 
   */
   public int getPersonalRating()
   {
      return personalRating;
   }
   /**
   @return the number of albums sold 
   */
   public int getNumAlbumsSold()
   {
      return numAlbumsSold;
   }
   /**
   @return the album located on this AlbumRanking 
   */
   public Album getAlbum()
   {
      return new Album(album);//avoid a security hole here 
   }
   /**
   @param personalRating the rating of a person 
   */
   public void setPersonalRating(int personalRating)
   {
      this.personalRating = personalRating;
   }
   /**
   @param numAlbumsSold the number of albums sold
   */
   public void setNumAlbumsSold(int numAlbumsSold)
   {
      this.numAlbumsSold = numAlbumsSold;
   }
   /**
   @param a the building located on this AlbumRanking 
   */
   public void setAlbum(Album album)
   {
      this.album = new Album(album);
   }
   /**
   Calculates the RIAA Certification for this AlbumRanking
   @return the RIAA Certification 
   */
   public String getRIAACertification()
   {
      if (numAlbumsSold < 500000){
         return "None";}
      else if (numAlbumsSold >= 500000 && numAlbumsSold < 1000000){
         return "Gold";}
      else if (numAlbumsSold >= 1000000 && numAlbumsSold < 2000000){
         return "Platnium";}
      else if (numAlbumsSold >= 2000000 && numAlbumsSold < 10000000){
         return "Multi-Platnium";}
      else{
        return "Diamond";}
        
    }
    /**
   Calculates the overall ranking
   @return the overall ranking 
   */
    public char getOverallRanking()
    {
      if (personalRating >= 9){
         return 'A';}
      else if (personalRating == 8){
         return 'B';}
      else if (personalRating == 7){
         return 'C';}
      else if (personalRating <= 6){
         return 'D';}
      else{
         return 'F';}
         
     }
   /**
   @return a String format of the AlbumRanking 
   */
     public String toString()
   {
      return String.format(album + "\nPersonal Rating: " + personalRating + "\nAlbums Sold: " 
            + numAlbumsSold + "\nRCIAA Certification: " + getRIAACertification() +
            "\nOverall Ranking: " + getOverallRanking());
 
   }
   
}
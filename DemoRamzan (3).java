import java.util.*;
public class DemoRamzan{
   public static void main(String [] args){
      int yearOfRelease, personalRating, numAlbumsSold = 0;
      String albumName, artistName;
      char keepGoing;
      ArrayList<AlbumRanking> albumList = new ArrayList<AlbumRanking>();
      
      Scanner keyboard = new Scanner(System.in);
      
      //asl the user to enter information about the Album and AlbumRanking object until they do not want to continue
      do
      {
         System.out.print("Please enter the name of the album: ");
         albumName = keyboard.nextLine();
         
         System.out.print("Please enter the artist's name: ");
         artistName = keyboard.nextLine();
         
         System.out.print("Please enter the year the album was released: ");
         yearOfRelease = keyboard.nextInt();
         
         System.out.print("Please enter your personal rating (from 1 to 10) for the album: ");
         personalRating = keyboard.nextInt();
         
         while(personalRating < 1 || personalRating > 10){//validate input 
            System.out.print("Invalid Selection. Please enter your personal rating (from 1 to 10) for the album: ");
            personalRating = keyboard.nextInt();}
            
         System.out.print("Please enter the number of albums sold: ");
         numAlbumsSold = keyboard.nextInt();
         
         //instantiate Album object and AlbumRanking object below
         Album a = new Album(albumName, artistName, yearOfRelease);
         AlbumRanking r = new AlbumRanking(personalRating, numAlbumsSold,a);
         //add Album to the AlbumRanking 
         albumList.add(r);
         
         keyboard.nextLine();
         System.out.print("\nWould you like to enter information about another album (Y/N)?");
         keepGoing = keyboard.nextLine().toUpperCase().charAt(0);
         System.out.println();
         }
      while(keepGoing == 'Y');
      
      //print out your information about AlbumRanking 
      System.out.println("Album Ranking Report");
      for(int i = 0; i <albumList.size(); i++)
      {
         System.out.println();
         System.out.println(albumList.get(i));
         System.out.println();
      }
      //print out the total number of albums rankings 
      System.out.printf("Total number of album rankings: " + albumList.size());
   }
}
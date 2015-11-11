
/**
 * This is a test program for the Book class
 * 
 * @author L. Lehmann
 * @version 3-19-2014
 */
public class Driver
{
	public static void main(String[ ] args)
   {
         Book bA;
         Book bB;
         Author a1 = new Author("King", "Steven", "2121 West Side Drive", 1948);
         Author a2=  new Author("Handey", "Jack", "331 Rodeao Drive", 1960);
         
         bA = new Book("The Stand", "23232323", 24.99, 1978, a1);
         bB = new Book("Deep Thoughts", "5555555", 12.95, 1999, a2);

        System.out.println(bA);
        System.out.println("==============================\n\n");
        System.out.println(bB);
    
    if(a1.compareTo(a2) < 0)
      System.out.println(a1 + "   comes before " + a2);
    else
       System.out.println(a1 + "  does not  come before " + a2);
    }   
}
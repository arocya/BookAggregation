
/**
 * This is a template for a Book object.
 * This is written as an example of aggregation.
 *
 * @auther Arion Almond
 * @author Lorrie Lehmann
 * @version 3-13-2016
 */
public class Book
{
	private String title;
	private String ISBN;
	private double cost;
	private int yearPublished;
	private Author writer;

	public Book( )
	{
	    title = ISBN  = null;
	    writer = null;
	    cost = 0;
	    yearPublished = -999;
   }

   public Book(String inTitle, String inISBN, double inCost, int inYear, Author inWriter)
   {
       title = inTitle;
       ISBN = inISBN;
       cost = inCost;
       yearPublished = inYear;
       writer = new Author(inWriter);
    }

  public Book(Book inBook)
  {
      title = inBook.title;
      ISBN = inBook.ISBN;
      cost = inBook.cost;
      yearPublished = inBook.yearPublished;
      writer = new Author(inBook.writer);
  }

  public String toString( )
  {
      return "Title:\t" + title +
             "\nISBN:\t" + ISBN +
             "\nAuthor:\t" + writer +
             "\nCost:\t" + cost +
             "\nYear published:\t" + yearPublished;
   }
}

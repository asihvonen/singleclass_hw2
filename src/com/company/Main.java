package com.company;
import ibcsutils.Book;

public class Main
{
    public static void main(String[] args)
    {
	    Book[] books = new Book [2];
	    books[0] = new Book ("Persepolis", new String[] {"Marjane Satrapi"}, 2003);
	    books[1] = new Book ("Hard Times", new String[] {"Charles Dickens"}, 1854);
        for (Book b : books)
            System.out.println (b);
        /*
        public class Book
        {
          public Book (String title, String[] authors, int publicationYear) //constructor
          {
            this.title = title;
            this.authors = authors;
            this.publicationYear = publicationYear;
          }

          public String toString () //string representation of Book
          {
            StringBuffer strBuffer = new StringBuffer (); //allows for String to be changed
            int numAuth = authors.length; //how many authors in array
            for (int i = 0; i < numAuth; i = i + 1)
            {
              strBuffer.append (authors [i]); //append = add to the end
              if (i != numAuth - 1)
                strBuffer.append (" & ");
            }
            strBuffer.append (": " + title + " ");
            strBuffer.append ("(" + publicationYear + ")");

            return strBuffer.toString ();
          }

          public String getTitle () //accessor for title
          {
            return title;
          }

          public String[] getAuthors () //accessor for authors
          {
            return authors;
          }

          public int getPublicationYear () //accessor for publicationYear
          {
            return publicationYear;
          }

          public int numAuthors ()
          {
            return authors.length;
          }

          public boolean newerThan (Book book)
          {
            return publicationYear > book.getPublicationYear ();
          }

          // fields/member variables of Book
          private String title;
          private String[] authors;
          private int publicationYear;
        }
         */
    }
}

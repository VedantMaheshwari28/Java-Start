public class LibraryProject{
	private static String []Books ={"Let us C", "DSA through C","NCERT 10","NCERT 12","Science Schand","Malik"};
	private static String []IssuedBooks= new String[10];
	private static int NumberOfIssuedBooks=0;
	public void booksAvailable() {
		System.out.println("BOOKS available:");
		for(int i=0;i<Books.length;i++)
			System.out.println(Books[i]);
	}
	public void issuedBooks() {
		System.out.println("BOOKS ISSUED BY YOU :");
		for(int i=0;i<IssuedBooks.length;i++)
			if(IssuedBooks[i]!=null) {
				System.out.println(IssuedBooks[i]);
			}
	}
	public void issueABook(String name) {
		for(int i=0;i<Books.length;i++) {
			if(Books[i].equals(name)) {
				IssuedBooks[NumberOfIssuedBooks]=Books[i];
				NumberOfIssuedBooks++;
				break;
			}
			else if(i==Books.length-1) {
				System.out.println("BOOK NOT FOUND");
			}
		}
	}
	public void addBook(String bname) {
		String [] NewBook = new String[Books.length+1];
		for(int i=0;i<Books.length;i++) {
			NewBook[i]=Books[i];
		}
		NewBook[Books.length]=bname;
		Books = NewBook;
		System.out.println(bname +" Added to the library");
	}
	public void returnBook(String bookname) {
	    boolean found = false;
	    for (int i = 0; i < IssuedBooks.length; i++) {
	        if (IssuedBooks[i] != null && IssuedBooks[i].equals(bookname)) {
	            IssuedBooks[i] = null; // Remove the book from IssuedBooks
	            found = true;
	            break;
	        }
	    }
	    if (found==false) {
	        System.out.println("Book not found in issued books.");
	        return;
	    }
	    String[] newBooks = new String[Books.length + 1];
	    for (int i = 0; i < Books.length; i++) {
	        newBooks[i] = Books[i];
	    }
	    newBooks[Books.length] = bookname; 
	    Books = newBooks; 
	    System.out.println(bookname + " has been returned to the library.");
	}
}
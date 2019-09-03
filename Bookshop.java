import java.util.ArrayList;
import java.util.List;

public class Bookshop implements Cloneable {
	
	private String sname;
	
	List<Book> books = new ArrayList<>();

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void loadData() {
		
		for (int i=0; i<11;i++)
		{
			Book b = new Book();
			b.setBid(i);
			b.setBname("Book"+ i);
			getBooks().add(b);
			
		}
	}

	@Override
	public String toString() {
		return "Bookshop [sname=" + sname + ", books=" + books + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		
		
	}
	
	
	 
	// @Override
	//protected Bookshop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//Bookshop newshop = new Bookshop();
		// for (Book : this.getbooks())
	//{
	
	// newshop.getBooks().add(b);
		
//	}
	
	// return newshop;
		
//	}
	
	
}

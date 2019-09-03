
public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Bookshop bs = new Bookshop();
		
		bs.setSname("NSU");
		bs.loadData();
	
		Bookshop bsNew = (Bookshop) bs.clone();
		bsNew.setSname("NSUBookShop2");
		
		bs.getBooks().remove(2);
		
		System.out.println(bs);
		System.out.println(bsNew);

	}

}

public class DemoSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj1 = Abc.getInstance();
			
	}
	
}

class Abc{
	
	static Abc obj = new Abc();
	
	private Abc() {
				
	}
	
	public static Abc getInstance() {
		
		return obj;
		
	}
		
	
}


public class MethOvrload {
	public void search(String brand) {
		System.out.println("search the list of items present with brand xyz");
		
	}
	public void search(int price) {
		System.out.println("search the list of items present with price");
		
	}

	public static void main(String[] args) {
		MethOvrload mo= new MethOvrload();
		mo.search(52);       //it consider int datatype
		mo.search("hero");   //it consider string datatype
		
	}

}

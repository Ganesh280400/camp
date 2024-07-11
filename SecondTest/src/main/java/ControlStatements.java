
public class ControlStatements {

	public static void main(String[] args) {
		int x = 30;
		int y = 20;
		int z = 10;

		if (x <=y) {
			int a=x+y+z;
			System.out.println("if:"+a);

		} else if(z<=y) {
			int a=x+y+z;

			System.out.println("else-if:"+a);
		}

	}

}

/*
  if (x <= y) { 
  int a = x + y;
   System.out.println("the value is:" + a); 
   } 
  if (x <= y || z <= y) { 
   int a = x + y+z; 
   System.out.println("the value is:" + a); 
   }
 */
package demo2;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int i = 1;
	      while(i < 5) {
	         System.out.println("i = " + i);
	         i++;
	      }
	      
	      while(true) {
	         System.out.println("무한 루프");
	         break; // break가 없으면 무한루프
	      }

	}

}

package d1_while;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int sum = 0;
	      int i = 0;
	      
	      while(true) {
	    	  if(sum > 100) break;
	    	  i++;
	    	  sum = sum +1;
	    	 // sum=+=1	    	  
	      }
	      
	      System.out.println("i=" + i);
	      System.out.println("sum = " + sum);
	      System.out.println();
	      // continue문
	      for(int n=0; n<=10; n++) {
	         // n%3 == 0 은 3의 배수
	         if(n%3 == 0) continue;
	         System.out.println("n = " + n);
	      }

	}
	

}

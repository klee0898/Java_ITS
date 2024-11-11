package d1_while;

public class ForTest {
   public static void main(String[] args) {
      
      // 1*****
      // 2*****
      // 3*****
      // 4*****
      // 5*****
            
//       이중 for문을 이용해서 위의 별을 출력하시오. 외부for문 줄을 5번 반복 
      for(int i=1; i<=5; i++) {
         System.out.print(i);   
//         숫자출력
         for(int j =1; j<=5; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
      System.out.println();
      // 1*
      // 2**
      // 3***
      // 4****
      // 5*****
      for(int i=1; i<=5; i++) {
         System.out.print(i);         
         for(int j =1; j<=i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
      
      
   }
}

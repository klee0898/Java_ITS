package demo_04;

public class BikeApp {
	class Carbon extends Material{
		   public String toString() {
		      return "카본 재료 입니다.";
		   }

		   @Override
		   void using() {
		      System.out.println("가볍고 강해서 "
		            + "산악 자전거용으로 사용됨..");
		   }   
		}

		class Titanium extends Material {
		   public String toString() {
		      return "티타늄 재료 입니다.";
		   }

		   @Override
		   void using() {
		      System.out.println("가볍고 매우 강함~~");
		   }
		}

}

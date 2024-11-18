package demo_04;

public class Bike <T extends Material> {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike<Carbon> new <Bike>();
		Carbon carbon = new Carbon();
		System.out.println();
//
//	}

}

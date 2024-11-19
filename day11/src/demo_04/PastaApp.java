package demo_04;

public class PastaApp {
	public static void main(String[] args) {
		Tomato tomato = new Tomato();
		Garlic garlic = new Garlic();
		Cream cream = new Cream();
		
		Shrimp shrimp = new Shrimp();
		Vongole vongole = new Vongole();
		
		Pasta<Tomato, Shrimp> tomatoShrimpPasta = new Pasta<Tomato, Shrimp>();		
		tomatoShrimpPasta.setSource(tomato);
		tomatoShrimpPasta.setIngredient(shrimp);		
		System.out.println(tomatoShrimpPasta);//tomatoShrimpPasta 뒤에 toString()생략
		
		Pasta<Garlic, Shrimp> garlicShrimpPasta = new Pasta<Garlic, Shrimp>();		
		garlicShrimpPasta.setSource(garlic);
		garlicShrimpPasta.setIngredient(shrimp);		
//		garlicShrimpPasta.setSrcIngredient(garlic, shrimp);
		System.out.println(garlicShrimpPasta);
	
		Pasta<Cream, Shrimp> creamShrimpPasta = new Pasta<>();		
		creamShrimpPasta.setSource(cream);
		creamShrimpPasta.setIngredient(shrimp);
		System.out.println(creamShrimpPasta.toString());
		
		Pasta<Garlic, Vongole> garlicVongolePasta = new Pasta<>();		
		garlicVongolePasta.setSource(garlic);
		garlicVongolePasta.setIngredient(vongole);
		System.out.println(garlicVongolePasta);
	}
}

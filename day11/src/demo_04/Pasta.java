package demo_04;

public class Pasta <T, S> {
	private T source;
	private S ingredient;
	
	public T getSource() {
		return source;
	}

//	public void setSrcIngredient(T source, S ingredient) {
//		this.source = source;
//		this.ingredient = ingredient;
//	}

	public void setSource(T source) {
		this.source = source;
	}
	public S getIngredient() {
		return ingredient;
	}
	public void setIngredient(S ingredient) {
		this.ingredient = ingredient;
	}	
	@Override
	public String toString() {	
		return source + " "+ingredient+ " 파스타 완성!!";
	}
}

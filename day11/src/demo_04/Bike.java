package demo_04;

abstract class Material{
	abstract void using();
}

// Material의 자식만 T타입이 가능하다.
public class Bike <T extends Material>{
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void description() {
		material.using();
	}
}

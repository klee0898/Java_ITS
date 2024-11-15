package review;

// Animal은 기본생성자가 없는 상태
// 클래스에 인자생성자 있는 경우 기본생성자 명시를 하지 않으면
// 자동으로 기본생성자를 생성해주지 않는다.
class Animal{
	String type;
	Animal(String type){this.type = type;}
}

// Animal의 기본생성자를 호출하는 기본생성자가 존재하기
// 때문에 에러가 난다. Dog(){super();}
//class Dog extends Animal{}

class Cat extends Animal{
	Cat(){
		super("고양이");
	}
}

public class SuperEx {

}

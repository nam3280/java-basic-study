package day15.interfaceEx.homework.인터페이스.문제1;

public class AnimalTest {
	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);

		for (int i = 1; i <= 3; i++) {
			System.out.printf("%d시간 후\n",i);
			dog.run(i);
			chicken.run(i);
			fly(cheatableChicken, i);
		}
	}
//전
	public static void fly(Cheatable cheatable, int i){
		if(cheatable instanceof Chicken)
			cheatable.fly(i);
	}
//후

//	public static void fly(Chicken cheatableChicken, int i){
//		if(cheatableChicken instanceof Cheatable)
//			cheatableChicken.fly(i);
//	}

	//B instanceof A -> A안에 B가 있는지 물어보는 부분
	//Cheatable이라는 인터페이스 안에 cheatableChicken가 있는지 물어봐야함
	//전에는 Chicken 클래스 안에 cheatableChicken이 있는지 물어봄
	//결과값은 맞지만 의도가 틀림.
}

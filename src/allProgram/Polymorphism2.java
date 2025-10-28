package allProgram;

public class Polymorphism2 extends Polymorphism1 {

	@Override
	void m1() {
		System.out.println("obulesh is added polymorphism concept");
	}

	public static void main(String[] args) {
		Polymorphism2 p2 = new Polymorphism2();
		p2.m1();

	}
}
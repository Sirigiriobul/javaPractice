package allProgram;

public class MethodOverLoading1 {

	public void m1() {

		System.out.println();

	}

	public void m1(int x, int y) {
		System.out.println(x + y);

	}

	public void m1(int i, int j, int k) {

	}

	public static void main(String[] args) {
		MethodOverLoading1 mo1 = new MethodOverLoading1();
		mo1.m1(10, 20);

	}
}

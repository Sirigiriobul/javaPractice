package allProgram;

public class ExceptionTryCatch {
	public static void main(String[] args) {

		try {
			int a = 1;
			int b = 0;
			int c = a / b;
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

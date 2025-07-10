package learn.classobject;

public class MainClass {

	public static void main(String[] args) {

		Calculator cal = new Calculator(); //Object/reference variable
		int a = 10;
		int b = 20;
		int result = cal.add(a, b);
		System.out.println(result);
	}

}

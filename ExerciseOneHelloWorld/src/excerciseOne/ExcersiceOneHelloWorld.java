package excerciseOne;

public class ExcersiceOneHelloWorld {

	public static void main(String[] args) {

		  String str = "Hello World!";
	      System.out.println(str);
	      method(str);
	      System.out.println(str);
	      int c = addoperator(5,10);
	      System.out.println(c);
	}
	public static void method(String strTest) {
		System.out.println(strTest);
    }
	public static String returnhelloworld(String ret) {
		return(ret);
	}
	public static int addoperator(int a, int b) {
		return a+b;
	}
}
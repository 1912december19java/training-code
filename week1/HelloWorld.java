public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("myField is " + myField);
		repeatedPrint("This will repeat 2 times", 4);
	}

	public static String myField = "Adam";

	public static void repeatedPrint(String toPrint, Integer timesToPrint) {
		for(int i=0;i<timesToPrint;i++) {
			System.out.println(toPrint);
		}
	}
}

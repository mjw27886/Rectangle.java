import java.util.Scanner;



public class rectangle {
	
public static void main(String [] arges) {
	Scanner keyboard = new Scanner(System.in);
	double length, width, area, peremeter;

	
	System.out.println("Give me a length");
	length = keyboard.nextDouble();
	System.out.println("Give me a Width");
	width = keyboard.nextDouble();
	area = length*width;
	peremeter = length*2+width*2;
	System.out.println("Your area is " + area);
	System.out.println("Your peremiter is " + peremeter );
	
}

}

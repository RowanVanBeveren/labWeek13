import java.util.Scanner;
import java.util.Random;
public class Tasks {

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);















    }

    public static void playingWithStrings(){
			String name = "Melanie";
			String myName = "Rowan van Beveren";

			//Task 1
			System.out.println(name);
			System.out.println(name.toUpperCase());

			//Task 2
			System.out.println(myName.length());

			//Task 3
			System.out.println(myName.substring(2, 5));

			System.out.println("ahhhhhhhhhhhhh");

		}

	public static void playingWithMaths() {
		double num = 15.7;
		int random;

		System.out.println(Math.ceil(num));
		System.out.println((int) num);
		random = (int) (Math.random() * 10 + 1);
		System.out.println(random);
	}

}

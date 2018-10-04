import java.util.Scanner;
import java.util.Random;
public class Tasks {

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);


		System.out.println("Which task would you like to run? \n For playingWithStrings press 1 \n For playingWithMaths press 2");

		int number = input.nextInt();

		if(number == 1){

			playingWithStrings();
		}
		else if(number == 2) {
			playingWithMaths();
		}












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

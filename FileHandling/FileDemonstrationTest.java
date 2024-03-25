package FileHandling;


import java.util.Scanner;

public class FileDemonstrationTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		FileDemonstrationTest application = new FileDemonstrationTest();

		System.out.println("Enter file or directory name here: ");
		application.analyzePath(input.nextLine());
	}

	private void analyzePath(String nextLine) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'analyzePath'");
	}
}
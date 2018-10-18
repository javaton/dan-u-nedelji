import java.util.Scanner;

public class DanUNedelji {

	public static void main(String[] arg) {
		System.out.println("Unesite broj za koji zelite da izracunate dan?");
		Scanner input = new Scanner(System.in);
		int dan = input.nextInt();
		dan = dan % 7;
		if(dan == 1) {
			System.out.println("Ponedeljak");
		} else if(dan == 2) {
			System.out.println("Utorak");
		} else if (dan == 3) {
			System.out.println("Sreda");
		} else if(dan == 4) {
			System.out.println("Cetvrtak");
		} else if(dan == 5) {
			System.out.println("Petak");
		} else if(dan == 6) {
			System.out.println("Subota");
		} else {
			System.out.println("Nedelja");
		}
	}
}

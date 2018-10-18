import java.util.Scanner;

public class DanUNedelji {

	public static void main(String[] arg) {
		String [] danUNedelji = new String[7];
		danUNedelji[0] = "NEDELJA";
		danUNedelji[1] = "PONEDELJAK";
		danUNedelji[2] = "UTORAK";
		danUNedelji[3] = "SREDA";
		danUNedelji[4] = "CETVRTAK";
		danUNedelji[5] = "PETAK";
		danUNedelji[6] = "SUBOTA";
		
		System.out.println("Unesite broj za koji zelite da izracunate dan?");
		Scanner input = new Scanner(System.in);
		int dan = input.nextInt();
		dan = dan % 7;
		
		System.out.println(danUNedelji[dan]);
		
	}
}

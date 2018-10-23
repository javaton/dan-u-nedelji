

public class DanUNedelji {

	public static void main(String[] arg) {
		Datum d = new Datum();
		System.out.println(d.datum());
		
		Datum d2 = new Datum(23,10,2018);
		System.out.println(d2.datum());
	}
}

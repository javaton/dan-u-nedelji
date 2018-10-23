

public class DanUNedelji {

	public static void main(String[] arg) {
		Datum d = new Datum();
		d.proveriDatum();
		System.out.println(d.datum());
		System.out.println(d.proveriDatum());

		
		Datum d2 = new Datum(237,180,2018);
		System.out.println(d2.datum());
		System.out.println(d2.proveriDatum());
	}
}

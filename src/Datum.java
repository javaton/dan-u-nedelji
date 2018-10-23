
public class Datum {
	
	private Integer dan;
	private Integer mesec;
	private Integer godina;
	
	public Datum() {
		this(01, 01, 2010);
//		this.dan = 01;
//		this.mesec = 01;
//		this.godina = 2010;
	}
	
	public Datum(Integer dan, Integer mesec, Integer godina) {
		this.dan = dan;
		this.mesec = mesec;
		this.godina = godina;
	}
	
	public String datum() {
		return dan+"."+mesec+"."+godina;
	}
	
	public Boolean proveriDatum() {
		// Ako je datum ispravan vraca true
		//Ako nije ispravan vraca false
		if(mesec >= 1 && mesec <= 12 && dan >= 1 && dan <=31) {
			System.out.println("Datum je zadatom opsegu");
			return true;
		}
		System.out.println("Datum nije u zadatom opsegu!");
		return false;
	}

}

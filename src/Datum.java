
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

}

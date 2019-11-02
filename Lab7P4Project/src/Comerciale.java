
public class Comerciale extends Project implements Risky {

	private String Deadline;
	private int nrEchipe;
	private String Parola;
	private long Fonduri;
	private Member[] m=new Member[15];
	private int contor=0;
	public Comerciale(int nrEchipe,String Titlu, String Obiectiv,String DeadLine,String Parola,long Fonduri){
		super(Titlu,Obiectiv,Fonduri/2);
		this.Deadline=DeadLine;
		this.Parola=Parola;
	    this.nrEchipe=nrEchipe;	
	}
	public void setFonduri() {
		this.Fonduri=super.getFonduri()/2;
	}
	public void addMember(Member membru) {
		if(contor<this.m.length)
		{
          m[contor]=membru;
          contor++;
		}
		
	}
	public double getRisk() {
		double s = this.nrEchipe*3/m.length;
		return s/this.Fonduri;
		
	}
	


}


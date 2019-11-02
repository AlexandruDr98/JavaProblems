
public class Militare extends Project implements Risky{
private String Deadline;
private String Parola;
private long Fonduri;
private Member[] me= new Member[15];
private int contor=0;
public Militare(String Titlu, String Obiectiv,long Fonduri,String DeadLine,String Parola){
	super(Titlu,Obiectiv,Fonduri);
	this.Deadline=DeadLine;
	this.Parola=Parola;
}

public void addMember(Member membru) {
	if(contor<this.me.length)
	{
      me[contor]=membru;
      contor++;
	}
		
}

public double getRisk() {
	double s= me.length/this.Parola.length();
	return s/this.Fonduri;
	
}
}
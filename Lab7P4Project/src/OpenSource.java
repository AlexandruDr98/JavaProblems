
public class OpenSource extends Project implements Risky{
private String MailList;
private Member[] mem= new Member[100];
private int contor=0;
public OpenSource(String Titlu, String Obiectiv,long Fonduri,String MailList){
	super(Titlu,Obiectiv,Fonduri);
	this.MailList=MailList;
}

public void addMember(Member membru) {
	if(contor<this.mem.length)
	{
      mem[contor]=membru;
      contor++;
	}
	
}

public double getRisk() {
	return this.mem.length/super.getFonduri();
}
}


public class Cabinet {
private String AvocatNume;
private int NumarCazuri;
private String[] total=new String[4];
public int contor=0;

public Cabinet(String AvocatNume)
{
	this.AvocatNume=AvocatNume;
	this.NumarCazuri=0;
	
}
public void adaugaCaz(String Reclamant , String Acuzat) {
	String s=Reclamant+"vs"+Acuzat+"\n";
	if(total.length<40)
		{
		total[contor]=s;
	    contor++;
		}	
}
public Cabinet formeazaAlianta(Cabinet c) {
	if(this.NumarCazuri+c.NumarCazuri<40)
	{
		String s = this.AvocatNume+"-"+c.AvocatNume;
		Cabinet nou= new Cabinet(s);
		String[] tmp= new String[nou.total.length+10];
		for(int j=0;j<nou.total.length;j++) {
			tmp[j]=nou.total[j];
		}
		nou.total=tmp;
		int i;
		for(i=0;i<total.length;i++)
			nou.total[i]=this.total[i];
		int x = this.total.length;
		for(i=0;i<c.total.length;i++) {
			nou.total[x]=c.total[i];
		    x++;
		    
		}
		return nou;
		}
	return null;
}
public String toString() {
	String s="";
	for(int i=0;i<total.length;i++)
		s+=total[i];
	return "Nume avocat:"+this.AvocatNume+"\n"+s;
}



}



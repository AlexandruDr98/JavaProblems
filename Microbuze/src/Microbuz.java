
public class Microbuz {
private String Nume;
private String Proprietar;
private String[] NumePas=new String[7];
public  int contor=0;

public Microbuz(String Nume, String Proprietar) {
	this.Nume=Nume;
	this.Proprietar=Proprietar;
	
}
public boolean urca(String Name) {
	if(NumePas.length<14) {
		NumePas[contor]=Name;
	   this.contor++;
	   return true;
	}
	return false;
}
public boolean transferaPasageri(Microbuz m) {
	
	if(this.NumePas.length>m.NumePas.length)
		return false;
		else
		{
			int i;
			for(i=0;i<NumePas.length;i++)
					m.NumePas[i]=NumePas[i];
		     return true;
		}	
}
public String toString() {
	String s ="";
	for(int i =0;i<NumePas.length;i++)
		s+=NumePas[i];
	return "<"+this.Nume+"><"+this.Proprietar+">:"+s;
}


}

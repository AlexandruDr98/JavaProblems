
public class Echipa {
private String[] ref= new String[10];
public  int contor=1;
public int numara=0;
public Echipa(String nume) {
	
	ref[contor]=nume;

}

public void adaugaProgramator(String nume) {
	
	if(ref.length<10) {
		for(int i=0;i<ref.length;i++)
		{
			if(ref[i]==nume)
				numara++;
			}
		if(numara==0) {
		ref[contor]=nume;
		contor++;
		}
	}
}
public void mutaProgramatori(Echipa e,int numar) {
	if(ref.length>contor+numar) {
		if(e.contor>numar) {
			
		int x =e.ref.length-numar;	
        for(int i=e.ref.length;i>x;i--)
        {
        	ref[contor]=e.ref[i];
        	contor++;
        }
        }
		}
	
	}
public double calculeazaDurata(double x) {
	return x/this.contor;
}

}

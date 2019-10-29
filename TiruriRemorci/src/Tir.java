
public class Tir {
public Remorca[] RemorcaTab=new Remorca[3];
private int contor=0;

public boolean adaugaRemorca(int numarCutii,String nrInmatriculare) {
	
	if(RemorcaTab.length<3)
	{
		RemorcaTab[contor]=new Remorca(numarCutii,nrInmatriculare);
		contor++;
		return true;
	}
	return false;
}

public boolean adaugaRemorca(Remorca referinta) {
	if(RemorcaTab.length<3)
	{
		RemorcaTab[contor]=referinta;
		contor++;
		return true;
	}
	return false;
	
}

public Remorca stergeRemorca(String nrInmatriculare) {
	
	for(int i=0;i<RemorcaTab.length;i++)
	{
		if(RemorcaTab[i].getnrInmatriculare().equals(nrInmatriculare))
		{Remorca nou = new Remorca(nrInmatriculare);
		RemorcaTab[i]=nou;
		RemorcaTab[i]=RemorcaTab[i+1];
		contor--;
		return nou;
		}
		
	}
	return null;
}

public boolean egale(Tir a) {
	int sum1=0,sum2=0;
	int i;
	for(i=0;i<a.RemorcaTab.length;i++)
	{
		sum1+=a.RemorcaTab[i].getCantitateCutii();
	}
	for(i=0;i<this.RemorcaTab.length;i++)
	{
		sum2+=this.RemorcaTab[i].getCantitateCutii();
	}
	if(sum1==sum2)
		return true;
	return false;
}

public String toString()
{
	String t = "Tir";
	for(int i=0;i<RemorcaTab.length;i++)
		t+=RemorcaTab[i].toString();
	return t;
	
}





}

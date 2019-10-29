
public class Remorca {
private int cantitateCutii;
private String nrInmatriculare;
public Remorca anterior;

public Remorca(int cantitateCutii, String nrInmatriculare)
{
	this.cantitateCutii=cantitateCutii;
	this.nrInmatriculare=nrInmatriculare;
}

public Remorca(String nrInmatriculare) {
	this.nrInmatriculare=nrInmatriculare;
	if(this.anterior!=null)
	this.cantitateCutii=1+anterior.cantitateCutii;
	else
		this.cantitateCutii=10;
}

public int getCantitateCutii() {
	return this.cantitateCutii;
}
public String getnrInmatriculare() {
	return this.nrInmatriculare;
}
public boolean equals(Object o) {
	if(o instanceof Remorca)
	{
		if(this.nrInmatriculare==((Remorca)o).getnrInmatriculare())
			return true;
	}
	return false;
}
public String toString()
{
	return "->Remorca("+this.nrInmatriculare+","+this.cantitateCutii+")";
	
}


}

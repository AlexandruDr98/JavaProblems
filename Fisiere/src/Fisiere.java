
public class Fisiere {
	private String Nume;
	private String Continut;
	private int id;
	private static int contor=1;
	private Fisiere anterior;
	private int numarConcatenari=0;
	public Fisiere(String Nume, String Continut) {
		this.Nume=Nume;
		this.Continut=Continut;
		this.id=contor;
	    contor++;
	    anterior=null;
	}
	
	public void salveazaVersiune() {
        Fisiere NumeNou=new Fisiere(Nume+" Bak ",Continut); 
		NumeNou.anterior=this.anterior;
		this.anterior=NumeNou;
		
	}
	
	public void concateneaza(Fisiere Ref) {
		
		salveazaVersiune();
	   Continut=Continut+Ref.Continut;
	    this.numarConcatenari++;
	}
	
	public String toString() {
		if(this.anterior!=null)
	       return this.id+"  "+this.Nume+this.Continut+"\n"+anterior.toString();
		else
			return this.id+"  "+this.Nume+this.Continut;
	}
	public int numarConcatenari() {
		
		return this.numarConcatenari;
	}
}

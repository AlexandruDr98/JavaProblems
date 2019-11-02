
public class EURO extends contBancar {
private double dobanda;
	public EURO(String numarCont,float suma) {
		super(numarCont,suma);
		if(suma>500)
			this.dobanda=0.3;
		else
			this.dobanda=0;

	}
	public double getDobanda() {
		return this.dobanda;
	}
	public float getSumaTotala() {
		return super.getSuma()*36000;
	}
}

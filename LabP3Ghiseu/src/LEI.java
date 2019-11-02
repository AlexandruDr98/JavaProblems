
public class LEI extends contBancar implements SumaTotala{
private float suma;
	public LEI(String numarCont,float suma) {
		super(numarCont,suma);
	}
	
	public void transfer(contBancar contDestinatie , float suma) {
		 contDestinatie.suma=this.suma+suma;
	
}
	public float getSumaTotala() {
		return this.suma;
	}
	public float getSuma() {
		return this.suma;
	}
}

	
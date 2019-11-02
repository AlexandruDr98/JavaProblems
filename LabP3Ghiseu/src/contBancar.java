
public abstract class contBancar {
private String numarCont;
protected float suma;
public contBancar(String numarCont,float suma) {
	this.numarCont=numarCont;
	this.suma=suma;
}
public float getSuma() {
	return this.suma;
}
public String numarCont() {
	return this.numarCont;
}
}

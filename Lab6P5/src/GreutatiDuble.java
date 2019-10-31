
public class GreutatiDuble extends Greutati {
private Greutati Prima;
private Greutati Doi;

public GreutatiDuble(int greutate1 , int greutate2) {
	greutate1=this.Prima.getCapacitate();
	greutate2=this.Doi.getCapacitate();
}
public void setGreutate1(Greutati g) {
	this.Prima=g;
	
}
public void setGreutate2(Greutati g) {
	this.Doi=g;
}
public int capacitate() {
	
	return this.Prima.getCapacitate()+this.Doi.getCapacitate();
}


}

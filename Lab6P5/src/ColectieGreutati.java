
public class ColectieGreutati {
private Greutati[] greu;
private int contor=0;
public ColectieGreutati(int n) {
	greu=new Greutati[n];
}
public void adauga(Greutati g) {
	if(contor<greu.length) {
		greu[contor]=g;
		contor++;
	}
}
public double medie() {
	
	int s=0;
	for(int i=0;i<greu.length;i++)
		if(greu[i] instanceof GreutatiSimple)
			s+=((GreutatiSimple)greu[i]).capacitate();
		else if(greu[i] instanceof GreutatiDuble)
			s+=((GreutatiDuble)greu[i]).capacitate();
		else if(greu[i] instanceof GreutatiMultiple)
			s+=((GreutatiMultiple)greu[i]).capacitate();
		
		return s/greu.length;
}
}


public class GreutatiMultiple extends Greutati{
private Greutati[] gr;
private int contor=0;
	public GreutatiMultiple() {
       gr=new Greutati[100];
	}
	public void add(Greutati g) {
		gr[contor]=g;
		contor++;
	}
	public int capacitate() {
		int s=0;
		int i;
		for(i=0;i<gr.length;i++) {
			s+=gr[i].getCapacitate();
		}
		return s;
	}
	
}

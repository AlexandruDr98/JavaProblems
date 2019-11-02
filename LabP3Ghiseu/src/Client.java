
public class Client {
private String nume;
private String adresa;
private contBancar[] cont= new contBancar[5];
private int contor=0;
public Client(String nume,String adresa,contBancar x) {
	this.nume=nume;
	this.adresa=adresa;
	cont[contor]=x;
	contor++;
}
public String getNume() {
	return this.nume;
}
public String getAdresa() {
	return this.adresa;
}
public void setNume(String Nume) {
	this.nume=Nume;
}
public void setAdresa(String Adresa) {
	this.adresa=Adresa;
}
public String toString() {
	String s="";
	int i;
	for(i=0;i<cont.length;i++)
		s=s+cont[i].getSuma()+"\n";
	return this.nume+":"+this.adresa+":"+s;
}
}

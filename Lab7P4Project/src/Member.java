 
public abstract class Member {
private String Nume;
private int Varsta;
public Member(String Nume, int Varsta) {
	this.Nume=Nume;
	this.Varsta=Varsta;
}
	
	
	
public String getNume() {
	return this.Nume;
}
public int getVarsta() {
	return this.Varsta;
}
}


public abstract class Project {
private String Titlu;
private String Obiectiv;
private long Fonduri;
public abstract  void addMember(Member m);

public Project(String Titlu, String Obiectiv,long Fonduri) {
this.Titlu=Titlu;
this.Obiectiv=Obiectiv;
this.Fonduri=Fonduri;
}

public long getFonduri() {
	return this.Fonduri;
}
}


public class MainCabinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cabinet c1=new Cabinet("Alex");
Cabinet c2=new Cabinet("Dan");
Cabinet c3;
c1.adaugaCaz("unu", "doi");
c1.adaugaCaz("trei","patru");
c2.adaugaCaz("cinci", "sase");
c2.adaugaCaz("sapte", "opt");
System.out.println(c1.toString());
System.out.println(c2.toString());
c3=c1.formeazaAlianta(c2);
System.out.println(c3.toString());
	}

}

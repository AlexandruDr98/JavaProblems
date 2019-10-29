
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Remorca r1,r2,r3,r4;
		r1=new Remorca(10,"Remorca 1");
		r2=new Remorca(11,"Remorca 2");
		r3=new Remorca("Remorca 3");
		r4=new Remorca(13,"Remorca 4");
	    
		Tir t1,t2;
		t1 = new Tir();
		t2 = new Tir();
		
		t1.adaugaRemorca(r1);
		t1.adaugaRemorca(r2);
		t2.adaugaRemorca(r3);
		t2.adaugaRemorca(r4);
		t2.adaugaRemorca(14, "Remorca 5");
		t1.adaugaRemorca(15,"Remorca 6");	    
		System.out.println(r1);
		System.out.println(t1.egale(t2));
		
	}

}

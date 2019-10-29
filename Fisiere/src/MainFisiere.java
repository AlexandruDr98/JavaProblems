
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Fisiere f1= new Fisiere("Primu","A");
      Fisiere f2= new Fisiere("Al doilea","B");
      Fisiere f3;
      System.out.println(f1.toString());
      System.out.println(f2.toString());
      f1.concateneaza(f2);
      f3=new Fisiere("Al treilea","C");
      System.out.println("Numarul de concatenari este : "+f1.numarConcatenari());
      System.out.println(f1.toString());
      
      
	}

}

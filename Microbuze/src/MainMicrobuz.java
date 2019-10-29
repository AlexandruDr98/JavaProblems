
public class MainMicrobuz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Microbuz x = new Microbuz("Ford","Alex");
      x.urca("Andrei");
      x.urca("Dan");
      x.urca("Nicki");
      System.out.println(x.toString());
      System.out.println(x.contor);
     
      Microbuz x1 = new Microbuz("Audi","Adina");
      x.transferaPasageri(x1);
      System.out.println(x1.toString());
	}

}


public class MainGreutati {
Greutati g1=new GreutatiSimple(30);
Greutati g2=new GreutatiSimple(40);
Greutati g3=new GreutatiSimple(50);
Greutati g4=new GreutatiDuble(60,70);


ColectieGreutati g5=new ColectieGreutati(10);
g5.adauga(g1);
g5.adauga(g2);
System.out.println(g5.medie());
}

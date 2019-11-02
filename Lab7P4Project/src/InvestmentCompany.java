
public class InvestmentCompany {
public Project[] project= new Project[100];
private int contor=0;
public void addProject(Project p)
{
	if(contor<this.project.length)
		{project[contor]=p;
	     contor++;
		}	     
}

public int getBestInvestment() {
	double minim=10000000;
	int tineminte=0;
	for(int i =0;i<project.length;i++)
	{
		if(project[i] instanceof Militare)
		{
			if(((Militare)project[i]).getRisk()<minim)
              minim=((Militare)project[i]).getRisk();
			tineminte=i;
		}
		else if(project[i] instanceof Comerciale)
		{
			if(((Comerciale)project[i]).getRisk()<minim)
	              minim=((Comerciale)project[i]).getRisk();
				tineminte=i;
		}
		else if(project[i] instanceof OpenSource)
		{
			if(((OpenSource)project[i]).getRisk()<minim)
	              minim=((OpenSource)project[i]).getRisk();
				tineminte=i;
		}
	}
	return tineminte;
	
}

public static void main(String[] args) {
	Project p1 = new Comerciale(10,"Alex","Locu1","4 zile","Alexandru",100);
	Project p2 = new Militare("Beni","locul 2 ",200,"5 zile","Ceaules");
	Project p3= new OpenSource("Ceai","locul 3",300,"ceau.Alex");
	Member m1= new Manager("A",20);
	Member m2= new Participant("B",30);			
	Member m3= new Participant("C",22);
	Member m4= new Participant("D",31);
	Member m5= new Participant("E",34);
	p1.addMember(m1);
	p1.addMember(m2);;
	p2.addMember(m3);
	p3.addMember(m4);
	p3.addMember(m5);
	InvestmentCompany i1= new InvestmentCompany();
	i1.addProject(p1);
	i1.addProject(p2);
	i1.addProject(p3);
	System.out.println(i1.getBestInvestment());
	
}
}

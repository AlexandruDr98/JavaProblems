
public class Banca {
private Client[] client=new Client[100];
private String codBanca;
private int contor=0;
public void add(Client c) {
	client[contor]=c;
	contor++;
}
public void afisareClient(String nume) {
	for(int i=0;i<client.length;i++)
		if(nume==client[i].getNume()) 
			System.out.println(client[i].toString());
}

}

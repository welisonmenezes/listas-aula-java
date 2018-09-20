
public class HelloWorld {

	public static void main(String[] args) {
		
		// teste adiciona no fim
		ListaLigada lista = new ListaLigada();
	    lista.adiciona("Rafael");
	    lista.adiciona("Paulo");
	    System.out.println(lista);
	    
	    //teste adiciona por posição
	    ListaLigada lista2 = new ListaLigada();
	    lista2.adiciona("Rafael");
	    lista2.adiciona(0, "Paulo");
	    lista2.adiciona(1, "Camila");
	    System.out.println(lista2);
	    
	    // teste pega por posicao
	    ListaLigada lista3 = new ListaLigada();
	    lista3.adiciona("Rafael");
	    lista3.adiciona("Paulo");
	    System.out.println(lista3.pega(0));
	    System.out.println(lista3.pega(1));
	    
	    // teste remove por posição
	    ListaLigada lista4 = new ListaLigada();
	    lista4.adiciona("Rafael");
	    lista4.adiciona("Paulo");
	    lista4.adiciona("Camila");
	    lista4.remove(1);
	    System.out.println(lista4);
	    
	    // teste tamanho
	    ListaLigada lista5 = new ListaLigada();
	    lista5.adiciona("Rafael");
	    lista5.adiciona("Paulo");
	    System.out.println(lista5.tamanho());
	    lista5.adiciona("Camila");
	    System.out.println(lista5.tamanho());
	    
	    // teste contem elemento
	    ListaLigada lista6 = new ListaLigada();
	    lista6.adiciona("Rafael");
	    lista6.adiciona("Paulo");
	    System.out.println(lista6.contem("Rafael"));
	    System.out.println(lista6.contem("Camila"));
	    
	    // teste adiciona no começo
	    ListaLigada lista7 = new ListaLigada();
	    lista7.adicionaNoComeco("Rafael");
	    lista7.adicionaNoComeco("Paulo");
	    System.out.println(lista7);
	    
	    // teste remove do começo
	    ListaLigada lista8 = new ListaLigada();
	    lista8.adiciona("Rafael");
	    lista8.adiciona("Paulo");
	    lista8.removeDoComeco();
	    System.out.println(lista8);
	    
	    // teste remove do fim
	    ListaLigada lista9 = new ListaLigada();
	    lista9.adiciona("Rafael");
	    lista9.adiciona("Paulo");
	    lista9.removeDoFim();
	    System.out.println(lista9);
	   
	}

}

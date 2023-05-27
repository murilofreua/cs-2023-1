import java.util.List;

public class Agenda {
	
	private List<Contato> lista;
	
	public void adicionaContato (Contato c ) {
		lista.add(c);
	}
	
	public Contato buscaContato (String nome, String email) {
		
		int a = 1;
		
		while(a != 0) {
		
			for(int i = 0; i < lista.size(); i++) {
				
				if(lista.get(i).getNome() == nome || lista.get(i).getEmail() == email) {
					
					a = 0;
					return lista.get(i);
				}
			}
		}
		
		return null;
	}
	
	public void excluiContato(String nome) {
		
		for(int i = 0; i < lista.size(); i++) {
			
			if(lista.get(i).getNome() == nome)
				lista.remove(i);
		}
	}
	
	public void listaContatos () {
		
		for(int i = 0; i < lista.size(); i++) {
			
			System.out.println("Nome: " + lista.get(i).getNome() + "\n" + "E-mail: " + lista.get(i).getEmail() + "\n\n");
		}
	}
}

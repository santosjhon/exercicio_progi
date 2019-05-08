import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	public final static byte TAM = 3;

	public static void main(String[] args) {
		String nome , email = null,cidade = null , uf = null;
		int codigo = 0;
		int quantos = 0 ;
		
		
		try {
			for (int i = 0 ; i < TAM ; i ++ ){
	
				int comparacao = 0;
			
				byte opcao = Byte.parseByte( JOptionPane.showInputDialog("ESCOLHA UMA DAS OPCÕES ABAIXO.\n1-Cadastrar \n2-Consultar\n3-Atualizar\n4-Excluir\n5-Listar\n6-Sair\n7-Mostra cliente"));
				
				switch (opcao){
				case 1 :
					cadatrarCliente(quantos);
					break;
				case 2 : 
					consultaCliente();
				case 3 :
					atualizar();
				case 4 : 
					excluir();
				case 5 : 
					listar();
				case 6 : 
					sair();
					break;
				case 7 :
					

				default :
					mensagem();
					
				} 
			}
		}
			catch (Exception ex){
				mensagem();
			}
		}
				
	public static void mensagem (){
		JOptionPane.showMessageDialog(null, " Opcao invalida ! ");;
		
	}
	public static void cadatrarCliente(int quantos){
		quantos = Integer.parseInt(JOptionPane.showInputDialog("Quatos clientes quer cadastrar agora ? "));
		String nome,email , cidade , uf ;
		int codigo;
		nome = JOptionPane.showInputDialog("Digite seu nome : ");
		codigo = Integer.parseInt(JOptionPane.showInputDialog("DIgite seu codigo : "));
		email = JOptionPane.showInputDialog("Digite seu email : ");
		cidade = JOptionPane.showInputDialog("Digite sua cidade ");
		uf = JOptionPane.showInputDialog("Digite o uf da sua cidade ");
		
		Classe cliente = new Classe();
		cliente.setnome(nome);
		cliente.setcodigo(codigo);
		cliente.setemail(email);
		cliente.setcidade(cidade);
		cliente.setuf(uf);
		
		Classe [] vetor = new Classe [TAM];
		vetor[quantos] = cliente;
		quantos ++;
		
		System.out.println("Cliente " + cliente.getnome() + " cadastrado com sucesso ! ");
		System.out.println("Codigo : " + cliente.getcodigo());
		System.out.println("E-mail : " + cliente.getemail());
		System.out.println("Cidade : " + cliente.getcidade());
		System.out.println("UF da cidade : " + cliente.getuf());
		System.out.println("Clientes cadastrados : " + quantos);

	}
	
	public static void consultaCliente(){	
		
	}
	public static void atualizar(){	
		
	}
	public static void excluir (){		
	}
	public static void listar(){
	}
	public static void sair (){
}
	
	
}

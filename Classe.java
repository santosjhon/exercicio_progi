import javax.swing.JOptionPane;

public class Classe {
	private String nome;
	private int codigo;
	private String email;
	private String cidade;
	private String uf;
	private boolean tamanho;
	
	
	public Classe(){//metodo contrutor 
		this.filaCheia();
		this.nome = "";
		this.codigo = 0 ;
		this.email = "";
		this.cidade = "";
		this.uf = "";
	}

	public void setnome(String n){
		this.nome = n;
	}
	public String getnome(){
		return this.nome;
	}
	public void setcodigo(int c){
		this.codigo = c;
	}
	public int getcodigo(){
		return this.codigo;
	}
	public void setemail(String e){
		this.email = e;
	}
	public String getemail(){
		return this.email;
	}
	public void setcidade(String c){
		this.cidade = c ;
	}
	public String getcidade(){
		return this.cidade;
	}
	public void setuf(String u){
		this.uf= u;
	}
	public String getuf(){
		return this.uf;
	}
	
	public void filaCheia(){
		this.tamanho = false;
	}
	public void filaVazia(){
		this.tamanho = true;
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

package Bebida;

public abstract class Bebida {
	
	
	private String nome;
	private double preco;
	
	public abstract mostrarBebida();
	
	public abstract verificarPreco(double preco);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}

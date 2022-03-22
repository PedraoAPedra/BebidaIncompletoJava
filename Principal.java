package Bebida;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Vinho meuVinho = new Vinho();
		Suco meuSuco = new Suco();
		Refrigerante meuRefri = new Refrigerante();

		String menuPrin[] = {"Cadastrar", "Mostrar bebida", "Verificar preço", "Sair"}; 
		String menuBeb[] = {"Vinho", "Suco", "Refrigerante", "Sair"};
		String retornavel[] = {"Sim", "Não"};
		String menuMostrar[] = {"Vinho", "Suco", "Refrigerante", "Sair"};
		int confirmacao, opcBeb, mostrarBeb, verifPreco;
		
			
			
do {
				
				
			 confirmacao = JOptionPane.showOptionDialog(null, "Bem vindo. Selecione uma opção","Menu principal", 0, JOptionPane.PLAIN_MESSAGE, null, menuPrin, menuPrin[0]);
			 
switch(confirmacao) {
			 
		case 0:
			 
				
		opcBeb = JOptionPane.showOptionDialog(null, "Selecione uma opção","Menu cadastro", 0, JOptionPane.PLAIN_MESSAGE, null, menuBeb, menuBeb[0]);
					if(opcBeb==0) {
						meuVinho.setNome(JOptionPane.showInputDialog(null, "Qual o nome do vinho?"));
						meuVinho.setTipo(JOptionPane.showInputDialog(null, "Qual o tipo do vinho?"));
						meuVinho.setSafra(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a safra do vinho?")));
						meuVinho.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do vinho?")));
					};
			
			 
			//----------------------------------------------------------------------------------------------
			 				
					 if(opcBeb==1) {
						 meuSuco.setNome(JOptionPane.showInputDialog(null, "Qual o nome do suco?"));
						 meuSuco.setSabor(JOptionPane.showInputDialog(null, "Qual o sabor do suco?"));
						 meuSuco.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do suco?")));
					 };
	
		 //----------------------------------------------------------------------------------------------
		
					 if (opcBeb==2) {
						 meuRefri.setNome(JOptionPane.showInputDialog(null, "Qual o nome do refigerante?"));
						 meuRefri.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do refigerante?")));
					 };
		
			//----------------------------------------------------------------------------------------------
			break;
			
			
		case 1:
			
			mostrarBeb = JOptionPane.showOptionDialog(null, "Selecione uma opção","Mostrar bebida", 0, JOptionPane.PLAIN_MESSAGE, null, menuBeb, menuBeb[0]);
			
			if(mostrarBeb==0) {
			JOptionPane.showMessageDialog(null, "Este é o vinho cadastrado" + "\nNome: " + meuVinho.getNome() + "\nTipo: " + meuVinho.getTipo() + "\nSafra: "  + meuVinho.getSafra() + "\nValor: R$" + meuVinho.getPreco());
			}
			if(mostrarBeb==1) {
				JOptionPane.showMessageDialog(null, "Este é o suco cadastrado" + "\nNome: " + meuSuco.getNome() + "\nSabor: " + meuSuco.getSabor() + "\nValor: R$" + meuSuco.getPreco());
			}
			if(mostrarBeb==2) {
				JOptionPane.showMessageDialog(null, "Este é o refrigerante cadastrado" + "\nNome: " + meuRefri.getNome() + "\nValor: R$" + meuRefri.getPreco());
			}

			break;
			
			
			
		case 2:
			
			verifPreco = JOptionPane.showOptionDialog(null, "Selecione uma opção","Verificar preco", 0, JOptionPane.PLAIN_MESSAGE, null, menuBeb, menuBeb[0]);	
			
			if(verifPreco==0) {
				
			}
			
			
			
			
}
}while(confirmacao!=3);


	}
}


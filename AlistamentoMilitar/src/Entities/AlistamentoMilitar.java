package Entities;

import javax.swing.JOptionPane;

public class AlistamentoMilitar {
	private String dadosPessoa1[] = new String[9];

	/**
	 * dados [0] = nome, dados [1] = Ano de nascimento, dados [2] = Nome da mãe, dados
	 * [3] = Nome do pai, dados [4] = Telefone, dados [5] = Email ,dados [6] = Altura
	 * ,dados [7] = Peso ,dados [8] = multa
	 */
	
	public AlistamentoMilitar(String nome,String anoNacimento,String nomeMae,String nomePai,String telefone,String email, String altura, String peso,String multa) {
		this.dadosPessoa1[0] = nome;
		this.dadosPessoa1[1] = anoNacimento;
		this.dadosPessoa1[2] = nomeMae;
		this.dadosPessoa1[3] = nomePai;
		this.dadosPessoa1[4] = telefone;
		this.dadosPessoa1[5] = email;
		this.dadosPessoa1[6] = altura;
		this.dadosPessoa1[7] = peso;
		this.dadosPessoa1[8] = multa;
	}
	
	// Gets
	public String[] getDados() {
		return dadosPessoa1;
	}

	public void startAplication() {
		String[] options = { "Fazer Alistamento", "Alterar Telefone", "Visualizar Cadastro", "Sair" };
		int choice = JOptionPane.showOptionDialog(null, "Selecione uma opção", "Menu", JOptionPane.DEFAULT_OPTION,
				JOptionPane.DEFAULT_OPTION, null, options, null);
		switch (choice) {
		case 0:
			informarAnoNacimento();
			
			break;
		case 1:

			break;
		case 2:

			break;
		case 3:

			break;
		default:
			break;
		}

	}
	

	

	public void informarAnoNacimento() {
		int anoNacimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano de nacimento"));
		int idade = anoNacimento - 2023;
		if (idade >= 18 && idade < 45) {
			multaPorIdade(idade);
			anoNacimento(anoNacimento);
			pesoEaltura();
			informarNomes();
		} else if (idade >= 45) {
			JOptionPane.showMessageDialog(null, "A idade maxima para se alistar é de 45 anos");
		}
		JOptionPane.showMessageDialog(null, "A idade minima para se alistar é de 18 anos");
	}

	public void multaPorIdade(int idade) {
		if (idade > 20) {
			double multa = (idade - 18) * 5.00;
		}
	}

	public void anoNacimento(int anoNacimento) {
		dadosPessoa1[8] = String.format(null, anoNacimento);
	}

	public void pesoEaltura() {
		String peso = JOptionPane.showInputDialog(null, "Informe o peso");
		peso(peso);
		String altura = JOptionPane.showInputDialog(null, "Informe a altura");
		altura(altura);
	}

	public void peso(String peso) {
		dadosPessoa1[8] = peso;
	}

	public void altura(String altura) {
		dadosPessoa1[8] = altura;
	}

	public void informarNomes() {
		String nome = JOptionPane.showInputDialog(null, "Informe o nome");
		nome(nome);
		String nomeMae = JOptionPane.showInputDialog(null, "Informe o nome da mae");
		nomeMae(nomeMae);
		String nomePai = JOptionPane.showInputDialog(null, "Informe o nome do pai");
		nomePai(nomePai);
	}

	public void nome(String nome) {
		dadosPessoa1[1] = nome;
	}

	public void nomeMae(String nome) {
		dadosPessoa1[3] = nome;
	}

	public void nomePai(String nome) {
		dadosPessoa1[4] = nome;
	}

	public void dadosDeContato() {
		String telefone = JOptionPane.showInputDialog(null, "Informe o numero de telefone");
		telefone(telefone);
		String email = JOptionPane.showInputDialog(null, "Informe E-mai");
		email(email);
	}

	public void telefone(String telefone) {
		dadosPessoa1[5] = telefone;
	}

	public void email(String email) {
		dadosPessoa1[6] = email;
	}

}

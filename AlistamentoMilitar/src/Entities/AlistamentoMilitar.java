package Entities;

import javax.swing.JOptionPane;

public class AlistamentoMilitar {
	private String dadosPessoa1[] = new String[9];

	public AlistamentoMilitar(String nome, String anoNacimento, String nomeMae, String nomePai, String telefone,
			String email, String altura, String peso) {
		this.dadosPessoa1[0] = nome;
		this.dadosPessoa1[1] = anoNacimento;
		this.dadosPessoa1[2] = nomeMae;
		this.dadosPessoa1[3] = nomePai;
		this.dadosPessoa1[4] = telefone;
		this.dadosPessoa1[5] = email;
		this.dadosPessoa1[6] = altura;
		this.dadosPessoa1[7] = peso;
	}

	public String[] getDadosPessoa1() {
		return dadosPessoa1;
	}

	public void cadastrarRecruta() {
		String anoNacimento = JOptionPane.showInputDialog("Informe o ano de nacimento");
		int ano = Integer.parseInt(anoNacimento);
		int idade = 2023 - ano;
		if (idade >= 18 && idade < 45) {
			anoNacimento(anoNacimento);
			String peso = JOptionPane.showInputDialog("Informe o peso");
			peso(peso);
			String altura = JOptionPane.showInputDialog("Informe o altura");
			altura(altura);
			String nome = JOptionPane.showInputDialog("Informe o nome");
			nome(nome);
			String nomeMae = JOptionPane.showInputDialog("Informe o nome da mae");
			nomeMae(nomeMae);
			String nomePai = JOptionPane.showInputDialog("Informe o nome do pai");
			nomePai(nomePai);
			String email = JOptionPane.showInputDialog("Informe o email para contato");
			email(email);
			String telefone = JOptionPane.showInputDialog("Informe o telefone para contato");
			telefone(telefone);
			double multa = calcularMulta();
			if (multa > 0) {
				String stringMulta = String.format("%.2f", multa);
				multa(stringMulta);
			}

		} else if (idade > 45) {
			JOptionPane.showMessageDialog(null, "Idade maxima para o alistamento é de 45 anos!!");
		} else {
			JOptionPane.showMessageDialog(null, "Idade minima para o alistamento é de 18 anos!!");
		}

	}

	public double calcularMulta() {
		int idade = 2023 - Integer.parseInt(getDadosPessoa1()[1]);
		double multa = (idade - 19) * 5;
		return multa;
	}

	public void multa(String multa) {
		this.dadosPessoa1[8] = multa;
	}

	public void nome(String nome) {
		this.dadosPessoa1[0] = nome;
	}

	public void anoNacimento(String anoNacimento) {
		this.dadosPessoa1[1] = anoNacimento;
	}

	public void nomeMae(String nomeMae) {
		this.dadosPessoa1[2] = nomeMae;
	}

	public void nomePai(String nomePai) {
		this.dadosPessoa1[3] = nomePai;
	}

	public void telefone(String telefone) {
		this.dadosPessoa1[4] = telefone;
	}

	public void email(String email) {
		this.dadosPessoa1[5] = email;
	}

	public void altura(String altura) {
		this.dadosPessoa1[6] = altura;
	}

	public void peso(String peso) {
		this.dadosPessoa1[7] = peso;
	}

	public String toString() {
		double multa = calcularMulta();
		if (multa > 0) {
			return "Nome: " + getDadosPessoa1()[0] + "\n" + "Ano de nascimento: " + getDadosPessoa1()[1] + "\n"
					+ "Nome da mãe: " + getDadosPessoa1()[2] + "\n" + "Nome do pai: " + getDadosPessoa1()[3] + "\n"
					+ "Telefone: " + getDadosPessoa1()[4] + "\n" + "E-mail: " + getDadosPessoa1()[5] + "\n" + "Altura: "
					+ getDadosPessoa1()[6] + "\n" + "Peso: " + getDadosPessoa1()[7] + "\n" + "Multa: "
					+ getDadosPessoa1()[8] + "\n";
		} else {
			return "Nome: " + getDadosPessoa1()[0] + "\n" + "Ano de nascimento: " + getDadosPessoa1()[1] + "\n"
					+ "Nome da mãe: " + getDadosPessoa1()[2] + "\n" + "Nome do pai: " + getDadosPessoa1()[3] + "\n"
					+ "Telefone: " + getDadosPessoa1()[4] + "\n" + "E-mail: " + getDadosPessoa1()[5] + "\n" + "Altura: "
					+ getDadosPessoa1()[6] + "\n" + "Peso: " + getDadosPessoa1()[7];
		}

	}
}

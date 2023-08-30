package Entities;
/*
 * @autor
 * Marcos Henrique O. G. da Silva
 * GitHub//https://github.com/MarcosHogs97/Alistamento.git
 * **/
import javax.swing.JOptionPane;
import java.time.Year;

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

	private void setDadosPessoa1(int index, String dados) {
		this.dadosPessoa1[index] = dados;
	}

	public void multa(String multa) {
		setDadosPessoa1(8, multa);
	}

	public void nome(String nome) {
		setDadosPessoa1(0, nome);
	}

	public void anoNacimento(String anoNacimento) {
		setDadosPessoa1(1, anoNacimento);
	}

	public void nomeMae(String nomeMae) {
		setDadosPessoa1(2, nomeMae);
	}

	public void nomePai(String nomePai) {
		setDadosPessoa1(3, nomePai);
	}

	public void telefone(String telefone) {
		setDadosPessoa1(4, telefone);
	}

	public void email(String email) {
		setDadosPessoa1(5, email);
	}

	public void altura(String altura) {
		setDadosPessoa1(6, altura);
	}

	public void peso(String peso) {
		setDadosPessoa1(7, peso);
	}

	public void cadastrarRecruta() {
		int idade = informarAnoNascimento();
		if (idade >= 18 && idade < 45) {
			String nome = JOptionPane.showInputDialog("Informe o nome");
			nome(nome);
			double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
			peso(String.format("%.3f", peso));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe o altura"));
			altura(String.format("%.2f", altura));
			String nomeMae = JOptionPane.showInputDialog("Informe o nome da mae");
			nomeMae(nomeMae);
			String nomePai = JOptionPane.showInputDialog("Informe o nome do pai");
			nomePai(nomePai);
			String email = JOptionPane.showInputDialog("Informe o email para contato");
			email(email);
			inputTelefone();
			double multa = calcularMulta();
			if (multa > 0) {
				multa(String.format("%.2f", multa));
			}
		}
	}

	public int informarAnoNascimento() {
		String anoNascimento = JOptionPane.showInputDialog(null, "Informe o ano de nacimento");
		int ano = Integer.parseInt(anoNascimento);
		int anoAtula = Year.now().getValue();
		int idade = anoAtula - ano;
		if (anoNascimento.length() != 4 || idade < 18 || idade > 45) {
			JOptionPane.showMessageDialog(null, "Dados inválidos, O recruta deve ter entre 18 a 45 anos");
			informarAnoNascimento();
		} else {
			anoNacimento(anoNascimento);
		}

		return idade;

	}

	public void inputTelefone() {
		String telefone = JOptionPane.showInputDialog("Informe o telefone para contato");
		if (telefone.length() != 11) {
			JOptionPane.showMessageDialog(null,
					"O número de telefone deve ter 11 dígitos seguindo o padrao (xx) x xxxx-xxxx.");
			inputTelefone();
		} else {
			telefone(telefone);
		}

	}

	public String formatacaoTelefone(String telefone) {
		String numeroFormatado = null;
		numeroFormatado = String.format("(%s) %s %s-%s", telefone.substring(0, 2), telefone.substring(2, 3),
				telefone.substring(3, 7), telefone.substring(7));
		return numeroFormatado;
	}

	public double calcularMulta() {
		int idade = 2023 - Integer.parseInt(getDadosPessoa1()[1]);
		double multa = (idade - 19) * 5;
		return multa;
	}

	public String toString() {
		double multa = calcularMulta();
		if (multa > 0) {
			return "\nNome: " + getDadosPessoa1()[0] + "\n" + "Ano de nascimento: " + getDadosPessoa1()[1] + "\n"
					+ "Nome da mãe: " + getDadosPessoa1()[2] + "\n" + "Nome do pai: " + getDadosPessoa1()[3] + "\n"
					+ "Telefone: " + formatacaoTelefone(getDadosPessoa1()[4]) + "\n" + "E-mail: " + getDadosPessoa1()[5]
					+ "\n" + "Altura: " + getDadosPessoa1()[6] + "m\n" + "Peso: " + getDadosPessoa1()[7] + "Kg\n"
					+ "Multa: R$ " + getDadosPessoa1()[8] + "\n";
		} else {
			return "\nNome: " + getDadosPessoa1()[0] + "\n" + "Ano de nascimento: " + getDadosPessoa1()[1] + "\n"
					+ "Nome da mãe: " + getDadosPessoa1()[2] + "\n" + "Nome do pai: " + getDadosPessoa1()[3] + "\n"
					+ "Telefone: " + formatacaoTelefone(getDadosPessoa1()[4]) + "\n" + "E-mail: " + getDadosPessoa1()[5]
					+ "\n" + "Altura: " + getDadosPessoa1()[6] + "m\n" + "Peso: " + getDadosPessoa1()[7] + "Kg";
		}

	}
}

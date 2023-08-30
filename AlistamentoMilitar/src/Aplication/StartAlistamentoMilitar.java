package Aplication;

/*
 * @autor
 * Marcos Henrique O. G. da Silva
 * GitHub//https://github.com/MarcosHogs97/Alistamento.git
 * **/
import javax.swing.JOptionPane;

import Entities.AlistamentoMilitar;

public class StartAlistamentoMilitar {

	public static void main(String[] args) {
		int quantidadeRecruta = quantidadeRecruta();
		if (quantidadeRecruta > 1) {
			AlistamentoMilitar[] recrutas = new AlistamentoMilitar[quantidadeRecruta];
			for (int i = 0; i < recrutas.length; i++) {
				recrutas[i] = new AlistamentoMilitar(null, null, null, null, null, null, null, null);
				recrutas[i].cadastrarRecruta();
			}
			String informaçoes = "";
			for (AlistamentoMilitar recruta : recrutas) {
				informaçoes += "============================\n" + "Programa de alistamento militar V.1\n"
						+ recruta.toString();
			}
			JOptionPane.showMessageDialog(null, informaçoes);
		} else {
			AlistamentoMilitar recrutas = new AlistamentoMilitar(null, null, null, null, null, null, null,null);
			recrutas.cadastrarRecruta();
			JOptionPane.showMessageDialog(null, "Informções do recruta 01\n" + recrutas.toString());
		}

	}

	public static int quantidadeRecruta() {
		int quantidadeRecruta = Integer.parseInt(JOptionPane.showInputDialog(
				"Bem Vindo ao alistamento militar obrigatorio\nInforme quantos recrutas quer cadastrar"));
		if (quantidadeRecruta <= 0) {
			JOptionPane.showMessageDialog(null, "Informe um valor maior que 0");
			quantidadeRecruta();
		}
		return quantidadeRecruta;
	}
}

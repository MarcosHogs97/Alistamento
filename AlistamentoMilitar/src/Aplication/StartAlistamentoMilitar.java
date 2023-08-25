package Aplication;

import javax.swing.JOptionPane;

import Entities.AlistamentoMilitar;

public class StartAlistamentoMilitar {

	public static void main(String[] args) {
		int quantidadeRecruta =  quantidadeRecruta();
		if(quantidadeRecruta > 1) {
			AlistamentoMilitar[] recrutas = new AlistamentoMilitar[quantidadeRecruta];
			for (int i = 0; i < recrutas.length; i++) {
				recrutas[i] = new AlistamentoMilitar("", "", "", "", "", "", "", "");
				recrutas[i].cadastrarRecruta();
			}
			JOptionPane.showMessageDialog(null, "Informções do recruta 01\n" + recrutas[0].toString()
					+ "\nInformções do recruta 02\n" + recrutas[1].toString());
		}else {
			AlistamentoMilitar recrutas = new AlistamentoMilitar("", "", "", "", "", "", "", "");
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

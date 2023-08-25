package Aplication;

import javax.swing.JOptionPane;

import Entities.AlistamentoMilitar;

public class StartAlistamentoMilitar {

	public static void main(String[] args) {
		AlistamentoMilitar[] recrutas = new AlistamentoMilitar[2];

		for (int i = 0; i < recrutas.length; i++) {
			recrutas[i] = new AlistamentoMilitar("", "", "", "", "", "", "", "");
			recrutas[i].cadastrarRecruta();
		}
		JOptionPane.showMessageDialog(null, "Informções do recruta 01\n" + recrutas[0].toString()
				+ "\nInformções do recruta 02\n" + recrutas[1].toString());

	}

}

package br.com.tkzi.visao;

import javax.swing.JFrame;

import br.com.tkzi.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {

	public TelaPrincipal() {
		//define como vai ser o tabuleiro linhas/colunas/minas
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 6);
		add(new PainelTabuleiro(tabuleiro));

		setTitle("Campo minado");
		setSize(690, 480);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {

		new TelaPrincipal();

	}

}

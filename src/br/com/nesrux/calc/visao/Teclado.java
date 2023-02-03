package br.com.nesrux.calc.visao;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Teclado extends JPanel {
	private final Color CINZA_ESCURO = new Color(68, 68, 68);
	private final Color CINZA_CLARO = new Color(99, 99, 99);
	private final Color LARANJA = new Color(242, 163, 60);

	public Teclado() {
		setLayout(new GridLayout(5,4));
		add(new Botao("AC", CINZA_ESCURO));
		add(new Botao("+/-", CINZA_ESCURO));
		add(new Botao("%", CINZA_ESCURO));
		add(new Botao("/", LARANJA));

		add(new Botao("7", CINZA_CLARO));
		add(new Botao("8", CINZA_CLARO));
		add(new Botao("9", CINZA_CLARO));
		add(new Botao("*", LARANJA));
		
		add(new Botao("4", CINZA_CLARO));
		add(new Botao("5", CINZA_CLARO));
		add(new Botao("6", CINZA_CLARO));
		add(new Botao("*", LARANJA));
		
		add(new Botao("4", CINZA_CLARO));
		add(new Botao("5", CINZA_CLARO));
		add(new Botao("6", CINZA_CLARO));
		add(new Botao("*", LARANJA));
		
		add(new Botao("4", CINZA_CLARO));
		add(new Botao("5", CINZA_CLARO));
		add(new Botao("6", CINZA_CLARO));
		add(new Botao("*", LARANJA));
	}

}

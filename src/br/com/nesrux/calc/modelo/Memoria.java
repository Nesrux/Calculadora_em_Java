package br.com.nesrux.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

	private enum TipoComando {
		ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA
	};

	private static final Memoria instancia = new Memoria();

	private final List<MemoriaObservador> observadores = new ArrayList<>();

	private String textoAtual = "";

	private Memoria() {
	}

	public static Memoria getInstancia() {
		return instancia;
	}

	public void addObservador(MemoriaObservador observador) {
		observadores.add(observador);
	}

	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}

	public void processarComando(String valor) {
		TipoComando tipoComando = detectarTipoComando(valor);
		System.out.println(tipoComando);

		if ("AC".equals(valor)) {
			textoAtual = "";
		} else {
			textoAtual += valor;
			observadores.forEach(o -> o.valorAlterado(textoAtual));
		}
	}

	private TipoComando detectarTipoComando(String valor) {
		if (textoAtual.isEmpty() && valor == "0") {
			return null;
		}
		try {
			Integer.parseInt(valor);
			return TipoComando.NUMERO;
		} catch (NumberFormatException e) {
			//Quando nao for número cai aqui
			if("AC".equals(valor)) {
				return TipoComando.ZERAR;
			}
		}

		return null;
	}

}

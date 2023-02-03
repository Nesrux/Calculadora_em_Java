package br.com.nesrux.calc.modelo;
@FunctionalInterface
public interface MemoriaObservador {

	void valorAlterado(String novoValor);
}

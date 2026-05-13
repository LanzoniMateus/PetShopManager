package br.patinhasFelizes.servico.banho;

import br.patinhasFelizes.animal.Animal;
import br.patinhasFelizes.servico.Servico;

public class Banho extends Servico {

    public Banho(String descricao, int duracaoMin) {
        super(descricao, duracaoMin);
    }

    @Override
    public double calcularCusto(Animal a) {
        return a.calcularPrecoBase() + (getDuracaoMin() * 0.5);
    }
}

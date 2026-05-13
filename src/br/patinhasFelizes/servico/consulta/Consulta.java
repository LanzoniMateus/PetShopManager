package br.patinhasFelizes.servico.consulta;

import br.patinhasFelizes.animal.Animal;
import br.patinhasFelizes.servico.Servico;

public class Consulta extends Servico {
    public Consulta(String descricao, int duracaoMin) {
        super(descricao, duracaoMin);
    }

    @Override
    public double calcularCusto(Animal a) {
        return a.calcularPrecoBase() + 35;
    }
}

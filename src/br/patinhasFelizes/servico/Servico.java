package br.patinhasFelizes.servico;

import br.patinhasFelizes.animal.Animal;

public abstract class Servico {
    private String descricao;
    private int duracaoMin;

    public Servico(String descricao, int duracaoMin) {
        this.descricao = descricao;
        this.duracaoMin = duracaoMin;
    }

    public abstract double calcularCusto(Animal a);

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }

    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }
}

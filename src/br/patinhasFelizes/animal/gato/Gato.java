package br.patinhasFelizes.animal.gato;

import br.patinhasFelizes.animal.Animal;

public class Gato extends Animal {
    private String pelagem;

    public Gato(double peso, String nome, String pelagem) {
        super(peso, nome);
        this.pelagem = pelagem;
    }

    @Override
    public double calcularPrecoBase() {
        double precoBase = 0;
        if (pelagem.equalsIgnoreCase("curto")) {
            precoBase = 45;
        } else if (pelagem.equalsIgnoreCase("longo")) {
            precoBase = 65;
        }

        return calcularPrecoBase();
    }
}

package br.patinhasFelizes.animal.cachorro;

import br.patinhasFelizes.animal.Animal;

public class Cachorro extends Animal {

    public Cachorro(double peso, String nome) {
        super(peso, nome);
    }

    @Override
    public double calcularPrecoBase() {
        double precoBase = 0;
        if (getPeso() <= 10) {
            precoBase = 40;
        } else if (getPeso() <= 25) {
            precoBase = 60;
        } else {
            precoBase = 85;
        }

        return calcularPrecoBase();
    }
}

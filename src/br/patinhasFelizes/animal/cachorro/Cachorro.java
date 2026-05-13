package br.patinhasFelizes.animal.cachorro;

import br.patinhasFelizes.animal.Animal;

public class Cachorro extends Animal {

    public Cachorro(double peso, String nome) {
        super(peso, nome);
    }

    @Override
    public double calcularPrecoBase() {
        if (getPeso() <= 10) {
            return  40;
        } else if (getPeso() <= 25) {
            return 60;
        } else {
            return  85;
        }
    }
}

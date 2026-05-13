package br.patinhasFelizes.animal.passaro;

import br.patinhasFelizes.animal.Animal;

public class Passaro extends Animal {

    public Passaro(double peso, String nome) {
        super(peso, nome);
    }

    @Override
    public double calcularPrecoBase() { return 30; }
}

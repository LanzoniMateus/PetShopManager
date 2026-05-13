package br.patinhasFelizes.animal;

public abstract class Animal {
    private double peso;
    private String nome;

    public Animal(double peso, String nome) {
        this.peso = peso;
        this.nome = nome;
    }

    public abstract double calcularPrecoBase();

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

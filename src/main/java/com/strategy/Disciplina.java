package com.strategy;

/**
 * Classe que representa uma disciplina e usa Strategy para calcular média
 */
public class Disciplina {
    private String nome;
    private double p1;
    private double p2;
    private double media;
    private String situacao;
    private MediaStrategy estrategia;
    
    /**
     * Construtor que recebe a estratégia de cálculo
     */
    public Disciplina(MediaStrategy estrategia) {
        this.estrategia = estrategia;
    }
    
    /**
     * Calcula a média usando a estratégia injetada
     */
    public void calcularMedia() {
        // Implementar usando estrategia.calcularMedia()
        this.media = estrategia.calcularMedia(p1, p2);
        // Implementar usando estrategia.verificarSituacao()
        this.situacao = estrategia.verificarSituacao(media);
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public double getMedia() {
        return media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }  

    public void setEstrategia(MediaStrategy estrategia) {
        this.estrategia = estrategia;
    }
}

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
        // TODO: Implementar usando estrategia.calcularMedia()
        // TODO: Implementar usando estrategia.verificarSituacao()
    }
    
    // TODO: Implementar getters e setters
}

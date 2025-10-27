package com.strategy;

public class Main {
    public static void main(String[] args) {
        // Testando com Média Aritmética
        MediaStrategy estrategia = new Aritmetica();
        Disciplina d = new Disciplina(estrategia);
        
        d.setNome("Padrões de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.calcularMedia();
        
        System.out.printf("P1: %.2f  P2: %.2f  Média: %.2f  Situação: %s%n",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao());
        
        // Para testar com Média Geométrica, troque:
        // MediaStrategy estrategia = new Geometrica();
    }
}
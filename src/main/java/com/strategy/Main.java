package com.strategy;

public class Main {
    public static void main(String[] args) {
        // Testando com Média Aritmética
        MediaStrategy arit = new Aritmetica();
        Disciplina d = new Disciplina(arit);
        
        d.setNome("Padrões de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.calcularMedia();
        
        System.out.printf("===Média Aritimética===\nP1: %.2f  P2: %.2f  Média: %.2f  Situação: %s%n",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao());
        
        // Para testar com Média Geométrica, troque:
        // MediaStrategy estrategia = new Geometrica();

        MediaStrategy geom = new Geometrica();
        Disciplina f = new Disciplina(geom);

        f.setNome("Padrões de Desenvolvimento");
        f.setP1(10);
        f.setP2(5);
        f.calcularMedia();

        System.out.printf("\n===Média Geométrica===\nP1: %.2f  P2: %.2f  Média: %.2f  Situação: %s%n",
                f.getP1(), f.getP2(), f.getMedia(), f.getSituacao());
                
    }
}
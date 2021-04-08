/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

/**
 *
 * @author diego
 */
public class Jogador {
    private final int quantidade_cartas = 5;
    private final String nome;
    private int [] mao = new int [quantidade_cartas];
    private int pontos = 0;

    public Jogador(String nome, int[] mao, int pontos) {
        this.nome = nome;
        this.mao = mao;
        this.pontos = pontos;
        
    }

    public int getQuantidade_cartas() {
        return quantidade_cartas;
    }

    public String getNome() {
        return nome;
    }

    public int[] getMao() {
        return mao;
    }

    public int getPontos() {
        return pontos;
    }
    public static int soma_pontos(int cartas_casa, int cartas_jogador){
        return (cartas_casa + cartas_jogador);
        
    }
}

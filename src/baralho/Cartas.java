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
public enum Cartas {
    DOIS("2",2, "C02"), TRES("3",3, "C03"), QUATRO("4",4, "C04"), CINCO("5",5, "C05"), SEIS("6",6, "C06"), SETE("7",7, "C07"), OITO("8",8, "C08"), NOVE("9",9, "C09"), DEZ("10",10, "C10"),
    J("valete",11, "C11"), Q("rainha",12, "C12"), K("rei",13, "C13"), A("as",14, "C14");
    
    private final String nome_carta_imagem;
    private final String nome_carta;
    private final int nome_pontos;

    public String getNome_carta() {
        return nome_carta;
    }

    public int getNome_pontos() {
        return nome_pontos;
    }
    public String getNome_carta_imagem() {
        return nome_carta_imagem;
    }
    private Cartas(String nome_carta, int nome_pontos, String nome_carta_imagem) {
        this.nome_carta = nome_carta;
        this.nome_pontos = nome_pontos;
        this.nome_carta_imagem = nome_carta_imagem;
    }
}

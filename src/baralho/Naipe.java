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
public enum Naipe {
    COPAS("copas", "NC"), ESPADA("espada", "NE"), OURO("ouro", "NO"), PAUS("paus","NP" );
    private final String naipes;
    private String nome_naipe;
    

    private Naipe(String naipes, String nome_naipe) {
        this.naipes = naipes;
        this.nome_naipe = nome_naipe;
    }

    public String getNome_naipe() {
        return nome_naipe;
    }

    public String getNaipes() {
        return naipes;
    }
    
}

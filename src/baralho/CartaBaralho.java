/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

import java.security.SecureRandom;
import javax.swing.ImageIcon;

/**
 *
 * @author diego
 */
public class CartaBaralho {
    private Cartas carta;
    private Naipe naipe;
    static private ImageIcon img_cartas;
    static private final SecureRandom mistura_cartas = new SecureRandom();

    public CartaBaralho(Cartas carta, Naipe naipe, ImageIcon img_cartas) {
        this.carta = carta;
        this.naipe = naipe;
        this.img_cartas = img_cartas;
    }

    public Cartas getCarta() {
        return carta;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public static ImageIcon getImg_cartas() {
        return img_cartas;
    }
    
    public static CartaBaralho[] gera_baralho(){
        int tamanho= Naipe.values().length * Cartas.values().length;
        CartaBaralho deck [] = new CartaBaralho[tamanho];
        int i = 0;
        for(Naipe naipe: Naipe.values()){
            for (Cartas cartas: Cartas.values()){
                deck[i++] = new CartaBaralho(cartas,naipe, img_cartas );
            }
        }
        for(int primeiro = 0; primeiro< deck.length; primeiro++){
            int segundo = mistura_cartas.nextInt(tamanho);
            CartaBaralho auxiliar = deck[primeiro];
            deck[primeiro] = deck[segundo];
            deck[segundo] = auxiliar;
        }
         return deck;   
    }
    public static void main(String[] args){
        CartaBaralho baralho1[] = CartaBaralho.gera_baralho();
        for(CartaBaralho baralho: baralho1){
            System.out.println(baralho.getCarta().getNome_carta()+" de "+ baralho.getNaipe().getNaipes());
        }
    }   
    
            
}

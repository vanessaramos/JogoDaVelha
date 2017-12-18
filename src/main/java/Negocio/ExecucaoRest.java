/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author Vanessa Ramos
 */


@Path("jogo")
public class ExecucaoRest {

    
    static Jogo jogo = new Jogo();
    
    @GET
    @Path("começar")
    public String começar() {
        jogo.iniciar();
        
        return "<h1>Jogo da Velha</h1>"+jogo.tabuleiro.imprimirTabuleiro();
    }

    @GET
    @Path("jogar")
    public String jogar(@QueryParam("posicao") String posicao) {
        return "<h1>Jogo da Velha</h1>"+jogo.jogar(posicao);
    }
    
    
}

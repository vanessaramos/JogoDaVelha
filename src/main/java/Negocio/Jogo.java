package Negocio;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;

public class Jogo {

    static boolean iniciar = true;

    static Tabuleiro tabuleiro = new Tabuleiro();
    static Jogador jogador;
    static int verificarJogador = 1;
    static Jogadas jogadas = new Jogadas();

    static final Jogador JOGADOR_X = new Jogador(Jogador.X);
    static final Jogador JOGADOR_O = new Jogador(Jogador.O);

    public void iniciar() {
        Jogo jogo = new Jogo();
        jogador = JOGADOR_X;
        tabuleiro.construirTabuleiro();
    }

    public String jogar(String posicao) {
        if (iniciar == true) {
            this.iniciar();
            iniciar = false;
            
            return tabuleiro.imprimirTabuleiro();
        }

        if (jogadas.verificarJogadas(posicao, tabuleiro) == true) {
            return tabuleiro.imprimirTabuleiro() + "<br>" + "<font size=5 color=red>"+"Posicao ocupada. Jogue novamente";

        } 
        else {
            alterarJogador();
            jogadas.fazerJogada(jogador, posicao, tabuleiro);
        }
            if (jogadas.verificarVencedor(tabuleiro, jogador) == true) {
                iniciar = true;
                return "<font size=5>"+"Jogador " + jogador.getSimbolo() + " venceu";
            }
        return tabuleiro.imprimirTabuleiro();

    }

    public void alterarJogador() {
        if (jogador == JOGADOR_X) {
            jogador = JOGADOR_O;
        } else {
            jogador = JOGADOR_X;
        }

    }

}

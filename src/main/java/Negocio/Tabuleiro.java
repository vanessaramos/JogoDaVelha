package Negocio;



public class Tabuleiro {

    static String tab[][] = new String[3][3];
   

    public static String[][] getTab() {
        return tab;
    }

    public static void setTab(String[][] tab) {
        Tabuleiro.tab = tab;
    }

    public void construirTabuleiro() {
        tab[0][0] = "1";
        tab[0][1] = "2";
        tab[0][2] = "3";

        tab[1][0] = "4";
        tab[1][1] = "5";
        tab[1][2] = "6";

        tab[2][0] = "7";
        tab[2][1] = "8";
        tab[2][2] = "9";

    }

    public String imprimirTabuleiro() {
        String tabela = "";
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {

                tabela += tab[i][j] + "|";

            }
            tabela = "<font size=6>"+tabela + "<br>";
        }

        return tabela;
    }

}

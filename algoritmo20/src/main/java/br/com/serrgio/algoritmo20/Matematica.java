package br.com.serrgio.algoritmo20;

/**
* Serviços oferecidos para calculo da razão Aurea
*/
public class Matematica {

    /**
     *
     * razaoAurea
     *     
     * @param t1
     * @param t2
     * @param fator
     * @return tc / ta
     */
    public static double razaoAurea(int t1, int t2, int fator) {

        if (!(t1 > 0) || (!(t2 < t1) && !(fator > 0))) {
            throw new IllegalArgumentException("Valores inválidos");
        }

        int tc = t2;
        int ta = t1;
        int i = 1;

        while (i <= fator) {
            tc = tc + ta;
            ta = tc - ta;
            i = i + 1;
        }

        return tc / ta;
    }

}

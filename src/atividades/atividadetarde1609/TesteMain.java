package atividades.atividadetarde1609;

import atividades.atividadetarde1609.exercicio2.ManipulaString;
import atividades.atividadetarde1609.exercicio3.Retangulo;

public class TesteMain {

    public static void main(String[] args) {

//      =================== EXERCICIO 2 =======================
        ManipulaString manipulaString = new ManipulaString();
        String nome = "Jaula";

        manipulaString.invertString(nome);

        String palindromo = "subi no ónibus";

        manipulaString.palindromo(palindromo);

//    ==================== EXERCICIO 3 =======================

        Retangulo retangulo = new Retangulo();
        retangulo.calculaArea(6.5, 4.3);

        retangulo.calculaPerimetro(3.3, 5.8);

        System.out.printf("A quantidade de lajotas necessária é:  %.2f", retangulo.quantidadePiso(0.45, 4.8));

        System.out.printf("A quantidade de lajotas para preencher o rodapé é: %.2f ",
                            retangulo.quantidadeRodaPe(0.40, 4.12));



    }

}

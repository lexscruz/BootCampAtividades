package atividades.atividadetarde1609.exercicio2;

import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;

public class ManipulaString {

    public void invertString(String nome){
        StringBuffer sb = new StringBuffer(nome.toUpperCase(Locale.ROOT));
        sb.reverse();
        System.out.println(sb);
    }

    public void palindromo(String nome){

        String nomeSemAcento = retiraAcentos(nome);
        String nomeSemEspacoEAcento = retiraEspaco(nomeSemAcento);

        StringBuffer sb = new StringBuffer(nomeSemEspacoEAcento.toUpperCase(Locale.ROOT)).reverse();
        String stringauxiliar = sb.toString();

        if (nomeSemEspacoEAcento.equalsIgnoreCase(stringauxiliar)){
            System.out.println("É um palindromo.");
            System.out.println("Nome recebido: " + nome + " Nome invertido: " + stringauxiliar);
        }else{
            System.out.println("Não é um palindromo.");
            System.out.println("Nome recebido: " + nome + " Nome invertido: " + stringauxiliar);
        }
    }

    public static String retiraEspaco(String texto){
        return texto.replace(" ", "");
    }


    public static String retiraAcentos(String texto){
        String nfdNormalizedString = Normalizer.normalize(texto, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("");
    }
}

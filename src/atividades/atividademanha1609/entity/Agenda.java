package atividades.atividademanha1609.entity;

import java.util.*;

public class Agenda {
    private static List<Pessoa> pessoasList = new ArrayList<>();

    public void armazenaPessoa(Pessoa pessoa){
        pessoasList.add(pessoa);
    }

    public void removePessoa(String nome){

        for (int i=0;i < pessoasList.size();i++){
            if (pessoasList.get(i).getNome().equals(nome)){
                pessoasList.remove(i);
                System.out.println(nome + " foi removido.");
            }
        }
    }

    public int buscaPessoa(String nome){

        for (Pessoa p :
                pessoasList) {
            if (p.getNome().equals(nome)){
                int posicao = pessoasList.indexOf(p) + 1;
                return posicao;
            }
        }
        return 0;

    }

    public void exibirTodaAgenda(){

        for (Pessoa p :
                pessoasList) {
            System.out.println(p.toString());
        }

//        pessoasList.stream().forEach(System.out::println);
    }

    public void exibirPessoa(int posicao){
        System.out.println(pessoasList.get(posicao));
    }

    public void listarPessoasEmOrdemAlfabeticaDeNome() {

      pessoasList.stream().sorted(Comparator.comparing(Pessoa::getNome)).forEach(System.out::println);

    }


    public void listarPessoasEmOrdemAlfabeticaDeEndereco() {

        pessoasList.stream().sorted(Comparator.comparing(Pessoa::getEndereco)).forEach(System.out::println);
    }

    public void listarPessoasPorIdade() {
        pessoasList.stream().sorted(Comparator.comparing(Pessoa::getIdade)).forEach(System.out::println);
    }
}

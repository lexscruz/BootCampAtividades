package atividades.atividademanha1609;

import atividades.atividademanha1609.entity.Agenda;
import atividades.atividademanha1609.entity.Pessoa;

public class TesteMain {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        Agenda agenda = new Agenda();

        agenda.armazenaPessoa(new Pessoa("Alex", "joao dentice", "51 998762345", 23, 1.78));
        agenda.armazenaPessoa(new Pessoa("Maria", "dentice", "51 998762345", 60, 1.62));
        agenda.armazenaPessoa(new Pessoa("Ines", "joao", "51 998762345", 63, 1.60));
        agenda.armazenaPessoa(new Pessoa("Cassia", "Porto", "51 998762345", 37, 1.65));
        agenda.armazenaPessoa(new Pessoa("Benjamin", "Alegre", "51 998762345", 12, 1.56));
        agenda.armazenaPessoa(new Pessoa("Joaquim", "Angola", "51 998762345", 28, 1.70));
        agenda.armazenaPessoa(new Pessoa("Marcelo", "Bahia", "51 998762345", 28, 1.68));
        agenda.armazenaPessoa(new Pessoa("Hugo", "São", "51 998762345", 31, 1.75));
        agenda.armazenaPessoa(new Pessoa("Matheus", "Paulo", "51 998762345", 24, 1.72));
        agenda.armazenaPessoa(new Pessoa("Mauri", "Rio Grande do Sul", "51 998762345", 42, 1.80));

        agenda.exibirTodaAgenda();

        System.out.println("-------------- Removendo pessoa da Lista ------------------");

        agenda.removePessoa("Alex");

        agenda.removePessoa("Mauri");

        agenda.exibirTodaAgenda();

        System.out.println("\nEstá na posição: " + agenda.buscaPessoa("Hugo"));

        agenda.exibirPessoa(3);

        agenda.listarPessoasEmOrdemAlfabeticaDeNome();

        agenda.listarPessoasEmOrdemAlfabeticaDeEndereco();

        agenda.listarPessoasPorIdade();

    }
}

package service.Isevice;

import models.Pessoa;

import java.util.Arrays;
import java.util.List;

public class servicePessoaImpl implements IservicePessoa {
    private static List<Pessoa> listaPessoas =
            Arrays.asList(new Pessoa("Ana"),
                    new Pessoa("Bruna"),
                    new Pessoa("Carla"),
                    new Pessoa("Debora"),
                    new Pessoa("Eliza"),
                    new Pessoa("Fatima"),
                    new Pessoa("Giovana"));

    public Pessoa getPessoa(String nome) {
        return listaPessoas.stream().filter(pessoa -> pessoa.getNome()
                .equals(nome)).findFirst().orElse(null);
    }
}

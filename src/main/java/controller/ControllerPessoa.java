package Controller;

import models.Pessoa;
import service.Isevice.IservicePessoa;

public class ControllerPessoa {

    final IservicePessoa iservicePessoa;

    public ControllerPessoa(IservicePessoa iservicePessoa) {
        this.iservicePessoa = iservicePessoa;
    }

    public Pessoa getPessoa(String nome) {
        Pessoa pessoa = iservicePessoa.getPessoa(nome);
        return pessoa;
    }
}

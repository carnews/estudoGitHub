import Controller.ControllerPessoa;
import models.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;
import service.Isevice.IservicePessoa;

import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ControllerPessoaTest {

    IservicePessoa iservicePessoa;

    @BeforeAll
    void init(){
        iservicePessoa = Mockito.mock(IservicePessoa.class);
    }

    @Test
    void getPessoa(){
        when(iservicePessoa.getPessoa("Ana")).thenReturn(new Pessoa("Ana"));
        ControllerPessoa controllerPessoa = new ControllerPessoa(iservicePessoa);
        Pessoa pessoa = controllerPessoa.getPessoa("Ana");
        Assertions.assertEquals("Ana", pessoa.getNome());
    }
}

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import models.Pessoa;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MainTest {
    public static void main(String[] args) {
        String uri = "/etc/propriedades/lista-pessoas.txt";
        Consumer imprimi = System.out::println;
        /*
        List<Pessoa> listaPessoas = new ArrayList<>();
        Path arqListaPessoas = Paths.get(uri);
        try {
            List<String> linhas = Files.readAllLines(arqListaPessoas);

            Gson g = new Gson();
            for (String linha : linhas) {
                listaPessoas.add(g.fromJson(linha, Pessoa.class));
            }


            listaPessoas.forEach(imprimi);

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        System.out.println("____________");
        ObjectMapper mapper = new ObjectMapper();
        List<Pessoa> lp = new ArrayList<>();
        try {
            lp =  Arrays.asList(mapper.readValue(new File(uri), Pessoa[].class));
            lp.forEach(imprimi);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

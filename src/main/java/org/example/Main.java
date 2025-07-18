package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.certificado.Certificado;
import org.example.model.certificado.ListaCertificados;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        final String LOCAL_ARQUIVO = "src/main/resources/";
        final String NOME_ARQUIVO = ".json";
        final String NOME_ARQUIVO_FILTRADO = ".json";

        ObjectMapper mapper = new ObjectMapper();
        ListaCertificados listaCertificados = mapper.readValue(new File(LOCAL_ARQUIVO + NOME_ARQUIVO), ListaCertificados.class);

        List<Certificado> certificadosValidos = new ArrayList<>();

        for (Certificado c : listaCertificados.getCertificados()) {
            if(VerificadorDominio.isDominioValido(c.getDominio().getPrincipal())) {
                certificadosValidos.add(c);
            } else {
                System.out.println("Domínio inválido ou não pertence mais à Casanova: " + c.getDominio().getPrincipal());
            }
        }

        ListaCertificados listaFiltrada = new ListaCertificados();

        listaFiltrada.setConta(listaCertificados.getConta());
        listaFiltrada.setHttpChallenges(listaCertificados.getHttpChallenges());
        listaFiltrada.setTlsChallenges(listaCertificados.getTlsChallenges());
        listaFiltrada.setCertificados(certificadosValidos);

        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(LOCAL_ARQUIVO + NOME_ARQUIVO_FILTRADO), listaFiltrada);
        System.out.println("✅ Processo concluído. Arquivo 'traefik-filtrado.json' gerado com " +
                certificadosValidos.size() + " certificados válidos.");

    }
}
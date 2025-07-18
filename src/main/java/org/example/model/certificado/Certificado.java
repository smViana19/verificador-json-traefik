package org.example.model.certificado;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Certificado {
    @JsonProperty("Domain")
    private Dominio dominio;

    @JsonProperty("Certificate")
    private String certificado;

    @JsonProperty("Key")
    private String chave;

    public Dominio getDominio() {
        return dominio;
    }

    public String getCertificado() {
        return certificado;
    }

    public String getChave() {
        return chave;
    }
}

package org.example.model.certificado;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dominio {
    @JsonProperty("Main")
    private String principal;
    @JsonProperty("SANs")
    private Object sans;

    public String getPrincipal() {
        return principal;
    }

    public Object getSans() {
        return sans;
    }
}

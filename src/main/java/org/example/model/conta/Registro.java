package org.example.model.conta;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Registro {
    @JsonProperty("body")
    public Body body;

    @JsonProperty("uri")
    public String uri;
}

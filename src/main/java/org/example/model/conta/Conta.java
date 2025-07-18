package org.example.model.conta;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Conta {
    @JsonProperty("Email")
    public String email;

    @JsonProperty("Registration")
    public Registro registration;

    @JsonProperty("PrivateKey")
    public String privateKey;

    @JsonProperty("KeyType")
    public String keyType;

}

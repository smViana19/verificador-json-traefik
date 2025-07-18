package org.example.model.conta;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Body {
    @JsonProperty("status")
    public String status;

    @JsonProperty("contact")
    public List<String> contact;
}

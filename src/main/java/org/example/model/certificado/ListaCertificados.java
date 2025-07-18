package org.example.model.certificado;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.model.conta.Conta;

import java.util.List;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class ListaCertificados {

    @JsonProperty("Account")
    private Conta conta;

    @JsonProperty("Certificates")
    private List<Certificado> certificados;

    @JsonProperty("HTTPChallenges")
    public Object httpChallenges;

    @JsonProperty("TLSChallenges")
    public Object tlsChallenges;

    public List<Certificado> getCertificados() {
        return certificados;
    }

    public void setCertificados(List<Certificado> certificados) {
        this.certificados = certificados;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Object getHttpChallenges() {
        return httpChallenges;
    }

    public void setHttpChallenges(Object httpChallenges) {
        this.httpChallenges = httpChallenges;
    }

    public Object getTlsChallenges() {
        return tlsChallenges;
    }

    public void setTlsChallenges(Object tlsChallenges) {
        this.tlsChallenges = tlsChallenges;
    }
}

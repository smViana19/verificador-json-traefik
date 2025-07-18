package org.example;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.List;

public class VerificadorDominio {
    private static final String IP_VALIDO = "165.227.255.222";

    public static boolean isDominioValido(String dominio) {
        try {
            InetAddress endereco = InetAddress.getByName(dominio);
            String ip = endereco.getHostAddress();
            return IP_VALIDO.contains(ip);
        } catch (Exception e){
            System.out.println("Ocorreu um erro ao tentar verificar o dominio: " + e);
            return false;
        }
    }
}

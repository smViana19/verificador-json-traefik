# 🧹 Verificador de Certificados Traefik

Este projeto é uma solução automatizada em Java para verificar e limpar registros inválidos do arquivo JSON gerado pelo Traefik, contendo domínios e certificados SSL. Ele foi criado para resolver um problema comum: **o Traefik não remove automaticamente entradas antigas ou inválidas**, o que pode gerar acúmulo de dados desnecessários.

## 💡 Objetivo

Analisar e identificar registros de domínios que:

- Não estão mais acessíveis (ping falha ou não resolvem DNS).
- Não apontam mais para o IP da empresa.
- Foram abandonados por clientes ou substituídos por novos domínios.

Após a verificação, a aplicação gera um novo arquivo JSON contendo apenas os registros ainda válidos, **mantendo intactas seções importantes** como `Account` e `HTTPChallenges`.

---

## 🛠️ Tecnologias Utilizadas

- Java 8
- Jackson (leitura/escrita JSON)
- InetAddress (verificação DNS/IP)
- Maven (opcional, para gerenciamento de dependências)

---

## 📁 Estrutura do JSON Esperado

```json
{
  "Account": {
    "Email": "...",
    "Registration": { ... },
    "PrivateKey": "...",
    "KeyType": "..."
  },
  "Certificates": [
    {
      "Domain": {
        "Main": "exemplo.com",
        "SANs": [...]
      },
      "Certificate": "...",
      "Key": "..."
    }
  ],
  "HTTPChallenges": { ... }
}

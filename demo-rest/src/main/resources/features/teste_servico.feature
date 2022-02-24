#language: pt
Funcionalidade: servicos API

  @CT01_TestarServico
  Esquema do Cenario: Testar Servico
    Dado que o sistema "<URL>" esteja acessivel

    Exemplos: 
      | URL                                             |
      | /accountservice/accountrest/api/v1/health-check |
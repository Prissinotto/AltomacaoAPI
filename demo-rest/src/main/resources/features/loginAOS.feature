#language: pt
Funcionalidade: Login Usuario 

	@CT03_Login
  Esquema do Cenario: Realizar Login
    Dado que o sistema "<URL>" esteja acessivel
    E o usuario realiza o login  com "<email>" "<password>" "<loginName>"

    Exemplos: 
      | URL                                             | email             | password  | loginName  |
      | /accountservice/accountrest/api/v1/health-check | email03@teste.com | Teste@123 | testando07 |
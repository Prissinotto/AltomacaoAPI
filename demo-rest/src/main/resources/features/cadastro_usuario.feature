#language: pt
Funcionalidade: Cadastro usuario 

  @CT02_cadastro_usuario
  Esquema do Cenario: cadastro_usuario
    Dado que o sistema "<URL>" esteja acessivel
    Entao o usuario cria uma conta de usuario "<accountType>""<address>""<allowOffersPromotion>""<aobUser>""<cityName>""<country>""<email>""<firstName>""<lastName>""<loginName>""<password>""<phoneNumber>""<stateProvince>""<zipcode>"

    Exemplos: 
      | URL                                             | accountType | address  | allowOffersPromotion | aobUser | cityName | country      | email             | firstName | lastName   | loginName | password  | phoneNumber | stateProvince | zipcode |
      | /accountservice/accountrest/api/v1/health-check | USER        | endereço | true                 | true    | cidade   | AUSTRALIA_AU | email03@teste.com | nometest  | sobrenomeT |           | Teste@123 |  1199665544 | estado        | 0223654 |

  
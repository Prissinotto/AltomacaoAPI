#language: pt
Funcionalidade: carrinho de compra
 
 @CT04_AdicionarProdutoCarrinho
  Esquema do Cenario: AdicionarProdutoCarrinho
   	Dado que o sistema "<URL>" esteja acessivel
    E adicionar um produto ao carrinho "<email>" "<password>" "<loginName>" "<color>" "<productId>" "<quantidade>" "<userId>"

    Exemplos: 
      | URL                                             | email             | password  | loginName  | color  | productId | quantidade | userId    |
      | /accountservice/accountrest/api/v1/health-check | email03@teste.com | Teste@123 | testando07 | 414141 |        20 |          1 | 271680216 |

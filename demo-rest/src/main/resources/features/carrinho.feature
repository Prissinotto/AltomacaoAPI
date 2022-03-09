#language: pt
Funcionalidade: carrinho de compra

  @CT04_AdicionarProdutoCarrinho
  Esquema do Cenario: AdicionarProdutoCarrinho
    Dado que o sistema "<URL>" esteja acessivel
    E adicionar um produto ao carrinho "<email>" "<password>" "<loginName>" "<color>" "<productId>" "<quantidade>" "<userId>"

    Exemplos: 
      | URL                                             | email             | password  | loginName | color  | productId | quantidade | userId    |
      | /accountservice/accountrest/api/v1/health-check | email03@teste.com | Teste@123 | NewUser56 | 414141 |        20 |          1 | 943013159 |

  @CT05_ExcluirProdutosCarrinho
  Esquema do Cenario: ExcluirProdutosCarrinho
    Dado que o sistema "<URL>" esteja acessivel
    E excluir produto do carrinho "<email>" "<password>" "<loginName>" "<userId>"

    Exemplos: 
      | URL                                             | email             | password  | loginName | userId    |
      | /accountservice/accountrest/api/v1/health-check | email03@teste.com | Teste@123 | NewUser56 | 943013159 |

  @CT06_ExcluirUmProdutoCarrinho
  Esquema do Cenario: ExcluirUmProdutoCarrinho
    Dado que o sistema "<URL>" esteja acessivel
    E excluir um produto do carrinho "<email>" "<password>" "<loginName>" "<color>" "<productId>" "<userId>"

    Exemplos: 
      | URL                                             | email             | password  | loginName | color  | productId | userId    |
      | /accountservice/accountrest/api/v1/health-check | email03@teste.com | Teste@123 | NewUser56 | 414141 |        20 | 943013159 |

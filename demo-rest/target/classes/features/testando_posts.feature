#language: pt
Funcionalidade: Posts

  @CT001_testar_requisicao_pagina_post
  Cenario: Teste pagina post 200
    Dado que o usuario acesse a pagina post

    
  @CT002_validar_quantidade_usuarios
  Esquema do Cenario: Validar quantidade usuarios
    Dado que o usuario acesse a pagina post
    Entao a pagina apresenta "<QUANT_USUARIO>" usuarios cadastrados
    
   Exemplos: 
      |QUANT_USUARIO|
      |2|
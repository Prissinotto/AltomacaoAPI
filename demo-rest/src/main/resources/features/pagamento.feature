#language: pt
Funcionalidade: Pagamento

  @CT01_realizar_pagamento
  Esquema do Cenario: Realizar Pagamento
    Dado que o sistema "<URL>" esteja acessivel
    Entao o usuario realiza o pagamento "<MCCVVNumber>" "<MCCardNumber>" "<MCCustomerName>" "<MCCustomerPhone>" "<MCExpirationDate>" "<MCRecevingAmount.Value>" "<MCRecevingCard.AccountNumber>" "<MCRecevingCard.Currency>" "<MCTransactionDate>" "<MCTransactionType>"

    Exemplos: 
      | URL                              | MCCVVNumber | MCCardNumber     | MCCustomerName | MCCustomerPhone | MCExpirationDate | MCRecevingAmount.Value | MCRecevingCard.AccountNumber | MCRecevingCard.Currency | MCTransactionDate | MCTransactionType |
      | /MasterCredit/api/v1/healthcheck | 698				 | 1564565598744886 | teste testando | 1236598754			 | 122027						| 269.99								 | 112987298763									| USD                     | 23022022					| credit            |

      
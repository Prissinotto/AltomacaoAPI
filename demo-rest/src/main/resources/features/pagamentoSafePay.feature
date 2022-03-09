#language: pt
Funcionalidade: realizar pagamento com SafePay

  @CT01_FazerPagementoSafePay
  Esquema do Cenario: FazerPagementoSafePay
    Dado que o sistema "<URL>" esteja acessivel
    Entao o usuario raliza o pagamento com safePay "<SPCustomerPhone>" "<SPPassword>" "<SPReceivingAmount.Currency>" "<SPReceivingAmount.Value>" "<SPReceivingCard.AccountNumber>" "<SPTransactionDate>" "<SPTransactionType>" "<SPUserName>"

    Exemplos: 
      | URL                         | SPCustomerPhone | SPPassword | SPReceivingAmount.Currency | SPReceivingAmount.Value | SPReceivingCard.AccountNumber | SPTransactionDate | SPTransactionType | SPUserName     |
      | /SafePay/api/v1/healthcheck |      1236598754 | Safe1234   | USD                        |                  269.99 |                     111111111 |                   | PAYMENT           | teste testando |

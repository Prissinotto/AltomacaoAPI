#language: pt
Funcionalidade: Devices

  @CT03_Listar_dispositivos
  Esquema do Cenário: 02241239370583 - Verificar listagem de devices
    Dado que faço login na api com o nome "<NOME>" e senha "<SENHA>"
    E obtenho os devices disponíveis
    Entao valido se existem dispositivos disponíveis
    Exemplos: 
      | NOME              | SENHA    |
      | admin@default.com | Rsi@2020 |

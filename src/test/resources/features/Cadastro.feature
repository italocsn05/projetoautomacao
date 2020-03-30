#language: pt
#encoding: UTF-8
#author: Marcos Barbosa


  Funcionalidade: Cadastro de usuário

    Cenario: Validar mensagem de sucesso ao cadastrar um usuário

      Dado que acesso a pagina de criação do usuário
      E estou realizando o teste
        | Numero do CT |                          Nome do CT            | Nome do executor   | Sprint   |
        | 123-XXX      |         Descricao com o nome do caso de teste  |  Marcos Barbosa    | Sprint 3 |
      E preencho os dados validos de cadastro
      Entao visualizo a mensagem "Usuário Criado com sucesso"

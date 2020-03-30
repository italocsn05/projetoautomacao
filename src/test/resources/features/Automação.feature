#language: pt
#encoding: UTF-8
#author: Marcos Barbosa


Funcionalidade: Cadastrar usuário

  @web
  Cenario: Validar a mensagem de sucesso ao criar um novo usuário

    Dado que entro na pagina de criação de usuário
    E estou realizando o teste
      | Numero do CT |                          Nome do CT            | Nome do executor   | Sprint   |
      | 123-XXX      |         Descricao com o nome do caso de teste  |  Italo Cabral    | Sprint 3 |
    E preencho o formulário com dados válidos
    Entao valido o teste com a mensagem "Usuário Criado com sucesso"

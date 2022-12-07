# Plano de Testes para vvs-auth-user


##  AuthServiceTest  
### Testes unitários
1. testGetToken: chama o método getToken e verifica por um token diferente de null;
2. testGetAdmin: chama o método getTokenAdmin e verifica por um token diferente de null;


##  AuthResourceTest  
### Testa a API e seus Endpoints
1. testGetJWT: Testa se o web service (ws) retorna uma resposta válida quando acessado seu endpoint **/auth/getjwt**. Resultado esperado é 200 como status code.
2. testGetJWTAdmin: Testa se o web service (ws) retorna uma resposta válida quando acessado seu endpoint **/auth/getadmin**. Resultado esperado é 200 como status code.


##  SistemaTest 
### Teste de Sistema, utilizando o Selenium

1. googleTest: Primeiro é feito um teste simples na página inicial do Google, pra verificar se o webDriver está funcionando, procurando pelo termo pesquisado "automation" no Titulo da página.  O Retorno esperado é *true*, para o caso que contenha o termo.
2. homeTest: Testa o carregamento da página Home e procura pela Palavra "Quarkus" no h1 da página. O Retorno esperado é *true*, para o caso que contenha o termo.

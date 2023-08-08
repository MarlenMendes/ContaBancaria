# ContaBancaria

## LISTA DE EXERCÍCIO SPRING - Entregar
Desenvolver uma API REST, uma aplicação que possua endpoints de listagem, cadastro, atualização e deleção de contas bancárias, utilizando tudo o que foi aprendido até o momento, ou seja, você fará uma API, pois o usuário pode fazer depósitos e saques.

## Funcionalidades:
1- Exibir de todos as contas;
2- Exibir de uma conta específica;
3- Cadastro de uma nova conta;
4- Deleção de uma conta;
5- Atualização do valor atual caso tenha um depósito;
6- Atualização do valor atual caso tenha um saque;

## Especificações:
1- Uma conta deve possuir:
 id;
numero de conta;
agencia;
nome do usuario;
valor atual da conta;
valor final;
valor fornecido para saque ou deposito (valor a ser acrescido ou subtraído no valor final);
tipo de serviço (saque ou depósito);

2- Sua aplicação deve conter pelo menos 1 tratamento de exceção, utilizando o Exception Handler

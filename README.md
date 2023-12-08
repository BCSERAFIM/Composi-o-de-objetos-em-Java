# Composição de objetos em Java 
Ler os dados de um pedido com N itens, depois, mostrar um sumário do pedido

## Comentários Conceituais:
Este programa Java é uma aplicação de console que permite ao usuário inserir dados do cliente, informações do pedido e detalhes dos itens do pedido.
O sistema utiliza as classes Client, Order, OrderItem, Product, e a enumeração OrderStatus.

### Diagrama de Classe:

### Objetos em Memória 


## Lógica:
1. Importa classes e pacotes necessários, incluindo Scanner para entrada do teclado e SimpleDateFormat para manipulação de datas.
2. Define a formatação de datas usando SimpleDateFormat.
3. Solicita ao usuário os dados do cliente, como nome, e-mail e data de nascimento.
4. Cria um objeto Client com os dados fornecidos.
5. Solicita ao usuário os dados do pedido, como status.
6. Cria um objeto Order com a data atual, status informado e o cliente criado anteriormente.
7. Pergunta ao usuário quantos itens ele deseja adicionar ao pedido.
8. Em um loop, para cada item, solicita os dados do produto (nome, preço e quantidade).
9. Cria objetos Product e OrderItem com os dados fornecidos, adicionando o OrderItem ao pedido.
10. Ao final, exibe um resumo do pedido.

### Sumário do pedido

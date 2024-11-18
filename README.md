# Analisando Jogos de Civilizações Antigas

## Autores

-   Eduardo Godoi da Silveira
-   João Junges Poitevin

## Dependências

Este projeto não possui dependências de pacotes ou frameworks externos para sua execução.

## Breve Explicação

O código deste projeto está estruturado em três classes principais:

1. **Classe Main**:
   Contém a lógica de entrada dos dados e exibição dos resultados finais. Ela serve como o ponto de partida para o programa, gerenciando a interação com o usuário.

2. **Classe BackTracking**:
   Implementa a lógica principal de backtracking utilizada para resolver o problema. Esta classe é responsável por explorar todas as combinações possíveis de placas, sendo o núcleo crítico e mais importante do trabalho.

3. **Classe Placa**:
   Uma classe auxiliar que representa cada placa utilizada no jogo. Contém os valores associados à placa e o método de inversão, permitindo que as orientações das placas sejam ajustadas. Na implementacao tentamos fazer o uso de listas encadeadas como uma tentativa de explorar diferentes abordagens, o que infelizmente não deu certo, então seguimos por listas de objetos placas.

## Como Executar

-   Compile o projeto em qualquer ambiente Java compatível.
-   Siga as instruções no console para inserir o número de placas e seus valores.

# PROMPTS: Grupo __

**Integrantes:**

1. Jonatan Viana Gomes
2.Thiago Gotti  Rapozo
**Prova:** POO

**Usamos IA?** (X) Sim  ( ) Não

**Qual ferramenta e modelo (se usaram):** ChatGPT

## Registro, na ordem

### Prompt 1

**O prompt (cópia exata):**

> Crie a estrutura de um projeto Java para uma locadora de veículos seguindo as regras da prova, usando uma classe abstrata Veiculo, herança para Carro, Moto e CarroEletrico e uma interface para o cálculo de recarga.

**O que a IA devolveu (uma ou duas linhas):**

A IA sugeriu as classes que deveriam existir, os pacotes `model` e `app` e a estrutura básica de herança e interface.

**O que fizemos com a resposta:** ( ) usamos como veio  (X) alteramos  ( ) descartamos

**Por quê (o que conferimos, o que mudamos):**

Conferimos a estrutura e adaptamos algumas partes para ficar de acordo com as regras da prova e com o jeito que estávamos fazendo o projeto.

### Prompt 2

**O prompt (cópia exata):**

> Implemente as classes Java dessa locadora. O Carro deve calcular diária vezes dias mais 10% de seguro. A Moto deve dar 15% de desconto quando o aluguel for de 5 dias ou mais. O CarroEletrico deve herdar de Carro, reaproveitar o cálculo do Carro e adicionar R$ 15 por dia de taxa de bateria. A recarga deve ser dias vezes consumo diário em kWh vezes R$ 0,80.

**O que a IA devolveu (uma ou duas linhas):**

A IA criou as classes e os métodos de cálculo de aluguel e recarga seguindo as regras informadas.

**O que fizemos com a resposta:** (X) usamos como veio  ( ) alteramos  ( ) descartamos

**Por quê (o que conferimos, o que mudamos):**

Conferimos as fórmulas e os valores da prova. Os cálculos estavam de acordo com o que foi pedido.

### Prompt 3

**O prompt (cópia exata):**

> Faça uma classe Main que teste o projeto. Preciso colocar carro, moto e carro elétrico em uma mesma lista de Veiculo e usar um único laço, sem instanceof e sem cast, para imprimir o resumo e calcular o aluguel. Também preciso testar a recarga percorrendo somente objetos que representam veículos elétricos através da interface.

**O que a IA devolveu (uma ou duas linhas):**

A IA criou a classe `Main`, uma lista de `Veiculo` para demonstrar o polimorfismo e uma lista de `Recarregavel` para testar a recarga.

**O que fizemos com a resposta:** (X) usamos como veio  ( ) alteramos  ( ) descartamos

**Por quê (o que conferimos, o que mudamos):**

Conferimos se não tinha `instanceof` nem cast no laço principal e verificamos se os três tipos estavam na mesma lista.

### Prompt 4

**O prompt (cópia exata):**

> Confira os cálculos da locadora e diga quais valores devem aparecer: carro de R$ 150 por 3 dias, moto de R$ 80 por 4 dias, moto de R$ 80 por 5 dias e carro elétrico de R$ 200 por 3 dias com consumo de 10 kWh por dia.

**O que a IA devolveu (uma ou duas linhas):**

A IA confirmou os valores: carro R$ 495,0; moto 4 dias R$ 320,0; moto 5 dias R$ 340,0; carro elétrico R$ 705,0 e recarga R$ 24,0.

**O que fizemos com a resposta:** (X) usamos como veio  ( ) alteramos  ( ) descartamos

**Por quê (o que conferimos, o que mudamos):**

Comparamos os valores da IA com a tabela da prova e depois conferimos os cálculos no programa.

### Prompt 5

**O prompt (cópia exata):**

> Revise o projeto completo procurando erros de POO, principalmente abstração, herança, sobrescrita, polimorfismo, interface e encapsulamento. Não altere as regras da prova.

**O que a IA devolveu (uma ou duas linhas):**

A IA revisou as classes e apontou que a estrutura estava usando os conceitos de POO pedidos na prova.

**O que fizemos com a resposta:** ( ) usamos como veio  (X) alteramos  ( ) descartamos

**Por quê (o que conferimos, o que mudamos):**

Conferimos cada classe manualmente e fizemos pequenos ajustes na organização do código antes de testar novamente.

## Como conferimos

Executamos o programa e comparamos os valores apresentados com a tabela da prova.

A saída conferida foi:

```text
=== VEÍCULOS ===
Placa: ABC-1234 | Modelo: Toyota Corolla
Aluguel: R$ 495.0

Placa: DEF-5678 | Modelo: Honda CG
Aluguel: R$ 320.0

Placa: GHI-9012 | Modelo: Tesla Model 3
Aluguel: R$ 705.0

=== TESTE MOTO 5 DIAS ===
Aluguel: R$ 340.0

=== RECARGA ===
Recarga: R$ 24.0
```

Os valores bateram com a tabela da prova.

## Onde a IA errou, ou onde nós erramos

Durante o teste, percebemos que precisávamos conferir principalmente o cálculo da moto com 5 dias, porque o desconto de 15% só deve ser aplicado a partir de 5 dias.

Também conferimos o carro elétrico, porque ele precisa reaproveitar o cálculo do carro e depois adicionar a taxa de bateria de R$ 15 por dia.

Depois de conferir as contas, os valores ficaram corretos.

## Respostas finais, sem consultar a IA

**Pergunta 1:**

Não dá para criar um `Veiculo` diretamente porque ele é uma classe abstrata. Isso faz sentido porque na locadora não existe um veículo genérico para alugar, e sim tipos específicos, como carro, moto e carro elétrico.

**Pergunta 2:**

Funciona porque carro, moto e carro elétrico são veículos e possuem o mesmo método `calcularAluguel`, mas cada classe faz o cálculo de uma maneira. O Java identifica qual método deve executar de acordo com o objeto. Isso é polimorfismo.

**Pergunta 3:**

A recarga está em uma interface porque nem todo veículo pode ser recarregado. Se colocássemos o método na classe `Veiculo`, a moto e o carro comum também teriam esse método, mesmo sem precisarem dele. A interface permite colocar esse comportamento somente nos veículos que realmente possuem recarga.
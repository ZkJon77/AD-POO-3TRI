# Registro do processo - PROMPTS

> IMPORTANTE: este arquivo é um modelo de registro. Durante a prova, os prompts devem ser registrados exatamente como foram enviados à IA, na ordem em que foram enviados. As respostas abaixo devem ser ajustadas para refletir o que realmente aconteceu.

## Prompt 1

**Prompt enviado:**

Crie a estrutura de um projeto Java para uma locadora de veículos seguindo estas regras: deve existir uma classe abstrata Veiculo com placa, modelo e valor da diária; Carro, Moto e CarroEletrico devem herdar dela; cada tipo deve calcular o aluguel de uma forma diferente; CarroEletrico deve herdar de Carro; e o cálculo de recarga deve ficar em uma interface usada somente pelo carro elétrico. Organize em pacotes model e app.

**O que a IA devolveu / o que fizemos:**

A IA sugeriu a estrutura das classes, a classe abstrata, as subclasses e a interface. Usamos a estrutura como base e conferimos se ela atendia às regras da prova.

---

## Prompt 2

**Prompt enviado:**

Implemente as classes Java dessa locadora. O Carro deve calcular diária vezes dias mais 10% de seguro. A Moto deve dar 15% de desconto quando o aluguel for de 5 dias ou mais. O CarroEletrico deve reaproveitar o cálculo do Carro e adicionar R$ 15 por dia de taxa de bateria. A recarga deve ser dias vezes consumo diário em kWh vezes R$ 0,80.

**O que a IA devolveu / o que fizemos:**

A IA implementou os cálculos. Conferimos manualmente os valores da tabela da prova e mantivemos a implementação depois de verificar as contas.

---

## Prompt 3

**Prompt enviado:**

Faça uma classe Main que teste o projeto. Preciso colocar carro, moto e carro elétrico em uma mesma lista de Veiculo e usar um único laço, sem instanceof e sem cast, para imprimir o resumo e calcular o aluguel. Também preciso testar a recarga percorrendo somente objetos que representam veículos elétricos através da interface.

**O que a IA devolveu / o que fizemos:**

A IA criou um exemplo de Main usando uma lista de Veiculo para demonstrar polimorfismo e uma lista da interface Recarregavel para a recarga. Conferimos se não havia instanceof nem cast no laço principal.

---

## Prompt 4

**Prompt enviado:**

Confira os cálculos da locadora e diga quais valores devem aparecer: carro de R$ 150 por 3 dias, moto de R$ 80 por 4 dias, moto de R$ 80 por 5 dias e carro elétrico de R$ 200 por 3 dias com consumo de 10 kWh por dia.

**O que a IA devolveu / o que fizemos:**

A IA confirmou os valores esperados: carro R$ 495,0; moto 4 dias R$ 320,0; moto 5 dias R$ 340,0; carro elétrico R$ 705,0 e recarga R$ 24,0. Conferimos a saída do programa com esses valores.

---

## Prompt 5

**Prompt enviado:**

Revise o projeto completo procurando erros de POO, principalmente abstração, herança, sobrescrita, polimorfismo, interface e encapsulamento. Não altere as regras da prova.

**O que a IA devolveu / o que fizemos:**

A IA revisou a estrutura. Conferimos as sugestões e verificamos que os atributos estavam privados, Veiculo era abstrata, os métodos de aluguel eram sobrescritos e a recarga estava na interface.

---

# Conferência final

- [x] Veiculo é abstrata e não pode ser instanciada.
- [x] Atributos são privados.
- [x] Carro, Moto e CarroEletrico usam herança.
- [x] Os cálculos de aluguel usam sobrescrita.
- [x] A lista de Veiculo demonstra polimorfismo.
- [x] O cálculo de recarga está na interface Recarregavel.
- [x] Os valores foram conferidos.
- [ ] Saída real do programa foi colada no README.
- [ ] Nomes dos integrantes foram preenchidos.

# Perguntas finais

## 1. Por que não dá para criar um Veiculo diretamente, e por que isso faz sentido para uma locadora?

Não dá para criar um Veiculo diretamente porque a classe foi feita como abstrata. Ela representa uma ideia geral de veículo, mas a locadora trabalha com tipos específicos, como carro e moto. Por isso faz sentido não permitir um veículo genérico.

## 2. Num único laço, o programa calcula o aluguel de carro, moto e carro elétrico sem saber qual é qual. Como isso funciona e qual é o nome desse conceito?

Isso funciona porque todos eles são Veiculo e cada classe possui sua própria versão do método calcularAluguel. Quando o método é chamado, o Java usa a implementação correta de cada objeto. Esse conceito é chamado de polimorfismo.

## 3. Por que o cálculo de recarga está numa interface e não na classe Veiculo? O que daria errado se estivesse lá?

A recarga está em uma interface porque somente alguns veículos possuem esse comportamento, como o carro elétrico. Se o método estivesse em Veiculo, carro comum e moto também teriam que possuir esse método, mesmo sem fazer sentido para eles. Isso deixaria o projeto menos organizado.

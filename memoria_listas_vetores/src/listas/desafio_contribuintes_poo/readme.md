Capítulo: Memória, vetores, listas

DESAFIO: Contribuintes OO e Lista

Para calcular o imposto de renda que uma pessoa deve pagar, um país aplica as seguintes regras: 

1) Imposto sobre salário: a pessoa paga
   imposto sobre seu salário conforme
   tabela abaixo.

Salário ------------------- | Imposto
--------------------------- | -------
Abaixo de 3000 por mês ---- | Isento
3000 até 5000 exclusive --- | 10%
5000 ou acima ------------- | 20%

2) Se a pessoa obteve renda com prestação de serviços, o imposto cobrado é de 15%. 

3) Se a pessoa obteve ganho de capital (imóveis, ações, etc.), o imposto cobrado é de 20%.

4) A pessoa pode abater até 30% do seu imposto bruto devido com gastos médicos ou educacionais. Mas
   se seus gastos médicos e educacionais forem abaixo desses 30%, apenas os gastos médicos e
   educacionais podem ser abatidos.

Você deve fazer um programa para ler os dados de N contribuintes,
armazenando os dados desses contribuintes em uma lista. Depois,
você deve mostrar, para cada contribuinte, um resumo do imposto
conforme exemplo abaixo.

Você deve utilizar uma classe TaxPayer conforme projeto ao lado
para representar cada contribuinte. Repare que sua lista vai ter que
ser uma List<TaxPayer>

Lembre-se de respeitar os nomes apresentados no projeto ao lado
(como foi fornecido o projeto para você executar, você tem que
respeitar a especificação do projeto). Sinta-se livre para
implementar construtores pra facilitar a instanciação dos objetos. 

Critérios de avaliação (todos devem estar corretos):

1) Nomes de classes, atributos, métodos e argumentos respeitando o projeto, bem como as convenções
   de nome para Java (classe com primeira letra maiúscula, e padrão "camel case" para atributos, variáveis
   e métodos.
2) Atributos corretos e devidamente encapsulados com métodos get/set.
3) Todos métodos corretos calculando os valores corretamente.
4) Comportamento do programa correto conforme exemplo.
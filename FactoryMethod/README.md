# **Padrão de Projeto Factory Method**

O Factory Method é bastante utilizado em diversos projetos, até mesmo nos casos em que temos apenas um Creator, pois mesmo nessas condições o padrão nos oferece um meio de desligar a implementação de um Product. Adicionando ou alterando Products isso não irá afetar o Creator, pois eles não estão fortemente ligados.

Com o padrão Factory Method podemos encapsular o código que cria objetos. É muito comum termos classes que instanciam classes concretas e essa parte do código normalmente sofre diversas modificações, portanto nesses casos usamos um Factory Method que encapsula esse comportamento de instanciação.

Usando o Factory Method temos o nosso código de criação em um objeto ou método, evitando assim a duplicação e além disso temos um local único para fazer manutenção. O padrão também nos dá um código flexível e extensível para o futuro.

**Exemplo:**

![img.png](img.png)

1. O Produto declara a interface, que é comum a todos os objetos que podem ser produzidos pelo criador e suas subclasses.
2. Produtos Concretos são implementações diferentes da interface do produto.
3. A classe Criador declara o método fábrica que retorna novos objetos produto. É importante que o tipo de retorno desse método corresponda à interface do produto.
Você pode declarar o método fábrica como abstrato para forçar todas as subclasses a implementar suas próprias versões do método. Como alternativa, o método fábrica base pode retornar algum tipo de produto padrão.
Observe que, apesar do nome, a criação de produtos não é a principal responsabilidade do criador. Normalmente, a classe criadora já possui alguma lógica de negócio relacionada aos produtos. O método fábrica ajuda a dissociar essa lógica das classes concretas de produtos. Aqui está uma analogia: uma grande empresa de desenvolvimento de software pode ter um departamento de treinamento para programadores. No entanto, a principal função da empresa como um todo ainda é escrever código, não produzir programadores.
4. Criadores Concretos sobrescrevem o método fábrica base para retornar um tipo diferente de produto.
Observe que o método fábrica não precisa criar novas instâncias o tempo todo. Ele também pode retornar objetos existentes de um cache, um conjunto de objetos, ou outra fonte.

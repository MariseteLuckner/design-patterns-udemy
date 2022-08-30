# **O Princípio da Substituição de Liskov**

O princípio da substituição de Liskov declara que as subclasses devem ser substituíveis por suas classes de base.

Isso quer dizer que, se a classe B for uma subclasse da classe A, devemos poder passar um objeto da classe B para qualquer método que espere um objeto da classe A e o método não deverá produzir resultados estranhos, nesse caso.

Esse é o comportamento esperado, pois, quando usamos a herança, levamos em conta que a classe filha herda tudo o que a superclasse tem. A classe filha estende o comportamento, mas nunca o reduz.

Portanto, quando uma classe não obedece esse princípio, isso causa alguns bugs ruins e difíceis de detectar.

O princípio de Liskov é fácil de entender, mas difícil de detectar no código.
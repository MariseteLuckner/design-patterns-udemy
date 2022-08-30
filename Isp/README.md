# **Interface Segmentation Principle**

O principio diz basicamente que o cliente não deve utilizar interfaces das quais não precise. Uma maneira bem simples
de entender o princípio, descrita em [1], é: considere um conjunto de clientes que possuem necessidades diferentes em 
alguns pontos, utilizar uma única interface que oferece vários métodos para todos os clientes fere o princípio, pois 
como os clientes possuem necessidades diferentes, esta interface acaba por oferecer métodos que não são necessários 
a todos os clientes.

Observe a imagem a seguir, nesse design todos os clientes utilizam uma mesma interface, assim, esta interface deve
oferecer métodos que supram as necessidades de todos os clientes.

![https://brizeno.files.wordpress.com/2012/01/interface-nc3a3o-segregada1.png](https://brizeno.files.wordpress.com/2012/01/interface-nc3a3o-segregada1.png)

Essa classe “SuperInterface” fere o ISP, pois os clientes são obrigados a utilizar uma interface a qual não necessitam. 
As implementações desta interface precisarão também suprir as necessidades dos clientes, implementando métodos que não
serão utilizados e/ou não são de sua responsabilidade.
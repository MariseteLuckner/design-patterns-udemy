# **Dependency Inversion Principle - Princípio de Inversão de Dependência**

O Princípio da Inversão de Dependência (DIP) faz parte da coleção de princípios de programação orientados a objetos popularmente conhecidos como SOLID.

O Dependency Inversion Principle (DIP) ou Princípio da Inversão de Dependência é a base para termos um projeto com um excelente design orientado a objetos, focado no domínio e com um arquitetura flexível.

O DIP é regido pela seguinte premissa: Dependa de abstrações e não de implementações.

De uma forma objetiva o princípio nos faz entender que sempre devemos depender de abstrações e não das implementações, afinal de contas, as abstrações mudam menos e facilitam a mudança de comportamento e as evoluções do código.

Para um melhor entendimento, vamos tentar exemplificar uma situação prática. Mas antes, é importante descobrir o que significam alguns termos:

- Módulos de alto nível: são as rotinas mais fáceis de entender, mais próximas da realidade de qualquer programador. Tendem a exigir menos carga mental para serem usadas;<pr>
- Módulos de baixo nível: são as rotinas mais complexas e difíceis de entender. Geralmente são compostas de implementações de cálculos ou comportamentos específicos.<pr>
- Detalhes: são os artefatos que não deveriam fazem parte da arquitetura de forma acoplada, mas que, no entanto, são necessários para um sistema funcionar. O acesso ao banco de dados, por exemplo, é um detalhe; assim como o gerenciamento de arquivos.
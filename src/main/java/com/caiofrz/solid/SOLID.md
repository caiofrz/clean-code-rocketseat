# S.O.L.I.D

 - **S**ingle Responsibility Principle (Princípio da responsabilidade única)
 - **O**pen-Closed Principle (Princípio aberto/fechado)
 - **L**iskov Substitution Principle (Princípio da substituição de Liskov)
 - **I**nterface Segregation Principle (Princípio da segregação da interface)
 - **D**ependency Inversion Principle (Princípio da inversão da dependência)

### Princípio da responsabilidade única
O princípio da responsabilidade única declara que uma classe deve fazer apenas uma coisa e, portanto, deve ter apenas uma razão para ser modificada.

### Princípio aberto/fechado
O princípio de aberto/fechado diz que as classes devem estar abertas para extensão, mas fechadas para modificação.

Modificação significa alterar o código de uma classe existente, enquanto extensão significa adicionar novas funcionalidades.

### Princípio da substituição de Liskov
O princípio da substituição de Liskov declara que as subclasses devem ser substituíveis por suas classes de base.

Isso quer dizer que, se a classe B for uma subclasse da classe A, devemos poder passar um objeto da classe B para qualquer método que espere um objeto da classe A e o método não deverá produzir resultados estranhos, nesse caso.

### Princípio da segregação da interface
Segregação quer dizer manter as coisas separadas. O princípio da segregação da interface tem a ver com separar as interfaces.

O princípio declara que muitas interfaces específicas do cliente são melhores que uma interface de propósito geral. Os clientes não devem ser forçados a implementar uma função que não necessitam.

### Princípio da inversão da dependência
O princípio da inversão da dependência declara que nossas classes devem depender de interfaces ou de classes abstratas em vez de classes concretas e de funções.
# Clean Code

 - Testes
 - Revisão
 - Refatoração
 - Simplicidade - KISS (Keep It Simple and Stupid)
 - Iterações curtas

### Nomencalatura de variáveis

 - Evitar nomes genéricos. Ex: data, response, args
 - Usar "perguntas" para booleanos (is, does, has). Ex: isDisabled, userHasGroup 
 - Nomear variáveis pela causa/motivo e nunca pelo efeito.
 - Dar preferência pela escrita em Inglês. Acompanhar a sintaxe da linguagem e ajuda na acessibilidade.

### Condicionais

 - Evitar negações.
 - Early return, na maioria das vezes, é superior ao else.
 - Evitar condicionais aninhadas.

### Parâmetros e Desestruturação

 - Prefirir receber objetos ao invés de multiplos parâmetros
 - Devolver parâmetros em formato de objeto.

### Números mágicos

 - Evitar numeros mágicos(sem sentido quando sozinho). Ex: datas representadas em milissegundos
 - Optar preferencialmente por constantes, ou comentários.
 - Descrever o formato no nome da variável. Ex: amountInCents

### Comentários vs Documentação

 - Comentário != Documentação
 - Evitar comentários em tudo

### Sintatic Sugars

 - Evitar usar sintatic sugars
 - Prefrir usar em casos que realmente aumentem a produtividade e/ou simplifique o entendimento do código.

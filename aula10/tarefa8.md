### Tarefa 008: Prática de Revisão de Código - 12/05/2023

**CpfValidator.java**

Nessa classe, as operações não se estabelecem como métodos, além de que algumas não possuem orientações de funcionamento.

Além disso, a operação que "valida se todos os números são iguais" pode ser escrita de forma mais legível.

**CpfValidatorRefactored.java**

Nessa classe, as maneiras utlizadas para calcular os dígitos não são ideais, uma vez que tratam os métodos da classe dentro dela mesma e não utlizam palavras de referência, como "this".

**DataUtils.java**

Há uma sobrecarga de métodos sobre essa classe, algo que deve ser resolvido através do desacoplamento.

**EstadoCivilValidator.java**

O principal método dessa classe não considera que o usuário pode digitar o seu estado civil com a primeira letra sendo minúscula, como em "solteiro", por exemplo.

**NacionalidadeValidator.java**

O principal método possui o mesmo problema da classe "EstadoCivilValidator" e ainda considera somente a existência de duas nacionalidades. 
Além disso, o usuário que digitar a sua nacionalidade a partir de um substantivo masculino, como em "brasileiro", por exemplo, encontrará um problema.

**PassaporteValidator.java**

Essa classe aceita qualquer tipo de entrada não nula, ou seja, ele não cumpra a sua função de validar os passaportes.

**SexoValidator.java**

O principal método dessa classe não considera a existência de gêneros não binários, o que gera intolerância ao sistema.

</DIV/>

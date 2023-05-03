### Tarefa 006: Git Branching - 28/04/2023

1. Qual o nome do branch padrão do Git? "master"

2. O que o comando **<code>git branch nome</code>** realiza?

Cria um branch com o nome em questão.

3. Como criar um branch a partir de um commit específico?

Usando o comando "git branch" e o hash do commit.

4. Em um repositório, qual o efeito do comando **<code>git checkout -b bugfix/234</code>**?

Esse comando cria uma nova branch, chamada de "bugfix/234", e alerna para ela.

5. Qual o comando para se alternar para um branch de nome **experimento2**? git checkout experimento2

6. Em um repositório com dois branches, **b1** e **b2**, onde b1 é o corrente, qual o efeito do comando **<code>git branch</code>**?

Alterna-se para a branch "b2".

7. O que o comando **<code>git checkout -b</code>** nome faz?

Esse comando é usado para se criar uma nova branch e alternar para ela.

8. Qual a função do <code>**comando git branch -d teste</code>**?

Esse comando é usado para excluir uma branch.

9. Durante o desenvolvimento de um software é comum, por exemplo, utilizar um novo recurso por meio de experimentação. Talvez uma nova tecnologia, uma nova biblioteca que pode ser útil ao que está em desenvolvimento, ou até mesmo uma nova versão de um produto já empregado. Para que o uso deste novo recurso não interfira com o que é considerado pronto, um branch pode ser criado para a experimentação. Código que for criado para a experimentação existirá apenas no branch criado. Se eventualmente o experimento demonstrar um resultado satisfatório, as alterações realizadas no branch poderão ser incorporadas no que é considerado pronto, ou seja, no branch principal (master). Esta última ação é conhecida por merge. Neste item, crie uma sequência de comandos que simula um caso simples de criação e uso seguido de merge empregando um branch para ilustrar uma experimentação conforme acima. A sequência deve incluir, obrigatoriamente: (a) criação de um ou mais branches; (b) chaveamento para pelo menos dois branches e (c) merge.

git checkout -b testes

git merge testes

</DIV/>

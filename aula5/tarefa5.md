### Tarefa Grupo 005: Git Exercícios - 28/04/2023.

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git? git --version

2. Qual o efeito da execução de cada um dos comandos abaixo?

  a. git help:
  exibe diversos comandos disponíveis para uso no Git.
  
  b. git help checkout:
  exibe informações sobre a manipulação de branches.
  
  c. git help merge:
  exibe informações sobre a aplicação de merges.
  
  d. git init:
  configuração inicial de um novo repositório.
  
  e. git add --all:
  adicionar arquivos ao repositório.
  
  f. git add -u:
  manipula apenas arquivos que foram modificados ou removidos.
  
  g. git config -l:
  exibe as informações presentes no arquivo "config".
  
  h. git mv a.txt b.txt:
  mover ou renomear um arquivo.
  
  i. git reset --hard:
  reseta a branch atual.
  
  j. git log -27:
  exibe o histórico do repositório.
  
3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo? git stash e git commit

4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”? git status

5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando? git status -u

6. Qual o comando para efetuar um _commit_? git commit

7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo? git reset teste.txt

8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.

O repositório deve ser incluído ao arquivo .gitgnore.

9. O que acontece se o seu repositório local for acidentalmente removido?

Uma solução para recuperar esse repositório seria cloná-lo novamente de algum local ou checar algum backup.

10. Como clonar um repositório remoto? git clone <git_repo_url> <your_custom_directory_name>

11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado? git log -(linha)

12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário? git config --list

13. Qual o comando para criar um repositório local? git init

14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**? .git

15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?) git add -u

16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?

SHA1 é uma função hash com propósito de criptografia. No Git, cada objeto em um repositório é idenficado por um único SHA1. Além disso, o sistema do Git usa esse hash para verificar mudanças nos repositórios.

17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente? "HEAD"

18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?

Não, pois esses arquivos ainda não estavam sendo rastreados pelo Git.

19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**

O último commit e todas as suas mudanças serão desfeitos.

20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_? git clean -d

21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados? .gitignore

22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?

Um arquivo .gitignore deve ser criado, o comando "*.class" deve ser aplicado dentro desse arquivo e, por fim, deve-se salvar as alterações.

23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.

24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?

Exibe as linhas, os nomes e os e-mails dos usuários relativos aos últimos commits realizados.

25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?

Exibe a lista de repositórios remotos aos quais esse repositório está conectado.

26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado? git tag -a

27. Caso um dado repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0? git tag --list "2.0.*"

28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?

Criação de uma tag que possui nome e mensagem específicos.

29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?

O Git mostrará o commit com o qual a tag se relaciona, junto com a mensagem, o autor, a data e as alterações.

30. O que o comando **git push origin 3.4-gold** teria como efeito?

O Git envia a tag para o repositório remoto "origin".

31. Após executar um commit, qual o efeito de **git commit --amend**?

Esse comando permite que o último commit seja modificado.

32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?

As mudanças presentes em "x.txt" serão removidas da área "staging", mas ainda estarão presentes no diretório.

33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?

Esse comando irá descartar as mudanças e restaurar o arquivo para o seu estado presente no último commit.

34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?

O comando "git reset HEAD a.txt" remove as alterações realizadas em a.txt da área de preparação.
O comando "git checkout -- a.txt" descarta todas as alterações realizadas em a.txt desde o último commit, efetivamente restaurando o arquivo para o estado em que estava no último commit.

35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.











</DIV/>

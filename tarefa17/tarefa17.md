# Tarefa 017 - Configuração de software em tempo de execução, Generics, Closure e Logging - 30/06/2023

Primeiramente, o principal objetivo da configuração de software em tempo de execução é manipular determinados aspectos do programa durante a sua atividade.
Essa configuração é orientada a partir do uso de palavras-chave, no código-fonte da aplicação, que podem guiar o funcionamento de classes e operações do sistema, por exemplo.

Uma aplicação direta desse mecanismo é o uso do "Profile" em uma aplicação desenvolvida a partir do framework Spring Boot.
Esse modelo é fundamental no processo de mapeamento de objetos em relação a diversos perfis de desenvolvimento dentro do sistema.

Segundamente, o termo "Closure" se refere a uma função que consegue acessar e manipular variáveis que não são passadas diretamente como argumentos ou declaradas dentro da própria opreações.
Esse mecanismo é importante para diminuir a quantidade de código necessária para a escrita de algumas funções.

Uma aplicação desse modelo é a função lambda da linguagem Java. Nesse caso, a criação de threads, por exemplo, é realizada de forma mais concisa com a utilização de funções dessa natureza.

Além disso, o termo "Generics" se refere a recursos de software que permitem a criação de códigos seguros e reutilizáveis.
Esse modelo é importante para a definição de classes, interfaces e métodos que possam trabalhar com diferentes tipos de dados sem comprometer a segurança de tipos.

Em Java, um exemplo interessante dessa ferramenta seria esta criação de uma lista de variáveis com um tipo definido, o que previne erros em tempo de execução e casts desnecessários:

```

/* COM GENERICS */
List<Apple> box = ...;
Apple apple = box.get(0);

/* SEM GENERICS */
List box = ...;

/*
Se o objeto retornado de box.get(0) não puder
ser convertido para Apple, só saberemos disso em tempo
de execução
*/
Apple apple = (Apple) box.get(0);

```

Por fim, o termo "Logging" se refere ao mecanismo de armazenar informações importantes a respeito da execução da aplicação.
Essa ferramenta é importante para monitorar e solucionar problemas em sistemas de software, pois permite que desenvolvedores e administradores de sistema obtenham insights sobre o comportamento do aplicativo e diagnostiquem problemas.

Na maioria dos casos, as bibliotecas de registro são instaladas a partir dos arquivos de configuração do software.
Nesse contexto, a linguagem Java possui um framework de configuração de "Logging" que ajuda o desenvolvedor durante o processo de construção da aplicação: o "java.util.logging".

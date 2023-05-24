# Tarefa 011 - Polimorfismo - 22/05/2023

2. Exercício 02:

2.1 Crie uma classe chamada **Produto** que possua os atributos "nomeloja" e "preco", crie os métodos _sets_ e _gets_ para estes atributos. Crie também o atributo "descricao" e seu método chamado _getDescricao()_ que retorna uma _string_ com o simples conteúdo "Produto de informática".

2.2 Crie duas classes filhas de **Produto**, que sendo a primeira nominada de **Mouse** e possuindo o atributo "tipo" (string) e a segunda nominada **Livro** com o atributo "autor" (string), no método construtor de cada uma dessas classes passe como argumento a descrição desse produto, por exemplo, Mouse(“Mouse ótico, Saída USB. 1.600 dpi”); Crie o método _getDescricao()_ que retorna a descrição que foi passada no argumento do construtor concatenada com o atributo que a classe tiver, "autor" no caso de livro e "tipo" no caso de mouse, esse método deve ter a mesma assinatura do método _getDescricao()_ da classe pai “Produto”.

2.3 Crie a classe **ProdutoTeste** (deverá ser executável) que irá simular a compra de um cliente de vários mouses e livros, deve haver apenas uma lista, nesta classe para armazenamento de todos os livros e mouses. Essa lista deverá se chamar "carrinho" que simula o carrinho de compras de produtos variados de um cliente em um _e-commerce_. Insira nesse "carrinho" vários mouses e livros e depois chame o método _getDescricao()_ de todos os objetos presentes na lista, para o usuário do carrinho saber as informações dos produtos em seu carrinho.

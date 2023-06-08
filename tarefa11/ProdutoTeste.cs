namespace tarefa11 {
    public static class ProdutoTeste {
        public static void Main (string[] args) {
            List<Produto> carrinho = new List<Produto>();
            char input = 'A';

            Console.WriteLine("Entre com '0' para encerrar a compra.");

            while(input != '0')
            {
                if(input == 'L') {

                    Console.WriteLine("\nQual é o autor?");
                    string autor = "";
                    autor += Console.ReadLine();

                    Console.WriteLine("Qual é a descrição?");
                    string desc = "";
                    desc += Console.ReadLine();
                    
                    Produto L0 = new Livro (autor, desc);
                    carrinho.Add(L0);
                }

                else if(input == 'M') {
                    
                    Console.WriteLine("\nQual é o tipo?");
                    string tipo = "";
                    tipo += Console.ReadLine();

                    Console.WriteLine("Qual é a descrição?");
                    string desc = "";
                    desc += Console.ReadLine();
                    
                    Produto M0 = new Mouse (tipo, desc);
                    carrinho.Add(M0);
                }
                
                Console.WriteLine("Que produto você deseja adicionar ao carrinho? (L ou M)");
                input = Console.ReadKey().KeyChar;
            }

            Console.WriteLine("\n");

            foreach (var element in carrinho)
            {
                if(element is Mouse) {
                    Console.WriteLine(((Mouse)element).getDescricao());
                }
                else if(element is Livro) {
                    Console.WriteLine(((Livro)element).getDescricao());
                }
            }

            Console.WriteLine("\n");
        }
    }
}
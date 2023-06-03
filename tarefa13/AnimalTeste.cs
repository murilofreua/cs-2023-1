namespace tarefa13 {
    public static class AnimalTeste {
        public static void Main (string[] args) {
            Animal A1 = new Cachorro();
            Animal A2 = new Preguica();
            Animal A3 = new Cavalo();
            Animal A4 = new Cachorro();
            Animal A5 = new Cavalo();
            Animal A6 = new Preguica();
            Animal A7 = new Cavalo();
            Animal A8 = new Cachorro();
            Animal A9 = new Cavalo();
            Animal A10 = new Preguica();

            Veterinario V = new Veterinario();
            Zoologico Z = new Zoologico();

            Z.adicionarEmJaula(A1);
            Z.adicionarEmJaula(A2);
            Z.adicionarEmJaula(A3);
            Z.adicionarEmJaula(A4);
            Z.adicionarEmJaula(A5);
            Z.adicionarEmJaula(A6);
            Z.adicionarEmJaula(A7);
            Z.adicionarEmJaula(A8);
            Z.adicionarEmJaula(A9);
            Z.adicionarEmJaula(A10);

            Console.WriteLine(A1.emitirSom());
            Console.WriteLine(A2.emitirSom());
            Console.WriteLine(A3.emitirSom() + '\n');

            Console.WriteLine(V.examinar(A1));
            Console.WriteLine(V.examinar(A2));
            Console.WriteLine(V.examinar(A3) + '\n');

            // Essa iteração contém o tratamento de erro
            
            foreach(Animal animal in Z.getJaula()) {

                if(animal is Cachorro) {
                    Console.WriteLine(animal.emitirSom());
                    Cachorro C = (Cachorro)animal;
                    Console.WriteLine(C.correr() + '\n');
                }
                else if(animal is Cavalo) {
                    Console.WriteLine(animal.emitirSom());
                    Cavalo C = (Cavalo)animal;
                    Console.WriteLine(C.correr() + '\n');
                }
                else if(animal is Preguica) {
                    Console.WriteLine(animal.emitirSom());
                    Console.WriteLine('\n');
                }
                else {
                    throw new AnimalInvalidoException("Tipo de Animal Inválido");
                }
            }
        }
    }
}
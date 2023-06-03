namespace tarefa13 {
    public class Zoologico {
        private List<Animal> jaulas = new List<Animal>(10);

        public void adicionarEmJaula(Animal a) {
            jaulas.Add(a);
        }

        public List<Animal> getJaula() {
            return jaulas;
        }
    }
}
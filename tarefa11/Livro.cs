namespace tarefa11 {
    public class Livro : Produto {
        private string autor;

        public Livro (string autor, string descricao) : base(descricao) {
            this.autor = autor;
        }

        public override string getDescricao () {
            return this.autor + ", " + this.descricao;
        }
    }
}
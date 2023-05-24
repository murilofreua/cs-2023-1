namespace tarefa11 {
    public class Produto {
        private string nomeLoja { get; set; }
        private float preco { get; set; }
        public string descricao { get; set; }

        public string getNome () {
            return this.nomeLoja;
        }

        public float getPreco () {
            return this.preco;
        }

        public void setNome (string nome) {
            this.nomeLoja = nome;
        }

        public void setPreco (float preco) {
            this.preco = preco;
        }

        public Produto (string descricao) {
            this.descricao = descricao;
        }

        public virtual string getDescricao () {
            return "Produto de informática";
        }
    }
}
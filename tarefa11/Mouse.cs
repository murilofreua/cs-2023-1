namespace tarefa11 {
    public class Mouse : Produto {
        private string tipo;

        public Mouse (string tipo, string descricao) : base(descricao) {
            this.tipo = tipo; 
        }

        public override string getDescricao () {
            return this.tipo + ", " + this.descricao;
        }
    }
}
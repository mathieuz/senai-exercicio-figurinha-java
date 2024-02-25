public class Pessoa {
    private String nome;
    private int numFigurinhas;

    Pessoa(String nome, int numFigurinhas) throws Exception {
        this.setNome(nome);
        this.setNumFigurinhas(numFigurinhas);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) throws Exception {
        if (!nome.isEmpty()) {
            this.nome = nome;

        } else {
            throw new Exception("Erro: o nome da instância de pessoa não pode ser vazio ou nulo.");
        }
    }

    public int getNumFigurinhas() {
        return this.numFigurinhas;
    }

    public void setNumFigurinhas(int numFigurinhas) throws Exception {
        if (numFigurinhas >= 0) {
            this.numFigurinhas = numFigurinhas;

        } else {
            throw new Exception("Erro: não é possível atribuir um valor menor que 0 para o número de figurinhas.");
        }
    }

    public void darFigurinhas(Pessoa pessoa, int qtdeFigurinhas) throws Exception {
        if (qtdeFigurinhas >= 0 && qtdeFigurinhas <= this.getNumFigurinhas()) {
            
            pessoa.setNumFigurinhas(pessoa.getNumFigurinhas() + qtdeFigurinhas);
            this.setNumFigurinhas(this.getNumFigurinhas() - qtdeFigurinhas);

        } else {
            if (qtdeFigurinhas < 0) { 
                throw new Exception(String.format("Erro: %s não é um valor válido de figurinhas a serem transferidas.", qtdeFigurinhas)); 
            }

            if (qtdeFigurinhas > this.getNumFigurinhas()) {
                throw new Exception(String.format("Erro: %s é maior do que a quantidade de figurinhas que %s possui.", qtdeFigurinhas, this.getNome()));
            }
        }
    }

    @Override public String toString() {
        return String.format("{'nome': '%s', 'numFigurinhas': '%s'}", this.getNome(), this.getNumFigurinhas());
    }
}
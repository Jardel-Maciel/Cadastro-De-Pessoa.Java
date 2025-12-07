package novoprojeto;

public class Pessoa {

    private String nome;
    private String profissao;
    private int idade;

    public Pessoa(String nome, String profissao, int idade) {
        this.nome = nome;
        this.profissao = profissao;
        this.idade = idade;
    }

    void status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Profissão: " + this.profissao);
        System.out.println("Idade: " + this.idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Profissão: " + profissao + ", Idade: " + idade;

    }   

}

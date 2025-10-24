package aula6;

public abstract class itemMagico {
    // campos comuns a todos os itens
    protected String nome;
    protected double peso;

    // método construtor
    public itemMagico(String nome, double peso) {
        super();
        this.nome = nome;
        this.peso = peso;
    }
    // método concreto -- o mesmo comportamento para todos os itens 
    public void exibirDetalhes() {
        System.out.println("-----Detalhes do item-----");
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + "Kg");
    }
    // método abstrato (ESTE É O CORAÇÃO DO CONCEITO)
    // ELE NÃO POSSUI IMPLEMENTAÇÃO
    public abstract void usar();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        return nome;
    }
    public String getPeso() {
        return peso;
    }
    public void setPeso(String nome) {
        return peso;
    }
}

package aula6;

public class pocaoCura extends itemMagico {
    // atributo específico da subclasse
    private int pontosCura;

    // construtor que vai chamar o construtor da super classe
    public pocaoCura(String nome, double peso, int pontosCura) {
        super(nome, peso);
        this.pontosCura = pontosCura;
    }
    @override
    public void usar() {
        System.out.println("\n***Item: " + nome + " ***");
        System.out.println("A poção foi bebida...");
        System.out.println("Efeito: O herói recupera " + pontosCura " de vida!");
    }
}
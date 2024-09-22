
public class Combo {
    private Sanduiche sanduiche;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public void criarCombo(int tipo) {
        if (tipo == 1) {
            sanduiche = new Sanduiche("Burguer Master");
            sobremesa = new Sobremesa("Sorvete");
            bebida = new Bebida("Coca-Cola");
        } else if (tipo == 2) {
            sanduiche = new Sanduiche("Super Burguer");
            sobremesa = new Sobremesa("Torta de maçã");
            bebida = new Bebida("Fanta");
        } else {
            System.out.println("Combo inválido");
        }
    }

    @Override
    public String toString() {
        return "Combo: \n" +
               "Sanduíche: " + sanduiche.getNome() + "\n" +
               "Sobremesa: " + sobremesa.getNome() + "\n" +
               "Bebida: " + bebida.getNome();
    }
}

public class BancaPentruNevoiPersonale implements UnitateBancara{
    @Override
    public void calculeazaCredit(Persoana pers) {
        int credit = pers.getSalariuNet() * 10;
        System.out.println("Creditul este in valoare de: " + credit + " lei.");
    }

    @Override
    public double calculeazaDobanda(Persoana pers){
        double dobanda = 0.08 * pers.getSalariuNet() *10;
        return dobanda;
    }
}

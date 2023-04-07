public class BancaPentruLocuinte implements UnitateBancara {
    @Override
    public void calculeazaCredit(Persoana pers) {

        int credit = pers.getSalariuNet() * 100;
        System.out.println("Creditul este in valoare de: " + credit + " lei");
    }

    @Override
    public double calculeazaDobanda(Persoana pers) {
        double dobanda = 0.05 * pers.getSalariuNet()*100;
        return dobanda;
    }
}
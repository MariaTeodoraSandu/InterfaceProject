import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        UnitateBancara unitateBancara = null;

        System.out.print("Introduceti numele persoanei: ");
        String numePersoana = scanner.nextLine();
        System.out.print("Introduceti varsta persoanei: ");
       int varstaPersoana = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduceti CNP: ");
       long cnp = Long.parseLong(scanner.nextLine());
        System.out.print("Introduceti salariul net: ");
        int salariuNet = Integer.parseInt(scanner.nextLine());
        Persoana persoana = new Persoana(numePersoana, varstaPersoana, cnp, salariuNet);

        if(persoana.getVarstaPersoana()<18)
        {
            System.out.println("Persoana nu este eligibila pentru un credit");
        } else if (persoana.getVarstaPersoana()>=18 && persoana.getVarstaPersoana()<=40)
        {
            unitateBancara=new BancaPentruLocuinte();
            unitateBancara.calculeazaCredit(persoana);
            System.out.println("Dobanda creditului pentru locuinte este: " + unitateBancara.calculeazaDobanda(persoana) + " lei.");
        } else {
            unitateBancara = new BancaPentruNevoiPersonale();
            unitateBancara.calculeazaCredit(persoana);
            System.out.println("Dobanda creditului pentru nevoi personale este: " + unitateBancara.calculeazaDobanda(persoana) + " lei.");
        }
    }
}
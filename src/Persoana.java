public class Persoana {
    private String numePersoana;
    private int varstaPersoana;
    private long cnp;
    private int salariuNet;

    public Persoana(String numePersoana, int varstaPersoana, long cnp, int salariuNet) {
        this.numePersoana = numePersoana;
        this.varstaPersoana = varstaPersoana;
        this.cnp = cnp;
        this.salariuNet = salariuNet;
    }

    public void setNumePersoana(String numePersoana)
    {
        this.numePersoana=numePersoana;
    }
    public String getNumePersoana()
    {
        return numePersoana;
    }
    public void setVarstaPersoana(int varstaPersoana)
    {
        this.varstaPersoana=varstaPersoana;
    }
    public int getVarstaPersoana()
    {
        return  varstaPersoana;
    }
    public void setCnp(long cnp)
    {
        this.cnp=cnp;
    }

    public long getCnp() {
        return cnp;
    }

    public void setSalariuNet(int salariuNet)
    {
        this.salariuNet=salariuNet;
    }
    public int getSalariuNet()
    {
        return salariuNet;
    }
}

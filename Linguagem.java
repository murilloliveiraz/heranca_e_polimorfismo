public class Linguagem {
    protected String nome;
    protected int numFalantes;
    protected String regioesFaladas;
    protected String ordemDasPalavras;

    //construtor
    public Linguagem(String nome, int numFalantes, String regioesFaladas,String ordemDasPalavras) {
    this.nome = nome;
    this.regioesFaladas = regioesFaladas;
    this.ordemDasPalavras = ordemDasPalavras;
    this.numFalantes = numFalantes;       
    }

    public void getInfo() {
        System.out.println( nome + " é falado por " + numFalantes + " pessoas principalmente em "
        + regioesFaladas);
    }
    public static void main(String[] args) {
        Linguagem portugues = new Linguagem("Portugues", 751, " AmericaDoSul", "escrita");
        portugues.getInfo();
        Mayan mayan = new Mayan("Mayan", 1000);
        mayan.getInfo();
        SinoTibetan sino = new SinoTibetan("Mandarim", 1000);
        sino.getInfo();
        SinoTibetan birmanes = new SinoTibetan("Birmanes", 1000);
        birmanes.getInfo();
    }
}
class Mayan extends Linguagem {
    public Mayan(String nome, int numFalantes){
        super(nome, numFalantes, "America Central", "verbo-objeto-sujeito");
    }

    @Override
    public void getInfo() {
        System.out.println(nome + " é falado por " + numFalantes + " pessoas principalmente em " + regioesFaladas + " A linguagem segue a ordem das palavras: " + ordemDasPalavras + " Fato interessante: " + nome + " é uma língua ergativa.");
    }
}
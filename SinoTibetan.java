class SinoTibetan extends Linguagem {
        public SinoTibetan(String nome, int numFalantes){
            super(nome, numFalantes, "Asia", "verbo-objeto-sujeito");
            if(this.nome == "Chines" || this.nome == "Mandarim"){
                ordemDasPalavras = "sujeito-verbo-objeto";
            }
        }
        
        @Override
        public void getInfo() {
            System.out.println(nome + " é falado por " + numFalantes + " pessoas principalmente em " + regioesFaladas + " A linguagem segue a ordem das palavras: " + ordemDasPalavras + " Fato interessante: " + nome + " é uma língua ergativa.");
        }
    }

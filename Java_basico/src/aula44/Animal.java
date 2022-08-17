package aula44;

// Aula que tratou do assunto de interfaces no Java.
public abstract class Animal {
        private String nome;

        // Métodos abstratos serão sempre implementados pelas classes concretas que herdarem a classe abstrata
        public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

package aula36;

// Nesta aula foi explicado como se constitui um relacionamento entre classes.
public class Relacionamento {
    public static void main(String[] args) {
        Contato contato = new Contato();

        Endereco endereco = new Endereco();
        endereco.setRua("Rua dos Bobos");
        endereco.setNumero("N/A");
        endereco.setComplemento("N/A");
        endereco.setCidade("Atlantida");
        endereco.setEstado("Liquido");
        endereco.setCep("96000000");

        contato.setNome("Tyrion");
        contato.setEndereco(endereco);

        Telefone[] telefones = new Telefone[3];

        Telefone tel = new Telefone();
        tel.setTipo("Celular");
        tel.setDdd("11");
        tel.setNumero("99-9999-9999");

        Telefone tel2 = new Telefone();
        tel2.setTipo("Fixo");
        tel2.setDdd("11");
        tel2.setNumero("98-9999-9991");

        telefones[0] = tel;
        telefones[1] = tel2;
        contato.setTelefones(telefones);

        System.out.println("Nome: " + contato.getNome());

        // Necessario verificar se o objeto endereco não é nulo para evitar NullPointerException

        if(contato.getEndereco() != null) {
            System.out.println("Endereço: " + contato.getEndereco().getRua());
        }
        if(contato.getTelefones() != null){
            for (Telefone telefone: contato.getTelefones()) {
                if(telefone != null)
                    System.out.println("Tel: " + telefone.getDdd() + " " + telefone.getNumero());
            }
        }
    }
}

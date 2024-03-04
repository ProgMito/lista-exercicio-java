public class Cachorro {
    private String nome, raca;
    private int idade;






    public Cachorro(){
    }
    public Cachorro (String nome) {
        this.nome = nome;
    }
    public Cachorro (String newName, String newRaca) {
        this.nome = newName;
        this.raca = newRaca;
    }
    public Cachorro (String newName, String newRaca, int newAge) {
        this.nome = newName;
        this.raca = newRaca;
        this.idade = newAge;
    }






    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    public String getNome(){
        return nome;
    }

    public void setRaca(String novaRaca){
        this.raca = novaRaca;
    }
    public String getRaca(){
        return raca;
    }

    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }
    public int getIdade(){
        return idade;
    }
}
package estatico.exercicio1;

public class Pessoa {
    private String nome;
    private String email;
    private int telefone;
    private static double contador = 0;

    public static double getContador() {
        return contador;
    }
    public static void setContador(double contador) {
        Pessoa.contador = contador;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public Pessoa() {
        contador ++;
    }
    
}

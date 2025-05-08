package estatico.exercicio1;


public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa ();
        p1.setNome ("Joaquim");
        p1.setEmail ("joaquim@ig.com.br");
        p1.setTelefone (1234);
        
        Pessoa p2 = new Pessoa ();
        p2.setNome ("Maria");
        p2.setEmail ("maria@ig.com.br");
        p2.setTelefone (4321);

        Pessoa p3 = new Pessoa ();
        p3.setNome ("José");
        p3.setEmail ("jose@ig.com.br");
        p3.setTelefone (1234);

        Pessoa p4 = new Pessoa ();
        p4.setNome ("Mativanio");
        p4.setEmail ("joao@ig.com.br");
        p4.setTelefone (43251);

        Pessoa p5 = new Pessoa ();
        p5.setNome ("Igor");
        p5.setEmail ("joao@ig.com.br");
        p5.setTelefone (43261);

        Pessoa p6 = new Pessoa ();
        p6.setNome ("Thalisson");
        p6.setEmail ("joao@ig.com.br");
        p6.setTelefone (432771);

        Pessoa p7 = new Pessoa ();
        p7.setNome ("Mariazinha");
        p7.setEmail ("joao@ig.com.br");
        p7.setTelefone (43261);

        Pessoa p8 = new Pessoa ();
        p8.setNome ("Queiroz");
        p8.setEmail ("joao@ig.com.br");
        p8.setTelefone (43721);

        Pessoa p9 = new Pessoa ();
        p9.setNome ("jULIA");
        p9.setEmail ("joao@ig.com.br");
        p9.setTelefone (46321);

        Pessoa p10 = new Pessoa ();
        p10.setNome ("Mariana");
        p10.setEmail ("jaaoao@ig.com.br");
        p10.setTelefone (4323461);

        Pessoa p11 = new Pessoa ();
        p11.setNome ("Mariana");
        p11.setEmail ("jaaoao@ig.com.br");
        p11.setTelefone (4323461);	

        System.out.println("Pessoas cadastradas: " + Pessoa.getContador());
        
    }
}

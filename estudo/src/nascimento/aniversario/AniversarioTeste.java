

public class AniversarioTeste {
    
   

    public static void main(String[] args) {
        

        Nascimento v1 = new Nascimento();
        v1.nome = "Vivane";
        v1.dia = 31;
        v1.mes = 03;
        v1.ano = 1980;

        Nascimento r1 = new Nascimento();
        r1.nome = "Rodrigo";
        r1.dia = 11;
        r1.mes = 05;
        r1.ano = 1979;


        
       // int idadeAtual = ano - 2022;

        System.out.println("");
        System.out.println(v1.nome +" nasceu em " +v1.dataNascimento());
        
        System.out.println("Sua  idade é "+ v1.idadeAtual()+" anos.");
        System.out.println("");

    }
}

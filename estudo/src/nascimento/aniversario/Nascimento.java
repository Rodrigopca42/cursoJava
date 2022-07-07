import java.lang.module.ResolutionException;

public class Nascimento {

    int dia, mes, ano;
    String nome;

     int idadeAtual(){
    return ano - 2022;
} 

    /**
     * @return
     */
    String dataNascimento(){
        return String.format("%d/%d/%d", dia, mes,ano);
    }
    
}

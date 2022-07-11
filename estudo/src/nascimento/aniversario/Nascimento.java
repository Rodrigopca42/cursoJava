
public class Nascimento {

    int dia, mes, ano;
    String nome;

     int idadeAtual(){
    return  2022 - ano;
} 

    /**
     * @return
     */
    String dataNascimento(){
        return String.format("%d/%d/%d", dia, mes,ano);
    }
    
}

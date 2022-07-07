public class Comemoracao {
    

    public static void main(String[] args) {
        
        Calendário viviane = new Calendário();
        viviane.dia = 31;
        viviane.mes = 03;
        viviane.ano = 1980;

        Calendário daniel = new Calendário();
        daniel.dia = 25;
        daniel.mes = 03;
        daniel.ano = 2012;

        Calendário millena = new Calendário();
        millena.dia = 19;
        millena.mes = 10;
        millena.ano = 2010;

        Calendário rodrigo = new Calendário();
        rodrigo.dia = 11;
        rodrigo.mes = 05;
        rodrigo.ano = 1979;

        
        
        System.out.printf("A Viviane nasceu no dia %d / %d de %d",viviane.dia, viviane.mes, viviane.ano);
        System.out.println("");

        System.out.printf("O Daniel nasceu no dia %d / %d de %d",daniel.dia, daniel.mes, daniel.ano);
        System.out.println("");

        System.out.printf("A Millena nasceu no dia %d / %d de %d",millena.dia, millena.mes, millena.ano);
        System.out.println("");

        System.out.printf("O Rodrigo nasceu no dia %d / %d de %d",rodrigo.dia, rodrigo.mes, rodrigo.ano);
        System.out.println("");
    }
}

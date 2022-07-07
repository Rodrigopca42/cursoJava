public class Comemoracao {
    

    public static void main(String[] args) {
        
        Calendário v1 = new Calendário();
        v1.dia = 31;
        v1.mes = 03;
        v1.ano = 1980;

        Calendário d1 = new Calendário();
        d1.dia = 25;
        d1.mes = 03;
        d1.ano = 2012;

        Calendário m1 = new Calendário();
        m1.dia = 19;
        m1.mes = 10;
        m1.ano = 2010;

        Calendário r1 = new Calendário();
        r1.dia = 11;
        r1.mes = 05;
        r1.ano = 1979;

        
        
        System.out.printf("A Viviane nasceu no dia %d / %d de %d",v1.dia,v1.mes,v1.ano);
        System.out.println("");

        System.out.printf("O Daniel nasceu no dia %d / %d de %d",d1.dia, d1.mes, d1.ano);
        System.out.println("");

        System.out.printf("A Millena nasceu no dia %d / %d de %d",m1.dia, m1.mes, m1.ano);
        System.out.println("");

        System.out.printf("O Rodrigo nasceu no dia %d / %d de %d",r1.dia, r1.mes, r1.ano);
        System.out.println("");
    }
}

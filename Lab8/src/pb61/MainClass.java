package pb61;

public class MainClass {
    public static void main(String[] args){
        Zi[] zileDaniel = new Zi[7];
        zileDaniel[0] = new Zi("Luni",true);
        zileDaniel[1] = new Zi("Marti",true);
        zileDaniel[2] = new Zi("Miercuri",true);
        zileDaniel[3] = new Zi("Joi",true);
        zileDaniel[4] = new Zi("Vineri",true);
        zileDaniel[5] = new Zi("Sambata",false);
        zileDaniel[6] = new Zi("Duminica",false);
        Zi[] zileAdina = new Zi[7];
        zileAdina[0] = new Zi("Luni",false);
        zileAdina[1] = new Zi("Marti",false);
        zileAdina[2] = new Zi("Miercuri",true);
        zileAdina[3] = new Zi("Joi",true);
        zileAdina[4] = new Zi("Vineri",true);
        zileAdina[5] = new Zi("Sambata",true);
        zileAdina[6] = new Zi("Duminica",false);
        CalendarLucru calendarDaniel = new CalendarLucru(zileDaniel);
        CalendarLucru calendarAdina = new CalendarLucru(zileAdina);

        Lucrator lucrator1 = new Lucrator("Daniel", calendarDaniel);

        try{
            lucrator1.lucreaza("Luni");
            lucrator1.lucreaza("Marti");
            lucrator1.lucreaza("Sambata");
            lucrator1.lucreaza("Miercuri");
        }catch (ExceptieZiNelucratoare exceptieZiNelucratoare){
            System.out.println(exceptieZiNelucratoare.getMessage());
        }

        Lucrator lucrator2 = new Lucrator("Adina", calendarAdina);
        try{
            lucrator2.lucreaza("Miercuri");
            lucrator2.lucreaza("Joi");
            lucrator2.lucreaza("Marti");
        } catch (ExceptieZiNelucratoare exceptieZiNelucratoare){
            System.out.println(exceptieZiNelucratoare.getMessage());
        }

    }
}

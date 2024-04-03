package pb61;

public class Lucrator {

    private String name;
    private CalendarLucru calendarLucru;

    public Lucrator(String name, CalendarLucru calendarLucru){
        this.name = name;
        this.calendarLucru = calendarLucru;
    }

    public void lucreaza(String zi) throws ExceptieZiNelucratoare{

        Zi[] zileleLucratorului = calendarLucru.getZile();
        for(int i=0;i<7;i++){
            if(zileleLucratorului[i].getName() == zi){
                if(zileleLucratorului[i].isWorkingDay()){
                    System.out.println( name + " poate lucra " + zi);
                }
                else throw new ExceptieZiNelucratoare( name + " nu poate lucra " + zi);
            }
        }
    }
}

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
Карманный телепорт
*/

public class Main {

    public static final String INVENTED = "Пожалуйста, можете забрать ваш карманный телепорт. Спасибо за ожидание!";
    public static final String NOT_INVENTED = "Извините, телепорт еще не изобрели, приходите через 10 лет.";

    public static final Calendar INVENTION_DAY = new GregorianCalendar(2192, Calendar.JUNE, 12);

    public static void main(String[] args) {
        Calendar currentDay = Calendar.getInstance();
        boolean ans=false;
        while(!ans){
            ans=isTeleportInvented(currentDay);
            if(!ans){
                currentDay.add(Calendar.YEAR,+10);
            }

        }
    }

    static boolean isTeleportInvented(Calendar currentDay) {
        boolean answer=false;
        int year =currentDay.get(Calendar.YEAR);
        int month =currentDay.get(Calendar.MONTH);
        int day =currentDay.get(Calendar.DAY_OF_WEEK);
        if(day>12 || month>5||year>2192){
            System.out.println(INVENTED);
            answer=true;

        }else{
            System.out.println(NOT_INVENTED);

        }

        return answer;
    }
}

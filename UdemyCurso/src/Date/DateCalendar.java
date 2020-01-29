package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalendar {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
//      Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(simpleDateFormat.format(date));

        Calendar cal = Calendar.getInstance(); // 1- obtemos um calendario
        cal.setTime(date); // 2- adicionamos uma data ao nosso calendario
        cal.add(Calendar.HOUR_OF_DAY, 1);
        date = cal.getTime(); //4 - atualizamos a data com 4 horas a mais

        int minute = cal.get(Calendar.MINUTE);
        int month = 1+cal.get(Calendar.MONTH);

        System.out.println("horas adicionais "+simpleDateFormat.format(date));
        System.out.println("MINUTES "+minute);
        System.out.println("MONTH "+month);
    }
}

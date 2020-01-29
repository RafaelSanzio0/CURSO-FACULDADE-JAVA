package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class MainData {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");

        Date data = simpleDateFormat.parse("28/01/2020");
        Date data2 = simpleDateFormat2.parse("28/01/2020 22:17:00");
        Date data3 = new Date();

        System.out.println("apenas a data "+simpleDateFormat.format(data));
        System.out.println("data com horas "+simpleDateFormat2.format(data2));
        System.out.println("data atual "+simpleDateFormat2.format(data3));

    }
}

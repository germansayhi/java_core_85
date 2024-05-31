import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class I18NDemo {
    public static void main(String[] args) {
        Locale viVN = new Locale("vi","VN");
        double currency = 1234.79;

        String s1 = formatCurrencyByLocale(currency,viVN);
        System.out.println("s1 = " + s1);

    }
    public static String formatCurrencyByLocale(double currency ,Locale locale){
        NumberFormat formatter = NumberFormat.getInstance(locale);
        formatter.format(currency);
        return formatter.format(currency);

    }
    public static String formatDateByLocale(Locale date,Locale locale){
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(locale);
        return formatter.format();

    }
}

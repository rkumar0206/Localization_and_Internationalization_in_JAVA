package assignments;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/*
       Create a java application that receives a number,
       a country code (ex: UK, FR, etc) and a language
       code (ex: en, ru, etc) and display the received
       number & current date in the appropriate format.
       [Hint: use the NumberFormat & DateFormat classes]
 */

// https://www.tutorialspoint.com/java_i18n/java_i18n_quick_guide.htm

public class Assignment_app2 {

    public static void main(String[] args) {

        LocaleTest test = new LocaleTest(
                456.56,
                "FR",
                "fr",
                446.33
        );

        test.printDetails();

    }
}

class LocaleTest {

    double number;
    String countryCode;
    String languageCode;
    double currencyValue;

    public LocaleTest(double number, String countryCode, String languageCode, double currencyValue) {
        this.number = number;
        this.countryCode = countryCode;
        this.languageCode = languageCode;
        this.currencyValue = currencyValue;
    }

    public void printDetails() {

        Locale locale = new Locale(languageCode, countryCode);

        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        System.out.println(
                "Number format for number "
                        + number + " in '"
                        + languageCode
                        + "' is : "
                        + numberFormat.format(number));

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);

        System.out.println("Today's date in " + countryCode + " is : " + dateFormat.format(new Date()));

        NumberFormat numberFormatCurrency = NumberFormat.getCurrencyInstance(locale);

        System.out.println("Currency for " + countryCode + " is : " + numberFormatCurrency.format(currencyValue));

    }

}

import java.util.Locale;

public class Application {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();

        printWithDiffLocaleFunc(locale);

        // Local class that prints english in different languages

        Locale localeFrench = new Locale("fr", "FR");
        System.out.println();
        printWithDiffLocaleFunc(localeFrench);

        Locale localeUS = new Locale("en", "US");
        System.out.println();
        printWithDiffLocaleFunc(localeUS);

    }

    public static void printWithDiffLocaleFunc(Locale locale) {

        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayName());
        System.out.println(locale.getISO3Country());
        System.out.println(locale.getISO3Language());
        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

    }
}

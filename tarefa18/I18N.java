import java.util.*; 
import java.text.DateFormat;
import java.text.NumberFormat;  

public class I18N {
    
    static void printDateShort(Locale locale) {  
            
        DateFormat formatter = DateFormat.getDateInstance(DateFormat.SHORT, locale);  
        Date currentDate = new Date();  
        String date = formatter.format(currentDate);  
        System.out.println(date + " " + locale);  
    }

    static void printDateLong(Locale locale) {  
            
        DateFormat formatter = DateFormat.getDateInstance(DateFormat.LONG, locale);  
        Date currentDate = new Date();  
        String date = formatter.format(currentDate);  
        System.out.println(date + " " + locale);  
    }

    static void printTime(Locale locale) {  
        
        DateFormat formatter = DateFormat.getTimeInstance(DateFormat.DEFAULT,locale);  
        Date currentDate = new Date();  
        String time = formatter.format(currentDate);  
        System.out.println(time);  
    }

    static void printCurrency(Locale locale) {  
        
        double dbl = 10.00;  
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);  
        String currency = formatter.format(dbl);  
        System.out.println(currency);  
    } 

    static void printNumber(Locale locale) {  
        
        double dbl = 12048.32;  
        NumberFormat formatter = NumberFormat.getNumberInstance(locale);  
        String number = formatter.format(dbl);  
        System.out.println(number);  
    }  

    public static void main (String args[]) { 
        
        Locale[] locales = {

            new Locale("pt", "BR"),
            new Locale("en", "US"),
            new Locale("fr", "FR"),
            new Locale("pl", "PL"),
            new Locale("it", "IT"),
            new Locale("de", "DE"),
            new Locale("zh", "CN"),
            new Locale("ja", "JP"),
            new Locale("es", "ES"),
            new Locale("en", "GB")
        };

        System.out.println("Nomes dos países:\n");

        for (int i = 0; i < locales.length; i++) {   
            
            String display = locales[i].getDisplayCountry(locales[i]);   
            System.out.println(locales[i].toString() + ": " + display);   
        }  
        
        System.out.println("\nLinguagens:\n");

        for (int i = 0; i < locales.length; i++) {   
            
            String display = locales[i].getDisplayLanguage(locales[i]);   
            System.out.println(locales[i].toString() + ": " + display);   
        }  
        
        System.out.println("\nData no formato curto:");

        for (int i = 0; i < locales.length; i++) {
            
            System.out.println("\n" + locales[i].toString() + ": ");   
            printDateShort(locales[i]);
        }

        System.out.println("\nData no formato longo:");

        for (int i = 0; i < locales.length; i++) {
            
            System.out.println("\n" + locales[i].toString() + ": ");   
            printDateLong(locales[i]);
        }

        System.out.println("\nFormato de hora:");

        for (int i = 0; i < locales.length; i++) {   
            
            System.out.println("\n" + locales[i].toString() + ": ");   
            printTime(locales[i]);
        }

        System.out.println("\nSímbolo da moeda local:");

        for (int i = 0; i < locales.length; i++) {   
            
            System.out.println("\n" + locales[i].toString() + ": ");   
            printCurrency(locales[i]);
        }

        System.out.println("\nSeparadores numéricos:");

        for (int i = 0; i < locales.length; i++) {   
            
            System.out.println("\n" + locales[i].toString() + ": ");   
            printNumber(locales[i]);
        }
    } 
}
package br.com.javacore.Sdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        //ISO 639 pt=portugues BR - Brazil, en - ingles, US - Estados Unidos
        Locale locItaly = new Locale("it");
        Locale locSuica = new Locale("it","CH");
        Locale locIndia = new Locale("hi","IN");
        Locale locJapao = new Locale("ja","JP");

        Calendar c = Calendar.getInstance();
        c.set(2011, Calendar.DECEMBER, 25);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locJapao);

        System.out.println("Italia "+df.format(c.getTime()));
        System.out.println("Suica "+df2.format(c.getTime()));
        System.out.println("Indiano "+df3.format(c.getTime()));
        System.out.println("Japao "+df4.format(c.getTime()));

        System.out.println(locItaly.getDisplayLanguage());
        //linguagem japones em nihongo
        System.out.println(locJapao.getDisplayLanguage(locJapao));
    }
}

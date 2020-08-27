import jdk.internal.org.objectweb.asm.ClassReader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Interview {

    static class a {
        static class b {
            static int c;
        }
    }

    static class c {
        static class b {
            static int a;
        }
    }

    public static void main(String[] args) throws IOException {
        a.b.c = c.b.a;
        folderAssignment();

    }

   /*
     Sample outpt-
  Number of files Month wise:
  ============================
  May-->22
  August-->2
 */


    static void folderAssignment() throws IOException {

        String folderPath = "E:\\WALLPAPERS";
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        int january = 0;
        int february = 0;
        int march = 0;
        int april = 0;
        int may = 0;
        int june = 0;
        int july = 0;
        int august = 0;
        int september = 0;
        int october = 0;
        int november = 0;
        int december = 0;

        if (files != null) {
            for (File file : files) {
                BasicFileAttributes attr = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
                FileTime fileTime = attr.creationTime();

                Date date = new Date(fileTime.to(TimeUnit.MILLISECONDS));
                LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                int month = localDate.getMonthValue();

                if (month == 1) {
                    january++;
                } else if (month == 2) {
                    february++;
                } else if (month == 3) {
                    march++;
                } else if (month == 4) {
                    april++;
                } else if (month == 5) {
                    may++;
                } else if (month == 6) {
                    june++;
                } else if (month == 7) {
                    july++;
                } else if (month == 8) {
                    august++;
                } else if (month == 9) {
                    september++;
                } else if (month == 10) {
                    october++;
                } else if (month == 11) {
                    november++;
                } else {
                    december++;
                }
            }
        }

        System.out.println("Number of files Month wise:");
        System.out.println("============================");

        if (january > 0)
            System.out.println("January-->" + january);
        if (february > 0)
            System.out.println("February-->" + february);
        if (march > 0)
            System.out.println("March-->" + march);
        if (april > 0)
            System.out.println("April-->" + april);
        if (may > 0)
            System.out.println("May-->" + may);
        if (june > 0)
            System.out.println("June-->" + june);
        if (july > 0)
            System.out.println("July-->" + july);
        if (august > 0)
            System.out.println("August-->" + august);
        if (september > 0)
            System.out.println("Septemebr-->" + september);
        if (october > 0)
            System.out.println("October-->" + october);
        if (november > 0)
            System.out.println("November-->" + november);
        if (december > 0)
            System.out.println("December-->" + december);

    }
}

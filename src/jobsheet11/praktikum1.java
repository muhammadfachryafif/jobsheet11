package jobsheet11;
import java.util.Locale;

public class praktikum1 {
    public static void main(String[] args)
            {
                String identitas = "MUHAMMAD FACHRI AFIF / X RPL 2 / 22";
                System.out.println(" identitas : " + identitas);
                 String x = "OPERASI";
                System.out.println("isi variabel = " + x);
                System.out.println("\""+ x +"\" panjang Character = "+ x.length () );
                System.out.println("x adalah kosong = "+ x.isEmpty());
                String y = "";
                System.out.println("isi variabel y = "+ y);
                System.out.println("y adalah kosong = "+ y.isEmpty() );
                 System.out.println("isi x sama dengan y = " + x.equals(y));
        String z = "operasi";
        System.out.println("isi variable z = " + z);
        System.out.println("isi x sama dengan z (case sensitive) = " + x.equals(z));
        String r = "operasi";
        System.out.println("isi variable r = "+ r);
        System.out.println("isi x sama dengan r (case sensitive = "+ x.equals(r));
        System.out.println("isi x sama dengan r (Not case sensitive) = "+ x.equalsIgnoreCase(r));
        System.out.println("perbandingan isi x dengan y = " + x.compareTo(y));
        System.out.println("perbandingan isi x dengan z (case sensitive) + " + x.compareTo(z));
        System.out.println("perbandingan isi x dengan r (case sensitive = " + x.compareTo(r));
        System.out.println("perbandingan isi x dengan r (not case sensitive) = " + x.compareToIgnoreCase(r));
        String s = "operasi";
        System.out.println("isi variable s = "+ s);
        System.out.println("perbandingan isi r dengan s (case sensitive) = "+ r.compareTo(s));

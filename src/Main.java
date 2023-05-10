// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String recenica = "macejedejecam";

        int n = recenica.length();
        int brojac = n/2;
        boolean signal = true;
        for(int i=0;i<brojac;i++) {
            if (recenica.charAt(i)!=(recenica.charAt(n-i-1))) {

                signal = false;
                break;

            }
        }

        if (signal == true)
            System.out.println("String je palindrom");
        else
            System.out.println("String nije palindrom.");
    }




}





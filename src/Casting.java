public class Casting {
    public static void main(String[] args) {

        //In un anno far adottare 30 cagnolini
        //Quanti cani devo far adottare in un mese

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs); //2.5

        //Stima
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);//2

        //Esattezza
        int a = 30;
        int b = 12;

        System.out.println(a/b); //2
        System.out.println((double)a/b); //2.5

        double c = (double) a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n; //devo specificarlo siccome un char è molto più grande
        System.out.println(nS);
        }
    }


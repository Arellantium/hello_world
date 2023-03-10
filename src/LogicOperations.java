public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //operatori asigmatic
        System.out.println("s è uguale a b?" + (a==b));
        System.out.println("a è diverso a b?" + (a!=b));

        //operatori relazionali
        System.out.println("a è maggiore di b?" + (a > b));
        System.out.println("a è minore di b?" + (a < b));
        System.out.println("a è maggiore uguale di b?" + (a >= b));
        System.out.println("a è maggiore di b?" + (a >= b));

        if (a == b) {
            System.out.println("a è uguale a b");
        } else if (a != b){
            System.out.println("a è diverso a b");
        } else if (a > b){
            System.out.println("a è maggiore di b");
        } else if (a < b){
            System.out.println("a è minore di b");
        } else if (a >= b){
            System.out.println("a è maggiore uguale a b");
        } else if (a <= b){
            System.out.println("a è minore uguale a b");
        }
    }
}

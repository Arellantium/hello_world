public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Ceil ritorna un intero per eccesso
        System.out.println(Math.ceil(x));//3.0

        //Floor ritorna un intero per difetto
        System.out.println(Math.floor(x));//2.0

        //Pow ritorna un numero elevato con un altro
        System.out.println(Math.pow(x, y));

        //Max ritorna il numero più grande tra due numeri
        System.out.println(Math.max(x, y));

        //Sqrt ritorna la radice quadrata
        System.out.println(Math.sqrt(y));

        //Area di un cerchio, y = raggio
        System.out.println(Math.PI * Math.pow(y, 2));

        //Area di una sfera
        //4*PI*r2
        System.out.println(Math.PI * Math.pow(y, 2) * 4);

        //Volume di una sfera
        //(4/3)*PI * r3
        System.out.println(Math.PI * (4/3) * Math.pow(y, 3));
    }
}

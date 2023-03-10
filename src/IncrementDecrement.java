public class IncrementDecrement {
    public static void main(String[] args) {

        Integer lives = 5;
        lives = lives - 1; //4
        System.out.println(lives);

        lives--; //3
        System.out.println(lives);

        lives++; //4
        System.out.println(lives);

        //Vince un regalo se vince una vita
        Integer gift = 100 + lives++; //postfijo
        System.out.println(gift); //104
        System.out.println(lives); //5

        Integer gift1 = 100 + ++lives; //prefijo, così ottiene il nostro dato ma incrementato
        System.out.println(gift1); //106
        System.out.println(lives); //6



    }
}

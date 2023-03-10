public class WhileLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {

        turnOnOffLight();
        int i = 1;
        while (isTurnOnLight && i <= 10){
            printSOS();
            i++;
        }

    }
    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight(){

        isTurnOnLight = (isTurnOnLight)?false:true;
        //La riga sopra riassume le righe qua sotto dell'if in unica riga
        /*
        if (isTurnOnLight){
            isTurnOnLight = false;
        }else{
            isTurnOnLight = true;
        }*/
        return isTurnOnLight;
    }
}

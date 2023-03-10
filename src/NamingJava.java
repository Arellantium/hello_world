            //Upper Camel Case
public class NamingJava {
    public static void main(String[] args){
        Integer celphone = 33337777;
        Integer celPhone = 555558899; //Sono differenti perché una ha la maiuscola ed una no, è meglio usare questa.
        System.out.println(celphone);
        System.out.println(celPhone);

        String $countryName = "Spain";
        String _backgroundColor = "green";

        //String background-Color = "red";   Non si può fare

        String currency$ = "MXN";
        String background_color = "blue";

        Integer POSITION = -5;//Costante
        Integer MAX_WIDTH = 9999;
        Integer MIN_WIDTH = 1;

        //Lower Camel Case
        String fullName = "Alessandro Arellano Altuna";
        Integer sizeInCentimeters = 26;

    }
}

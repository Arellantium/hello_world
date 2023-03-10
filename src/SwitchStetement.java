public class SwitchStetement {
    public static void main(String[] args) {

        String colorModeSelected = "Dark";
        switch (colorModeSelected){
            case "Light":
                System.out.println("Hai scelto Light mode");
                break;
            case "Night":
                System.out.println("Hai scelto Night mode");
                break;
            case "Blue Dark":
                System.out.println("Hai scelto Blue Dark mode");
                break;
            case "Dark":
                System.out.println("Hai scelto Dark mode");
                break;
            default:
                System.out.println("Scegli una tra le opzioni");
        }
    }
}

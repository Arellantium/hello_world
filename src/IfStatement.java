public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnable = false;
        int fileSended = 3;

        if (isBluetoothEnable){
            //Send file
            fileSended++;
            System.out.println("Il file è stato inviato");

            //Se definisco una varianile all'interno dell'if, non potrò chiamarla al di fuori
            int i = 1;
            i++;
        }else{
            System.out.println("Per favore attivare il bluetooth, per iniziare il trasferimento");
        }
    }
}

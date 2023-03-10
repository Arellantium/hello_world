public class funzioni {
    public static void main(String[] args) {
        double y = 3;
        double area = circleArea(y);
        System.out.println(area);
        System.out.println("Da pesos a dollari: "+ converToDolar(200, "MXN"));

    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double sphereVolume(double r){
        return (4/3) * Math.PI * Math.pow(r, 3);
    }


    /**
     * Descrizione: funzione che specificando la moneta la converte in dollari
     *
     * @param quantity Qunatità di soldi
     * @param currency Tipo di moneta, solo accetta pesos messicani o colombiani
     * @return quantity, che ritorna la quantità attualizzata in dollari
     * */
    public static double converToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}

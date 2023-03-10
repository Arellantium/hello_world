            //Upper Camel Case
public class UpdatingVariables {
    public static void main(String[] args){
        Integer salary = 1000;

        //buono da 200$
        salary = salary + 200;
        System.out.println(salary);

        //pensione: 50$, da scalare
        salary = salary - 50;
        System.out.println(salary);

        //2 ore extra, ed ogni ora extra vale 30$
        //cibo: 45$
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Attualizando stringhe
        String employeeName = "Alessandro Arellano";
        employeeName = employeeName + " Altuna";
        System.out.println(employeeName);

        employeeName = "Il tuo nome è: " + employeeName;
        System.out.println(employeeName);

        //Lower Camel Case
        Integer sizeCentimeters = 37;
        String fullName = "Alessandro Arellano Altuna";
    }
}

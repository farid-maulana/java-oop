package jti.polinema.polimorfisme.teori;

public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat) {
        if (perangkat instanceof TelevisiJadul)
            System.out.println("Nyalakan televisi jadul dengan input: "
                    + ((TelevisiJadul) perangkat).getModelInput());
        else
            System.out.println("Nyalakan televisi modern dengan input: "
                    + ((TelevisiModern) perangkat).getModelInput());
        System.out.println("Voltase televisi: " + perangkat.getVoltase());
    }
}
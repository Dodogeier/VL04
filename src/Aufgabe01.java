public class Aufgabe01 {
    public static void main (String[] args){
        // (i) ok
       // tuWas(12);

        //(ii) nicht möglich da double --> long
       //tuWas(3.1415);


        // (iii) benötigt einen Return Value, aber Methode hat keinen (da void)
        //int x = tuWas(123L);
    }

    public static void tuWas(long p){
        long zeitaufwand = p+20;
        System.out.println("Zeitaufwand: " + zeitaufwand + " Minuten");
    }
}

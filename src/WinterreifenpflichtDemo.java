public class WinterreifenpflichtDemo {
    public static void main(String[] args) {
        isWinterreifenPflicht(7, true);
    }
    public static boolean isWinterreifenPflicht (int temperatur, boolean rutschigeFahrbahn) {
        if ( rutschigeFahrbahn = true & temperatur < 10 || temperatur < 4 ){
           return System.out.println("Bitte Winterreifen verwenden");
        } else{
           return System.out.println("Winterreifen sind nciht erforderlich");
        }
    }
}

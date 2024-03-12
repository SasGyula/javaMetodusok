package metodusoksasgyula;
public class MetodusokSasGyula {
    public static void main(String[] args) {
        nehanySzamGyokenekMegjelenitese();
    }

    private static void nehanySzamGyokenekMegjelenitese() {
        haromSzamGyokeKonzolon();
        otSzamGyokeKonzolon();
    }

    private static void haromSzamGyokeKonzolon() {
        int osszeg = szamok(10,szamok(14,12));
        double a =  gyokvonas(osszeg);
        kiir(a, osszeg);
    }

    private static void otSzamGyokeKonzolon() {
        int[] szamok = {4,3,2,3,4};
        int osszeg = tombosOsszegzes(szamok);
        double a = gyokvonas(osszeg);
        kiir(a, osszeg);
    }
    public static int szamok(int a, int b){
        return b+a;
    }
    public static double gyokvonas(double a){
        return Math.sqrt(a);
    }
    public static void kiir(double a, int c){
        System.out.printf("%d gyöke: %.4f\n",c,a);
    }
    public static int tombosOsszegzes(int[] tomb){
        int osszeg = 0;
        for(int i = 0; i<tomb.length; i++){
            osszeg += tomb[i];
        }
        return osszeg;
    }

}
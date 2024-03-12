package metodusoksasgyula;

import java.io.IOException;
import java.nio.file.Files;
import static java.nio.file.Files.lines;
import java.nio.file.Path;
import java.nio.file.Paths;


public class MetodusokBetukkel {
    public static void main(String[] args) {
        tombokMegjelenitese(); 
    }
    private static void tombokMegjelenitese() {
        char[] betuk = betukGeneralas(9);
        kiirasok(betuk);
    }

    private static void kiirasok(char[] tomb) {
        sorbaKiir(tomb);
        matrixbaKiir(tomb,3);
        fajlbaIras();
    }
    private static char[] betukGeneralas(int db){
        char[] tomb = new char[db];
        for (int i = 0; i < 9; i++) {
            tomb[i] = (char) (97+i);
        }
        return tomb;
    }
    public static void sorbaKiir(char[] tomb){
        for(int i =0; i<tomb.length; i++){
            System.out.print(tomb[i] + " ");
        }
    }
    public static void matrixbaKiir(char[] tomb, int oszlop){
        for(int i = 0; i<tomb.length;i++){
            if(i % oszlop == 0){
                System.out.println("");
            }
            System.out.print(tomb[i] + " "); 
        }
    }
    public static void fajlbaIras() throws IOException{
        Path hova = Paths.get("fajlNeve.txt");
        char[] betuk = betukGeneralas(9);
        String mit = matrixbaKiir(betuk,3);
        Files.write(hova, mit.getBytes());
    }
}


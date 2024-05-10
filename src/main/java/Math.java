import java.util.Random;

public class Math {
    void ShowPi (){
        System.out.println("3.14159265358979323846");
    }

    int max(int a, int b){
        return a > b ? a : b;
    }

    int lode(){
        Random randon = new Random();
        return randon.nextInt(100);
    }
}

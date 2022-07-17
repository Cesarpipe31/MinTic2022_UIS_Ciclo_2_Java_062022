package ja_017_for;

public class JA_017_For {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            System.out.println("--------------");

        int j = 20;
        while (j <= 30) {
            System.out.println(j);
            j++;
        }
        
        System.out.println("--------------");
        
        int m = 40;
        do{
            System.out.println(m);
            m++;
        } while (m <=47);
        }
        
        System.out.println("--------------");
        
        float[] nota = new float[3];
        nota[0] = 4.5f;
        nota[1] = 4.0f;
        nota[2] = 3.5f;
        for (int i = 0; i < 3; i++){
            System.out.println(nota[i]);
        }
        
        
    }

}

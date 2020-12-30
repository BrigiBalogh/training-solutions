package week08d01;

public class Sultan {

    public boolean[] getOpenDoors() {

        boolean[] result = new boolean[100];
        for (int i = 0; i < 100; i++) {
            for (int j =i + 1; j <= 100; j++) {
                if ((i+1) % j== 0) {
                    result[i] = !result[i];
                }
            }
        }
        return result;
    }
}

package bytematrix;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MatrixReader {

   private  List<byte[]> myMatrix = new ArrayList<>();

    public void readBytesAndCreateMatrix(String fileName) {
        Path path = Path.of(fileName);

        try (InputStream inputStream = Files.newInputStream(path)) {
            byte[] b = new byte[1000];
            int size = 0;
            while ((size = inputStream.read(b)) > 0) {
                myMatrix.add(b);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot find file !",e);
        }

    }

    public int numberOfColumnsWhereMoreZeros() {
        int numOfColumns = 0;
        for (int i = 0; i < 1000; i++) {
            int zeros = 0;
            int ones = 0;

            for (int j = 0; j < myMatrix.size(); j++) {
//                byte[] kivett = myMatrix.get(j);
//                kivett[i]
                if (myMatrix.get(j)[i] == '0') { // 48
                    zeros++;
                } else {
                    ones++;
                }
            }
            if (zeros > ones ) {
                numOfColumns++;
            }
        }
        return numOfColumns;
    }

    public List<byte[]> getMyMatrix() {
        return myMatrix;
    }
}

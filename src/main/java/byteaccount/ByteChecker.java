package byteaccount;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteChecker {

    public int readBytesAndFindAs(String fileName) {
        Path path = Path.of(fileName);
        int sumOfA = 0;
        try(InputStream inputStream = Files.newInputStream(path)) {
            byte[] b = new byte[1000];
            int size;
            while((size = inputStream.read(b)) > 0) {
                for (int i = 0; i < size; i++) {
                    if (b[i] == (byte)'a') {
                        sumOfA++;
                    }
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot find file !", e);
        }
        return sumOfA;

    }
}

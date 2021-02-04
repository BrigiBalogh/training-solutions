package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StringToBytes {

    public void writeAsBytes(List<String> text, Path path) {
        try(BufferedOutputStream bos = new BufferedOutputStream(Files.newOutputStream(path))) {
            for (String s : text) {
                if(! s.startsWith("_")) {
                    bos.write(s.getBytes());
                }
            }
        }catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file",ioe);
        }

    }


}

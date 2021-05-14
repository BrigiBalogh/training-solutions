package lambdaintro;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OfficeDocumentReader {

    private static final String DOC = "docx||pptx||xlsx";
    private List<File> officeDocuments;

    public List<File> listOfficeDocuments(File path) {
        List<File> files = Arrays.asList(path.listFiles(f -> f.isFile() && (
                f.getName().toLowerCase().endsWith(".docx") ||
                f.getName().toLowerCase().endsWith(".pptx") ||
                f.getName().toLowerCase().endsWith(".xlsx")
                )));
        files.sort(Comparator.comparing(File :: getName));
        return files;
    }

}

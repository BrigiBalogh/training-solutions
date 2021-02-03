package salary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SalaryWriter {

    private List<String> names;

    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    public void writeNamesAndSalaries(Path file) {
        try(PrintWriter pw = new PrintWriter(Files.newBufferedWriter(file))) {
            for (String name  : names) {
                pw.print(name);
                pw.print(":");
                pw.println(selectSalary(name));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot write file !");
        }
    }

    private long selectSalary(String name) {
        if(name.contains("Dr")) {
            return 500_00;
        }
        if (name.contains("Mr") || name.contains("Mrs")){
            return 200_000;
        }else {
            return 100_000;
        }
    }
}

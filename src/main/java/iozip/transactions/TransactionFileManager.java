package iozip.transactions;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class TransactionFileManager {



    public void saveTransactions(Path path, List<Transaction>transactions) {
        try (ZipOutputStream zos = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            for (Transaction transaction : transactions) {
                zos.putNextEntry(new ZipEntry(Long.toString(transaction.getId())));
                String outputString = transaction.getTime().toString() + "\n" + transaction.getAccount() + "\n" + Double.toString(transaction.getAmount());
                zos.write(outputString.getBytes());
                zos.closeEntry();
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot write zip file !", e);
        }
    }
}

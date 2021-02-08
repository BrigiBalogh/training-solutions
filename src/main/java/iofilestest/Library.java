/*
Isaac Asimov;Foundation
Jokai Mor;Egy magyar nábob
*/

package iofilestest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Library {

    List<Book> books;

    public void add(Book...books) {
        for(Book b : books) {
            if (!this.books.contains(b)) {
//            if (!findBook(b)) {
                this.books.add(b);
            }
        }
    }

/*    private boolean findBook(Book b) {
        for (Book book : books) {
           if (book.equals(b)){
               return true;
           }
        }
        return false;
    }*/

    public void saveBooks(Path path) {
        try (BufferedWriter bw = Files.newBufferedWriter(path)) {
            for (Book b : books) {
                bw.write(b.getAuthor() + ";" + b.getTitle());
                bw.newLine();
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot write file", e);
        }

    }

    public void loadBooks(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            this.books.clear();
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                String author = parts[0];
                String title = parts[1];
                Book book = new Book(author, title);
                this.books.add(book);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
    }
}

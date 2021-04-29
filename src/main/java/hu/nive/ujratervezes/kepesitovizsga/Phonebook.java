package hu.nive.ujratervezes.kepesitovizsga;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {

        if ((contacts == null) || (output==null)) {
            throw new IllegalArgumentException();
        }



        try (BufferedWriter writer = Files.newBufferedWriter(Path.of("C:/kepesitovizsga/src/main/resources/" + output))) {

            try {
                for (String s: contacts.keySet()) {
                    writer.write(s + ": " + contacts.get(s) + "\r\n");
                }
            } catch (IOException ioe) {
                throw new IllegalStateException("Can not write file", ioe);
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }

    }

}

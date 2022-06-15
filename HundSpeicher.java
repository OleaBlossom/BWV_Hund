package hund;

import java.io.*;
import java.util.*;

public class HundSpeicher {
    ArrayList<Hund> hunde;

    public HundSpeicher(ArrayList<Hund> hunde) {
        this.hunde = hunde;

        try {
            hundeCsvSpeichern();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void hundeCsvSpeichern() throws FileNotFoundException {
        List<String> dataLines = new ArrayList<>();
        for (Hund hund :
                hunde) {
            dataLines.add(hund.getName() + ", " +
                             hund.getRasse() + ", " +
                             hund.getGroesse() + ", " +
                             hund.getGewicht());

        }
        File csvOutputFile = new File("hundeInfos.csv");
        try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
            dataLines.forEach(pw::println);
        }

    }
}
package com.itProger;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        try {

            BufferedReader br = new BufferedReader(new FileReader("aplana.txt"));

            String textOutput;

            while ((textOutput = br.readLine()) != null) {
                System.out.println(textOutput);
            }
        } catch (IOException ex) {
            System.out.print("Error" + ex);
        }
        try {
            LineNumberReader lnr = new LineNumberReader(new FileReader("aplana.txt"));

            while (null != lnr.readLine()) {
                x++;
            }
        } catch (IOException ex) {
            System.out.print("Error" + ex);
        }
        try(BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw =  new FileWriter("aplana.txt", false)) {
            String text;

                for (int i = 0; i < x; i++) {
                    System.out.println("Введите строку:");
                    text=brr.readLine();
                    fw.write(text + "\n");
                    fw.flush();
                }
            } catch (IOException ex) {
            System.out.print("Error" + ex);
        }
    }
}




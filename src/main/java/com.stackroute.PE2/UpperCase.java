package com.stackroute.PE2;
import java.io.*;

public class UpperCase {

    public String upperCase(String path) {
        String res = "";
        try {
            System.out.println("anu");

            String path1 = "/home/anusha/Documents/PE2_testCases-master/src/test/com.stackroute.PE2/";

            File file = new File(path1);

            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null) {
                res = res + st;
            }
            return res.toUpperCase();

        } catch (Exception e) {
            System.out.println("cannt read");
        }
        return res.toUpperCase();
    }
    }

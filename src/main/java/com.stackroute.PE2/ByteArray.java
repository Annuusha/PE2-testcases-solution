package com.stackroute.PE2;

import java.io.*;

public class ByteArray {


    public byte[] byteArray(String folderName, String extensionName) throws IOException {
        String path="/home/anusha/Documents/PE2_testCases-master/src/test/com.stackroute.PE2"+folderName;
        File[] file = new File(path).listFiles();
        File working=null;
        for(File f:file){
            if(f.toString().contains(extensionName))
                working =f;
        }
        BufferedReader br = new BufferedReader(new FileReader(working));
        StringBuilder result= new StringBuilder();
        String read="";
        while((read=br.readLine())!=null){
            result.append(read);
        }
        return result.toString().getBytes();
    }
}



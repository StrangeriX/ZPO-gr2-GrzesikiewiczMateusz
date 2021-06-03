package zad1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File implements  IFile{

    @Override
    public int[] executeOperation(int[] ints) {
        try{
        String path = File.class.getResource("dane.txt").toString().substring(6);
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        int i=0;
        while((line = br.readLine())!=null){
            if(ints.length!=i){
                System.out.println(line);
                ints[i] = Integer.parseInt(line);
                i++;
            }
        }
    }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return ints;
    }
}

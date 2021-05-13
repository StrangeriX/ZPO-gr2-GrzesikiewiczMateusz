package zad3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DaneFinansowe {
    private static Map<String, DaneFinansowe> dane;
    private String name;
    private double value;

    private DaneFinansowe(){
        try{
            dane = new HashMap<>();
            String path = DaneFinansowe.class.getResource("dane.txt").toString();
            BufferedReader br = new BufferedReader(new FileReader(path));
            String miesiac;
            while((miesiac = br.readLine())!=null){
                String[] cMiesiac = miesiac.split(":");
                dane.put(cMiesiac[0], new DaneFinansowe(cMiesiac[0], Double.parseDouble(cMiesiac[1])));
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public DaneFinansowe(String s, double parseDouble) {
        this.name = s;
        this.value = parseDouble;
    }

    public static DaneFinansowe getInstance(String name){
        return dane.get(name);
    }
    public double getValue(){
        return value;
    }
}

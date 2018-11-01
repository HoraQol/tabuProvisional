package redex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import redex.model.DataProcessing;
import redex.tabu.TabuSearch;

public class RedEx {
    public static void main(String[] args) {
        String origin, destiny;
        
        try{
            TabuSearch ts = new TabuSearch();
            ts.inputData("aeropuertos.txt", "planes_vuelo.txt", "pack_enviado_SKBO.txt");
            ts.printPackList();
            long start = System.currentTimeMillis();
            ts.executeVCRPTabu();
            long elapsedTime = System.currentTimeMillis() - start;
            System.out.println("Tiempo: " + String.valueOf(elapsedTime) + " mseg");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("There are a several problem with the testing data reading process! Check it!");
        }
    }
}

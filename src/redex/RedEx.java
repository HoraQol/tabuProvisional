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
//            BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
//            origin = lector.readLine();
//            destiny = lector.readLine();
            origin = "SKBO";
            destiny = "LHBP";
            TabuSearch ts = new TabuSearch();
            ts.inputData("aeropuertos.txt", "planes_vuelo.txt", "pack_enviado_SKBO.txt");
            //ts.printListFlight();
            if(ts.validator(origin, destiny)){
                ts.tabuAlgorithm(origin, destiny, "06:40");
                ArrayList<Integer> solution = ts.getRouteOptimal();
                for(int i : solution){
                    System.out.print(i + "->");
                }
                System.out.println();
                int lenghtOptimal = ts.getLenghtOptimal();
                System.out.println("Optimal route's lenght is: " + String.valueOf(lenghtOptimal));
            }else{
                System.out.println("Some airport doesn't exist!");
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("There are a several problem with the testing data reading process! Check it!");
        }
    }
}

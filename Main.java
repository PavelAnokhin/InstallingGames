package InstallOfGames;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private static List<String> tempString = new LinkedList<>();

    public static void main(String[] args)  {

        creatingFolder("/Users/pavelanokhin/Документы/Games/src","src dir was created");
        creatingFolder("/Users/pavelanokhin/Документы/Games/src/Main","main dir was created");
        creatingFolder("/Users/pavelanokhin/Документы/Games/src/test","test dir was created");
        creatingFolder("/Users/pavelanokhin/Документы/Games/res","res dir was created");
        creatingFolder("/Users/pavelanokhin/Документы/Games/res/drawables","drawable dir was created");
        creatingFolder("/Users/pavelanokhin/Документы/Games/res/vectors","vectors dir was created");
        creatingFolder("/Users/pavelanokhin/Документы/Games/res/icons","icons dir was created");
        creatingFolder("/Users/pavelanokhin/Документы/Games/savegames","savegames dir was created");
        creatingFolder("/Users/pavelanokhin/Документы/Games/temp","temp dir was created");
        creatingFiles("/Users/pavelanokhin/Документы/Games/src/Main","Main.java");
        creatingFiles("/Users/pavelanokhin/Документы/Games/src/Main","Utils.java");
        creatingFiles("/Users/pavelanokhin/Документы/Games/temp","temp.txt");


        try {
            FileWriter writer = new FileWriter("/Users/pavelanokhin/Документы/Games/temp/temp.txt", true);
            writer.write(tempString.toString());
            writer.flush();
        } catch (IOException ext) {
            System.out.println(ext.getMessage());
        }

    }


    static void creatingFolder(String adress, String message){
        File src = new File(adress);
        if(src.mkdir()){
            tempString.add(message);
        }else{
            System.out.println("Fault during creating folders!Try again");
        }

    }

    static void creatingFiles(String adress,String nameOfFile){
        File mainfile = new File(adress, nameOfFile);
        try {
            if (mainfile.createNewFile()) {
                tempString.add(nameOfFile + "was created in" + adress+ "dir\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}

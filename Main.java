package InstallOfGames;

import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringBuilder tempString = new StringBuilder();
        File src = new File("/Users/pavelanokhin/Документы/Games/src");
        if(src.mkdir()){
            tempString.append("src dir was created\n");
        }
        File mainDir = new File("/Users/pavelanokhin/Документы/Games/src/Main");
        if(mainDir.mkdir()){
            tempString.append("main dir was created\n");
        }
        File testDir = new File("/Users/pavelanokhin/Документы/Games/src/test");
        if(testDir.mkdir()){
            tempString.append("test dir was created\n");
        }
        File mainfile = new File(mainDir, "Main.java");
        try {
            if (mainfile.createNewFile()) {
                tempString.append("Main.java was created in Main dir\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File utilsfile = new File(mainDir, "Utils.java");
        try {
            if (utilsfile.createNewFile()) {
                tempString.append("Utils.java was created in Main dir\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File main = new File("/Users/pavelanokhin/Документы/Games/src/main");
        if(main.mkdir()){
            tempString.append("main dir was created\n");
        }
        File test = new File("/Users/pavelanokhin/Документы/Games/src/test");
        if(test.mkdir()){
            tempString.append("test dir was created\n");
        }
        File res = new File("/Users/pavelanokhin/Документы/Games/res");
        if(res.mkdir()){
            tempString.append("res dir was created\n");
        }
        File drawables = new File( "/Users/pavelanokhin/Документы/Games/res/drawables");
        if(drawables.mkdir()){
            tempString.append("drawable dir was created\n");
        }
        File vectors = new File("/Users/pavelanokhin/Документы/Games/res/vectors");
        if(vectors.mkdir()){
            tempString.append("vectors dir was created\n");
        }
        File icons = new File("/Users/pavelanokhin/Документы/Games/res/icons");
        if(icons.mkdir()){
            tempString.append("icons dir was created\n");
        }
        File savegames = new File("/Users/pavelanokhin/Документы/Games/savegames");
        if(savegames.mkdir()){
            tempString.append("savegames dir was created\n");
        }
        File temp = new File("/Users/pavelanokhin/Документы/Games/temp");
        if(temp.mkdir()){
            tempString.append("temp dir was created\n");
        }
        File temptxt = new File(temp, "temp.txt");
        try {
            if (temptxt.createNewFile()) {
                tempString.append("temp.txt was created\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());


        }
        try {
            FileWriter writer = new FileWriter("/Users/pavelanokhin/Документы/Games/temp/temp.txt", true);
            writer.write(tempString.toString());
            writer.flush();
        } catch (IOException ext) {
            System.out.println(ext.getMessage());
        }

    }

}

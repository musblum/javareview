package edu.citytech.javareview.utility;

import java.io.File;
import java.util.function.Consumer;

public class FileUtility {
    
    
    public final Consumer<String> dir = this::getAllFiles;
    public final Consumer<String> ls = this::getAllFiles;
    private Consumer<File> consumer = System.out::println;

    public FileUtility(){

    }

    public FileUtility(Consumer<File> consumer) {
        this.consumer = consumer;
    }



    private  void getAllFiles(String directory) {

        File folder = new File(directory);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                consumer.accept(file);
            }
        }
    }
}
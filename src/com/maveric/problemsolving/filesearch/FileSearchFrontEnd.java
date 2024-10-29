package com.maveric.problemsolving.filesearch;

import java.util.Optional;

public class FileSearchFrontEnd {
    private static String path="C:/Users/karthikku/Videos/experiments";

    public static void main(String[] args) {
        FileSearch search=new FileSearch();
        Optional<String> result=search.searchFile(path,"kk.txt");
        if (result.isPresent()){
            System.out.println("File Found At Location :"+result.get());
        }
        else {
            System.out.println("File Not Found in the path :"+path);
        }
    }
}

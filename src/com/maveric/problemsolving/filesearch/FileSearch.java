package com.maveric.problemsolving.filesearch;

import java.io.File;
import java.util.Arrays;
import java.util.Optional;
import java.util.Stack;

public class FileSearch {

    /**
     * Searches for a file with the specified name starting from the given directory path.
     *
     * This method performs a depth-first search (DFS),
     * using a stack to keep track of directories to explore.
     * If the file is found, it returns the absolute path of the file as an Optional
     * If the file is not found, it returns an empty Optional.
     *
     *
     * @param startPath the starting directory path from which the search begins.
     * @param fileName the name of the file to search for.
     * @return an Optional containing the absolute path of the found file,
     *         or an empty Optional if the file is not found.
     *
     *  Best Case Scenario Time Complexity : O(1)
     *  Worst Case Scenario Time Complexity : O(n)
     *  Average Case Scenario Time Complexity : O(n)
     *  Auxialary Space Complexity : O(d) [d is maximum depth of the directory structure]
     *
     *
     */

    Optional<String> searchFile(String startPath,String fileName){
        Stack<File> stack=new Stack<>();
        File start=new File(startPath);
        if (start.isFile() && startPath.equalsIgnoreCase(fileName)){
            return Optional.of(startPath);
        }
        stack.push(start);
        System.out.println("************Files In Stack*************");
        Arrays.asList(stack.pop().listFiles()).stream().forEach(System.out::println);
        System.out.println("***************************************");
        stack.push(start);
        while (!stack.empty()){
            File visited=stack.pop();
            System.out.println("Visiting File :"+visited.getName());
            File[] files=visited.listFiles();
            System.out.println("Files In Visiting file:"+visited.getName());
            Arrays.asList(files).forEach(System.out::println);
            System.out.println("************************************");
            for (File file:files){
                if (file.isFile() && file.getName().equalsIgnoreCase(fileName)){
                    System.out.println("FILE NAME:"+file.getName());
                    return Optional.of(file.getAbsolutePath());
                }
                System.out.println("It is directory and Pushing into stack:"+file.getName());
                stack.push(file);
            }
        }
        return Optional.empty();
    }
}

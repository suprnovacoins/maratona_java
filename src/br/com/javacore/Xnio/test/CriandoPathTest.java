package br.com.javacore.Xnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CriandoPathTest {
    public static void main(String[] args) {
//        C:\Users\isaia\Documents\maratona_java
        Path p1 = Paths.get("C:\\Users\\isaia\\Documents\\maratona_java\\arquivo.txt");
        Path p2 = Paths.get("C:\\Users\\isaia\\Documents\\maratona_java","arquivo.txt");
        Path p3 = Paths.get("C:","Users\\isaia\\Documents\\maratona_java","arquivo.txt");
        Path p4 = Paths.get("C:","Users","isaia","Documents","maratona_java","arquivo.txt");
    }
} 

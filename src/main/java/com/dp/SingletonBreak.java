package com.dp;

import java.io.*;

public class SingletonBreak {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton instance = Singleton.getInstance();
        try {
            ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(new File("C:\\CPG\\test.txt")));
            ous.writeObject(instance);
            Singleton instance2 = null;
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:\\CPG\\test.txt")));
            instance2 = (Singleton)ois.readObject();
            System.out.println(instance == instance2);
            System.out.println(instance.hashCode());
            System.out.println(instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
package org.example;

public class Main2 {
    public static void main(String[] args) {
        int n = 1000000;
        String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str += "a";
            sb.append("a");
        }

        long startTime = System.nanoTime();
        str = str.replace("a", "b");
        long endTime = System.nanoTime();
        long duration1 = endTime - startTime;

        startTime = System.nanoTime();
        sb.replace(0, sb.length(), sb.toString().replace("a", "b"));
        endTime = System.nanoTime();
        long duration2 = endTime - startTime;

        System.out.println("String: " + duration1 + " nanoseconds");
        System.out.println("StringBuilder: " + duration2 + " nanoseconds");
    }
}
package org.example;
//Написать метод принимающий строку, ищущий в ней основание и степень После этого расчитывающий результат и
//        выводящий в консоль в консоль строку параметра + ответ.
//        Пример строки: "Основание -12б степень 7, результат". Попробовать с разными входящими строками.


public class Main1 {
    public static void main(String[] args) {
        String input = "Основание -126 степень 7, результат";
        String[] words = input.split(" ");
        int base = 0;
        int exponent = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("основание")) {
                base = Integer.parseInt(words[i + 1].replace("б", ""));
            } else if (words[i].equalsIgnoreCase("степень")) {
                exponent = Integer.parseInt(words[i + 1].replace(",", ""));
            }
        }
        int result = (int) Math.pow(base, exponent);
        System.out.println(input + " " + result);
    }
}
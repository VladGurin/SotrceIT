package string;

//Дано четыре строки ("Кот", "Котик", "Большой кот", "Собака").
// Напишите метод, который бы принимал строку и возвращал строку
// “Это не кот", если в принятой строке нет слова "Кот" или "кот"
// или бы возвращал строку “Это кот”.
// Вызовите написаный метод с каждой из представленных вначале сток.

public class String1 {
    public static void main(String[] args) {
        System.out.println(ifCat("Кот"));
        System.out.println(ifCat("Котик"));
        System.out.println(ifCat("Большой кот"));
        System.out.println(ifCat("Собака"));
    }

    public static String ifCat(String str) {
        if (str.contains("Кот")||str.contains("кот"))
        return "Это кот";
        else
            return "Это не кот";
    }
}
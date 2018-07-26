package ua.rozhkov;

public class Main {

    public static void main(String[] args) {

        FileParser fileParser=new FileParser();
        String sourceF="./resources/search.txt";
        System.out.println(fileParser.parseF(sourceF,"мама"));
        fileParser.parseF(sourceF,"маму","мама");
    }
}

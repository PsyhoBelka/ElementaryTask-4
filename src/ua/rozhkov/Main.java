package ua.rozhkov;

public class Main {

	public static void main(String[] args) {

		FileParser fileParser = new FileParser();
		String sourceF = "./resources/search.txt";
		fileParser.resetFile(sourceF);
		System.out.println(fileParser.parseFile(sourceF, "мама"));
		fileParser.parseFile(sourceF, "маму", "мама");
		System.out.println(fileParser.parseFile(sourceF, "мама"));
	}

}

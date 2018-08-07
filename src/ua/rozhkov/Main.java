package ua.rozhkov;

public class Main {

	public static void main(String[] args) {

		FileParser fileParser = new FileParser();
		String sourceF = "./resources/search.txt";
		fileParser.resetFile(sourceF);
		System.out.println(fileParser.parseFile(sourceF, "Кто бы"));
		fileParser.parseFile(sourceF, "Кто бы", "мама1");
		System.out.println(fileParser.parseFile(sourceF, "мама1"));
		fileParser.resetFile(sourceF);
	}

}

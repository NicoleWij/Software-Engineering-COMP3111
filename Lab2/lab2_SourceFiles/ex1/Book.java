package comp3111.lab2.ex1;

public class Book {
	private String chapters[];
	private static final int DEFAULT_CHAPTERS = 10;
	
	public Book() {
		chapters = new String[DEFAULT_CHAPTERS];
		for (int i = 0; i < chapters.length; i++) {
			chapters[i] = "n/a";
		}
	}
	
	public Book(String argument[]) {
		/* construct the object with an array of chapter names */
		/* ADD YOUR CODE HERE */
	}
	
	public String getChapters(int i) {
		/* return the chapter by the given index */
		/* ADD YOUR CODE HERE */
	}
	
	public String[] getChapters() {
		return chapters;
	}
}

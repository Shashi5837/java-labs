package lab2;

public class Test {

	public static void main(String[] args) {
		JournalPaper jp = new JournalPaper();
		book book = new book();
		
		jp.setId(1);
		jp.setAuthor("Ram");
		jp.setTitle("foo");
		
		System.out.println(jp);
		System.out.println(book);

	}

}
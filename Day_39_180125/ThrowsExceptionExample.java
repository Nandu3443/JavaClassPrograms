import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExceptionExample {
	public static void openFile(String path) throws FileNotFoundException {
			FileReader reader = new FileReader(path);
			System.out.println(reader);
	}

	public static void main(String[] args) {
		String path = "C:\\Users\\HCR867\\Desktop\\files\\a.txt";
		try {
			openFile(path);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}

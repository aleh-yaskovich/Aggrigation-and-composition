package by.htp.task1.textView;

import java.util.List;
import by.htp.task1.entity.Sentence;
import by.htp.task1.entity.Word;

public class TextView {

	public void textView(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i == (arr.length - 1)) {
				System.out.print("\n");
			} else {
				System.out.print(" ");
			}
		}
	}
	
}

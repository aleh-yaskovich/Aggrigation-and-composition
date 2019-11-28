package by.htp.task1.textView;

import java.util.List;
import java.util.Scanner;

import by.htp.task1.entity.Sentence;
import by.htp.task1.entity.Text;
import by.htp.task1.entity.Word;

public class TextView {

	public void textView(Text text) {
		// Выводим заголовок
		List<Word> title = text.getTitle().getSentence();
		String strTitle = "";
		String strText = "";
		for (int i = 0; i < title.size(); i++) {
			// Делаем заглавную букву для первого слова в предложении
			if (i == 0) {
				String tmp = title.get(i).getWord();
				String tmp1 = tmp.substring(0, 1);
				String tmp2 = tmp.substring(1, tmp.length());
				strTitle = strTitle + tmp1.toUpperCase() + tmp2;
				// Ставим точку или пробел после слова
				if (i == title.size()-1) {
					strTitle = strTitle + ". ";
				} else {
					strTitle = strTitle + " ";
				}
				continue;
			}
			// Ставим точку или пробел после слова
			if (i == title.size()-1) {
				strTitle = strTitle + title.get(i).getWord() + ". ";
			} else {
				strTitle = strTitle + title.get(i).getWord() + " ";
			}			
		}
		System.out.println(strTitle);
		// Выводим текст
		for (int i = 0; i < text.getText().size(); i++) {
			Sentence sentence = text.getText().get(i);
			for (int j = 0; j < sentence.getSentence().size(); j++) {
				Word word = sentence.getSentence().get(j);
				// Делаем заглавную букву для первого слова в предложении
				if (j == 0) {
					String tmp = word.getWord();
					String tmp1 = tmp.substring(0, 1);
					String tmp2 = tmp.substring(1, tmp.length());
					strText = strText + tmp1.toUpperCase() + tmp2;
					// Ставим точку или пробел после слова
					if (j == sentence.getSentence().size()-1) {
						strText = strText + ". ";
					} else {
						strText = strText + " ";
					}
					continue;
				}
				// Ставим точку или пробел после слова
				if (j == sentence.getSentence().size()-1) {
					strText = strText + word.getWord() + ". ";
				} else {
					strText = strText + word.getWord() + " ";
				}
			}
		}
		System.out.println(strText);
	}
	
	public String newSentence() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите новое предложение: ");
        String sentence = sc.nextLine();
        return sentence;
	}
	
}

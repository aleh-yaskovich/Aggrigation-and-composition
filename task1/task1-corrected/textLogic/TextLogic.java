package by.htp.task1.textLogic;

import java.util.List;
import java.util.Scanner;

import by.htp.task1.entity.Sentence;
import by.htp.task1.entity.Word;

public class TextLogic {
	
	public Sentence newSentence(String str) {
		Sentence sentence = new Sentence();
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			// Убираем точку, если она есть в конце предложения
			char ch = strArr[i].charAt(strArr[i].length()-1);
			if (ch == '.') {
				strArr[i] = strArr[i].substring(0, strArr[i].length()-1);
			}
			// Создаем новый объект Word и добавляем его в List<Word>
			sentence.getSentence().add(new Word(strArr[i]));
		}
		return sentence;
	}
	
}

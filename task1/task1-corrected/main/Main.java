package by.htp.task1.main;

import java.util.List;

import by.htp.task1.entity.Sentence;
import by.htp.task1.entity.Text;
import by.htp.task1.entity.Word;
import by.htp.task1.textLogic.TextLogic;
import by.htp.task1.textView.TextView;

public class Main {

	public static void main(String[] args) {

		Word word1 = new Word("oсень");
		Word word2 = new Word("наступила");
		Word word3 = new Word("осень");
		Word word4 = new Word("опали");
		Word word5 = new Word("листья");
		Word word6 = new Word("птицы");
		Word word7 = new Word("улетели");
		Word word8 = new Word("на");
		Word word9 = new Word("юг");
		Word word10 = new Word("похолодало");
		
		Sentence sentence1 = new Sentence();
		Sentence sentence2 = new Sentence();
		Sentence sentence3 = new Sentence();
		Sentence sentence4 = new Sentence();
		Sentence sentence5 = new Sentence();
		
		sentence1.getSentence().add(word1);
		// sentence1.getSentence().add(word2);
		sentence2.getSentence().add(word2);
		sentence2.getSentence().add(word3);
		sentence3.getSentence().add(word4);
		sentence3.getSentence().add(word5);
		sentence4.getSentence().add(word6);
		sentence4.getSentence().add(word7);
		sentence4.getSentence().add(word8);
		sentence4.getSentence().add(word9);
		sentence5.getSentence().add(word10);
		
		Text text = new Text();
		text.setTitle(sentence1);
		text.getText().add(sentence2);
		text.getText().add(sentence5);
		text.getText().add(sentence3);
		text.getText().add(sentence4);
		
		// Выводим заголовок и текст
		TextView view = new TextView();
		view.textView(text);
		
		// Добавляем новое предложение в текст
		String str = view.newSentence();
		TextLogic logic = new TextLogic();
		Sentence sentence = logic.newSentence(str);
		text.getText().add(sentence);
		view.textView(text);
		
	}

}

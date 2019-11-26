package by.htp.task1.textLogic;

import java.util.List;
import by.htp.task1.entity.Sentence;
import by.htp.task1.entity.Word;

public class TextLogic {
	
	public String[] createText (List<Sentence> text) {
		String[] createText = new String[text.size()];
		for (int i = 0; i < text.size(); i++) {
			List<Word> sentence = text.get(i).getSentence();
			String str = "";
			for (int j = 0; j < sentence.size(); j++) {
				if (j == 0) {
					String tmp = sentence.get(j).getWord();
					String tmp1 = tmp.substring(0, 1);
					String tmp2 = tmp.substring(1, tmp.length());
					str = str + tmp1.toUpperCase() + tmp2;
					if (j == (sentence.size() - 1)) {
						str = str + ".";
					} else {
						str = str + " ";
					}
					continue;
				}
				str = str + sentence.get(j).getWord();
				if (j == (sentence.size() - 1)) {
					str = str + ".";
				} else {
					str = str + " ";
				}
			}
			createText[i] = str;
		}
		return createText;
	}
	
	public String[] createTitle (Sentence title) {
		String[] createTitle = new String[title.getSentence().size()];
		
		for (int i = 0; i < title.getSentence().size(); i++) {
			String str = "";
			if (i == 0) {
				String tmp = title.getSentence().get(i).getWord();
				String tmp1 = tmp.substring(0, 1);
				String tmp2 = tmp.substring(1, tmp.length());
				str = str + tmp1.toUpperCase() + tmp2;
				if (i == (title.getSentence().size() - 1)) {
					str = str + ".";
				}
				createTitle[i] = str;
			} else {
				str = str + title.getSentence().get(i).getWord();
				if (i == (title.getSentence().size() - 1)) {
					str = str + ".";
				}
				createTitle[i] = str;
			}
		}
		return createTitle;
	}
	
}

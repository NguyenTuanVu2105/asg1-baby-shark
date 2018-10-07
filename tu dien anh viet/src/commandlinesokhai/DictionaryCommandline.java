package commandlinesokhai;

public class DictionaryCommandline {
	DictionaryManagement dic = new DictionaryManagement();

	public void showAllWord() {
		
		System.out.println("No"+"   "+"|English"+ "       |Vietnamese");
		
		for(int i=1;i<=dic.getN();i++) {
			System.out.println(i+ "   "+ "|"+dic.dictionary.arrWord.get(i).getNew_Word()+"       "+"|"+dic.dictionary.arrWord.get(i).getMean());
		}
	}
	
	public void  dictionaryBasic() {
		dic.insertFromCommandline();
		showAllWord();
	}
	
	public static void main(String [] args) {
		DictionaryCommandline Dic = new DictionaryCommandline();
		Dic.dictionaryBasic();
		
	}

}

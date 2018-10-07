package commandlinesokhai;
import java.util.Scanner;

public class DictionaryManagement {
	private int n;
	// ham nhap so luong tu va so tu can nhap;
	Dictionary dictionary = new Dictionary();
	Scanner input = new Scanner (System.in);
	Word words= new Word();
	// ham nhap n
	public void setN() {
		int n;
		n=input.nextInt();
		this.n= n;
	}
	public int getN() {
		return n;
	}
	// ham nhap du lieu tu dien;
	public void insertFromCommandline() {
		System.out.println("Nhap so tu ban muon tra: ");
		setN();
		for(int i=1;i<=getN();i++) {
			words.setNew_Word(input.nextLine());
			words.setMean(input.nextLine());
			dictionary.arrWord.add(words);
		}
		
	}
}

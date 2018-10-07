package viewer;

import javax.swing.*;
import java.awt.*;

public class Dictionary extends JFrame {
    //Variables declaration
    private JLabel lb1;
    private JTextField tfSearch;
    private JButton btSearch;
    private JButton btAdd;
    private JButton btCorrect;
    private JButton btRemove;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTextArea text;
    private JList wordList;


    public Dictionary(){
        initCompenents();


    }

    private void initCompenents() {
        tfSearch = new JTextField();
        tfSearch.setBounds(5,70,150,20);
        add(tfSearch);

        lb1 = new JLabel("Nhập từ cần tra:");
        lb1.setBounds(5,45,100,20);
        add(lb1);

        btSearch = new JButton("Search");
        btSearch.setBounds(160,70, 20,20);
        add(btSearch);

        btAdd = new JButton("Add");
        btAdd.setBounds(160,100,20,20);
        add(btAdd);

        btCorrect = new JButton("Corect");
        btCorrect.setBounds(160,130,20,20);
        add(btCorrect);

        btRemove = new JButton("Remove");
        btRemove.setBounds(160,160,20,20);
        add(btRemove);

        text = new JTextArea("");
        text.setColumns(10);
        text.setLineWrap(true);
        text.setRows(5);
        jScrollPane1 = new JScrollPane();
        jScrollPane1.setViewportView(text);
        jScrollPane1.setBounds(190,70, 500, 280);
        add(jScrollPane1);

        jScrollPane2 = new JScrollPane();
        jScrollPane2.setBounds(5,100, 150,250);
        jScrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(jScrollPane2);

        setSize(700,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new Dictionary();
    }
}

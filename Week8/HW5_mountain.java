import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class HW5_mountain {
    public static void main(String[] args) {
        MyJFrame f1 = new MyJFrame();
    }
}

class MyJFrame extends JFrame {
    
    private JPanel Panel_0;
    private static final String[] CITY = {"台北", "宜蘭", "桃園", "台中", "南投", "彰化", "高雄"};
    private static final String[] MOUNT = { "陽明山", "阿玉山", "拉拉山", "鳶嘴山", "合歡山", "八卦山", "壽山" };
    
    public MyJFrame() {
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("各地名山");
        
        Panel_0 = new JPanel(new GridLayout(2, 1));
        setContentPane(Panel_0);
        
        JLabel labelCity = new JLabel("找各地名山：");
        
        JPanel Panel_1 = new JPanel(new FlowLayout());
        Panel_1.add(labelCity);
        
        JTextArea txtShow = new JTextArea("可選取地名...");
        add(txtShow);
        JScrollPane Panel_2 = new JScrollPane(txtShow, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        JList<String> listCity = new JList<>(CITY);
        listCity.setVisibleRowCount(4);
        listCity.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String lbShow = "";
                for (int i : listCity.getSelectedIndices()) {
                    lbShow += CITY[i] + "的名山： " + MOUNT[i];
                    txtShow.setText(lbShow);
                }
            }
        });
        JScrollPane list_ScrollPanel = new JScrollPane(listCity, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        Panel_1.add(list_ScrollPanel);
        
        Panel_0.add(Panel_1);
        Panel_0.add(Panel_2);
        
        setContentPane(Panel_0);
        pack();
        setVisible(true);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class HW4_image{
    public static void main(String[] args) throws Exception{
        MyJFrame f1 = new MyJFrame();
    }
}

class MyJFrame extends JFrame implements ActionListener {
    private JPanel contentPane;
    private int imgNumber = 1;
    JTextField textfield;
    
    MyJFrame (){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600, 200, 250, 350);
        setTitle("換圖片");
        setVisible(true);
        
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout());
        
        JLabel lab1 = new JLabel("圖片1", JLabel.CENTER);
        Font font = new Font("SansSerif", Font.BOLD, 20);
        lab1.setFont(font);
        contentPane.add(lab1);
        
        ImageIcon img1 = new ImageIcon("1.png");
        ImageIcon img2 = new ImageIcon("2.png");
        ImageIcon img3 = new ImageIcon("3.png");
        
        // original image
        JLabel lab2 = new JLabel();
        lab2.setIcon(img1);
        contentPane.add(lab2);
        
        JButton btn1 = new JButton("上一張");
        JButton btn2 = new JButton("下一張");
        
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn2.setEnabled(true);
                if (imgNumber == 1){
                    btn1.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "沒有圖了", "圖片", JOptionPane.WARNING_MESSAGE);
                }
                if (imgNumber == 2){
                    lab1.setText("圖片1");
                    imgNumber--;
                    lab2.setIcon(img1);
                }
                if (imgNumber == 3) {
                    lab1.setText("圖片2");
                    imgNumber--;
                    lab2.setIcon(img2);
                }
            }
        });
        contentPane.add(btn1);
        
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn1.setEnabled(true);
                if (imgNumber == 3){
                    btn2.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "沒有圖了", "圖片", JOptionPane.WARNING_MESSAGE);
                }
                else if (imgNumber == 2){
                    lab1.setText("圖片3");
                    imgNumber++;
                    lab2.setIcon(img3);
                }
                else {
                    lab1.setText("圖片2");
                    imgNumber++;
                    lab2.setIcon(img2);
                }
            }
        });
        contentPane.add(btn2);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        JButton nameBtn = (JButton)e.getSource();
        JOptionPane.showMessageDialog(null, nameBtn.getText());
    }
}
import javax.swing.*;

public class Frame extends JFrame  {

    /**
     * Creates a 1000x750 JFrame that exits on close
     * with no layout manager. ALL ITEMS MUST BE MANUALLY POSITIONED
     */
    Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200,800);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }
}

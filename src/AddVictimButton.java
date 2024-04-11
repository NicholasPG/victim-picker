import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddVictimButton extends JButton implements ActionListener {

    private ArrayList<VictimPanel> victimPanels;
    private int numOfVictims = 1;

    AddVictimButton (ArrayList<VictimPanel> victimPanels) {
        this.victimPanels = victimPanels;

        this.setBounds(500,500,200,100);
        this.setFocusable(false);
        this.addActionListener(this);
        this.setText("Add Victim");

        //One victim by default on screen
        numOfVictims = 1;
        victimPanels.get(0).setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (numOfVictims == 1) {
            victimPanels.get(0).setVisible(false);

            victimPanels.get(1).setVisible(true);
            victimPanels.get(2).setVisible(true);

            numOfVictims++;
        } else if (numOfVictims == 2) {
            victimPanels.get(1).setVisible(false);
            victimPanels.get(2).setVisible(false);

            victimPanels.get(3).setVisible(true);
            victimPanels.get(4).setVisible(true);
            victimPanels.get(5).setVisible(true);

            numOfVictims++;
        } else if (numOfVictims == 3) {
            victimPanels.get(3).setVisible(false);
            victimPanels.get(4).setVisible(false);
            victimPanels.get(5).setVisible(false);

            victimPanels.get(6).setVisible(true);
            victimPanels.get(7).setVisible(true);
            victimPanels.get(8).setVisible(true);
            victimPanels.get(9).setVisible(true);

            numOfVictims++;
        }
    }
}

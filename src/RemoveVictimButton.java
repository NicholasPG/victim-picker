import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RemoveVictimButton extends JButton implements ActionListener {
    private ArrayList<VictimPanel> victimPanels;
    private int numOfVictims = 1;

    RemoveVictimButton (ArrayList<VictimPanel> victimPanels) {
        this.victimPanels = victimPanels;

        this.setBounds(300,500,200,100);
        this.setFocusable(false);
        this.addActionListener(this);
        this.setText("Remove Victim");

        //One victim by default on screen
        victimPanels.get(0).setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (numOfVictims == 2) {
            victimPanels.get(0).setVisible(true);

            victimPanels.get(1).setVisible(false);
            victimPanels.get(2).setVisible(false);

            numOfVictims--;
        } else if (numOfVictims == 3) {
            victimPanels.get(1).setVisible(true);
            victimPanels.get(2).setVisible(true);

            victimPanels.get(3).setVisible(false);
            victimPanels.get(4).setVisible(false);
            victimPanels.get(5).setVisible(false);

            numOfVictims--;
        } else if (numOfVictims == 4) {
            victimPanels.get(3).setVisible(true);
            victimPanels.get(4).setVisible(true);
            victimPanels.get(5).setVisible(true);

            victimPanels.get(6).setVisible(false);
            victimPanels.get(7).setVisible(false);
            victimPanels.get(8).setVisible(false);
            victimPanels.get(9).setVisible(false);

            numOfVictims--;
        }
    }
}

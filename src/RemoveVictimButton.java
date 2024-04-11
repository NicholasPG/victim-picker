import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RemoveVictimButton extends JButton implements ActionListener {
    //private ArrayList<VictimPanel> victimPanels;
    private VictimNumber numOfVictims;

    RemoveVictimButton (VictimNumber numOfVictims) {
        this.numOfVictims = numOfVictims;
        //this.victimPanels = victimPanels;

        this.setBounds(300,500,200,100);
        this.setFocusable(false);
        this.addActionListener(this);
        this.setText("Remove Victim");

        //One victim by default on screen
        //victimPanels.get(0).setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        numOfVictims.removeVictim();
    }
}

import java.util.ArrayList;

public class VictimNumber {
    private ArrayList<VictimPanel> victimPanels;
    private int numOfVictims = 1; //Initially one victim


    public VictimNumber(ArrayList<VictimPanel> victimPanels) {
        this.victimPanels = victimPanels;
        victimPanels.get(0).setVisible(true);
    }

    public void addVictim() {
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

    public void removeVictim() {
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

    public int getNumOfVictims() {
        return numOfVictims;
    }

}

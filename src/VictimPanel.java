import javax.swing.*;
import java.awt.*;

public class VictimPanel extends JPanel {

    private final JButton addPointButton;
    private final JButton removePointButton;
    private final JButton markAbsentButton;
    private final JButton pickVictimButton;

    private final int number;

    VictimPanel(int num) {
        this.number = num;

        addPointButton = new JButton("Add Point");
        addPointButton.setFocusable(false);

        removePointButton = new JButton("Remove Point");
        removePointButton.setFocusable(false);

        markAbsentButton = new JButton("Mark Absent");
        markAbsentButton.setFocusable(false);

        pickVictimButton = new JButton("Mark Absent");
        pickVictimButton.setFocusable(false);

        //Setting Bounds of Frame
        switch(number)
        {
            case 1 : //1 victim on screen
                this.setBounds(125,40,730,450);
                break;

            case 2 : //2 victims on screen (left panel)
                this.setBounds(125,40,365,450);
                break;

            case 3 : //2 victims on screen (right panel)
                this.setBounds(490,40,365,450);
                break;

            case 4, 7 : //3 or 4 victims on screen (top left panel)
                this.setBounds(125,40,365,225);
                break;

            case 5, 8 : //3 or 4 victims on screen (top right panel)
                this.setBounds(490,40,365,225);
                break;

            case 6 : //3 victims on screen (bottom panel)
                this.setBounds(308,265,365,225);
                break;

            case 9 : //4 victims on screen (bottom left panel)
                this.setBounds(125,265,365,225);
                break;

            case 10 : //4 victims on screen (bottom right panel)
                this.setBounds(490,265,365,225);
                break;

            default :
                // default Statement
        }

        this.setLayout(null);
        this.setBorder(BorderFactory.createLineBorder(Color.black));

        this.add(addPointButton);
        this.add(removePointButton);
        this.add(markAbsentButton);
        this.add(pickVictimButton);
    }

}

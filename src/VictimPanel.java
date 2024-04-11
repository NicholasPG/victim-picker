import javax.swing.*;
import java.awt.*;

//YO, here is a GitHub repo that I forked off of the main branch since I didn't have the access to
// make a new branch. https://github.com/NicholasPG/victim-picker
// I have the foundation of the setVisibility stuff for the add and remove victim
// buttons as well as some tentative sizing stuff in the VictimPanel class. Anyway, I am having
// trouble counting the number of victims on screen and sharing that information between the
// buttons. I beleive the solution is to create the buttons in the same class like the
// ButtonsPanel class that already exists in this project. We just need to move all of the logic
// that I have in the individual RemoveVictimButton and AddVictimButton into one class.
// So Basically, we need to create a new class that extends JPanel that is for these two buttons
// and then have that class create the buttons, implement their logic, then have a variable
// that both buttons can access that counts the number of victimPanels on the screen at the moment.

public class VictimPanel extends JPanel {

    //BUTTONS CURRENTLY HAVE ABSOLUTLEY 0 FUNCTIONALITY
    private final JButton addPointButton;
    private final JButton removePointButton;
    private final JButton markAbsentButton;
    private final JButton pickVictimButton;

    private final int number;

    //VALUES FOR RESIZING THE PANELS AND THEIR VALUES
    private final int OnePanelWidth = 730;
    private final int TwoThreeFourPanelWidth = 365;
    private final int TwoPanelHeight = 450;
    private final int ThreeFourHeight = 225;
    private final int OnePanelHeight = 450;

    private final int TopLeftCornerX = 125;
    private final int TopLeftCornerY = 40;

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
                this.setBounds(TopLeftCornerX,TopLeftCornerY,OnePanelWidth,OnePanelHeight);
                break;

            case 2 : //2 victims on screen (left panel)
                this.setBounds(TopLeftCornerX,TopLeftCornerY,TwoThreeFourPanelWidth,TwoPanelHeight);
                break;

            case 3 : //2 victims on screen (right panel)
                this.setBounds(490,TopLeftCornerY,TwoThreeFourPanelWidth,TwoPanelHeight);
                break;

            case 4, 7 : //3 or 4 victims on screen (top left panel)
                this.setBounds(TopLeftCornerX,TopLeftCornerY,TwoThreeFourPanelWidth,ThreeFourHeight);
                break;

            case 5, 8 : //3 or 4 victims on screen (top right panel)
                this.setBounds(490,TopLeftCornerY,TwoThreeFourPanelWidth,ThreeFourHeight);
                break;

            case 6 : //3 victims on screen (bottom panel)
                this.setBounds(308,265,TwoThreeFourPanelWidth,ThreeFourHeight);
                break;

            case 9 : //4 victims on screen (bottom left panel)
                this.setBounds(TopLeftCornerX,265,TwoThreeFourPanelWidth,225);
                break;

            case 10 : //4 victims on screen (bottom right panel)
                this.setBounds(490,265,TwoThreeFourPanelWidth,225);
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

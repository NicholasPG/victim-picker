import javax.swing.*;
import java.awt.*;

// Got the adding and removing working. I made a new class "VictimNumber.java" that handles all the logic from both buttons
// (just the adding and removing aspect, there is no Victim info present yet). So we should start on getting the actual victim
// info in each John next.
//ALS0, should we make our mini panels smaller to leave more room for the other info and buttons on the side or should we
// make the frame bigga

public class VictimPanel extends JPanel {

    //CHANGE THESE VALUES TO CHANGE THE SIZE OF THE VictimPanel Square (the space in which all victim panels reside)
    private final int OnePanelWidth = 800;
    private final int OnePanelHeight = 450;

    //X and Y values for the top left coordinates of the VictimPanel Square (the space in which all victim panels reside)
    private final int TopLeftCornerX = 200;
    private final int TopLeftCornerY = 40;

    //BUTTONS CURRENTLY HAVE ABSOLUTLEY 0 FUNCTIONALITY
    private final JButton addPointButton;
    private final JButton removePointButton;
    private final JButton markAbsentButton;
    private final JButton pickVictimButton;

    private final int number;




    //These values are dependent on the size of the VictimPanel Square (the space in which all victim panels reside)
    private final int TwoThreeFourPanelWidth = OnePanelWidth/2;
    private final int TwoPanelHeight = OnePanelHeight;
    private final int ThreeFourHeight = OnePanelHeight/2;




    VictimPanel(int num) {
        this.number = num;


        addPointButton = new JButton("Add Point");
        addPointButton.setFocusable(false);

        removePointButton = new JButton("Remove Point");
        removePointButton.setFocusable(false);

        markAbsentButton = new JButton("Mark Absent");
        markAbsentButton.setFocusable(false);

        pickVictimButton = new JButton("Pick Victim");
        pickVictimButton.setFocusable(false);


        //SET LOCAL VARIABLES SO THAT ALL STATEMENTS CAN BE COPIED AND PASTED
        int localX, localY, localWidth, localHeight;

        //Setting Bounds of Frame
        switch(number)
        {
            case 1 : //1 victim on screen
                localX = TopLeftCornerX;
                localY = TopLeftCornerY;
                localWidth = OnePanelWidth;
                localHeight = OnePanelHeight;

                this.setBounds(localX,localY,localWidth,localHeight);
                pickVictimButton.setBounds((int)(localWidth/(16/3)),(localHeight/9),(int)(localWidth/1.6),(int)(localHeight/4.5));
                break;

            case 2 : //2 victims on screen (left panel)
                localX = TopLeftCornerX;
                localY = TopLeftCornerY;
                localWidth = TwoThreeFourPanelWidth;
                localHeight = TwoPanelHeight;

                this.setBounds(localX,localY,localWidth,localHeight);
                pickVictimButton.setBounds((int)(localWidth/(16/3)),(localHeight/9),(int)(localWidth/1.6),(int)(localHeight/4.5));
                break;

            case 3 : //2 victims on screen (right panel)
                localX = TopLeftCornerX + TwoThreeFourPanelWidth;
                localY = TopLeftCornerY;
                localWidth = TwoThreeFourPanelWidth;
                localHeight = TwoPanelHeight;

                this.setBounds(localX,localY,localWidth,localHeight);
                pickVictimButton.setBounds((int)(localWidth/(16/3)),(localHeight/9),(int)(localWidth/1.6),(int)(localHeight/4.5));
                break;

            case 4, 7 : //3 or 4 victims on screen (top left panel)
                localX = TopLeftCornerX;
                localY = TopLeftCornerY;
                localWidth = TwoThreeFourPanelWidth;
                localHeight = ThreeFourHeight;

                this.setBounds(localX,localY,localWidth,localHeight);
                pickVictimButton.setBounds((int)(localWidth/(16/3)),(localHeight/9),(int)(localWidth/1.6),(int)(localHeight/4.5));
                break;

            case 5, 8 : //3 or 4 victims on screen (top right panel)
                localX = TopLeftCornerX + TwoThreeFourPanelWidth;
                localY = TopLeftCornerY;
                localWidth = TwoThreeFourPanelWidth;
                localHeight = ThreeFourHeight;

                this.setBounds(localX,localY,localWidth,localHeight);
                pickVictimButton.setBounds((int)(localWidth/(16/3)),(localHeight/9),(int)(localWidth/1.6),(int)(localHeight/4.5));
                break;

            case 6 : //3 victims on screen (bottom panel)
                localX = TopLeftCornerX + (TwoThreeFourPanelWidth/2);
                localY = TopLeftCornerY + ThreeFourHeight;
                localWidth = TwoThreeFourPanelWidth;
                localHeight = ThreeFourHeight;

                this.setBounds(localX,localY,localWidth,localHeight);
                pickVictimButton.setBounds((int)(localWidth/(16.0/3)),(localHeight/9),(int)(localWidth/1.6),(int)(localHeight/4.5));
                break;

            case 9 : //4 victims on screen (bottom left panel)
                localX = TopLeftCornerX;
                localY = TopLeftCornerY + ThreeFourHeight;
                localWidth = TwoThreeFourPanelWidth;
                localHeight = ThreeFourHeight;

                this.setBounds(localX,localY,localWidth,localHeight);
                pickVictimButton.setBounds((int)(localWidth/(16.0/3)),(localHeight/9),(int)(localWidth/1.6),(int)(localHeight/4.5));
                break;

            case 10 : //4 victims on screen (bottom right panel)
                localX = TopLeftCornerX + TwoThreeFourPanelWidth;
                localY = TopLeftCornerY + ThreeFourHeight;
                localWidth = TwoThreeFourPanelWidth;
                localHeight = ThreeFourHeight;

                this.setBounds(localX,localY,localWidth,localHeight);
                pickVictimButton.setBounds((int)(localWidth/(16.0/3)),(localHeight/9),(int)(localWidth/1.6),(int)(localHeight/4.5));
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

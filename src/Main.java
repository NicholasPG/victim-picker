
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Driver class for VictimPicker w/ GUI
 */
public class Main{
    public static void main(String[] args){

        // TODO: Replace with a file import
        String[] names = {"Channing Andrews", "Danny Barmanbekov", "Nate Benson", "Nate Bittle",
                "Excalibur Bunker", "Vincent Climer", "Nicholas Colet", "Fabrice Faustin", "Seth Garner",
                "Nicholas Gilleran", "Hunter Henderson", "Akhil John Bosco", "Jeremiah Jordan", "Bret Kagebein",
                "Owen Klilsgaard", "Chuckie Koch", "Reagan Kohler", "Jace Kramer", "Levi Landers",
                "Abraham Martinez Brito", "Chandler Mason", "Matthew McCallister", "Connor Myers",
                "Oluwatobiloba Olaoye", "Connor Parr", "Markie Salzwedel", "Canon Shaw", "Gavin Smith",
                "Josh Stapera", "Justin Stauffer", "Kevin Stinnett", "Ethan Stucker", "Dakotah Sutton-Rodriguez",
                "Heather Watson"};

        Random rand = new Random(); // purpose??

        /*Create new arraylist of students and store each name from roster in array
            Each student in the roster is randomly generated a number of picks
            to test the sorting algorithm used in the 'chooseTwo' method of the
            Victims class
        */
        ArrayList<Victim> students = new ArrayList<>();
        for (String name : names) {
            students.add(new Victim(name));     //instantiates new victim objects
            //students.get(i).setNumberOfPicks(rand.nextInt(10));
        }

        //driver objects
        VictimPicker victimPicker = new VictimPicker(); // main driver for everything

        // text display objects
        VictimLabel victimLabel = new VictimLabel(); // name of victim
        TimerLabel timerLabel = new TimerLabel(); // text for timer

        // interactable objects
        VictimButton button = new VictimButton(victimPicker, victimLabel, students); // pick a victim button
        ButtonsPanel panel = new ButtonsPanel(victimPicker, victimLabel,timerLabel); // add point, remove point, timer buttons
        VolunteerComboBox volunteer = new VolunteerComboBox(names, victimPicker, students, victimLabel); // dropdown menu for selecting volunteer

        // add them to a central frame
        Frame frame = new Frame();

        //ADD YOUR TESTING COMPONENTS HERE

        //Create ArrayList of every necessary VictimPanel
        ArrayList<VictimPanel> victimPanels = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            victimPanels.add(new VictimPanel(i));
        }

        for (VictimPanel v : victimPanels) {
            frame.add(v);
            v.setVisible(false);
        }

        AddVictimButton addVictimButton = new AddVictimButton(victimPanels);
        frame.add(addVictimButton);

        RemoveVictimButton removeVictimButton = new RemoveVictimButton(victimPanels);
        frame.add(removeVictimButton);

/*
        frame.add(button);
        frame.add(victimLabel);
        frame.add(panel);
        frame.add(volunteer);
        frame.add(timerLabel);

 */


        // Creates a window listener so that when frame is close
        // an action is performed, intended for  exporting victim list upon exit
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                e.getWindow().dispose();
            }
        });


    }


}
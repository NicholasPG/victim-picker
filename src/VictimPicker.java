import java.util.*;
public class VictimPicker {

    private ArrayList<Victim> victims;
    private ArrayList<Victim> pickedToday;
    private ArrayList<Victim> absentToday;

    public VictimPicker(){
        victims = new ArrayList<>();
        pickedToday = new ArrayList<>();
        absentToday = new ArrayList<>();
    }


    public Victim chooseVictim(){
        Collections.sort(victims);
        Random rand = new Random();

        int index = rand.nextInt(victims.size());

        pickedToday.add(victims.get(index));
        markAbsent(victims.get(index));

        return victims.get(index);
    }

    /**
    *    Method to choose two random victims, prioritizing those with
    *    the lowest number of picks. This is done by sorting the array of
    *    victims by number of picks and randomly generating two unique integers
    *    between 0 and half of the size of the array. So this method essentially
    *    chooses two random students from the first half of the array when it is
    *    sorted in ascending order by number of picks.
     */
    // NOTE: Does this guarentee that all lowest picked are picked before higher picks happen?
    //       Dunno if that's something we should care about - JS
    public ArrayList<Victim> chooseTwo(){
        ArrayList<Victim> twoVictims = new ArrayList<>();
        Random rand = new Random();

        //Sort array of victims
        Collections.sort(victims);

        //Generate two random indexes
        int index1 = rand.nextInt(victims.size() / 2);
        int index2 = rand.nextInt(victims.size() / 2);

        //Change second index if it is the same as first to make both unique
        while(index1 == index2){
            index2 = rand.nextInt(victims.size() / 2);
        }

        //Load victims into arraylist of two victims
        twoVictims.add(victims.get(index1));
        twoVictims.add(victims.get(index2));


        //Add victims to the 'pickedToday' array
        pickedToday.add(victims.get(index1));
        pickedToday.add(victims.get(index2));

        //Add all absent students to 'absentToday' array
        for(int i = 0; i < victims.size(); i++){
            if(victims.get(i).ifAbsent()){
                markAbsent(victims.get(i));
            }
        }

        //Return victims
        return twoVictims;
    }

    //Increment the score of those who were chosen and update when they were last picked
    public void increaseScore(int points){
        for(int i = 0; i < pickedToday.size(); i++){
            pickedToday.get(i).setScore(pickedToday.get(i).getScore() + 1);
            pickedToday.get(i).setLastPicked();
        }

    }

    //Mark students absent if they are not present
    public void markAbsent(Victim absentVictim){
        absentToday.add(absentVictim);
    }

    //Load roster of students into victims array
    public void loadList(ArrayList<Victim> victims){
        this.victims = new ArrayList<Victim>(victims);
    }

}

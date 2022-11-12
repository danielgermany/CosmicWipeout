import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Round {
    int Score;
    int avail_cubes;
    ArrayList<Integer> setInfo;
    //purpose: Keeps track of rounds
    //pre-conditions: None
    //post-conditions: Object is constructed
    public Round() {
        this.setInfo = null;
        this.Score = 0;
        this.avail_cubes = 0;

    }
    private Integer Flash(){
        int freq_1 = Collections.frequency(this.setInfo, 1);
        int freq_2 = Collections.frequency(this.setInfo, 2);
        int freq_3 = Collections.frequency(this.setInfo, 3);
        int freq_4 = Collections.frequency(this.setInfo, 4);
        int freq_5 = Collections.frequency(this.setInfo, 5);
        int freq_6 = Collections.frequency(this.setInfo, 6);
        int freq_10 = Collections.frequency(this.setInfo, 10);

        List<Integer> freq = new ArrayList<Integer>(
            List.of(freq_1,freq_2,freq_3,freq_4,freq_5,freq_6,freq_10));

        for(int i = 0; i < freq.size(); i++){
            if(freq.get(i) == 3){
                return i;
            }
        }
        return 8; //impossible number to return from the for loop
    }
    
    private Boolean FreightTrain(){

        if(this.setInfo.size() != 5){
            return false;
        }

        final List<Integer> FREIGHTTRAINAVIL = new ArrayList<Integer>(
            List.of(2,3,5,6));

        Object marker = this.setInfo.get(0);

        //Check if the first die in the set has the possiblity to roll a Frighttrain
        for(int j = 0; j < FREIGHTTRAINAVIL.size(); j++){
            if(marker.equals(FREIGHTTRAINAVIL.get(j))){
                break;
            }
        }
        //Check if marker is the the same through out the entire die set
        int counter = 0;
        for(int i = 0; i < this.setInfo.size(); i++){
            if(marker.equals(this.setInfo.get(i))){
                counter++;
            }
        }
        if(counter == 5){
            return true;
        }
        else{
            return false;
        }
        
    }
    //purpose: calculates score
    //pre-conditions: none
    //post-conditions: score is calculated
    public void CalculateScore() {
        int score = 0;
        int scoring_cubes = 0;
        int itr = Flash();
        if(FreightTrain()){
            score = this.setInfo.get(0) * 100;
        }
        else if(itr != 8){
            score = this.setInfo.get(itr) * 10;
        }
        else{
            int freq_5 = Collections.frequency(this.setInfo, 5);
            int freq_10 = Collections.frequency(this.setInfo, 10);
            

            scoring_cubes = freq_10 + freq_5;

            if (freq_5 >= 3) {
                score += 50;
                freq_5 -= 3;
            }
            if (freq_10 >= 3) {
                score += 100;
                freq_10 -= 3;
            }

            score = (freq_5 * 5) + (freq_10 * 10);
        }
        this.Score += score;
        this.avail_cubes -= scoring_cubes;
    }
}

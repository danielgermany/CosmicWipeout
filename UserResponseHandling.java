import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserResponseHandling {
    String response;
    Scanner reader = new Scanner(System.in);

    public UserResponseHandling(){
        this.response = null;
    }
    
    private static final List<String> VALIDINPUTS = new ArrayList<String>(
        List.of("yes","no","y","n"));
        
    private Boolean validateString(String input){
        for(int i = 0; i < VALIDINPUTS.size(); i++){
            if(input.toLowerCase().equals(VALIDINPUTS.get(i))){
                return true;
            }
        }

        return false;
    }
    public void closeReader(){
        reader.close();
    }
    public Boolean askToEnd(){
        while (true){
            System.out.println("Would you like to end the game? Enter Yes or No:");
            String input = reader.next();
            if(validateString(input) == false){
                System.out.println("Invalid Input. Try again.");
                continue;
            }
            if(input.equals("yes")|| input.equals("y")){
                reader.close();
                return true;
            }
            else{
                return false;
            }
        }
    }
}

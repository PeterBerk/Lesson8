
import javax.swing.ImageIcon;

public class CrapsGame {
    private Dice dice1, dice2;
    private String feedbackString, buttonText;
    private int money, firstNumber;
    private boolean firstroll;
    public CrapsGame(){
        dice1 = new Dice();
        dice2 = new Dice();
        feedbackString = "New game!";
        buttonText = "Roll!";
        money = 100;
        firstroll = true;
    }
    public ImageIcon getDicePictures(int dicenumber){
        if (dicenumber==1){
            return dice1.getPicture();
        }
        else if (dicenumber==2){
            return dice2.getPicture();
        }
        else{
            return null;
        }
    }
    public int returnTotalDiceValue(){
        return dice1.readRoll()+dice2.readRoll();
    }
    public String returnMoney(){
        return "$"+Integer.toString(money);
    }
    public String returnButton(){
        return buttonText;
    }
    public String returnFeedback(){
        return feedbackString;
    }
    public boolean roll(){
        if (firstroll){
            money -= 5;
            int total = dice1.roll()+dice2.roll();
            firstNumber = total;
            if (total==7||total==11){
                win();
            }
            else if (total==2||total==3||total==10){
                lose();
            }
            else{
                feedbackString = "Game continues...";
                firstroll = false;
            }
        }
        else{
            int total = dice1.roll()+dice2.roll();
            if (total==7){
                lose();
                firstroll = true;
            }
            else if (total==firstNumber){
                win();
                firstroll = true;
            }
            else{
                feedbackString = "Game continues...";
            }
        }
        if (money<5){
            
            return true;
        }
        else{
            return false;
        }
    }
    private void win(){
        feedbackString = "You win!";
        money += 10;       
    }
    private void lose(){
        feedbackString = "You lose.";
    }
}

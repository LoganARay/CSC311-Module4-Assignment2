package edu.farmingdale.csc311module4assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HelloController {
    private int[] hand= {0, 0, 0, 0};
    private int[] values={0, 0, 0, 0};
    @FXML
    private ImageView card1;

    @FXML
    private ImageView card2;

    @FXML
    private ImageView card3;

    @FXML
    private ImageView card4;

    @FXML
    private TextArea answer;

    @FXML
    private TextArea mirror;

    /*
    Called as soon as the scene is loaded, used to randomize the card draw and update graphics since
    its impossible to have random graphics in fxml so it must be done here
     */
    @FXML
    public void initialize() throws IOException {
        newHand();
        changeGraphics();
    }

    /*
        Creates a new hand setting the hand value to coordinate to what was
        randomly generated.
        Every time a card is randomly chosen it is taken out of the possible pool
        of cards for this hand, so you will never have 2 ace of spades in a hanf ever.
     */
    public void newHand(){
        List<Integer> deck= IntStream.rangeClosed(1, 52).boxed() //There are 52 cards in a deck (not including joker)
                .collect(Collectors.toCollection(ArrayList::new));
        for(int i=0; i<4; i++){
            int selected=(int)(Math.random()* deck.size());
            hand[i]=deck.get(selected);
            deck.remove(selected);
        }
    }

    /*
    Updates card graphics after a new hand.
    Each card needs their own case to change the card graphic correctly.
    The switch statements are split into 4 for each of the card types.
     */
    public void changeGraphics() throws IOException {
        Image card;
        for(int i=0; i<4; i++){
            if(hand[i] <= 13){ //spades; values from hand: 1-13
                switch(hand[i]){
                    case 1:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/ace_of_spades.png"));
                        changeCard(card, i);
                        values[i]=1;
                        break;
                    case 2:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/2_of_spades.png"));
                        changeCard(card, i);
                        values[i]=2;
                        break;
                    case 3:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/3_of_spades.png"));
                        changeCard(card, i);
                        values[i]=3;
                        break;
                    case 4:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/4_of_spades.png"));
                        changeCard(card, i);
                        values[i]=4;
                        break;
                    case 5:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/5_of_spades.png"));
                        changeCard(card, i);
                        values[i]=5;
                        break;
                    case 6:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/6_of_spades.png"));
                        changeCard(card, i);
                        values[i]=6;
                        break;
                    case 7:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/7_of_spades.png"));
                        changeCard(card, i);
                        values[i]=7;
                        break;
                    case 8:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/8_of_spades.png"));
                        changeCard(card, i);
                        values[i]=8;
                        break;
                    case 9:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/9_of_spades.png"));
                        changeCard(card, i);
                        values[i]=9;
                        break;
                    case 10:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/10_of_spades.png"));
                        changeCard(card, i);
                        values[i]=10;
                        break;
                    case 11:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/jack_of_spades.png"));
                        changeCard(card, i);
                        values[i]=11;
                        break;
                    case 12:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/queen_of_spades.png"));
                        changeCard(card, i);
                        values[i]=12;
                        break;
                    case 13:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/king_of_spades.png"));
                        changeCard(card, i);
                        values[i]=13;
                        break;
                }
            }
            else if(hand[i] <= 26){ //club cards; values from hand: 14-26
                switch((hand[i]-13)){
                    case 1:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/ace_of_clubs.png"));
                        changeCard(card, i);
                        values[i]=1;
                        break;
                    case 2:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/2_of_clubs.png"));
                        changeCard(card, i);
                        values[i]=2;
                        break;
                    case 3:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/3_of_clubs.png"));
                        changeCard(card, i);
                        values[i]=3;
                        break;
                    case 4:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/4_of_clubs.png"));
                        changeCard(card, i);
                        values[i]=4;
                        break;
                    case 5:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/5_of_clubs.png"));
                        changeCard(card, i);
                        values[i]=5;
                        break;
                    case 6:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/6_of_clubs.png"));
                        changeCard(card, i);
                        values[i]=6;
                        break;
                    case 7:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/7_of_clubs.png"));
                        changeCard(card, i);
                        values[i]=7;
                        break;
                    case 8:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/8_of_clubs.png"));
                        changeCard(card, i);
                        values[i]=8;
                        break;
                    case 9:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/9_of_clubs.png"));
                        changeCard(card, i);
                        values[i]=9;
                        break;
                    case 10:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/10_of_clubs.png"));
                        changeCard(card, i);
                        values[i]=10;
                        break;
                    case 11:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/jack_of_clubs.png"));
                        changeCard(card, i);
                        values[i]=11;
                        break;
                    case 12:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/queen_of_clubs.png"));
                        changeCard(card, i);
                        values[i]=12;
                        break;
                    case 13:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/king_of_clubs.png"));
                        changeCard(card, i);
                        values[i]=13;
                        break;
                }
            }
            else if(hand[i] <=39){//diamond cards; values from hand: 27-39
                switch((hand[i]-26)){
                    case 1:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/ace_of_diamonds.png"));
                        changeCard(card, i);
                        values[i]=1;
                        break;
                    case 2:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/2_of_diamonds.png"));
                        changeCard(card, i);
                        values[i]=2;
                        break;
                    case 3:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/3_of_diamonds.png"));
                        changeCard(card, i);
                        values[i]=3;
                        break;
                    case 4:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/4_of_diamonds.png"));
                        changeCard(card, i);
                        values[i]=4;
                        break;
                    case 5:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/5_of_diamonds.png"));
                        changeCard(card, i);
                        values[i]=5;
                        break;
                    case 6:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/6_of_diamonds.png"));
                        changeCard(card, i);
                        values[i]=6;
                        break;
                    case 7:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/7_of_diamonds.png"));
                        changeCard(card, i);
                        values[i]=7;
                        break;
                    case 8:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/8_of_diamonds.png"));
                        changeCard(card, i);
                        values[i]=8;
                        break;
                    case 9:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/9_of_diamonds.png"));
                        changeCard(card, i);
                        values[i]=9;
                        break;
                    case 10:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/10_of_diamonds.png"));
                        changeCard(card, i);
                        values[i]=10;
                        break;
                    case 11:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/jack_of_diamonds.png"));
                        changeCard(card, i);
                        values[i]=11;
                        break;
                    case 12:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/queen_of_diamonds.png"));
                        changeCard(card, i);
                        values[i]=12;
                        break;
                    case 13:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/king_of_diamonds.png"));
                        changeCard(card, i);
                        values[i]=13;
                        break;
                }
            }
            else{
                switch((hand[i]-39)){//heart cards; values from hand: 40-52
                    case 1:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/ace_of_hearts.png"));
                        changeCard(card, i);
                        values[i]=1;
                        break;
                    case 2:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/2_of_hearts.png"));
                        changeCard(card, i);
                        values[i]=2;
                        break;
                    case 3:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/3_of_hearts.png"));
                        changeCard(card, i);
                        values[i]=3;
                        break;
                    case 4:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/4_of_hearts.png"));
                        changeCard(card, i);
                        values[i]=4;
                        break;
                    case 5:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/5_of_hearts.png"));
                        changeCard(card, i);
                        values[i]=5;
                        break;
                    case 6:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/6_of_hearts.png"));
                        changeCard(card, i);
                        values[i]=6;
                        break;
                    case 7:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/7_of_hearts.png"));
                        changeCard(card, i);
                        values[i]=7;
                        break;
                    case 8:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/8_of_hearts.png"));
                        changeCard(card, i);
                        values[i]=8;
                        break;
                    case 9:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/9_of_hearts.png"));
                        changeCard(card, i);
                        values[i]=9;
                        break;
                    case 10:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/10_of_hearts.png"));
                        changeCard(card, i);
                        values[i]=10;
                        break;
                    case 11:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/jack_of_hearts.png"));
                        changeCard(card, i);
                        values[i]=11;
                        break;
                    case 12:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/queen_of_hearts.png"));
                        changeCard(card, i);
                        values[i]=12;
                        break;
                    case 13:
                        card= new Image(getClass().getResourceAsStream("PlayingCards/png/king_of_hearts.png"));
                        changeCard(card, i);
                        values[i]=13;
                        break;
                }
            }
        }
    }


    /*
    called on initialization and on every hit of refresh to
    randomize the chosen cards
     */
    public void changeCard(Image drawnCard, int slot){
        switch(slot){
            case 0:
                card1.setImage(drawnCard);
            case 1:
                card2.setImage(drawnCard);
            case 2:
                card3.setImage(drawnCard);
            case 3:
                card4.setImage(drawnCard);
        }
    }

    /*
    Used to mimic the initialization, changed the hand and updates the graphics to go along with it
     */
    public void redraw(ActionEvent actionEvent) throws IOException {
        newHand();
        changeGraphics();
    }

    public void checkSolution(ActionEvent actionEvent) {
        String t= answer.getText();
        Expression e = new ExpressionBuilder(t).build();
        if(cardUsed(t)) {
            int ans = (int) e.evaluate();
            if (ans == 24) {
                mirror.setText("Valid Equation!!!");
            } else {
                mirror.setText("You're  Stupid!!!");
            }
        }
    }

    public boolean cardUsed(String exp){
        boolean ultimateTruth=false;
        for(int j=0; j<4; j++) {
            for (int i = 0; i < exp.length() - ((values[j]+"").length() - 1); i++) {
                if (exp.substring(i, i + (values[j] + "").length()).equals(values[j] + "")){
                    ultimateTruth=true;
                    if(i==0){
                        exp=exp.substring(i+(values[j]+"").length(), exp.length());
                    }
                    else {
                        exp = exp.substring(0, i) + exp.substring(i + (values[j] + "").length(), exp.length());
                    }
                    break;
                }
            }
            if(ultimateTruth){
                continue;
            }else{
                return ultimateTruth;
            }
        }
        return ultimateTruth;
    }
}
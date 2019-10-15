/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokergame;

import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Owner-1
 */
public class PokerController {
    @FXML private TextField textbox01;
    @FXML private TextField textbox02;
    @FXML private TextField textbox03;
    @FXML private TextField textbox04;
    @FXML private TextField textbox05;
    @FXML private TextField textbox06;
    @FXML private TextField textbox07;
    @FXML private TextField textbox08;
    @FXML private TextField textbox09;
    @FXML private TextField textbox10;

    @FXML private Label displayLabel;

    public void displayHand(ActionEvent e){
        
        // Two-D Array
        int[][] myHand = new int[4][13];

        // Gather input from text fields
        int card1 = Integer.parseInt(textbox01.getText());
        String suit1 = textbox06.getText();
        
        // Assigns row number based on suit
        int newSuit1 = rowNumber(suit1);
        
        // Adds one to the appropriate position in the array
        myHand[card1][newSuit1] = 1;
        
        int card2 = Integer.parseInt(textbox02.getText());
        String suit2 = textbox07.getText();
        
        int newSuit2 = rowNumber(suit2);
        
        myHand[card2][newSuit2] = 1;
        
        int card3 = Integer.parseInt(textbox03.getText());
        String suit3 = textbox08.getText();
        
        int newSuit3 = rowNumber(suit3);
        
        myHand[card3][newSuit3] = 1;
        
        int card4 = Integer.parseInt(textbox04.getText());
        String suit4 = textbox09.getText();
        
        int newSuit4 = rowNumber(suit4);
        
        myHand[card4][newSuit4] = 1;
        
        int card5 = Integer.parseInt(textbox05.getText());
        String suit5 = textbox10.getText();
        
        int newSuit5 = rowNumber(suit5);
        
        myHand[card5][newSuit5] = 1; 
        
    }
    
    // Assigns row number based on suit
    public int rowNumber(String suit){

        switch(suit)
        {
            case "D":
                return 0;
                
            case "S":
                return 1;
                
            case "H":
                return 2;
                
            case "C":
                return 3;
                
            default:
                break;
        }
        return 0;
    } 
}

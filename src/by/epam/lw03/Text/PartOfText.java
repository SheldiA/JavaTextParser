/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw03.Text;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Anna
 */
public abstract class PartOfText {
    protected ArrayList<PartOfSentence> partsOfSentence = null;
    protected ArrayList<String> punctuatianMarks;
    protected String content = null;
    
    public ArrayList<PartOfSentence> getPartsOfSentence(){
        return partsOfSentence;
    }
    
    public Iterator<String> getPunctuatianMarks(){
        return punctuatianMarks.iterator();
    }
    
    public String getContent(){
        return content;
    }
}

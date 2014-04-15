/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw03.Functianality;

import by.epam.lw03.Text.PartOfSentence;
import by.epam.lw03.Text.PartOfText;
import by.epam.lw03.Text.Sentence;
import by.epam.lw03.Text.Text;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Anna
 */
public class SwapingFirstLast extends Functianality{
    public Text applyFunctianality(Text text){
        Iterator<PartOfText> parts = text.getParts();
        while(parts.hasNext()){
            PartOfText part;
            if((part = parts.next()) instanceof Sentence){
                int size = part.getPartsOfSentence().size();
                if(size > 0){
                    ArrayList<String> firstPartWords = part.getPartsOfSentence().get(0).getWords();
                    ArrayList<String> lastPartWords = part.getPartsOfSentence().get(size - 1).getWords();
                    String temp = firstPartWords.get(0);
                    firstPartWords.set(0, lastPartWords.get(lastPartWords.size()- 1));
                    part.getPartsOfSentence().get(0).setWords(firstPartWords);
                    lastPartWords.set(lastPartWords.size() - 1, temp);
                    part.getPartsOfSentence().get(size - 1).setWords(lastPartWords);
                }
            }
        }
        return text;
    }
}

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
public class SearchUniqueWord{

    public String applyFunctianality(Text text) {
        ArrayList<String> firstSentenceWords = new ArrayList<String>();
        boolean isFirstSentence = true;
        Iterator<PartOfText> parts = text.getParts();
        while(parts.hasNext()){
            PartOfText part = parts.next();
            if(part instanceof Sentence){
                Iterator<PartOfSentence> partsOfSentence = part.getPartsOfSentence().iterator();
                if(isFirstSentence){                    
                    while(partsOfSentence.hasNext()){
                        firstSentenceWords.addAll(partsOfSentence.next().getWords());
                    }
                    isFirstSentence = false;
                }
                else{
                    while(partsOfSentence.hasNext()){
                        Iterator<String> words = partsOfSentence.next().getWords().iterator();
                        while(words.hasNext()){
                            String currWord = words.next();
                            if(firstSentenceWords.contains(currWord)){
                                firstSentenceWords.remove(currWord);
                            }
                        }
                    }
                }
            }
        }
        return (firstSentenceWords.size() > 0) ? firstSentenceWords.get(0) : null;
    }
    
}

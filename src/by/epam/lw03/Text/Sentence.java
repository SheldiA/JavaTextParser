/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw03.Text;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Anna
 */
public class Sentence extends PartOfText{
    public Sentence(String sentence){
        partsOfSentence = new ArrayList<PartOfSentence>();
        punctuatianMarks = new ArrayList<String>();
        sentence = sentence.trim();
        Pattern p = Pattern.compile("((\\w+\\s?)+)|(\\W+)");
        Matcher m = p.matcher(sentence);
        String str;
        while(m.find()){
            if(null != (str = m.group(1))){
                partsOfSentence.add(new PartOfSentence(str));
            }
            if(null != (str = m.group(3))){ 
                punctuatianMarks.add(str);
            }
        }
    }
    
    public void addSentence(StringBuffer sb){        
        for(int i = 0; i < partsOfSentence.size(); ++i){
            partsOfSentence.get(i).addPartOfSentence(sb);
            if(i < punctuatianMarks.size()){
                sb.append(punctuatianMarks.get(i) + " ");
            }
        }
    }
}

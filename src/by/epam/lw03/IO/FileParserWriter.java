/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw03.IO;

import by.epam.lw03.Text.PartOfText;
import by.epam.lw03.Text.Sentence;
import by.epam.lw03.Text.Text;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Anna
 */
public class FileParserWriter {
    private String fileName;
    public FileParserWriter(String fileName){
        this.fileName = fileName;
    }
    
    public void write(Text text) throws Exception{
        if(null != text){
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName),"UTF8"));
            StringBuffer sb = new StringBuffer();
            Iterator<PartOfText> parts = text.getParts();
            while(parts.hasNext()){
                PartOfText part = parts.next();
                if(part instanceof Sentence){
                    ((Sentence)part).addSentence(sb);                
                }
                else{
                    if(null != part.getContent()){
                        sb.append(part.getContent());
                    }
                }
            }
            System.out.println(sb.toString());
            out.write(sb.toString());
            out.close();
        }
    }
}

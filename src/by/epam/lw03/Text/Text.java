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
public class Text {
    private ArrayList<PartOfText> parts;
    
    public Text(ArrayList<PartOfText> parts){
        this.parts = parts;
    }
    
    public Iterator<PartOfText> getParts(){
        return parts.iterator();
    }
    
    public void setParts(ArrayList<PartOfText> parts){
        this.parts = parts;
    }
}

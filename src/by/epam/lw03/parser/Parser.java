/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw03.parser;
import by.epam.lw03.Functianality.SwapingFirstLast;
import by.epam.lw03.IO.FileParserReader;
import by.epam.lw03.IO.FileParserWriter;
import by.epam.lw03.Text.Text;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Anna
 */
public class Parser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        FileParserReader fpr = new FileParserReader("D:\\MyProjects\\ProjectsJava\\Parser\\files\\1.txt");
        Text text = fpr.read();
        SwapingFirstLast sfl = new SwapingFirstLast();
        text = sfl.applyFunctianality(text);
        FileParserWriter fpw = new FileParserWriter("D:\\MyProjects\\ProjectsJava\\Parser\\files\\2.txt");
        fpw.write(text);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resume.reader;

import nlp.Nlp;
import parser.Sentence;
import parser.SentenceParser;

/**
 * ResumeReader contains main method this will serve as starting point of local executions.
 * @author Lokesh
 */
public class ResumeReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nlp.init();
        Sentence sentence = new SentenceParser().apply("A minimum of two years commercial software development experience in Java, and four years overall software development experience");
        System.out.println(sentence.getNerTaggedList());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nlp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;
import java.util.List;
import java.util.Properties;

/**
 * Nlp, Natural Language processor contains methods utilize StanfordCore NLP 
 * @author Lokesh
 */
public class Nlp {
    static Properties p=new Properties();
    static StanfordCoreNLP pipe;
    public static void init(){
        p.put("annotators", "tokenize, ssplit, pos, lemma, parse, ner");
        pipe=new StanfordCoreNLP(p);
    }
    public static List<CoreMap> annotate(String text){
        Annotation a=new Annotation(text);
        pipe.annotate(a);
        return a.get(CoreAnnotations.SentencesAnnotation.class);
    }
}

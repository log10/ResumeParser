import edu.stanford.nlp.classify.ColumnDataClassifier;
import edu.stanford.nlp.ling.Datum;

/**
 * Created by vikasnaiyar on 10/09/17.
 */
public class ClassifierMain {
    public static void main(String[] args) {
        ColumnDataClassifier cdc = new ColumnDataClassifier("src/main/resources/train/sample.prop");
        edu.stanford.nlp.classify.Classifier<String,String> cl =
                cdc.makeClassifier(cdc.readTrainingExamples("src/main/resources/train/sample.train"));
//        for (String line : ObjectBank.getLineIterator("src/main/resources/training/boxtest.tsv", "utf-8")) {
            // instead of the method in the line below, if you have the individual elements
            // already you can use cdc.makeDatumFromStrings(String[])
        String line = "\tHibernate";
       Datum<String,String> d = cdc.makeDatumFromLine(line);
        //
        //Datum<String,String> d = cdc.makeDatumFromStrings(new String[]{"framework", "Hibernate"});
            System.out.println(line + "  ==>  " + cl.classOf(d));
//        }
        /*for (String line : ObjectBank.getLineIterator("examples/cheeseDisease.test", "utf-8")) {
            // instead of the method in the line below, if you have the individual elements
            // already you can use cdc.makeDatumFromStrings(String[])
            Datum<String,String> d = cdc.makeDatumFromLine(line);
            System.out.println(line + "  ==>  " + cl.classOf(d));
        }*/
    }
}
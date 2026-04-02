package com.nlp.NLP;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class TokenizeExample {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String text = "Hello World! this side Himanshu Singh";
        CoreDocument document = new CoreDocument(text);
        stanfordCoreNLP.annotate(document);
        List<CoreLabel> coreLabelList = document.tokens();
        for (CoreLabel coreLabel : coreLabelList) {
            System.out.println(coreLabel.word());
        }
    }
}

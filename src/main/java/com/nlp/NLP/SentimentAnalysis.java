package com.nlp.NLP;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentimentAnalysis {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String text = "The Author does not like eating Oranges. Insted he prefer Apple over Oranges";
        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreSentence> coreSentenceList = coreDocument.sentences();
        for (CoreSentence sentence : coreSentenceList) {
            String sentiment = sentence.sentiment();
            System.out.println(sentiment + " - " + sentence);
        }
    }
}

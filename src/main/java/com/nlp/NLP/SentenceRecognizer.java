package com.nlp.NLP;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentenceRecognizer {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String sentence = "Hey Everyone! This is a test sentence. And we will test it by this Sentence";
        CoreDocument coreDocument = new CoreDocument(sentence);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreSentence> coreSentenceList = coreDocument.sentences();
        for (CoreSentence coreSentence : coreSentenceList) {
            System.out.println(coreSentence);
        }
    }
}

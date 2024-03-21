package org.moodAnalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MoodAnalyzerTest
{

    @Test
    void moodAnalysis_returnSad_whenSad()
    {
        MoodAnalyzer M = new MoodAnalyzer();
        String res = M.moodAnalysis("I am in Sad Mood");
        Assertions.assertEquals("SAD", res);
    }

}
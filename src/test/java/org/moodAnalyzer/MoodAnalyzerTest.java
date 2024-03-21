package org.moodAnalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;


class MoodAnalyzerTest
{

    @Test
    void moodAnalysis_returnSad_whenSad()
    {
        MoodAnalyzer M = new MoodAnalyzer();
        String res = M.moodAnalysis("I am in a Sad Mood");
        Assertions.assertEquals("SAD", res);
    }

    @Test
    void moodAnalysis_returnHappy_whenHappy()
    {
        MoodAnalyzer M = new MoodAnalyzer();
        String res = M.moodAnalysis("I am in Happy Mood");
        Assertions.assertEquals("HAPPY", res);
    }

    @Test
    void moodAnalysis_returnHappy_whenNullMood()
    {
        MoodAnalyzer M = new MoodAnalyzer();
        String res = M.moodAnalysis(null);
        Assertions.assertEquals("HAPPY", res);
    }




}
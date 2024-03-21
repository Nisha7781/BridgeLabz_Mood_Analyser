package org.moodAnalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerTest
{

    @Test
    void moodAnalysis()
    {
        MoodAnalyzer M = new MoodAnalyzer();
        String res = M.moodAnalysis("sad");
        Assertions.assertEquals("Sad", res);
    }

}
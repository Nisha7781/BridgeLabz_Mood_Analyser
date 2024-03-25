package org.moodAnalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {

    @Test
    void moodAnalysis_returnSad_whenSad() throws MoodAnalysisException {
        MoodAnalyzer M = new MoodAnalyzer();
        String res = M.moodAnalysis("I am in a Sad Mood");
        Assertions.assertEquals("SAD", res);
    }

    @Test
    void moodAnalysis_returnHappy_whenHappy() throws MoodAnalysisException {
        MoodAnalyzer M = new MoodAnalyzer();
        String res = M.moodAnalysis("I am in Happy Mood");
        Assertions.assertEquals("HAPPY", res);
    }

    @Test
    void moodAnalysis_returnHappy_whenNullMood() {
        MoodAnalyzer M = new MoodAnalyzer();
        try {
            String res = M.moodAnalysis(null);
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals("Mood cannot be null", e.getMessage());
        }
    }
}

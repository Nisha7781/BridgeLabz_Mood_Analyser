package org.moodAnalyzer;

public class MoodAnalyzer {
    public String s;

    MoodAnalyzer() {}

    MoodAnalyzer(String s) {
        this.s = s;
    }

    public String moodAnalysis(String s) throws MoodAnalysisException {
        try {
            if (s == null || s.isEmpty())
                throw new MoodAnalysisException(MoodError.EMPTY_MOOD.getMessage());
            if (s.equalsIgnoreCase("I am in a Sad Mood")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodError.EMPTY_MOOD.getMessage());
        }
    }
}

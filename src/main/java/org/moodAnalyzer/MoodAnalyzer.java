package org.moodAnalyzer;

public class MoodAnalyzer
{
    public String s;

    MoodAnalyzer()
    {
    }
    MoodAnalyzer(String s)
    {
        this.s = s;
    }
    public String moodAnalysis(String s)
    {
        if (s.equalsIgnoreCase("I am in sad mood"))
        {
            return "SAD";
        }
        else
        {
            return "HAPPY";
        }

    }

}
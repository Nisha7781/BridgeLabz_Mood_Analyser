package org.moodAnalyzer;

import java.util.Scanner;

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
        if (s.equalsIgnoreCase("I am in a Sad Mood"))
        {
            return "SAD";
        }
        else
        {
            return "HAPPY";
        }

    }

}
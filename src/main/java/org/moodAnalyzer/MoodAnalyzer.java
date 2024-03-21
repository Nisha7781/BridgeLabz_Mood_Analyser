package org.moodAnalyzer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MoodAnalyzer
{
    public String moodAnalysis(String s)
    {
        if (s.equalsIgnoreCase("sad"))
        {
            return "Sad";
        }
        else
        {
            return "Happy";
        }

    }

}
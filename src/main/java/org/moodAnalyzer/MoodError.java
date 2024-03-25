package org.moodAnalyzer;

public enum MoodError {
    EMPTY_MOOD("Empty Mood"),
    NULL_MOOD("Mood cannot be null");

    private final String message;

    MoodError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

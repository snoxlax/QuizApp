package com.grey.quizapp;

import java.lang.reflect.Array;

public class Question {
        // These are the placeholders for the question resource id and the correct answer
        private int mQuestionID;
        private boolean mAnswer;


        // This is the constructor that will be called when a new quiz question is created.
        public Question(int questionResourceID, boolean trueOrFalse) {
            mQuestionID = questionResourceID;
            mAnswer = trueOrFalse;
        }

        // This method gives us access to info stored in the (private) question id.
        public int getQuestionID() {
            return mQuestionID;
        }

        // This method gives us access to info stored in the (private) mAnswer.
        public boolean isAnswer() {
            return mAnswer;
        }

        // Not actually using the setters at the moment. Users are not creating questions.

//    public void setQuestionID(int questionID) {
//        mQuestionID = questionID;
//    }

//    public void setAnswer(boolean answer) {
//        mAnswer = answer;
//    }


}

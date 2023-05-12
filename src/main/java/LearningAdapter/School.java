package LearningAdapter;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        //PilotPen pp = new PilotPen();
        Assignment aw = new Assignment();
        Pen p = new PenAdapter();
        aw.setP(p);
        aw.writeAssignment("I am writing the assignment");
        StringBuilder sb = new StringBuilder();
        String s = new String();
        StringBuffer sf =new StringBuffer();





    }

}

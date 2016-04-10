package net.greenrivertech.hliu.learningnumbers;

import java.util.Random;

/**
 * Created by Zero on 4/7/2016.
 */
public class LearningNumbersModel {
    private int leftNum;
    private int rightNum;
    private int gamesPlayed;
    private int gamesWon;

    public LearningNumbersModel()
    {
        generateNumbers();
        gamesPlayed = 0;
        gamesWon = 0;
    }

    public void generateNumbers()
    {
        Random r = new Random();
        leftNum = r.nextInt(11);
        rightNum = r.nextInt(11);

        while(leftNum==rightNum)
        {
            rightNum =  r.nextInt(11);
        }
    }

    public int getLeftNum()
    {
        return leftNum;
    }

    public int getRightNum()
    {
        return rightNum;
    }

    public int getGamesPlayed()
    {
        return gamesPlayed;
    }

    public int getGamesWon()
    {
        return gamesWon;
    }

    public static final int LEFT_BTN = 0;
    public static final int RIGHT_BTN = 1;

    public boolean play(int choice)
    {
        gamesPlayed++;
        if(choice==LEFT_BTN)
        {
            if(leftNum>rightNum)
            {
                gamesWon++;
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            if(rightNum>leftNum)
            {
                gamesWon++;
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
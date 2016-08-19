package com.example.tanushree.coolfacts.model;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by tanushree on 20/07/16.
 */
public class ColorWheel
{
    private String mColorArray[] = {"#51b46d", //green
                            "#f092b0", //pink
                            "#39add1", //blue
                            "#838cc7", // lavender
                            "#e0ab18", // mustard
                            "#3079ab", // dark blue
                            "#c25975", // mauve
                            "#e15258", // red
                            "#f9845b", // orange
                            "#7d669e" // purple
                            };

    public int getColor()
    {
        String color;
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColorArray.length);
        color = mColorArray[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
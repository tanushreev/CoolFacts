package com.example.tanushree.coolfacts.model;

import java.util.Random;

/**
 * Created by tanushree on 15/07/16.
 */

public class FactBook
{
    public static String mFactArray[] = {"Mother Teresa's Missionaries of Charity, consists of over 4,500 sisters and is active in 133 countries.",
                            "Mr Barack Obama is the first African American President of the United States and the first President born outside the continental United States.",
                            "Dr APJ Abdul Kalam was a recipient of honorary doctorates from 40 universities.",
                            "Marie Curie was the first person to win two Nobel Prizes for Science.",
                            "No one has received more U.S. patents than Thomas Edison – 1,093.",
                            "It takes 8 minutes, 17 seconds for light to travel from the Sun’s surface to the Earth.",
                            "The Earth spins at 1,600 km/hr and it travels through space at an incredible 107,000 km/hr.",
                            "There are 206 bones in the adult human body and there are 300 in children (as they grow some of the bones fuse together).",
                            "Humans shed 40 pounds of skin in their lifetime, completely replacing their outer skin every month.",
                            "The Internet is the fastest-growing communications tool ever. It took radio broadcasters 38 years to reach an audience of 50 million, television 13 years, and the Internet just 4 years."
    };

    public String getFact()
    {
        String fact;
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFactArray.length);
        fact = mFactArray[randomNumber];

        return fact;
    }
}
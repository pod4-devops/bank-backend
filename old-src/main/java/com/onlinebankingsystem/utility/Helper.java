package com.onlinebankingsystem.utility;

import java.util.concurrent.ThreadLocalRandom;

public class Helper {
	
	public static String getAlphaNumericTransactionId()
    {
  
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz";
  
        StringBuilder sb = new StringBuilder(16);
  
        for (int i = 0; i < 16; i++) {
  
            int index
                = (int)(AlphaNumericString.length()
                        * ThreadLocalRandom.current().nextDouble());
  
            sb.append(AlphaNumericString
                          .charAt(index));
        }
  
        return sb.toString().toUpperCase();
    }

}

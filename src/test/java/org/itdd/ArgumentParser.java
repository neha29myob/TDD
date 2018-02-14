package org.itdd;

public class ArgumentParser {
    public String[] parse(String s) {

        String[] result = new String[3];
        result[0] = "false";
        result[1] = "0";
        result[2] = "";

        String flags[] = s.split("-");

       for(int i = 1; i < flags.length; i++) {
           if (flags[i].charAt(0) =='l') {
               result[0] = "true";
           }
           else if (flags[i].charAt(0) =='p') {
               result[1] = flags[i].substring(2).trim();
           }
           else if (flags[i].charAt(0) =='d') {
               result[2] = flags[i].substring(2).trim();
           }
       }

        return result;
    }
}

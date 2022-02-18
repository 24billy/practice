package homework.english.sum;

import java.util.HashMap;

public class EnglishSum {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("A", 1);
        hm.put("B", 2);
        hm.put("C", 3);
        hm.put("D", 4);
        hm.put("E", 5);
        hm.put("F", 6);
        hm.put("G", 7);
        hm.put("H", 8);
        hm.put("I", 9);
        hm.put("J", 10);
        hm.put("K", 11);
        hm.put("L", 12);
        hm.put("M", 13);
        hm.put("N", 14);
        hm.put("O", 15);
        hm.put("P", 16);
        hm.put("Q", 17);
        hm.put("R", 18);
        hm.put("S", 19);
        hm.put("T", 20);
        hm.put("U", 21);
        hm.put("V", 22);
        hm.put("W", 23);
        hm.put("X", 24);
        hm.put("Y", 25);
        hm.put("Z", 26);

        String input="values";
        input = input.toUpperCase();

        if(hm.get(input)==null) {
            System.out.println(0);
        }else {
            System.out.println(input+":"+hm.get(input));
        }

        Integer sum=0;
        for(int i =0;i<input.length();i++) {
            char charAt = input.charAt(i);
            Character c = (Character)charAt;
            String s1 = c.toString();
            sum+=hm.get(s1);
        }
        System.out.println(input+":sum:"+sum);


    }

}

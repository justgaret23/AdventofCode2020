package com.company;

public class Day1 {

    public static void main(String[] args) {
        int currentSum;
        int[] numArray = new int[]{};

        for(int i = 0; i < numArray.length; i++){
            for(int j = 0; j < numArray.length; j++){
                if(i != j){
                    currentSum = numArray[i] + numArray[j];
                    if(currentSum == 2020){
                        System.out.println(numArray[i]);
                        System.out.println(numArray[j]);
                        int finalMult = numArray[i] * numArray[j];
                        System.out.println(finalMult);

                    }
                }
            }
        }

        for(int i = 0; i < numArray.length; i++){
            for(int j = 0; j < numArray.length; j++){
                for(int k = 0; k < numArray.length; k++) {
                    if(i != j && j != k){
                        currentSum = numArray[i] + numArray[j] + numArray[k];
                        if(currentSum == 2020){
                            System.out.println(numArray[i]);
                            System.out.println(numArray[j]);
                            System.out.println(numArray[k]);
                            int trueFinalMult = numArray[i] * numArray[j] * numArray[k];
                            System.out.println(trueFinalMult);

                        }
                    }
                }
            }
        }
    }
}

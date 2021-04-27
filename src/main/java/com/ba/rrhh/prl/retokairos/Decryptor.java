/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ba.rrhh.prl.retokairos;

import java.text.Normalizer;

/**
 * Decriptor for kairos challenge
 *
 * @author xavier.verges
 */
public class Decryptor {

    /**
     * Prepare string in egypt mode
     *
     * @param str (String) original String
     * @return (String) prepared string
     */
    public static String prepareString(String str) {
        str = Normalizer.normalize(str, Normalizer.Form.NFKD);
        return str.replaceAll("[^a-z,^A-Z,^0-9,.]", "").toLowerCase();
    }

    /**
     * Decrypt a sentence by an integer array
     *
     * @param sentence (String) sentence to decrypt
     * @param numbers (int[]) array of numbers
     * @return
     */
    public String decrypt(String sentence, int numbers[]) {
        StringBuilder result = new StringBuilder();
        String preparedSentence = Decryptor.prepareString(sentence);

        char[] resultArray = new char[preparedSentence.length()];

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            char charAtNumber = preparedSentence.charAt(numbers[i]);
            int position = numbers[number];
            resultArray[position] = charAtNumber;
        }
        return result.append(resultArray).toString();
    }
}

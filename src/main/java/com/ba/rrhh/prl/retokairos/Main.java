/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ba.rrhh.prl.retokairos;

/**
 *
 * @author xavier.verges
 */
public class Main {

    public static void main(String[] args) {
        String sentence = "Cómo será dar con Nekgikis V...";
        int numbers[] = {23, 24, 25, 18, 19, 5, 6, 7, 20, 15, 17,
            8, 10, 11, 4, 3, 12, 2, 16, 14, 9, 21, 0, 1, 13, 22};

        Decryptor decrypter = new Decryptor();
        String result = decrypter.decrypt(sentence, numbers);
        System.out.println("Result is: " + result);
    }
}

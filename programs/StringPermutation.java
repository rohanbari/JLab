/*
 Copyright 2024 Rohan Bari <rohanbari@outlook.com>

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      https://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * String permutation finder program.
 */
class StringPermutation {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Permutation Finder!");
        System.out.println();

        while (true) {
            System.out.print("Input a string: ");
            String input = scanner.nextLine();

            // If the string is empty or has blankspace(s)
            if (input.isBlank()) {
                System.err.println("error: The input must not be blank.");
                continue;
            }

            List<String> result = permutation(input);

            System.out.println(result.toString());
            System.out.println(new StringBuffer("Size: ").append(result.size()));

            System.out.print("Again? (y/n) ");
            char choice = scanner.nextLine().charAt(0);

            if (choice == 'n' || choice == 'N')
                break;
        }

        scanner.close();
    }

    public static List<String> permutation(String input) {
        List<String> result = new ArrayList<>();
        String output = "";

        permute(input, output, result);
        return result;
    }

    /**
     * Finding the permutation of a given string using recursion.
     * 
     * @param in   Input string
     * @param out  Output string
     * @param list Output list of permutations
     */
    public static void permute(String in, String out, List<String> list) {
        if (in.length() == 0) {
            list.add(out);
            return;
        }

        for (int i = 0; i < in.length(); i++) {
            // Removing the character of i-th index only and keeping the before
            // and after substrings concatenated.
            //
            // For example, if i = 1, then from "abc", "a" + "c", "b".
            permute(in.substring(0, i) + in.substring(i + 1),
                    out + in.charAt(i), list);
        }
    }
}

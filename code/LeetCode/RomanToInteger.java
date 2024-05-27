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

package code.LeetCode;

import java.util.HashMap;

/**
 * Question: https://leetcode.com/problems/roman-to-integer
 */
class RomanToInteger {

    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };

        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = map.get(s.charAt(i));

            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }

            prev = curr;
        }

        return result;
    }
}

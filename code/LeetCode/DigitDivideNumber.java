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

/**
 * Question: https://leetcode.com/problems/count-the-digits-that-divide-a-number
 */
class DigitDivideNumber {

    public int countDigits(int num) {
        int count = 0;
        int temp = num;

        while (num > 0) {
            int rem = num % 10;
            if (temp % rem == 0)
                count++;

            num /= 10;
        }

        return count;
    }
}

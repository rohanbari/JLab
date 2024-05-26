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
 * Question: https://leetcode.com/problems/palindrome-number
 */
class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;

        int temp = x;
        while (temp > 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;

            temp /= 10;
        }

        return reverse == x;
    }
}

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
 * Question: https://leetcode.com/problems/powx-n
 */
public class MyPow {
    
    public int reverse(long x) {
        long res = 0L;
        boolean isNegative = x < 0;

        x = Math.abs(x);
        while (x > 0) {
            res = 10 * res + x % 10;
            x /= 10;
        }

        try {
            res = Math.toIntExact(res);

        } catch (Exception e) {
            res = 0;
        }

        return (int) res * (isNegative ? -1 : 1);
    }
}

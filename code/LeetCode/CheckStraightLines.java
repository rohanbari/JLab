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
 * Question: https://leetcode.com/problems/check-if-it-is-a-straight-line
 */
class CheckStraightLines {

    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        for (int[] c : coordinates) {
            int x = c[0];
            int y = c[1];

            int left = (x - x1) * (y2 - y1);
            int right = (y - y1) * (x2 - x1);

            if (left != right) {
                return false;
            }
        }

        return true;
    }
}

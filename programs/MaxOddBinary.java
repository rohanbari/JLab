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

class MaxOddBinary {
    
    /**
     * Manipulates the string such that the returning string contains an odd
     * number binary with maximum possible value.
     * 
     * @param s The original binary string
     * @return The max odd-binary
     */
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();

        int ones = s.split("1", -1).length - 1;
        int zero = s.split("0", -1).length - 1;

        for (int i = 0; i < ones - 1; i++)
            sb.append("1");
        for (int i = 0; i < zero; i++)
            sb.append("0");

        sb.append("1");

        return sb.toString();
    }
}

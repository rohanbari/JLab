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

import java.util.Scanner;

class FibonacciSum {

    public static void main(String[] args) throws Exception {
        Base.greetings();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a limit for Fibonacci: ");
        int limit = scanner.nextInt();

        System.out.println(fibonacci(limit));

        scanner.close();
    }

    /**
     * Generates the (limit - 1)th term of Fibonacci series.
     * 
     * @param limit Index of the term
     * @return Fibonacci sum
     */
    private static int fibonacci(int limit) {
        if (limit <= 1)
            return limit;
        else
            return fibonacci(limit - 1) + fibonacci(limit - 2);
    }
}

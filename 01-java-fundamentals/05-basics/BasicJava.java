import java.util.*;
public class BasicJava {   
    public static void main(String[] args) {
        // Print 1-255
        for (int i = 1; i <= 255; i++){
            System.out.println(i);
        }
        // Print odd numbers between 1-255
        for (int i = 1; i <= 255; i+=2){
            System.out.println(i);
        }
        // Print Sum of numbers from 0-255
		int sum = 0;
        for (int i = 0; i <= 255; i++){
            sum = sum + i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
        // Iterating through an array given an array X, say [1,3,5,7,9,13] 
        int x[] = {1, 3, 5, 7, 9, 13};
        for (int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
        // Find Max
        int max = 0;
        int maxArr[] = {0, -5, 2, 8, 10};
        for (int i = 0; i < maxArr.length; i++){
            if (i == 0){
                max = maxArr[i];
            }
            else {
                if (maxArr[i] > max){
                    max = maxArr[i];
                }
            }
        }
        System.out.println(max);
        // Get Average
		// Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5. Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.
		int sum1 = 0;
		int avgArr[] = {0, 1, 2, 3};
		for (int i = 0; i < avgArr.length; i++){
			sum1 = sum1 + avgArr[i];
		}
		int avg = sum1/avgArr.length;
		System.out.println(avg);
        // Array with Odd Numbers
		// Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
		ArrayList<Integer> arrOdd = new ArrayList<Integer>();
		for (int i = 1; i <= 255; i+=2){
			arrOdd.add(i);
		}
		int[] y = new int[arrOdd.size()];
        for (int i = 0; i < y.length; i++){
            y[i] = arrOdd.get(i);
            System.out.println(y[i]);
        }
        // Greater Than Y
		// Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).
		int grtrArr[] = {1,3,5,7};
		int y1 = 3;
		int count = 0;
		for (int i = 0; i < grtrArr.length; i++){
			if (grtrArr[i] > y1){
				count++;
			}
		}
		System.out.println(count);
        // Square the values
		// Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
		int arrX[] = {1,5,10,-2};
		for (int i = 0; i < arrX.length; i++) {
			arrX[i] = arrX[i]*arrX[i];
			System.out.println(arrX[i]);
		}
        // Eliminate Negative Numbers
		// Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. When the method is done, x should have no negative values, say [1, 5, 10, 0].
		int arrNeg[] = {1,5,10,-2};
		for (int i = 0; i < arrNeg.length; i++) {
			if (arrNeg[i] < 0){
				arrNeg[i] = 0;
			}
			System.out.println(arrNeg[i]);
		}
        // Max, Min, and Average
		// Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array. The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]
		int arrMaxMinAvgX[] = {1,5,10,-2};
		int arrMax = 0;
		int arrMin = 0;
		int arrAvg = 0;
		int sum2 = 0;
		for (int i = 0; i < arrMaxMinAvgX.length; i++){
			if (i == 0){
				arrMax = arrMaxMinAvgX[i];
				arrMin = arrMaxMinAvgX[i];
            }
            else {
                if (arrMaxMinAvgX[i] > arrMax){
                    arrMax = arrMaxMinAvgX[i];
				}
				if (arrMaxMinAvgX[i] < arrMin){
                    arrMin = arrMaxMinAvgX[i];
                }
			}
			sum2 = sum2 + arrMaxMinAvgX[i];
			arrAvg = sum2/arrMaxMinAvgX.length;
		}
		System.out.println(arrMax + " " + arrMin + " " + arrAvg);

        // Shifting the Values in the Array
		// Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.
		int[] arrShift = {1, 5, 10, 7, -2};
        for (int i = 0; i < arrShift.length; i++){
            if(i == arrShift.length - 1){
                arrShift[i] = 0;
            }
            else{
                arrShift[i] = arrShift[i+1];
            }
            System.out.println(arrShift[i]);
        }
    }
}
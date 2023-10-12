/*
HACKERRANK:

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
*/

function minMaxSum(array) {
    let min = array[0];
    let max = array[0];
    let sum = array[0];
    let firstloop = true;
    
    array.forEach((value) => {
        !firstloop && (
            sum += value,
            value < min ? min = value : value > max ? max = value : null
        )
        
        firstloop = false;
    });

    return console.log("MAX SUM: " + (sum-min), " MIN SUM: " + (sum-max));
}

minMaxSum([2, 1, 4, 3, 5]); // MAX SUM: 14, MIN SUM: 10
minMaxSum([1, 1, 1, 1, 2]); // MAX SUM: 5, MIN SUM: 4
minMaxSum([1, 8, 4, 10, 6]); // MAX SUM: 28, MIN SUM: 19
minMaxSum([2, 4, 1, 5, 21]); // MAX SUM: 32, MIN SUM: 12
minMaxSum([9, 8, 10, 42, 7]); // MAX SUM: 69, MIN SUM: 36
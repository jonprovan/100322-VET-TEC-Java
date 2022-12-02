// DESTRUCTURING

/**
 * Spread operator ...
 * Rest operator ... (different place)
 * 
 * Object destructuring into variables
 * Array destructing into variables
 */

// Spread operator
// spreading out the contents of an array into separate items

const myNums = [1, 2, 3, 4, 5]

// here, we're just pointing to the same memory address, and if we change something in myNums, it'll change in myOtherNums, too
let myOtherNums = myNums;

// myNums[0] = 0;
// console.log(myOtherNums[0]);
// myNums[0] = 1;

// this spreads out the contents of myNums and adds them into myOtherNums -- they are now completely independent
myOtherNums = [...myNums];

myNums[0] = 0;
//console.log(myOtherNums[0]);


// Rest Operator

function assembleNumbers(num1, num2, ...restOfNums) {
    console.log(num1);
    console.log(num2);
    console.log(restOfNums);
}

// rest operator creates an array, even if no parameters are passed into it (an empty array, in that case)
assembleNumbers();

// but all parameters after the individually-defined ones are smashed into the rest array
assembleNumbers(1, 2, 3, 4, 5);

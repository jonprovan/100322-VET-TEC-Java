// BOOLEANS IN JAVASCRIPT

/**
 * Many of our established pieces of syntax from Java work exactly the same in JavaScript
 * 
 * ...with an interesting exception
 */

if (true) {
    console.log('Print this if true.');
}

// we do not get errors for unreachable code
if (false) {
    console.log('Print this if true.');
}

if ((3 + 2) * 5 / 2 == 12.5) {
    console.log('Print this if true.');
}

// this prints true...why?
// if (2 == '2') {
//     console.log('Print this if 2 == \'2\'.');
// }

/**
 * What happens is that JavaScript does something called "coercion" to force values into comparable states when applicable
 * 
 * This CAN make certain things easier, like comparing an input string from a web form to a value stored as a number
 */

// JS Strict Equality Operator
if (2 === '2') {
    console.log('Print this if 2 == \'2\'.');
}

/**
 * JS STRICT EQUALITY OPERATOR -- ===
 * 
 * This does two things:
 * 
 * is 2 == '2'?
 * is typeof 2 == typeof '2'
 */

// booleans are not coerced from strings
if (true == 'true') {
    console.log("Print this if true == 'true'");
}

// strict not equals operator is !==
if (true !== 'true') {
    console.log("Print this if true !== 'true'");
}

// not operator works just like it does in Java
if (true == !false) {
    console.log('Print this if true === !false');
}

// null does not === undefined...
if (null === undefined) {
    console.log('Print this if null === undefined')
}

// BUT null DOES == undefined...
if (null == undefined) {
    console.log('Print this if null == undefined')
}

console.log();

let testVariable = false;

if (testVariable) {
    console.log(`${testVariable} is true!`);
} else {
    console.log(`${testVariable} is false!`);
}

/**
 * TRUTHY AND FALSY
 * 
 * JavaScript processes booleans as you would expect.
 * 
 * BUT, it also safeguards against breaking the app given certain input parameters by assigning a boolean value to just about everything
 * 
 * Falsy Values:
 * 
 * false 
 * 0
 * 0.0
 * -0
 * 0n
 * ''
 * undefined
 * null
 * !true (or not anything that's truthy)
 * NaN (not a number)
 * 
 * Truthy Values:
 * 
 * -- anything that's not falsy
 * 
 * true
 * !false
 * any number that isn't some variant of 0
 * '0', 'false', etc. -- any string that isn't empty
 * [] -- all arrays, empty or otherwise
 * {} -- all objects, empty or otherwise
 * 
 * 
 */

/**
 * EXPLICIT CASTING
 * 
 * we can use Number(), String() and Boolean() to explicitly cast values as those types
 */

// this casts the string '5' as the number 5
let five = Number('5');
console.log(five);

// this casts the number 10 as the string '10'
let ten = String(10);
console.log(ten);

// this casts a truthy value as the boolean true
let booleanTrue = Boolean('0');
console.log(booleanTrue);

// this casts a falsy value as the boolean false
let booleanFalse = Boolean(NaN);
console.log(booleanFalse);

console.log();

/**
 * The ternary operator exists in JS and functions the same as in Java
 * 
 * But there is another shorthand which can be useful
 */

// same syntax -- boolean statement ? if true use this : if false use this
let ternaryValue = ( (2 < 4) ? true : false );
console.log(ternaryValue);


// if the first statement evaluates to something truthy, assign that value to the variable
// if not, assign the second value to the variable
let shorthandValue = ( (2 - 1) || (2 + 1) );

// same thing longhand
let longHandValue = ( ((2-1) == true) ? (2 - 1) : (2 + 1) )

console.log(shorthandValue);
console.log(longHandValue);

console.log();

function dosage(mgOfCaffeine) {
    // we COULD do this
    // if (mgOfCaffeine == null)

    // this takes our function-scoped variable mgOfCaffeine and either assigns in the input value if it's truthy or 0 if it's not
    mgOfCaffeine = (mgOfCaffeine || 0);
    console.log(`I'm gonna need ${mgOfCaffeine}mg of caffeine for this lecture.`)
}

dosage(300);

/**
 * A NOTE ABOUT TEMPLATE STRINGS
 * 
 * You can run logic, including calling other functions, from with in the ${} of a template string.
 */

function printArray(myArray) {
    // this reassigns the input array to myArray if it exists (empty array is still truthy) or the default array if it doesn't
    myArray = (myArray || [1, 2, 3]);
    for (let i = 0; i < myArray.length; i++) {
        console.log(myArray[i]);
    }
}

// printArray();
// printArray([]);
printArray([4, 5, 6]);
// prints nothing
printArray(10);
// prints the characters since a string is an array of characters
printArray('Hello World!');

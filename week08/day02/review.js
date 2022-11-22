// REVIEW

// global variable
var varVariable = "Hi!";
// standard variable we can change
let letVariable = 234;
// constant we cannot change (though we CAN change properties)
const constVariable = false;
// seems to behave like let
noVariable = 590n;

// data types
/**
 * Number
 * String
 * Boolean
 * null
 * undefined
 * BigInt
 * Symbol
 * 
 * Object
 * Array (still actually an Object)
 */

// arrays can include ANY types in any order -- clear difference from Java
let myArray = [ 'Biff', 123, true, null, undefined, 990n, Symbol('key'), {name: 'Lois'}, [123, 456, 789] ];

let my3DArray = [ [1, 2, 3], [4, [5, '5', 'Five'], 6], [7, 8, 9] ];

console.log(my3DArray[1][1][2]);

// objects
let myObject = {
    name: 'My Name',
    age: 123,
    favoriteSongs: ['Albuquerque', 'Mr. Bojangles'],
    favoriteColors: ['Black', 'Forest Green'],
    favoritePerson: {
        name: 'Ambrose Burnsides',
        alive: false
    }
}

// three ways to print to the console
// remember that semicolons are OPTIONAL, if each line of code is on its own line
console.log(myObject.favoriteSongs[1] + ' ' + myObject.favoritePerson.alive)
console.log(myObject.favoriteSongs[1], myObject.favoritePerson.alive)
console.log(`My second favorite song is "${myObject.favoriteSongs[1]}," and is AB alive? ${myObject.favoritePerson.alive}`)
console.log('First...'); console.log('...and second.') // can separate on the same line with a semicolon


// creating a function
// no return type, no typing of parameters
function myFunction(x, y, z) {
    // var aaa gets hoisted to the top, no matter how buried it is, prints undefined here because it is not yet initialized
    console.log(aaa);
    if (true) {
        if (true) {
            if (true) {
                while (true) {
                    // this creates a function-scoped (global for the function) variable
                    var aaa = 3;
                    break;
                }
            }
        }
    }
    // still accessible throughout the function, even though the block in which it was created is gone
    console.log(aaa);
    // moral of the story = don't use var!!
}

myFunction();

console.log();

function rectangleArea(height = 1, width = height) {
    console.log(height * width);
}

// CAN NOT DO THIS!!
// This replaces the first version of the function -- we cannot overload in the traditional sense
//
// function rectangleArea(height, width, color) {
//     console.log(height, width, color);
// }

// we have "overloaded" this function to accept zero, one, the other, or both parameters
// we used default values and assigning values based on other values
rectangleArea(2, 6);
rectangleArea(4);
rectangleArea();
rectangleArea(undefined, 6);

console.log();

const myCar = {
    make: 'Lamborghini',
    model: 'Diablo',
    color: 'Azure'
}

console.log(myCar);
myCar.topSpeed = 200;
myCar.features = [ 'Butterfly Doors', 'Quad Exhaust Tips', 'Heated Ejector Seats', 'Shift Gates', 'Second Mortgage' ];
console.log(myCar);

delete myCar.topSpeed;
console.log(myCar);
myCar.topSpeed = 200;

myCar.features.splice(2, 1);

console.log(myCar);

myCar.features.splice(2, 0, 'Heated Ejector Seats');
console.log(myCar);

// ARRAY METHODS
/**
 * add something to the end = push
 * delete something from the end = pop
 * add something to the beginning = unshift
 * delete something from the beginning = shift
 * clip something out and/or insert something = splice
 * copy all or some to a new array = slice
 */


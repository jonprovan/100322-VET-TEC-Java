// VARIABLE AND FUNCTION HOISTING
// this describes where variables and functions are accessed in the series of code lines

// functions can be accessed anywhere and are fully hoisted

sayName();

function sayName() {
    console.log('Marvin.');
}

sayName();

// var's declaration is hoisted to the top of the document but isn't initialized until the line of code actually arrives
// true no matter how deep in a block the declaration is

console.log(myVar);

if (true)
    if (true)
        if(true)
            var myVar = 123;

console.log(myVar);

// let and const are NOT hoisted, meaning the program doesn't know they exist before initialization
// if you try to access it before initialization, you'll throw an error
// console.log(myLet);

// let myLet = 456;


// FUNCTIONS
// keyword function to create one
// no return type specified (just returns whatever is returned in the function)

function nameOfFunction(param1, param2) {
    let sum = param1 + param2;
    // don't have to return anything ('void' function), but if you do, what you return becomes the return type
    return sum;
}

// to run a function
nameOfFunction(3, 4);

// to pass a function as a parameter, don't use parentheses
// functionThatTakesAFunction(nameOfFunction, 5);

// no overloading in JS, but we can mimic that functionality using default values for parameters
// as well as using other parameters to assign value
function areaOfARectangle(height = 1, width = height) {
    return height * width;
}

console.log(areaOfARectangle(2));


// DATA TYPES

/**
 * 
 * Primitives --
 * null
 * undefined
 * number -- all number types, with or without decimals
 * BigInt -- 123n or a number too big to fit into number
 * string -- 'abc' or "abc"
 * Symbol
 * boolean
 * 
 * 
 * Non-primitives --
 * Object
 * Array
 */


// OBJECTS

let myEmptyObject = {}

// properties can be ANY data type, including arrays or other objects
let myObject = {
    name: 'Mildred Von Klecklacken',
    age: 104,
    hobbies: ['Sweater-Knitting', 'Turning Up The Thermostat'],
    pet: {
        name: 'Puddles',
        type: 'Cockatoo'
    }
}

console.log(myObject);
// accessing an individual property
console.log(myObject.age);
// changing a property
myObject.age = 105;
console.log(myObject.age);
// adding a property
myObject.favoriteTableClothPattern = 'Gingham';
console.log(myObject.favoriteTableClothPattern);
console.log(myObject);
// deleting a property
delete myObject.favoriteTableClothPattern;
console.log(myObject);
// accessing a deeper value
console.log(myObject.pet.type);
console.log(myObject.hobbies[1]);


// ARRAYS
// declaring an array, can hold any data type or any mix of data types
let myArray = [ 'House-hunting', 345, false, { name: 'Alan' }, [ 1, 2, 3 ] ];
let nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

// adding to/removing from the end (right)
nums.push(11);
console.log(nums);
nums.pop();
console.log(nums);

// adding to/removing from the beginning (left)
nums.unshift(0);
console.log(nums);
// nums.shift();
console.log(nums);

// inserting into and/or removing from the middle
// first param is index to start at, second is how many indices to remove, other params are things to insert
// this DOES affect the original array
nums.splice(5, 2, 4.2, 4.3);
console.log(nums);
nums.splice(5, 2, 5, 6);
console.log(nums);

// copying all or part of an array
// does NOT affect the original array, so we need to store the return
// first parameter is index to start at (inclusive); second is index to stop at (exclusive)
let slicedNums = nums.slice(2, 5);
console.log(slicedNums);


// TRUTHY/FALSY

/**
 * JS assigns a boolean value to all data types
 * 
 * Truthy Includes:
 * []
 * {}
 * Any positive/negative number
 * 'false'
 * Any non-empty string
 * Anything not falsy
 * 
 * Falsy Includes:
 * false
 * ''
 * 0
 * 0.0
 * -0
 * 0n
 * undefined
 * null
 * !true
 * NaN
 * Anything not truthy
 */

let myName = '';
if (myName)
    console.log(myName);

console.log(5 + '2');
console.log(2 === '2');

// ternary operator
let ternaryResult = (5 > 2) ? 'Yes!' : 'No!';
console.log(ternaryResult);

// shorthand -- if first item is falsy, second will be assigned, even if it is also falsy
let shorthandResult = null || 0;
console.log(shorthandResult);


// NULL VS. UNDEFINED
// not the same in JS
// null -- empty placeholder
// undefined -- not yet initialized (could also be not declared at all)

let color;
console.log(color);

let shade = null;
console.log(shade);

console.log(undefined == null);


// ITERABLE VS. ENUMERABLE
/**
 * Iterable is accessing the actual values within a collection
 * Array values
 * String characters
 * 
 * Enumerable is accessing the keys
 * Object properties
 * Array indices
 * 
 * To loop through items in an array, we iterate, vs.
 *  to loop through properties in an object, we enumerate
 */

let shoes = [ 'Sneaker', 'Tap Shoe', 'Sock', 'Slipper', 'Combat Boot' ]

// iterating to get values -- for of
for (let shoe of shoes) {
    console.log(shoe);
}

// enumerating to get indices (keys) -- for in
for (let shoe in shoes) {
    console.log(shoe);
}

let coffeeMug = {
    material: 'Ceramic',
    color: 'Beige',
    volume: '12oz.'
}

// enumerating to get properties (keys) and their values
for (let property in coffeeMug) {
    console.log(`${property} = ${coffeeMug[property]}`);
}


// HIGHER-ORDER FUNCTIONS

// functions that either return functions OR take them as parameters

// a closure is an "inner" function that has access to variables from an outer function

function timesX(x) {
    return number => number * x;
}

let times5 = timesX(5);

console.log(times5(10));

let times9 = timesX(9);

console.log(times9(10));


/**
 * forEach
 * map
 * filter
 * reduce
 */

// forEach does something with each item, doesn't change the array, doesn't return anything
shoes.forEach((shoe) => {
    console.log(shoe);
})

// map does something with each and returns a new array with the new values
let mappedShoes = shoes.map((shoe) => {
    return shoe.toUpperCase();
});

console.log(mappedShoes);
console.log(shoes);

// filter looks at each item, and if it passes the test, adds it to a new array
let filteredShoes = shoes.filter((shoe) => {
    return shoe.includes(' ');
});

console.log(filteredShoes);
console.log(shoes);

// reduce looks through the array, does something with each value, returns a single value
let reduction = shoes.reduce((shortest, shoe) => {
    if (shortest.length < shoe.length)
        return shortest;
    else
        return shoe;
}, 'A'); // can add a starting value after the function as a second parameter

console.log(reduction);
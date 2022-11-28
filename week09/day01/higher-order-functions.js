// HIGHER-ORDER FUNCTIONS

/**
 * A higher-order function is one that takes a function as a parameter OR that returns a function
 * 
 * TAKING A FUNCTION AS A PARAMETER
 * This is easier with arrow-function syntax
 * 
 * (parameter1, parameter2) => parameter1 + parameter2;
 * 
 * No parameters
 * () => console.log('Hi');
 * 
 * One parameter
 * num => num;
 * (num) => num;
 * 
 * Multiple parameters
 * (num1, num2) => num1 + num2;
 * 
 * Return keyword
 * CANNOT do this:
 * num => return num;
 * 
 * CAN do this:
 * num => { return num; };
 * num => { num = num * num; return num; }
 * 
 * Function that does nothing:
 * () => {};
 * () => { return {}; };
 * 
 */

const sum = (num1, num2) => num1 + num2;
const otherSum = (num1, num2) => { return num1 + num2 };

console.log(sum(2, 3));
console.log(otherSum(2, 3));

console.log();

const factorial = num => {
// subtract one and call the function again
    if (num <= 1)
        return 1;
    else
        return num * factorial(num - 1);
}

console.log(factorial(10));

console.log();


/**
 * Common higher-order functions taking functions as parameters
 * 
 * forEach
 * map
 * filter
 * reduce
 * 
 * We DO NOT need a stream in JavaScript
 */

const videoGames = [ 'Sonic The Hedgehog', 
                     'Super Mario Odyssey', 
                     'Contra', 
                     'Cruisin\' USA', 
                     'Pac-Man', 
                     'Crazy Taxi', 
                     'Grand Theft Auto San Andreas',
                     'Call Of Duty' ];

// forEach -- performs an action for each element

// -- this does NOT change the original array at all
videoGames.forEach((videoGame) => {
    console.log(videoGame);
    // only changes local variable
    // videoGame = 'The Adventures of Dino-Riki';
});

console.log();

// map -- performs an action for each element and returns an array containing the new elements
// STILL DOES NOT change the original array

// must create a variable in which to store the new array
const upperCaseVideoGames = videoGames.map((videoGame) => {
    // must return a value to store

    // this works and may be easier to read later
    // const upperCaseVideoGame = videoGame.toUpperCase();
    // return upperCaseVideoGame;

    return videoGame.toUpperCase();
});

console.log(upperCaseVideoGames);
console.log(videoGames);

console.log();

// filter -- creates a condition for inclusion in a new array, then returns that array
const videoGamesStartingWithC = videoGames.filter((videoGame) => {
    // returning a boolean; if the boolean is true, the element gets included in the new array
    return videoGame.toUpperCase().startsWith('S');

    // this works, too
    // return videoGame.charAt(0) === 'c' || videoGame.charAt(0) === 'C';
});

console.log(videoGamesStartingWithC);

console.log();

// reduce -- takes entire array, reduces it to some single value, then returns that value
// input function takes two parameters -- first is "accumulator", second is the item from the array
const longestVideoGame = videoGames.reduce((longest, videoGame) => {
    return (videoGame.length > longest.length) ? videoGame : longest;
}, 'Pong'); // initial value for first intake parameter goes at the end in JS, after the parameter function, before the parenthesis

console.log(longestVideoGame);

const numArray = [ 2, 4, 6, 10, 25 ];

const numSum = numArray.reduce((currentSum, num) => {
    return currentSum + num;
}, 10); // can add default parameter to store as starting value for currentSum

console.log(numSum);

console.log();


/**
 * FUNCTIONS THAT RETURN FUNCTIONS
 * 
 * A function can return an entire function
 * A "closure" is an anonymous (nameless) function that has access to its external environment
 * 
 * -- another definition = an inner function that has access to the variables from an outer function
 * 
 * The main purpose of closures is creating functions at runtime
 * 
 */

function timesX(x) {
    
    // this is a closure
    // this closure will have access the the value of x that was provided when the timesX function was originally run
    return function(number) {
        return number * x;
    }

}

const times5 = timesX(5);
console.log(times5(10));

const times7 = timesX(7);
console.log(times7(10));
console.log(times5(100));

// what times7 looks like as a written-out function
// function times7(number) {
//     return number * 7;
// }


function greet(name, age, job) {

    const vowels = [ 'a', 'e', 'i', 'o', 'u' ];

    for (let letter of vowels) {
        if (job.charAt(0).toLowerCase() === letter)
            return function() {
                console.log(`Hello! My name is ${name}, I am ${age} years old, and am an ${job}.`);
            }
    }

    return function() {
        console.log(`Hello! My name is ${name}, I am ${age} years old, and am a ${job}.`);
    }
}

const dougGreet = greet('Doug', 28, 'Anesthesiologist');
const jasmineGreet = greet('Jasmine', 32, 'CTO');

dougGreet();
jasmineGreet();
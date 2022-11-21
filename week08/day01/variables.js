// DECLARE & INITIALIZE YOUR VARIABLES BEFORE YOU USE THEM!!
// also, name your variables in ways that don't cross over

// functions ARE hoisted, so you can use them before they're declared
scopes();

/**
 * Three scopes in JS
 * 
 * Global scope -- accessible anywhere within the file
 * Function scope -- accessible anywhere within a function
 * Block scope -- accessible anywhere within a code block, i.e. {}
 * 
 */

// Global scoped variable

// In 2022, we generally say DO NOT USE VAR!!

// variable declaration, do not designate a type
var global;

// variable initialization
global = "global";
// can redefine a variable with any type we wish
global = 56;
global = true;

// with var, we can redeclare the same variable
// can't do this in Java

console.log(global);
var global = "still global";
console.log(global);

console.log();

// function-scoped variable
function functionScope() {
    // console.log(global); -- this creates a hoisting issue
    var global = 78; // this is a function-scoped variable that DOES NOT share a value with the global version
    console.log(global);
}

functionScope();
console.log(global);

console.log();

/**
 * DOWNSIDES TO USING VAR
 * 
 * 1. Function-/global-scoping leads to some strange and unpredictable interactions
 * 2. The idea of redeclaring a variable doesn't exist in other languages, so it's a little weird
 */

/**
 * WHAT ARE THE ALTERNATIVES?
 * 
 * let
 * -- let is similar to var in that I CAN redefine the variable's value
 * -- let x = 10; x = 11; x = 'Joe'; x = true;
 * -- I can NOT redeclare the variable
 * -- let x = 10; let x = 11; -- not allowed!
 * 
 * const
 * -- const is similar to final in Java
 * -- once I initialize the value, I cannot change it
 * -- if the value is an Object, I CAN change its properties
 * 
 */

let firstName = "Susan";
console.log(firstName);
// cannot redeclare with let in the same scope
// let firstName = "Michelle";
firstName = "Michelle";
console.log(firstName);
// CAN give a new value, even if the new value is a different type
firstName = false;
console.log(firstName);

console.log();

const lastName = "McTevish";
console.log(lastName);
// cannot redeclare
// const lastName = "Brown";
// cannot give a new value either
// lastName = "Brown";

const newPerson = {
    firstName: "Larry",
    lastName: "David",
    age: 73,
    temperament: "Cantankerous"
}

console.log(newPerson);

// can't do this
// newPerson = {
//     firstName: 'Jerry',
//     lastName: 'Seinfeld'
// }

newPerson.firstName = 'Jerry';
newPerson.lastName = 'Seinfeld';

console.log(newPerson);

console.log();

// Hoisting and its issues

function hoistingTestVar() {
    // the declaration of x is "hoisted" to the top of the scope (function) but is not initialized with a value
    console.log(x);
    var x = 10;
    console.log(x);
}

hoistingTestVar();

console.log();

function hoistingTestLet() {
    // the declaration of x is technically hoisted but completely inaccessible before initialization
    // true for const as well
    // so the below line throws an error
    // console.log(x);
    let x = 25;
    console.log(x);
}

hoistingTestLet();

console.log();

// various scopes
// variables only "live" as long as their scope is still active

// global scope y
let y = 10;
console.log('Before function: ' + y);

function scopes() {
    // function scope y
    let y = 20;
    console.log('Inside function, before block: ' + y);
    if (true) {
        // block scope y
        let y = 30;
        console.log('Inside block: ' + y);
    }
    console.log('Inside function, after block: ' + y);
}

scopes();

console.log('After function: ' + y);







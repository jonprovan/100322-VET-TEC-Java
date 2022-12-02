// WEEK 9 QUIZ

/**
 * Callback functions
setTimeout/setInterval
Prototypes
Function vs. Instance Prototypes
Prototypical Inheritance
Prototype Chaining
Constructor Functions
this
Class
Promises
Promise States
Promise Chaining
Promise.resolve/Promise.reject
Async & Await
Spread/Rest Operators
Object/Array Destructuring
Arrow Functions

Nullish Coalescing Operator

Object Property Permissions
 */

// CALLBACK FUNCTIONS

// Callback functions are any functions we don't want to execute immediately
// they will be executed after some period of time or after some action has happened

/**
 * setInterval -- executes certain code every x number of milliseconds
 * setTimeout -- executes certain code once after x number of milliseconds
 * Any async function -- returns a Promises
 * 
 * All of these get sent to the event loop
 * -- priority for code == inline code first, then Promises, then regular callbacks
 */

// setTimeout(() => {
//     console.log('This is my timeout.'); // first param is a lambda function or a previously existing function
// }, 500); // second param is number of milliseconds

function sayHi() {
    console.log('Hi!');
}

// setTimeout(sayHi, 1000); // first parameter calling an existing function without parentheses

// setInterval(() => {
//     console.log('My Interval');
// }, 1000);

function sayHiInterval() {
    console.log('Hi, Interval!');
}

// setInterval(sayHiInterval, 1000);

// if we want to be able to stop an interval, we need to store it in a variable
// const intervalToClear = setInterval(sayHiInterval, 1000);

// then we use clearInterval, taking in the variable we created for the interval, to stop it
// this can be cued from a button press or whatever other event we like
// setTimeout(() => {
//     clearInterval(intervalToClear);
// }, 5000);


// CONSTRUCTOR FUNCTIONS
// allow us to create a "type" of object and then use that "type" to create instances

function Parrot(name, age, crackerPreference) {
    this.name = name ?? this.name;
    this.age = age;
    this.crackerPreference = crackerPreference;
    this.speak = () => console.log(this.name); // can also create methods to add to our instances
}

// creates something that looks like this and is considered an instance of Parrot
// {
//     name: 'Name',
//     age: 45,
//     crackerPreference: 'Wheat'
// }

// create one using the new keyword
const polly = new Parrot('Polly', 75, 'Saltines');
console.log(polly);

polly.name = 'Polly-O';
console.log(polly);
polly.color = 'Blue';
console.log(polly);
delete polly.color;
console.log(polly);
polly.name = 'Polly';
console.log(polly);

const paul = new Parrot('Paul', 30, 'Triscuits');
console.log(paul);


// PROTOTYPES
// each constructor function has a prototype which is the template for all objects created with that function

Parrot.prototype.color = 'Blue'; // this adds the color property 
paul.color = 'Red';
console.log(polly.color);
console.log(paul.color);

const zulmak = new Parrot('Zulmak', 554, 'Human Skulls');
console.log(zulmak.color);

Parrot.prototype.name = 'Generic Parrot'; // if you adjust the prototype after a property has been initialized, it doesn't overwrite it
console.log(polly);

const undefinedParrot = new Parrot(undefined, 12, 'Cheez-Its');
console.log(undefinedParrot);

// The function has a .prototype property
// Each instance has a .__proto__ property, which points to the function's .prototype property (which is an object)

console.log(Parrot.prototype === polly.__proto__);

polly.speak();

polly.__proto__.eat = () => console.log(`Mmm! Love these!`);

paul.eat();

// static properties and methods
Parrot.AVIAN_STATUS = true;
Parrot.molt = () => console.log('No feathers left...');

// these MUST be called directly on the object and not an instance
// in Java, we can call static properties/methods on instances, even though it's not proper
// in JS, we cannot
console.log(Parrot.AVIAN_STATUS);
Parrot.molt();
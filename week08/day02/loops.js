// LOOPS IN JAVASCRIPT

/**
 * Most loops work exactly how you would expect them to from a Java background
 * 
 * With some exceptions re: the enhanced for loop
 */

// while loop
console.log('While loop:');

let i = 0;
while (i < 5) {
    console.log(i);
    i++;
}

console.log();
console.log('Do-while loop:');

// do-while loop
do {
    console.log(i);
    i++;
} while (false);

console.log();
console.log('For loop:');

// for loop
// we don't specify a data type for j, but if we're using a fresh block-scoped variable, we do need "let"
for (let j = 0; j < 5; j++) {
    console.log(j);
}

let veggieBytes = [ 'GPU', 'RAM', 'Carrot Processing Unit', 'Brussels Sprouts', 'Green Onions' ];

// Java syntax -- this does not work
// for (String veggieByte : veggieBytes) {
//     console.log(veggieByte);
// }

/**
 * THE "FOR OF" AND "FOR IN" LOOPS
 * 
 * JavaScript separates things into iterables and enumerables
 * 
 * Iterables Include:
 * Arrays -- specifically the items within arrays
 * Iterators
 * 
 * Enumerables Include:
 * Array indices
 * Properties within an object
 * -- enumerables are not necessarily ordered / order is not maintained
 */


// JS Versions

// this uses iterables -- for of
// in this case, it will print the array items
for (let veggieByte of veggieBytes) {
    console.log(veggieByte);
}

// this uses enumerables -- for in
// in this case, it will print the array indices
for (let veggieByte in veggieBytes) {
    console.log(veggieByte);
}

// With Objects
const person = {
    head: 1,
    hands: 2,
    fingers: 10,
    toes: 10,
    hairs: 500000n,
    heartChambers: 4
}

// must use for in, because person is an Object, which is not enumerable
for (let bodyPart in person) {
    // this prints the "keys" for each property, not the value
    // console.log(bodyPart);

    // can get the values by thinking of our enumerated object as being an array with indices labeled with each key
    console.log(`Key: ${bodyPart} and Value: ${person[bodyPart]}`);
}

// remember that Strings are arrays, so we can loop through them as well
let myString = 'Everyone loves enumerables!';

// to print the character values
for (let char of myString) {
    console.log(char);
}

// to print the indices of the letter
for (let index in myString) {
    console.log(index);
}
/**
 * Remember that JS distinguishes between things that are "iterable" and things that are "enumberable"
 * 
 * ITERABLE THINGS -- Array values, String characters, other iterators 
 * 
 * ENUMERABLE THINGS -- Array indices, Object properties
 * 
 */

// iterating through an array

let breakfastItems = [ 'Coffee', 'Bagel', 'Eggs', '2nd Cup Of Coffee', 'n00bz' ];

// standard for loop
for (let i = 0; i < breakfastItems.length; i++) {
    console.log(breakfastItems[i]);
}

console.log();

// use "for of" to iterate
// this prints out the actual values
// think of it as accessing values instead of "keys"
for (let item of breakfastItems) {
    console.log(item);
}

console.log();

// enumerating an array
// use "for in" to enumerate
// this prints indices, not values
// think of it as accessing the "key" and not the "value"
for (let item in breakfastItems) {
    console.log(item);
}

console.log();

// creating an object to enumerate

const coffeeShop = {
    name: 'Raymond\'s Java Shack',
    hours: '24/7',
    brands: [ 'Ray Supreme', 'Ray Mid-Grade', 'Ray Bottom-Shelf' ],
    menu: [ 'Americano', 'Redeye', 'Latte', 'Frappucino', 'Mocha', 'Flat White', 'Black COffee', 'Hot Chocolate' ],
    baristas: [
        {
            name: 'Victoria Morton',
            age: '24',
            specialty: 'Black Coffee'
        },
        {
            name: 'Dylan Howard',
            age: '25',
            specialty: 'Hot Chocolate'
        }
    ]
}

console.log(coffeeShop);

console.log();

for (let property in coffeeShop) {
    console.log( `Key = ${property} -------- Value = ${coffeeShop[property]}` );
}

console.log();

// grabbing properties of objects within an array within our object

// outer loop uses "for of" to access the objects within the baristas array
for (let barista of coffeeShop.baristas) {
    // inner loop uses "for in" to access the property keys within each object
    for (let property in barista) {
        // print statement uses the property keys to print them AND to access the property values
        console.log( `Key = ${property} -------- Value = ${barista[property]}` );
    }
    console.log();
}

const deepObject = {
    name: [ 'Doug', {
        middleNames: [ 'The', 'Supreme', 'Chancellor', {
            territories: [ 'North Galaxy', 'West Galaxy', 'Brooklyn' ]
        } ]
    } ]
}

console.log(deepObject.name[1].middleNames[3].territories[2]);
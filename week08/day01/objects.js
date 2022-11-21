/**
 * OBJECTS IN JAVASCRIPT
 * 
 * Objects in JS are a little more lightweight than in Java, BUT they are a bit more flexible
 * 
 * We create an object using the curly braces -- {}
 * -- within the object we have properties listed out in key/value pairs
 * -- can think of this like a little internal HashMap of sorts
 * 
 * Syntax:
 *  {
 *      key: value,
 *      otherKey: otherValue
 *  }
 * 
 * Commas are required between key/value pairs, but not after the last one
 */

const artist = {
    name: 'Mozart',
    genre: 'Classical',
    birthYear: 1756,
    alive: false
}

console.log();

console.log(artist);

console.log();

// cannot do this, because artist is a const
// artist = {};

artist.name = 'Wolfgang Amadeus Mozart';
console.log(artist);

console.log(artist.parents);

artist.wigSize = 'X-Large';
console.log(artist);

console.log();

const artistRevised = {
    // can nest an object inside an object
    name: {
        first: 'Wolfgang',
        middle: 'Amadeus',
        last: 'Mozart'
    },
    genre: 'Classical',
    birthYear: 1756,
    alive: false,
    // can also nest an array
    greatWorks: ['Fantasia', 'The Marriage Of Figaro', 'Requiem', 'The Magic Flute']
}

console.log(artistRevised);
// can access sub-object properties using the . syntax
console.log(artistRevised.name.first);
// can access array indices with [i] just like in Java
console.log(artistRevised.greatWorks[0]);
console.log(artistRevised);

// can assign a "blank" value to a property
artistRevised.birthYear = null;
console.log(artistRevised);
// or you can delete the property from the object altogether
delete artistRevised.birthYear;
console.log(artistRevised);
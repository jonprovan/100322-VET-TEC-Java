// We can dictate what is allowed to be done with our object properties

// enumerable, writable, configurable

// we access these through static methods of the Object class
// all Objects, by default, are all three
// all objects we create are "children" or "descendants" of the Object class

/**
 * enumerable -- whether or not a property will be visible
 * writable -- whether it can be changed
 * configurable -- whether its permissions can be altered in the future
 */

// we adjust these with the defineProperty method

const edith = {
    name: 'Edith',
    age: 101,
    gender: 'Female'
}

console.log(edith);

// enumerable
Object.defineProperty(edith, 'name', {enumerable: false});
console.log(edith);
// still accessible, just not enumerable (visible/used during enumeration)
console.log(edith.name);
Object.defineProperty(edith, 'name', {enumerable: true});
console.log(edith);

// writable
Object.defineProperty(edith, 'age', {writable: false});
console.log(edith);
// this doesn't change anything, because the property was blocked from being writable
edith.age = 102;
console.log(edith);
Object.defineProperty(edith, 'age', {writable: true});

// configurable
// this effectively sets the property permissions in stone
Object.defineProperty(edith, 'gender', {configurable: false});
// cannot do this, because configuration for this property has been disabled
// Object.defineProperty(edith, 'gender', {enumerable: false});

// can't even do this -- property permissions are forever fixed after setting configurable to false
// Object.defineProperty(edith, 'gender', {configurable: true});
console.log(edith);
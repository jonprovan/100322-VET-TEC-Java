// NULLISH COALESCING OPERATOR

// this returns the first value if it is not null or undefined -- it CAN be falsy
const myValue = 0 ?? 45;

// if I did this -- const myValue = 0 || 45; -- it would return the second parameter, because the first is falsy

console.log(myValue);


// OBJECT PROPERTY PERMISSIONS
// you may want to restrict whether a particular property of your object is visible, writable or configurable

const myObject = {
    name: 'Yolanda',
    age: 12,
    favoritePasttime: 'Mischief'
}

console.log(myObject);

// enumerable -- determines whether or not a property is visible when enumerating through the keys
Object.defineProperty(myObject, 'favoritePasttime', {enumerable: false});
console.log(myObject); // favoritePasttime doesn't show up
myObject.favoritePasttime = 'Antics'; // can still edit it
console.log(myObject.favoritePasttime); // can still access it
Object.defineProperty(myObject, 'favoritePasttime', {enumerable: true}); // now it shows up again
console.log(myObject);

// writable -- determines whether or not you can change the value of the property
Object.defineProperty(myObject, 'age', {writable: false});
myObject.age = 13; // can't do this
console.log(myObject); // still the same
Object.defineProperty(myObject, 'age', {writable: true}); // now I can edit freely

// configurable -- determines whether or not you can change the values of the other permissions, as well as this one
// sets all permissions in stone forever
Object.defineProperty(myObject, 'name', {configurable: false}); // this sets it in stone, with writable/enumerable still true
myObject.name = 'YOLANDA';
console.log(myObject.name);
console.log(myObject);
Object.defineProperty(myObject, 'name', {writable: false});
myObject.name = 'Yolanda';
console.log(myObject.name);
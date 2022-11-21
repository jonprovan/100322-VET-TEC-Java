// In JavaScript, we have several types of primitive data and a couple non-primitives

/**
 * PRIMITIVE DATA TYPES
 * 
 * - String -- 'abc' or "abc"
 * - Number -- 123 or 123.456
 * - Boolean -- true or false
 * - Null -- null
 * - Undefined -- undefined (no assigned value)
 * - BigInt -- some number outside the bounds of Number or 123n
 * - Symbol -- basically a unique item created with a key
 * 
 * NON-PRIMITIVE DATA TYPE(S)
 * - Objects and Arrays (both considered objects) -- {} for an object, [] for an array
 */

// can use typeof to check a variable's data type

console.log(typeof 'abc'); // string
console.log(typeof 234); // number
console.log(typeof {}); // object
console.log(typeof []); // object
console.log(typeof null); // object but should be thought of as a primitive
console.log(typeof undefined); // undefined
console.log(typeof 123n); // bigint
console.log(typeof Symbol('key')); // symbol
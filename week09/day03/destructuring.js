// DESTRUCTURING OBJECTS AND ARRAYS IN JAVASCRIPT

/**
 * What does this mean?
 * 
 * Sometimes, we want to access properties from an object as individual variables
 * - sometimes, we may want to use those properties as properties in a new object
 * 
 * Sometimes, we may want to collate several properties/variables into an object/array
 * 
 * We may not want to do this one at a time (or use a loop)
 */

// SPREAD OPERATOR

const plane = {
    manufacturer: 'Boeing',
    model: '747',
    capacity: 450
}

// if we do this, otherPlane points to the same spot in memory as plane
// let otherPlane = plane;

// when we change the properties of one, we change it for the other
// otherPlane.model = '777';
// console.log(plane.model);

// we can use the spread operator to "spread out" the properties of an object into individual items
// we can "destructure" the object into its parts

// spread operator ==> ...
const otherPlane = {...plane};

console.log(plane);
console.log(otherPlane);

console.log();

otherPlane.model = '777';

console.log(plane);
console.log(otherPlane);

console.log();

// we can add additional properties
const thirdPlane = {...plane, material: 'Aluminum', launchDate: 'May 2022'};
console.log(thirdPlane);

// can destructure an object built from a destructured object
const fourthPlane = { ...thirdPlane };

console.log(fourthPlane);

// we can also use spread to destructure an array
// a string is an array, easy to see the destructuring
const myString = 'abcde';
const myStringArray = [...myString];

console.log(myStringArray);

const coins = ['Quarter', 'Dime', 'Nickel', 'Penny'];
const newCoins = [...coins];
console.log(coins);
console.log(newCoins);
// adding to one array does NOT affect the other
newCoins.unshift('Half Dollar');
console.log(coins);
console.log(newCoins);


// REST OPERATOR
// looks just like the spread operator -- ... -- but does the opposite
// it takes a series of items and groups them together into an array

function collectNames(first, second, third, ...waitList) {
    console.log('People Who Must Perform A Dance Number On-Camera Tomorrow!');
    console.log(`First = ${first}`);
    console.log(`Second = ${second}`);
    console.log(`Third = ${third}`);
    console.log(`WaitList = ${waitList}`);
    console.log(waitList);
}

// doesn't have to be all the same data type -- any parameter passed in will get shoved into the array
collectNames('Edwin', 'Brian', 'Dylan', 'Tor', 'Chris?', 'Jordan', 'Snuffelupagus', 'Casper' );

console.log();

// destructuring into variables as opposed to other objects/arrays

const planet = {
    name: 'Saturn',
    madeOf: 'Gas',
    orbitNumber: 6
}

// have to do this without destructuring
// console.log(planet.name);

// this takes the properties with matching names and creates variables for them
// new variables MUST have the same names as the properties, or they'll end up undefined
const { name, madeOf, orbitNumber } = planet;

console.log(name);
console.log(madeOf);
console.log(orbitNumber);

console.log();

// destructuring an input parameter object

const candidate1 = {
    name: 'Barney',
    age: 52,
    field: 'Botany',
    skills: {
        skillOne: 'Planting',
        skillTwo: 'Semi-Green Thumb',
        skillThree: 'Herbicide'
    }
}

// we destructure the object coming in
function logCandidate( {name, age, field, skills} ) {

    // we also destructure the nested object
    const {skillOne, skillTwo, skillThree} = skills;

    // now we can directly access all variables at block scope
    console.log(`Name = ${name}`);
    console.log(`Age = ${age}`);
    console.log(`Field = ${field}`);
    console.log(`Skill 1 = ${skillOne}`);
    console.log(`Skill 2 = ${skillTwo}`);
    console.log(`Skill 3 = ${skillThree}`);
    
}

// running the function and feeding in a candidate object
logCandidate(candidate1);

console.log();


// DESTRUCTING ARRAYS INTO VARIABLES

const trees = [ 'Pine', 'Fir', 'Apple', 'Dogwood', 'Birch' ];

console.log(trees);

// this assigns variable names in order, a = 'Pine' and so forth
const [ a, b, c, d, e ] = trees;
// this assigns the first two to these variable names
const [ f, g ] = trees;
// what if I only want the last two?
// leave empty spaces, separated by commas, to skip indices
const [ , , , h, i ] = trees;

console.log(h);

// can use the rest operator to group array items into one new array
const [ j, k, ...l ] = trees;

console.log(j);
console.log(k);
console.log(l);

// In all of these cases, the variable and/or arrays/objects created are distinct from their sources
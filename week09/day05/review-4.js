// DESTRUCTURING

/**
 * Spread operator ...
 * Rest operator ... (different place)
 * 
 * Object destructuring into variables
 * Array destructing into variables
 */

// Spread operator
// spreading out the contents of an array into separate items

const myNums = [1, 2, 3, 4, 5]

// here, we're just pointing to the same memory address, and if we change something in myNums, it'll change in myOtherNums, too
let myOtherNums = myNums;

// myNums[0] = 0;
// console.log(myOtherNums[0]);
// myNums[0] = 1;

// this spreads out the contents of myNums and adds them into myOtherNums -- they are now completely independent
myOtherNums = [...myNums];

myNums[0] = 0;
//console.log(myOtherNums[0]);


// Rest Operator

function assembleNumbers(num1, num2, ...restOfNums) {
    console.log(num1);
    console.log(num2);
    console.log(restOfNums);
}

// rest operator creates an array, even if no parameters are passed into it (an empty array, in that case)
assembleNumbers();

// but all parameters after the individually-defined ones are smashed into the rest array
assembleNumbers(1, 2, 3, 4, 5);


// destructuring an object into variables holding its properties' values

const myOrder = {
    customerName: 'Jon',
    food: 'Pulled Pork Sandwich',
    drink: "Boddington's Pub Ale",
    ingredients: [
        {
            name: 'Pulled Pork',
            subIngredients: [
                {
                    subIngredientName: 'Vinegar',
                    cost: 3.95
                }
            ]
        }
    ]
}

// this creates three const variables at this scope with the values from the object
// the variable names for object destructuring MUST match the object properties in order to grab the values
// order doesn't matter
// don't have to grab all of them if I don't want to
const { drink, food, customerName } = myOrder;

console.log(customerName);
console.log(food);
console.log(drink);

// can also destructure a buried/nested object
const { subIngredientName, cost } = myOrder.ingredients[0].subIngredients[0];

console.log(subIngredientName);
console.log(cost);

// destructuring on parameter intake
// the object taken in as a parameter is broken out into its properties, which can then be accessed directly
function orderDetails( { customerName, food, drink } ) {
    console.log(customerName);
    console.log(food);
    console.log(drink);
}

orderDetails(myOrder);

console.log();


// destructuring an array
const myLetters = [ 'A', 'B', 'C', 'D', 'E' ];

// this breaks out the array into variables, assigning them in order
// variable names DO NOT have to match in any way
const [ a, b, c, d, superstar ] = myLetters;

console.log(a);
console.log(superstar);

// don't have to grab all of them; this just grabs the first two
const [ f, g ] = myLetters;

console.log(g);

// can skip indices by just putting a comma with no variable name
const [ h, , i, , j ] = myLetters;

console.log(i);
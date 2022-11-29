/**
 * Before ES6 (2015), there was no real support in JS for Java-like OOP syntax
 * There was SOME support for traditional inheritance via prototypical inheritance
 * 
 * In JS, there's no such thing as a class (OOP sense)
 */

// still just a normal function, despite the capital letter
// this is not a PROPER constructor function
function Hyena() {
    console.log('Hee-hee!');
}

// calling it normally
Hyena();

// even with a variable assignment, we're just calling it normally
let myHyena = Hyena();

// nothing returned, so prints as undefined
console.log(myHyena);

// THE NEW KEYWORD -- this makes our function into a "class" and our variable into an "instance" of the "class"
myHyena = new Hyena();

// now this prints the instance object
console.log(myHyena);

console.log();

// this creates a class called BetterHyena that takes in three parameters
// this is a constructor function
function BetterHyena(name, evil, numberOfTeeth) {
    this.name = name;
    this.evil = evil;
    this.numberOfTeeth = numberOfTeeth;
}

// this creates an instance of BetterHyena
let betterHyena1 = new BetterHyena('Shenzi', true, 40);

console.log(betterHyena1);

// this creates two more, each of which is distinct from the first one
let betterHyena2 = new BetterHyena('Banzai', true, 36);
let betterHyena3 = new BetterHyena('Ed', false, 20);

console.log(betterHyena2);
console.log(betterHyena3);

// altering properties on one does NOT alter the properties on the others
console.log(betterHyena2.evil);
betterHyena2.evil = false;
console.log(betterHyena2);
betterHyena2.funny = true;
console.log(betterHyena2);
delete betterHyena2.funny;
console.log(betterHyena2);


// PROTOTYPES IN JAVASCRIPT

/**
 * JavaScript uses prototypical inheritance
 * 
 * Functions that create instances have a prototype (an object)
 * -- NameOfFunction.prototype
 * -- any key on the prototype object can be considered like a instance field in Java
 * -- any function on the prototype object can be considered like an instance method in Java
 * 
 * 
 * Objects (instances) ALSO have a prototype object
 * -- this object is the SAME OBJECT as its constructor function's prototype
 * -- instanceName.__proto__ -- this gets added to all objects created with the "new" keyword from a constructor function
 * 
 */

// the constructor function's prototype is the same as the instance's __proto__
console.log(BetterHyena.prototype === betterHyena1.__proto__);

// printing the prototype doesn't help much
console.log(BetterHyena.prototype);

// adding an instance method to the prototype makes it available for ALL instances, even those already created
BetterHyena.prototype.laugh = () => console.log('Bwa ha ha!!');

// calling my new instance method
betterHyena1.laugh();
betterHyena2.laugh();
betterHyena3.laugh();

// adding a property to all instances
BetterHyena.prototype.funny = true;

// printing out properties to see the one that's been added for a specific instance
for (let property in betterHyena1) {
    console.log(`${property}: ${betterHyena1[property]}`);
}
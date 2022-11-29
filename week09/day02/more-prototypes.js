// a constructor function for an Elephant object

function Elephant(variety, age, height) {
    this.variety = variety;
    this.age = age;
    this.height = height;
    this.speak = () => console.log('Toot!');
}

let elephant = new Elephant('African', 55, '30 Hands');
let elephant2 = new Elephant('Indian', 21, '22 Hands');

elephant.speak();

elephant.__proto__.color = 'Gray';
elephant.color = 'White';
console.log(elephant.color);
console.log(elephant2.color);

// this creates a "static" property on the Elephant function itself
// if I change it later, it changes for all Elephants
// it "belongs" fully to the function, not an instance
Elephant.hasTusks = true;

// this does NOT change the static property; it creates a new property on the instance
elephant.hasTusks = false;
console.log(Elephant.hasTusks);

// proper notation for static properties
Elephant.HAS_TUSKS = true;

// creating a static function (method)
Elephant.dance = () => {
    console.log("Doin' the circus boogie...");
}

// MUST run a "static" function using the constructor function name, NOT an instance
Elephant.dance();

console.log(elephant);
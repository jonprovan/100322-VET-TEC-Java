// to create a model for an object
// ng g class <modelname>

export class Card {

    // set up our properties
    sign: string;
    symbol: string;
    element: string;

    // set up our constructor
    // MUST do so properly for this file to compile
    constructor(sign: string, symbol: string, element: string) {
        this.sign = sign;
        this.symbol = symbol;
        this.element = element;
    }

}

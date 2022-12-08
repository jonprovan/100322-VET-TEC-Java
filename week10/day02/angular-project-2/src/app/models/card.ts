// to create a model for an object
// ng g class <modelname>

export class Card {

    // set up our properties
    id: number;
    sign: string;
    symbol: string;
    element: string;

    // set up our constructor
    // MUST do so properly for this file to compile
    constructor(id: number, sign: string, symbol: string, element: string) {
        this.id = id;
        this.sign = sign;
        this.symbol = symbol;
        this.element = element;
    }

}

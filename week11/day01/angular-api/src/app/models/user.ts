export class User {

    // properties
    #firstName: string;
    #lastName: string;
    #email: string;
    #password: string;
    #favorites: any[];

    // constructor
    constructor(firstName: string,
                lastName: string,
                email: string,
                password: string) {

        this.#firstName = firstName;
        this.#lastName = lastName;
        this.#email = email;
        this.#password = password;
        this.#favorites = [];
    }

    // getters/setters
    get firstName(): string {
        return this.#firstName;
    }
    
    get lastName(): string {
        return this.#lastName;
    }

    get email(): string {
        return this.#email;
    }

    get password(): string {
        return this.#password;
    }

    get favorites(): any {
        return this.#favorites;
    }

    set firstName(firstName: string) {
        this.#firstName = firstName;
    }

    set lastName(lastName: string) {
        this.#lastName = lastName;
    }

    set email(email: string) {
        this.#email = email;
    }

    set password(password: string) {
        this.#password = password;
    }

    set favorites(favorites: any) {
        this.#favorites = favorites;
    }

}

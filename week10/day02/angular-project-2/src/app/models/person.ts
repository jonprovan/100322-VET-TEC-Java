export class Person {

    firstName: string;
    lastName: string;
    dateOfBirth: string;
    favoriteColor: string;
    bankAccountNumber: number;
    firstPet: string;

    constructor(firstName: string,
                lastName: string,
                dateOfBirth: string,
                favoriteColor: string,
                bankAccountNumber: number,
                firstPet: string) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.favoriteColor = favoriteColor;
        this.bankAccountNumber = bankAccountNumber;
        this.firstPet = firstPet;
    }

}

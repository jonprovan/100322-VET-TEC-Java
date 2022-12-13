// an environment is an object
// it contains key/value pairs for data you need across your site
// this is baked in when the project is built or served

export const environment = {
    production: false,
    // this is a property we can grab like any other object prop
    envTestVariable: 'We are in development.',
    apiURL: 'https://www.thecocktaildb.com/api/json/v1/1/'
}
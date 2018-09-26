

const add = function (a,b){
    return a+b;
}
console.log(add(55,1));

const user={
name: 'Manish',
cities: ['Delhi','Thanjavur','Hamilton'],
printPlacesLived(){
    return this.cities.map((city) => this.name + ' has lived in ' + city);
    }
};
console.log(user.printPlacesLived());

const multiplier = {
 numbers : [2,4,5],
 multiplyBy: 3,
 multiply(){
     return this.numbers.map((number) => number*this.multiplyBy + " ");
 }

    // numbers - array of numbers
    //multiplyBy - single number
    // multiply - return a new array where the numbers have been multiplied


};

console.log(multiplier.multiply());
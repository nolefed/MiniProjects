 class Person {
     constructor(name = 'Anonymous', age=0){
        this.name=name;
        this.age=age;
     }

     getGreeting(){
       //  return this.name;
       return `Hi. I am ${this.name}!`;
     }

     getDescription(){
         return `${this.name} is ${this.age} year(s) old`
     }

 }

 class Student extends Person{
    constructor(name,age,major){
        super(name,age);
        this.major=major;
    }
    hasMajor(){
        return !!this.major;
    }
    getDescription(){
        let description = super.getDescription();

        if(this.hasMajor()){
            description = description += `. Their major is ${this.major}. `; 
        }

        return description; 
    }
 }

 class Traveller extends Person{
    constructor(name,age,homeLocation){
        super(name,age);
        this.homeLocation=homeLocation;
    }
    hasHomeLocation(){
        return !!this.homeLocation;
    }
    getGreeting(){
        let greeting= super.getGreeting();
        if(this.hasHomeLocation()){
            greeting= greeting+= `. I am visiting from ${this.homeLocation}. `;
        }

        return greeting;
    }
 }


//const me = new Student('Manish Bhusal', 27, 'Computer Science');
const tr= new Traveller('Manish Bhusal', 27, 'Delhi');
 //console.log(me.getDescription());
 console.log(tr.getGreeting());


 const other = new Traveller();
 console.log(other.getGreeting());


class Human {
	gender = "Male";

	printGender = () => {
		console.log(this.gender);
	};
}

class Person extends Human {
	name = "default";

	introduce = () => "hello, my name is " + this.name + "!";
}

const eunbin = new Person("Eunbin");
console.log(eunbin.name);
console.log(eunbin.introduce());
eunbin.gender = "Female";
eunbin.printGender();

const person = {
	name: "Max",
};

const secondPerson = { ...person };

person.name = "Max2";
console.log(secondPerson.name); // Max2

const numbers = [1, 2, 3];
const doubleNumArray = numbers.map((number) => {
	return number * 2;
});

console.log(doubleNumArray);

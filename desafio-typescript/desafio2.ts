//#### DESAFIO 2 ####

// Como podemos melhorar o esse código usando TS? 

/*let pessoa1 = {};
pessoa1.nome = "maria";
pessoa1.idade = 29;
pessoa1.profissao = "atriz"

let pessoa2 = {}
pessoa2.nome = "roberto";
pessoa2.idade = 19;
pessoa2.profissao = "Padeiro";

let pessoa3 = {
    nome: "laura",
    idade: "32",
    profissao: "Atriz"
};

let pessoa4 = {
    nome = "carlos",
    idade = 19,
    profissao = "padeiro"
} */


interface Person {
    name: string,
    age: number,
    profession
}

const person1 : Person = {
    name: 'Maria',
    age: 29,
    profession: 'Atriz'
}

console.log(person1);

const person2 : Person = {
    name: 'Roberto',
    age: 19,
    profession: 'Padeiro'
}

console.log(person2);

const person3 : Person = {
    name: 'Laura',
    age: 32,
    profession: 'Atriz'
}

console.log(person3);

const person4: Person = {
    name: 'Carlos',
    age: 19,
    profession: 'Padeiro'
}

console.log(person4);
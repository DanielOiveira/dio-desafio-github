/*DESAFIO -> Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso. */


// a função gets() é implementada dentro do sistema para ler as entradas(inputs) dos dados e a função print() para imprimir a saída (output) de dados e já pula uma linha ("\n")
// Abaixo segue um exemplo de código que você pode ou não utilizar
let lines = gets().split('\n');
var N = parseInt(lines.shift());

for (let i = 1; i <= N; i++) {

	if (i % 2 === 0) { //testa se o número é par
	    const result = i * i; //multiplica o indice por ele mesmo (um número elevado ao quadarado é multiplicado por si mesmo)
	    print(`${i}^2 = ${ result }`);
	}
    
}
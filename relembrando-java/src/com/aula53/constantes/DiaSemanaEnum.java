/* Private: A �nica classe que tem acesso ao atributo � a 
pr�pria classe que o define, ou seja, se
uma classe Pessoa declara
* um atributo privado chamado nome, somente a classe Pessoa ter� acesso a ele.

Default: Tem acesso a um atributo default (identificado pela aus�ncia de modificadores) todas as classes que estiverem
no mesmo pacote que a classe que possui o atributo.

Protected: Esse � o que pega mais gente, ele � praticamente igual ao default, com a diferen�a de que se uma
classe (mesmo que esteja fora do pacote) estende da classe 
com o atributo protected, ela ter� acesso a ele. Ent�o o acesso � por pacote e por heran�a.

Public: Esse � f�cil, todos tem acesso :)*/

// aula sobre >>>>> ENUMERADORES
// vantagens do Enum: me garante que os valores atribuido a variavel � exatamente os valores que eu 
// declarei na minha classe 


package com.aula53.constantes;

public enum DiaSemanaEnum {
	SEGUNDA, TERCA , QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
}

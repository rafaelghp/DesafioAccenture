Feature: Desafio T?cnico Accenture

Scenario: Enviar cotacao por email 
	Given Que estou acessando o site para envio de cotacao
	When preencho o formulario da aba vehicle data
	And preencho o formulario da aba insurant data
	And preencho o formulario da aba product data 
	And preencho o formulario da aba price option 
	And preencho o formulario da aba send quote e pressiono send
	Then a cotacao deve ser enviada por email  
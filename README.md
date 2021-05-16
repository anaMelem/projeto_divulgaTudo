## Cadastro de anúncios Divulga Tudo

Esta API Rest foi criada com o intuito de cadastrar anúncios.

## Para executar o programa no seu computador, você precisará ter instalado:
- MySql
- IntelliJ(Ou qualquer outra IDE) 
- Java 11
- Maven
- Postman

## Este projeto foi construido com Spring Boot, utilizando as seguintes dependências:
1. Spring Web 
2. Spring Data JPA
3. Spring MySql Driver

Este API possui apenas uma model. class Cadastro. A mesma recebe como dados: Nome do anúncio, nome do cliente, data de início, data de término e valor investido por dia. 

![Configuração do Spring com Spring Initializr](https://github.com/anaMelem/assets/blob/4e730b3e4a3d6c4b79f0b1a6df28a992b0c54c53/configura%C3%A7%C3%B5es%20Spring.png)

Depois de ser criado o projeto com o Spring Initializr a estrutura do projeto deve ser a seguinte: 

![Estrutura do projeto](https://github.com/anaMelem/assets/blob/901abf5b54be7dfbe7ee8287ff3564dbb3179e47/Setup%20monstor.PNG)

Por último, uma etapa importante é a configuração do banco de dados que será utilizado. Vá em src/main/resources/application.propertties e escreva os seguintes comandos:

![Comandos para criar o banco de dados](https://github.com/anaMelem/assets/blob/0195349d6215ae041b41024640f86c25a4140fdd/banco%20configuration.PNG)


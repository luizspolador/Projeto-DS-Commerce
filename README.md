# Projeto-DS-Commerce

## Curso Java Professional - plataforma DevSuperior

A API Rest DS-Commerce foi desenvolvida em camadas de serviço, acesso a dados e controladores REST, conforme ilustrado na imagem abaixo:

![image](https://github.com/luizspolador/Projeto-DS-Commerce/assets/120989515/3500d1de-60bc-4485-80b0-dd0c5b0cd0c4)

As camadas de serviço e os repositórios são responsáveis pela transação e monitoramento da ORM. Quanto aos Controllers, são responsáveis pelo tráfego simples de dados.

Importante ressaltar que foram utilizados DTO (Data Transfer Object) para a transferência de dados. O DTO não é gerenciado pela ORM e garante maior segurança, flexibilidade e economia no tráfego de dados. 

Outro ponto importante da aplicação é a utilização de códigos de status de resposta HTTP corretos, assim como a criação de um ControllerAdvice para o tratamento global de exceções específicas. 

Vale ressaltar que o projeto desenvolvido é para fins de aprendizado do desenvolvimento de API REST utilizando a linguagem Java.

## Tecnologias utilizadas:
- Java 17
- Spring Boot 3.2.0
- Maven
- Banco de dados relacional

### Especificando conteúdos abordados:
- Componentes e Injeção de Dependência
- Estruturação de projeto, camadas
- Modelo de Domínio
- Relacionamentos
- Mapeamento objeto relacional
- API Rest
- Tratamento de exceções
- Validação de dados
- Consultas ao banco de dados
- Transações
- Login e controle de acesso
- OAuth2, JWT
- Variáveis de ambiente
- Perfis de projeto
- Ambiente local, homologação
- Implantação, CI/CD - **Apenas assistido**

### Softwares utilizados para o desenvolvimento
- IDE IntelliJ IDEA Community 2023
- Postman

### Sobre o projeto

Por hora, não foram realizadas testes automatizados. Contudo, a aplicação foi testada durante e ao final do seu desenvolvimento utilizando a ferramenta Postman.

O Postman foi organizado através da criação de uma Coleção com subpastas e suas respectivas requisições:
![image](https://github.com/luizspolador/Projeto-DS-Commerce/assets/120989515/d299034a-ea67-4de3-9e7f-353c71e1839c)

Também foi criado um ambiente para o controle de variáveis no Postman:
![image](https://github.com/luizspolador/Projeto-DS-Commerce/assets/120989515/b8309072-4170-49fa-97bf-ed0f3a18274e)


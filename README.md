#### Código teste para aprender a utilização de hibernate. Feito pela Ide Netbeans 25, Java with Ant, é um projeto web que usa servlet, html, css e principalmente método hibernate para conexão com banco de dados e classes DAO para métodos de inserção de dados.
#### Foi necessário baixar bibliotecas para usar o hibernate e configuração manual da conexão. Banco de dados, tela e conexão simples para aprendizado.

##### Lista: 
![Captura de tela 2025-04-26 200055](https://github.com/user-attachments/assets/a74d5379-8b44-4ad0-97e9-d895b8c88055)

###### Nomes: 
###### - mysql-connector-j-9.2.0.jar
###### - hibernate-commons-annotations-6.0.6.Final.jar
###### - jakarta.persistence-api-3.1.0.jar
###### - jboss-logging-3.5.3.Final.jar
###### - jakarta.transaction-api-2.0.1.jar classmate-1.5.1.jar
###### - jakarta.xml.bind-api-3.0.1.jar jakarta.activation-api-2.0.1.jar
###### - org.eclipse.persistence.moxy-3.0.2.jar
###### - jaxb-runtime-3.0.2.jar
###### - jaxb-core-3.0.2.jar
###### - istack-commons-runtime-4.1.1.jar
###### - c3p0-0.9.5.5.jar
###### - mchange-commons-java-0.2.20.jar hibernate-core-6.6.9.Final.jar
###### - hibernate-c3p0-6.6.9.Final.jar
###### - byte-buddy-1.14.14.jar
###### - byte-buddy-agent-1.14.14.jar
###### - antlr4-runtime-4.13.1.jar
###### - JDK 21 (Default)
###### - Apache Tomcat or TomEE

##### Banco de dados usado: 
##### create database teste;
##### use teste;
##### create table cliente (
#####	idcliente int auto_increment primary key,
#####    nome varchar(10),
#####    email varchar(50);
)

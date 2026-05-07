CRUD

Faça um projecto usando uma IDE;
Crie  2 pacotes um chamado "db" e outro chamado "program";
No pacote "db" coloque os ficheiros DB.java e DbException;
No pacote "program" coloque o ficheiro Program.java;
Na pasta libs coloque o mysql-connector-j-8.2.0.jar ou a outra versão;
Importe também o ficheiro db.properties;
Por fim, no XAMPP ou MySQLWorkbench dê start no seu servidor SQL;
Por fim rode o program.java;

//NOTA:O CRUD AINDA ESTÁ EM DESENVOLVIMENTO

No terminal coloque para compilar:
javac -cp ".;mysql-connector-j-9.0.7.jar" Connection.java
Para rodar:
java -cp ".;mysql-connector-j-x.x.x.jar" Connection

ou
javac -classpath mysql-connector-j-9.0.7.jar Connection.java para compilar
e
javac -classpath .:mysql-connector-j-9.0.7.jar Connection para rodar

Se não quiseres escrever o comando longo sempre que testares:Cria uma pasta fixa (ex: C:\java_libs).Copia o .jar para lá.Pesquisa no Windows por "Variáveis de Ambiente".Edita a variável CLASSPATH (ou cria uma nova) e adiciona o caminho: .;C:\java_libs\mysql-connector-j-x.x.x.jar.


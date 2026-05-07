***DDL***

**CREATE:** Cria um novo objeto, como uma base de dados ou tabela.

&#x09;**Exemplo:** CREATE TABLE usuarios (id INT, nome VARCHAR(50));

**ALTER:** Modifica a estrutura de um objeto existente.

&#x09;**Exemplo:** ALTER TABLE usuarios ADD email VARCHAR(100);

**DROP:** Exclui um objeto (tabela ou banco) definitivamente.

&#x09;**Exemplo:** DROP TABLE usuarios;

**TRUNCATE:** Remove todos os dados de uma tabela, mas mantém a estrutura.

&#x09;**Exemplo:** TRUNCATE TABLE usuarios;



***DML***

**INSERT:** Insere novos dados em uma tabela.

&#x09;**Exemplo:** INSERT INTO usuarios (id, nome) VALUES (1, 'Ana');

**UPDATE:** Atualiza registros existentes.

&#x09;**Exemplo:** UPDATE usuarios SET nome = 'Beatriz' WHERE id = 1;

**DELETE:** Exclui registros de uma tabela.

&#x09;**Exemplo:** DELETE FROM usuarios WHERE id = 1;


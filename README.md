# 𝗣𝗿𝗼𝗷𝗲𝘁𝗼 𝗝𝗮𝘃𝗮 + 𝗠𝘆𝗦𝗤𝗟 🖥️

Este projeto foi criado como parte dos meus estudos no curso de Java, ministrado pelo professor Nélio Alves. Agradeço ao professor pelos valiosos ensinamentos! 🙏

## 📚 𝗗𝗲𝘀𝗰𝗿𝗶𝗰̧𝗮̃𝗼

Este projeto tem como objetivo demonstrar a integração de um sistema Java com um banco de dados MySQL. Ele utiliza JDBC para a comunicação com o banco de dados, com foco em conceitos como manipulação de dados e operações CRUD (Create, Read, Update, Delete). As duas principais entidades do sistema são 𝗦𝗲𝗹𝗹𝗲𝗿 (Vendedor) e 𝗗𝗲𝗽𝗮𝗿𝘁𝗺𝗲𝗻𝘁 (Departamento).

## 🚀 𝗧𝗲𝗰𝗻𝗼𝗹𝗼𝗴𝗶𝗮𝘀 𝗨𝘁𝗶𝗹𝗶𝘇𝗮𝗱𝗮𝘀

- 𝗝𝗮𝘃𝗮: Linguagem principal usada no desenvolvimento do projeto.
- 𝗝𝗗𝗕𝗖: API usada para a interação com o banco de dados.
- 𝗠𝘆𝗦𝗤𝗟: Sistema de gerenciamento de banco de dados relacional.
- 𝗚𝗶𝘁: Controle de versão do código.

## 📂 𝗘𝘀𝘁𝗿𝘂𝘁𝘂𝗿𝗮 𝗱𝗼 𝗣𝗿𝗼𝗷𝗲𝘁𝗼

O projeto está organizado da seguinte forma:

- 𝘴𝘳𝘤: Contém os arquivos fontes Java.

- 𝘦𝘯𝘵𝘪𝘵𝘪𝘦𝘴: Classes que representam as entidades Seller e Department.

- 𝘥𝘢𝘰: Classes que fazem a interação direta com o banco de dados.

- 𝘥𝘣: Classe responsável pela configuração da conexão com o MySQL.

## 💾 𝗕𝗮𝗻𝗰𝗼 𝗱𝗲 𝗗𝗮𝗱𝗼𝘀

O banco de dados MySQL contém duas tabelas principais:

- Department: Representa os departamentos da empresa.

- Seller: Representa os vendedores, com uma chave estrangeira que faz referência ao departamento ao qual pertencem.

## ⚙️ 𝗙𝘂𝗻𝗰𝗶𝗼𝗻𝗮𝗹𝗶𝗱𝗮𝗱𝗲𝘀

- Listar, adicionar, atualizar e remover vendedores e departamentos.
- Consultar departamentos por nome.
- Consultar vendedores por departamento.
- Realizar operações de 𝗖𝗥𝗨𝗗 com 𝗝𝗗𝗕𝗖.

<img src="https://images.even3.com.br/m7WTPFGA7q2Zl536dowm5sGPqIg=/1100x440/smart/even3.blob.core.windows.net/banner/WhatsAppImage2023-10-18at11.41.18.775d16c04c00409c9296.jpeg" alt="Texto Alternativo">

# _TECH.WEEK1.0 UNIFACISA_
Cidade: Campina Grande / Paraíba
Local: UNIFACISA - Centro Universitário


O evento Tech. Week1.0 Unifacisa, foi idealizado pelas coordenações dos cursos: Jogos Digitais, Sistemas de Informação e Ciências Aeronáuticas em alinhamento à Semana da Tecnologia, com o o objetivo de Integrar as comunidades acadêmicas de Sistemas de Informação e Jogos Digitais da Unifacisa no desenvolvimento de ações de produção, ensino e pesquisa em temas relacionados à tecnologia. Será realizado no período de 24 a 27 de outubro de 2023, na Unifacisa, com previsão de 1000 participantes, entre alunos, professores e coordenadores dos cursos. A programação conta com as atividades: Pocket Show, Oficinas, Mesa Redonda, Palestras, Apresentação de Livro e Gamejam/Hackathon.


🤵 Coordenação do Curso de Sistemas da Informação:
Professor Fabrício Dias

<img src="https://images.even3.com.br/yWEik4_yJlWJWYylKBI9n5f0XEQ=/150x150/smart/even3.blob.core.windows.net/geral/Fabrcio_Dias.JPG.cdf9998dc5274c73879a.jpg">


👷 Equipe Esse projeto foi desenvolvido com a colaboração:
>- Francinaldo Batista da Silva Filho 
>- Gigliárly Marcelino 
>- Gustavo Tomio Magalhães Kubo 
>- Jose Carlos dos Santos Medeiros
>- Márcio Vitor de Souza Nascimento 
>- Sérgio Magno Castor Pinheiro 

🚀 Tecnologias Esse projeto foi desenvolvido com as seguintes tecnologias:
A API deve ser feito com uso das seguintes tecnologias e frameworks:
• Linguagem de Programação Java
• Spring Boot Framework
• Banco de Dados Relacional MySQL ou PostgreSQL


💻 Projeto : Principais Funcionalidades
As principais funcionalidades a serem implementadas são:
- Registro e gerenciamento de chaves de endereçamento PIX;
- Processamento de transações de pagamento e transferência PIX;
- Autenticação e autorização de instituições financeiras e usuários finais; e
- Consulta de informações de transações e histórico de pagamentos.

🗃️ Detalhes sobre as APIs Necessárias para o Sistema PIX


📑 1. Registro e Gerenciamento de Chaves PIX:
- POST /api/pix/chaves - Registra uma nova chave PIX para um usuário ou instituição financeira
específica.
- GET /api/pix/chaves/{id} - Obtém os detalhes de uma chave PIX específica com o ID fornecido.
- PUT /api/pix/chaves/{id} - Atualiza os detalhes de uma chave PIX existente identificada pelo ID
fornecido.
- DELETE /api/pix/chaves/{id} - Remove uma chave PIX específica com o ID fornecido.

📱 2. Processamento de Transações PIX:
- POST /api/pix/transacoes/pagamento - Inicia uma nova transação de pagamento PIX.
- POST /api/pix/transacoes/transferencia - Inicia uma nova transação de transferência PIX.
- GET /api/pix/transacoes/{id} - Obtém os detalhes de uma transação PIX específica com o ID fornecido.
- GET /api/pix/transacoes/historico/{usuarioId} - Obtém o histórico de transações PIX para um
usuário específico com base no ID do usuário.
- GET /api/pix/transacoes/status/{id} - Obtém o status atual de uma transação PIX com o ID
fornecido.

💰 3. Autenticação e Autorização:
- POST /api/pix/autenticacao/usuario - Permite que um usuário se autentique no sistema PIX.
- POST /api/pix/autenticacao/instituicao - Permite que uma instituição financeira se autentique
no sistema PIX.


Cada endpoint terá parâmetros específicos e cabeçalhos de autenticação que devem ser fornecidos para
realizar com sucesso as operações desejadas. Além disso, os códigos de status HTTP apropriados serão
utilizados para indicar o resultado de cada solicitação, como 200 OK para solicitações bem-sucedidas, 400
Bad Request para solicitações inválidas, 401 Unauthorized para solicitações não autorizadas e assim por
diante.
Além disso, os endpoints devem ser protegidos por medidas de segurança apropriadas, visando garantir
que apenas usuários e instituições financeiras autorizadas possam acessar e interagir com o sistema PIX.
Implementar validação de entrada e gerenciamento de erros adequados também é crucial para garantir
a confiabilidade e a segurança do sistema.

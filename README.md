Atividade da disciplina de Padrões de Projeto – Mediator
O projeto desenvolvido aplica o padrão Mediator em um cenário de URA de telemarketing, simulando o funcionamento de uma ouvidoria que recebe e direciona reclamações, elogios e sugestões dos clientes para os setores internos adequados.
A ideia central é demonstrar como o Mediator atua como intermediário na comunicação entre objetos, reduzindo o acoplamento e organizando o fluxo de mensagens dentro do sistema.

No modelo proposto, a classe Ouvidoria funciona como o mediador principal, responsável por receber as solicitações dos clientes e encaminhá-las para o setor correto (Financeiro, Atendimento ou Técnico).
Cada setor implementa a interface Setor, que define os métodos para tratar diferentes tipos de mensagens. O cliente, representado pela classe Cliente, interage apenas com a ouvidoria, sem precisar conhecer diretamente os setores internos.

Escolhi o cenário de telemarketing porque ele reflete bem a lógica de comunicação centralizada: o cliente faz contato com um único ponto (a ouvidoria), e o sistema decide automaticamente para onde encaminhar cada demanda.
Isso torna o uso do Mediator ideal para organizar interações complexas, facilitar manutenção e garantir que cada parte do sistema permaneça independente e bem estruturada.

Diagrama UML - https://drive.google.com/file/d/1PHM224xuDzlbQE9_T8PQf8LU7AewuVZP/view?usp=sharing

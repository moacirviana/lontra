INSERT INTO produto (id, descricao, preco, ativo) VALUES (100, 'Caneta Azul', 1.50, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (101, 'Caderno Espiral', 12.90, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (102, 'Lápis Preto', 0.80, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (103, 'Borracha Branca', 2.50, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (104, 'Régua Plástica', 5.00, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (105, 'Estojo Escolar', 15.75, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (106, 'Mochila Escolar', 89.90, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (107, 'Tesoura Escolar', 7.30, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (108, 'Apontador Metal', 3.20, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (109, 'Cola Bastão', 4.10, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (110, 'Papel Sulfite A4', 18.50, 1);

INSERT INTO cliente (id, nome, ativo, celular, cep) VALUES (100, 'CLIENTE 01', 1,'123-123', '69');
INSERT INTO cliente (id, nome, ativo, celular, cep) VALUES (200, 'CLIENTE 02', 1,'321-321','68');
INSERT INTO cliente (id, nome, ativo, celular, cep) VALUES (300, 'CLIENTE 03', 0,'321-321','68');

INSERT INTO pedido(id, datacad, id_cliente) values(100, '2025-01-01', 100);
INSERT INTO pedido(id, datacad, id_cliente) values(200, '2025-01-01', 200);
INSERT INTO pedido(id, datacad, id_cliente) values(300, '2024-01-01', 300);

INSERT INTO item_pedido(preco_unitario, quantidade, pedido_id, produto_id) values ( 1.5,  1, 100, 100);
INSERT INTO item_pedido(preco_unitario, quantidade, pedido_id, produto_id) values ( 12.90, 2, 100, 101);
INSERT INTO item_pedido(preco_unitario, quantidade, pedido_id, produto_id) values ( 0.80, 1, 200, 102);

INSERT INTO item_pedido(preco_unitario, quantidade, pedido_id, produto_id) values ( 3.20, 1, 300, 108);
INSERT INTO item_pedido(preco_unitario, quantidade, pedido_id, produto_id) values ( 18.50, 2, 300, 110);

INSERT INTO produto (id, descricao, preco, ativo) VALUES (111, 'Grampeador Grande', 25.00, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (112, 'Clips Metálicos', 6.90, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (113, 'Fita Adesiva', 2.80, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (114, 'Marcador Permanente', 9.70, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (115, 'Calculadora Básica', 35.00, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (116, 'Agenda Anual', 22.50, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (117, 'Post-it Colorido', 10.90, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (118, 'Corretivo Líquido', 8.40, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (119, 'Caneta Hidrográfica', 14.00, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (120, 'Pincel Atômico', 11.20, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (121, 'Lapiseira 0.7mm', 17.50, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (122, 'Grafite 0.5mm', 4.80, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (123, 'Bloco de Notas', 13.90, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (124, 'Envelope Kraft', 0.90, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (125, 'Pasta Suspensa', 20.00, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (126, 'Perfurador Papel', 16.50, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (127, 'Durex Transparente', 3.50, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (128, 'Fita Crepe', 5.20, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (129, 'Papel Cartão', 2.30, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (130, 'Tinta Guache', 19.90, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (131, 'Canoa de Papel', 12.50, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (132, 'Folha EVA', 6.70, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (133, 'Massa de Modelar', 10.00, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (134, 'Lousa Portátil', 45.00, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (135, 'Quadro Branco', 75.00, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (136, 'Caneta Quadro Branco', 8.90, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (137, 'Pastilha de Giz', 3.10, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (138, 'Jogo de Régua Técnica', 30.00, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (139, 'Compasso Escolar', 15.00, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (140, 'Transferidor Plástico', 4.50, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (141, 'Prancheta Plástica', 25.00, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (142, 'Caixa Organizadora', 35.00, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (143, 'Porta Retrato Digital', 120.00, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (144, 'Relógio de Parede', 50.00, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (145, 'Luminária LED', 65.00, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (146, 'Carregador Portátil', 80.00, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (147, 'Mouse Sem Fio', 40.00, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (148, 'Teclado Mecânico', 150.00, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (149, 'Headset Gamer', 120.00, 1);


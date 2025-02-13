
INSERT INTO produto (id, descricao, preco, ativo) VALUES (1, 'PRODUTO 01', 10.5, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (2, 'PRODUTO 02', 11.51, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (3, 'PRODUTO 03', 12.52, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (4, 'PRODUTO 04', 14.54, 1);
	
INSERT INTO cliente (id, nome, ativo, celular, cep) VALUES (1, 'CLIENTE 01', 1,'123-123', '69');
INSERT INTO cliente (id, nome, ativo, celular, cep) VALUES (2, 'CLIENTE 02', 1,'321-321','68');

INSERT INTO pedido(id, datacad, id_cliente) values(1, '2025-01-01', 1);
INSERT INTO pedido(id, datacad, id_cliente) values(2, '2025-01-01', 2);
INSERT INTO pedido(id, datacad, id_cliente) values(3, '2024-01-01', 1);

INSERT INTO item_pedido(id, preco_unitario, quantidade, pedido_id, produto_id) values (1, 10.5,  1, 1, 1);
INSERT INTO item_pedido(id, preco_unitario, quantidade, pedido_id, produto_id) values (2, 11.51, 2, 1, 2);
INSERT INTO item_pedido(id, preco_unitario, quantidade, pedido_id, produto_id) values (3, 12.52, 1, 1, 3);

INSERT INTO item_pedido(id, preco_unitario, quantidade, pedido_id, produto_id) values (4, 12.52, 1, 2, 3);
INSERT INTO item_pedido(id, preco_unitario, quantidade, pedido_id, produto_id) values (5, 14.54, 2, 2, 4);


INSERT INTO produto (id, descricao, preco, ativo) VALUES (5, 'Apontado de lápis', 10.5, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (6, 'Regua', 11.65, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (7, 'Caderno sem pautas', 7.30, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (8, 'Caneta 1.0', 24.54, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (9, 'Cola de isopor', 100.28, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (10, 'Fichários', 101.51, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (11, 'Borrachas', 102.52, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (12, 'Estojo lapis de cor n.20', 74.34, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (13, 'Marca texto kit com 3', 80.15, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (14, 'Tesoura de papel', 91.51, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (15, 'Adesivos para crianças', 22.22, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (16, 'Pentel giz cores diversas', 44.24, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (17, 'Whey Protein isolado 900g', 50.15, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (18, 'Processador de alimento', 61.51, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (19, 'Óleo pra banho Paixão', 72.92, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (20, 'Sanduicheira Elétrica 127v', 124.64, 1);


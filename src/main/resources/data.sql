INSERT INTO cliente (id, nome, ativo, celular, cep) VALUES (NEXT VALUE FOR PROX_ID, 'MARIA DE SOUZA', 1,'123-123', '69');
INSERT INTO cliente (id, nome, ativo, celular, cep) VALUES (NEXT VALUE FOR PROX_ID, 'PEDRO SANTOS', 1,'321-321','68');

INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'RESMA PAPEL  A4', 10.5, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'FOLHA ISOPOR 3x3', 11.51, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'TINTA PAPEL', 12.52, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'CARGA GRAFITE .5', 14.54, 1);
	
INSERT INTO pedido(id, datacad, id_cliente) values(NEXT VALUE FOR PROX_ID, '2025-01-01', 1);
INSERT INTO pedido(id, datacad, id_cliente) values(NEXT VALUE FOR PROX_ID, '2025-01-01', 2);
-- INSERT INTO pedido(id, datacad, id_cliente) values(NEXT VALUE FOR PROX_ID, '2024-01-01', 1);


INSERT INTO item_pedido(id, preco_unitario, quantidade, pedido_id, produto_id) values (NEXT VALUE FOR PROX_ID, 10.5,  1, 7, 3);
INSERT INTO item_pedido(id, preco_unitario, quantidade, pedido_id, produto_id) values (NEXT VALUE FOR PROX_ID, 11.51, 2, 7, 4);
INSERT INTO item_pedido(id, preco_unitario, quantidade, pedido_id, produto_id) values (NEXT VALUE FOR PROX_ID, 12.52, 1, 7, 5);

INSERT INTO item_pedido(id, preco_unitario, quantidade, pedido_id, produto_id) values (NEXT VALUE FOR PROX_ID, 12.52, 1, 8, 4);
INSERT INTO item_pedido(id, preco_unitario, quantidade, pedido_id, produto_id) values (NEXT VALUE FOR PROX_ID, 14.54, 2, 8, 5);


INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'Apontado de lápis', 10.5, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'Regua', 11.65, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'Caderno sem pautas', 7.30, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'Caneta 1.0', 24.54, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'Cola de isopor', 100.28, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'Fichários', 101.51, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'Borrachas', 102.52, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'Estojo lapis de cor n.20', 74.34, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'Marca texto kit com 3', 80.15, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'Tesoura de papel', 91.51, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'Adesivos para crianças', 22.22, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'Pentel giz cores diversas', 44.24, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'Whey Protein isolado 900g', 50.15, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'Processador de alimento', 61.51, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'Óleo pra banho Paixão', 72.92, 1);
INSERT INTO produto (id, descricao, preco, ativo) VALUES (NEXT VALUE FOR PROX_ID, 'Sanduicheira Elétrica 127v', 124.64, 1);

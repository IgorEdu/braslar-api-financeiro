create table pedidos(

    id bigint not null auto_increment,
    id_empresa bigint not null,
    numero_pedido varchar(30) not null,
    codigo_cliente varchar(30) not null,
    codigo_produto varchar(30) not null,
    data_emissao varchar(30) not null,
    data_entrega varchar(30) not null,
    condicao_pagamento varchar(100),
    sinal decimal(15,5),
    sinal_parcelado varchar(30),
    pedido_carregado varchar(30),
    codigo_transportadora varchar(30),
    operacao_contabil varchar(30),
    natureza_operacao varchar(30),

    primary key(id)

);
create table contas_pagar(

    id bigint not null auto_increment,
    id_empresa bigint not null,
    banco bigint not null,
    razao_banco varchar(50) not null,
    data_emissao varchar(30) not null,
    data_vencimento varchar(30) not null,
    data_recebimento varchar(30) not null,
    documento varchar(30) not null,
    parcela varchar(500),
    status varchar(10),
    codigo_fornecedor varchar(30),
    razao_fornecedor varchar(100),
    valor decimal(15, 5),
    codigo_centro_custo varchar(30),
    descricao_centro_custo varchar(50),
    codigo_conta_gerencial varchar(30),
    descricao_conta_gerencial varchar(50),

    primary key(id)

);

CREATE DATABASE TourGuide;

USE TourGuide;
CREATE TABLE Usuario (
    idUsuario INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255),
    idade INT,
    numeroDocumento VARCHAR(255),
    genero VARCHAR(50),
    telefone VARCHAR(50),
    endereco VARCHAR(255),
    perfil VARCHAR(255),
    permissao BOOLEAN
);

CREATE TABLE Historico (
    idHistorico INT PRIMARY KEY AUTO_INCREMENT,
    usuarioAssociado INT,
    listaDeViagens VARCHAR(255),
    FOREIGN KEY (usuarioAssociado) REFERENCES Usuario(idUsuario)
);

CREATE TABLE Bonificacao (
    idBonificacao INT PRIMARY KEY AUTO_INCREMENT,
    pontosDeBonificacao INT,
    usuarioAssociado INT,
    FOREIGN KEY (usuarioAssociado) REFERENCES Usuario(idUsuario)
);

CREATE TABLE Login (
    idLogin INT PRIMARY KEY AUTO_INCREMENT,
    usuario VARCHAR(255),
    dataCadastro DATE,
    email VARCHAR(255),
    senha VARCHAR(255)
);

CREATE TABLE Preferencias (
    idPreferencias INT PRIMARY KEY AUTO_INCREMENT,
    tipoLocal VARCHAR(255),
    climaPreferido VARCHAR(255),
    atrativosTuristicos VARCHAR(255),
    frequenciaViagem INT,
    destinosPreferidos VARCHAR(255),
    distancia DOUBLE
);

CREATE TABLE AdministradorSistema (
    idAdmin INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255),
    email VARCHAR(255),
    senha VARCHAR(255),
    nivelAcesso VARCHAR(50),
    telefone INT
);

CREATE TABLE Destino (
    idDestino INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255),
    descricao VARCHAR(255),
    localizacao VARCHAR(255),
    duracaoViagem TIME,
    custoMedio DOUBLE,
    clima VARCHAR(255),
    avaliacao INT,
    recomendacao BOOLEAN
);

CREATE TABLE Rota (
    idRota INT PRIMARY KEY AUTO_INCREMENT,
    origem VARCHAR(255),
    destino VARCHAR(255),
    distancia DOUBLE,
    tempoEstimado TIME,
    pontosDeParada VARCHAR(255),
    condicoesRota VARCHAR(255)
);

CREATE TABLE MeioTransporte (
    idTransporte INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255),
    capacidade INT,
    preco FLOAT,
    quilometragem DOUBLE,
    tempoGasto FLOAT,
    disponibilidade BOOLEAN
);

CREATE TABLE Trajeto (
    idTrajeto INT PRIMARY KEY AUTO_INCREMENT,
    inicioTrajeto TIME,
    fimTrajeto TIME,
    tempo TIME
);

CREATE TABLE Restaurantes (
    idRestaurante INT PRIMARY KEY AUTO_INCREMENT,
    funcionamento VARCHAR(255)
);

CREATE TABLE AtracoesTuristicas (
    idAtracao INT PRIMARY KEY AUTO_INCREMENT,
    atracoesDiarias VARCHAR(255)
);

CREATE TABLE Hospedagem (
    idHospedagem INT PRIMARY KEY AUTO_INCREMENT,
    disponibilidade VARCHAR(255)
);

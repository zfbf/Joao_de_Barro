
DROP INDEX XIF1ARQUIVO_REFERENCIADO_PONTO_FUNCAO;

DROP INDEX XIF1CATEGORIA_OPERACIONAL_TI;

DROP INDEX XAK1CATEGORIA_OPERACIONAL_TI;

DROP INDEX XAK2CATEGORIA_OPERACIONAL_TI;

DROP INDEX XIF1CATEGORIA_PRODUTO_TI;

DROP INDEX XAK1CATEGORIA_PRODUTO_TI;

DROP INDEX XAK2CATEGORIA_PRODUTO_TI;

DROP INDEX XIF1CICLO_FILA_DEMANDA_TI;

DROP INDEX XIF1CONSULTA_PEDIDO_TI;

DROP INDEX XIF2CONTAGEM_APLICACAO;

DROP INDEX XIF1CONTAGEM_PONTOS_FUNCAO;

DROP INDEX XIF2CONTAGEM_PROJETO_MELHORIA;

DROP INDEX XIF1ESFORCO_PEDIDO_TI;

DROP INDEX XIF2ESFORCO_PEDIDO_TI;

DROP INDEX XAK1ESTADO_PEDIDO_TI;

DROP INDEX XAK2ESTADO_PEDIDO_TI;

DROP INDEX XAK1ESTADO_PROBLEMA_TI;

DROP INDEX XAK2ESTADO_PROBLEMA_TI;

DROP INDEX XAK1FILA_DEMANDA_TI;

DROP INDEX XAK2FILA_DEMANDA_TI;

DROP INDEX XIF2FUNCAO_DADOS_PONTOS_FUNCAO;

DROP INDEX XIF2FUNCAO_TRANSACAO_PONTOS_FUNCAO;

DROP INDEX XIF1GRUPO_DADOS_PONTO_FUNCAO;

DROP INDEX XIF2GRUPO_DADOS_PONTO_FUNCAO;

DROP INDEX XAK1GRUPO_ESTADO_PEDIDO_TI;

DROP INDEX XAK2GRUPO_ESTADO_PEDIDO_TI;

DROP INDEX XIF1GRUPO_OPERACIONAL;

DROP INDEX XAK1GRUPO_OPERACIONAL;

DROP INDEX XAK2GRUPO_OPERACIONAL;

DROP INDEX XIF3ITEM_CONTAGEM_PONTOS_FUNCAO;

DROP INDEX XIF4ITEM_CONTAGEM_PONTOS_FUNCAO;

DROP INDEX XIF3NOTES_CONSULTA;

DROP INDEX XIF3NOTES_EXECUTOR;

DROP INDEX XIF3NOTES_HOMOLOGACAO;

DROP INDEX XIF3NOTES_PEDIDO;

DROP INDEX XIF3NOTES_VALIDACAO;

DROP INDEX XIF1PEDIDO_TI;

DROP INDEX XIF2PEDIDO_TI;

DROP INDEX XAK1PEDIDO_TI;

DROP INDEX XAK2PEDIDO_TI;

DROP INDEX XIF3PEDIDO_TI;

DROP INDEX XIF4PEDIDO_TI;

DROP INDEX XIF1PROBLEMA_TI;

DROP INDEX XIF2PROBLEMA_TI;

DROP INDEX XIF1PROCESSO_ELEMENTAR_PONTO_FUNCAO;

DROP INDEX XIF2PROCESSO_ELEMENTAR_PONTO_FUNCAO;

DROP INDEX XAK1PROCESSAMENTO_INTERNO_GDE;

DROP INDEX XIF1REMEDY_HPD_AUDIT_LOG_SYSTEM;

DROP INDEX XIF2REMEDY_HPD_AUDIT_LOG_SYSTEM;

DROP INDEX XIF1REMEDY_HPD_HELP_DESK;

DROP INDEX XIF2REMEDY_HPD_HELP_DESK;

DROP INDEX XIF1REMEDY_PBM_PROBLEM_INVESTIGATION;

DROP INDEX XIF2REMEDY_PBM_PROBLEM_INVESTIGATION;

DROP INDEX XAK1TIPO_CONTAGEM_PONTOS_FUNCAO;

DROP INDEX XIF1TIPO_DADO_PONTO_FUNCAO;

DROP INDEX XAK1TIPO_DADO_PONTO_FUNCAO;

DROP INDEX XIF2TIPO_DADO_PONTO_FUNCAO;

DROP INDEX XAK1TIPO_ESFORCO_PEDIDO_TI;

DROP INDEX XAK2TIPO_ESFORCO_PEDIDO_TI;

DROP INDEX XIF1TIPO_PEDIDO_TI;

DROP INDEX XAK2TIPO_PEDIDO_TI;

DROP INDEX XAK1_CAD_TIP_PDID_TI;

DROP INDEX XIF1TIPO_REGISTRO_PONTO_FUNCAO;

DROP INDEX XAK1TIPO_REGISTRO_PONTO_FUNCAO;

DROP INDEX XIF1TRANSICAO_ESTADO_PEDIDO_TI;

DROP INDEX XIF2TRANSICAO_ESTADO_PEDIDO_TI;

DROP INDEX XIF3TRANSICAO_ESTADO_PEDIDO_TI;

DROP INDEX XIF1TRANSICAO_ESTADO_PROBLEMA_TI;

DROP INDEX XIF2TRANSICAO_ESTADO_PROBLEMA_TI;

DROP INDEX XAK1CONTROLE_CARGA_GDE;

DROP INDEX XIF1HISTORICO_NOTES_CONSULTA;

DROP INDEX XIF2HISTORICO_NOTES_CONSULTA;

DROP INDEX XIF1HISTORICO_NOTES_EXECUTOR;

DROP INDEX XIF2HISTORICO_NOTES_EXECUTOR;

DROP INDEX XIF1HISTORICO_NOTES_HOMOLOGACAO;

DROP INDEX XIF2HISTORICO_NOTES_HOMOLOGACAO;

DROP INDEX XIF1HISTORICO_NOTES_PEDIDO;

DROP INDEX XIF2HISTORICO_NOTES_PEDIDO;

DROP INDEX XIF1HISTORICO_NOTES_VALIDACAO;

DROP INDEX XIF2HISTORICO_NOTES_VALIDACAO;

DROP INDEX XIF1HISTORICO_REMEDY_HPD_AUDIT_LOG_SYSTEM;

DROP INDEX XIF2HISTORICO_REMEDY_HPD_AUDIT_LOG_SYSTEM;

DROP INDEX XIF1HISTORICO_REMEDY_HPD_HELP_DESK;

DROP INDEX XIF2HISTORICO_REMEDY_HPD_HELP_DESK;

DROP INDEX XIF1HISTORICO_REMEDY_PBM_PROBLEM_INVESTIGATION;

DROP INDEX XIF2HISTORICO_REMEDY_PBM_PROBLEM_INVESTIGATION;

DROP INDEX XIF1AGRUPAMENTO_ESTADO_PEDIDO_TI;

DROP INDEX XIF2AGRUPAMENTO_ESTADO_PEDIDO_TI;

DROP INDEX XIF1PEDIDO_TI_CICLO_FILA_DEMANDA_TI;

DROP INDEX XIF2PEDIDO_TI_CICLO_FILA_DEMANDA_TI;

DROP INDEX XIF1PROBLEMA_PEDIDO_TI;

DROP INDEX XIF2PROBLEMA_PEDIDO_TI;

CREATE TABLE CAD_ARQ_REFDO_PNT_FNC
(
	ide_arq_refdo_pnt_fnc INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	nom_arq_refdo_pnt_fnc VARCHAR(64) NOT NULL,
	des_comen_arq_refdo_pnt_fnc LONG VARCHAR NULL,
	ide_procs_elemtar_pnt_fnc INTEGER NULL
);

ALTER TABLE CAD_ARQ_REFDO_PNT_FNC
ADD PRIMARY KEY (ide_arq_refdo_pnt_fnc);

CREATE INDEX XIF1ARQUIVO_REFERENCIADO_PONTO_FUNCAO ON CAD_ARQ_REFDO_PNT_FNC
(
	ide_procs_elemtar_pnt_fnc
);

CREATE TABLE CAD_CATEG_OPECL_TI
(
	ide_categ_opecl_ti   INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_categ_opecl_ti_super INTEGER NULL,
	nom_categ_opecl_ti   varchar(64) NOT NULL,
	nom_abrv_categ_opecl_ti varchar(16) NOT NULL
);

ALTER TABLE CAD_CATEG_OPECL_TI
ADD PRIMARY KEY (ide_categ_opecl_ti);

CREATE INDEX XIF1CATEGORIA_OPERACIONAL_TI ON CAD_CATEG_OPECL_TI
(
	ide_categ_opecl_ti_super
);

CREATE UNIQUE INDEX XAK1CATEGORIA_OPERACIONAL_TI ON CAD_CATEG_OPECL_TI
(
	nom_categ_opecl_ti,	ide_categ_opecl_ti_super
);

CREATE UNIQUE INDEX XAK2CATEGORIA_OPERACIONAL_TI ON CAD_CATEG_OPECL_TI
(
	nom_abrv_categ_opecl_ti,	ide_categ_opecl_ti_super
);

CREATE TABLE CAD_CATEG_PRDT_TI
(
	ide_categ_prdt_ti    INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_categ_prdt_ti_super INTEGER NULL,
	nom_categ_prdt_ti    varchar(64) NOT NULL,
	nom_abrv_categ_prdt_ti varchar(32) NOT NULL
);

ALTER TABLE CAD_CATEG_PRDT_TI
ADD PRIMARY KEY (ide_categ_prdt_ti);

CREATE INDEX XIF1CATEGORIA_PRODUTO_TI ON CAD_CATEG_PRDT_TI
(
	ide_categ_prdt_ti_super
);

CREATE UNIQUE INDEX XAK1CATEGORIA_PRODUTO_TI ON CAD_CATEG_PRDT_TI
(
	nom_categ_prdt_ti,	ide_categ_prdt_ti_super
);

CREATE UNIQUE INDEX XAK2CATEGORIA_PRODUTO_TI ON CAD_CATEG_PRDT_TI
(
	nom_abrv_categ_prdt_ti,	ide_categ_prdt_ti_super
);

CREATE TABLE CAD_CICLO_FILA_DMNDA_TI
(
	ide_ciclo_fila_dmnda_ti INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_fila_dmnda_ti    INTEGER NOT NULL,
	dat_ini_ciclo        BINARY(8) NOT NULL,
	dat_final_ciclo      BINARY(8) NULL,
	ind_atv              CHAR(1) NOT NULL DEFAULT 'N' CONSTRAINT ind_atv CHECK ( [ind_atv] ='N' or [ind_atv] = 'S' )
);

ALTER TABLE CAD_CICLO_FILA_DMNDA_TI
ADD PRIMARY KEY (ide_ciclo_fila_dmnda_ti);

CREATE INDEX XIF1CICLO_FILA_DEMANDA_TI ON CAD_CICLO_FILA_DMNDA_TI
(
	ide_fila_dmnda_ti
);

CREATE TABLE CAD_CNSLT_PDID_TI
(
	ide_cnslt_pdid_ti    INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_pdid_ti          INTEGER NOT NULL,
	dat_solic            BINARY(8) NOT NULL,
	dat_fechmnt          BINARY(8) NULL
);

ALTER TABLE CAD_CNSLT_PDID_TI
ADD PRIMARY KEY (ide_cnslt_pdid_ti);

CREATE INDEX XIF1CONSULTA_PEDIDO_TI ON CAD_CNSLT_PDID_TI
(
	ide_pdid_ti
);

CREATE TABLE CAD_CONTGM_APLIC
(
	ide_categ_prdt_ti    INTEGER NULL,
	ide_contgm_aplic     INTEGER NOT NULL
);

ALTER TABLE CAD_CONTGM_APLIC
ADD PRIMARY KEY (ide_contgm_aplic);

CREATE INDEX XIF2CONTAGEM_APLICACAO ON CAD_CONTGM_APLIC
(
	ide_categ_prdt_ti
);

CREATE TABLE CAD_CONTGM_PNT_FNC
(
	ide_contgm_pnt_fnc   INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_tip_contgm_pnt_fnc INTEGER NULL,
	nom_login_resp_contgm_pnt_fnc varchar(16) NULL,
	dat_ini_contgm_pnt_fnc BINARY(8) NULL,
	dat_fim_contgm_pnt_fnc BINARY(8) NULL,
	des_comen_contgm_pnt_fnc LONG VARCHAR NULL,
	ide_orgm             INTEGER NOT NULL,
	des_compl_orgm       VARCHAR(256) NULL
);

ALTER TABLE CAD_CONTGM_PNT_FNC
ADD PRIMARY KEY (ide_contgm_pnt_fnc);

CREATE INDEX XIF1CONTAGEM_PONTOS_FUNCAO ON CAD_CONTGM_PNT_FNC
(
	ide_tip_contgm_pnt_fnc
);

CREATE TABLE CAD_CONTGM_PROJ_MLHRIA
(
	ide_contgm_proj_mlhria INTEGER NOT NULL,
	ide_pdid_ti          INTEGER NULL
);

ALTER TABLE CAD_CONTGM_PROJ_MLHRIA
ADD PRIMARY KEY (ide_contgm_proj_mlhria);

CREATE INDEX XIF2CONTAGEM_PROJETO_MELHORIA ON CAD_CONTGM_PROJ_MLHRIA
(
	ide_pdid_ti
);

CREATE TABLE CAD_ESFRC_PDID_TI
(
	ide_esfrc_pdid_ti    INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_pdid_ti          INTEGER NOT NULL,
	ide_tip_esfrc_pdid_ti INTEGER NOT NULL,
	nom_login            varchar(16) NULL,
	qtd_hor_esfrc        INTEGER NULL,
	dat_reg_esfrc        BINARY(8) NOT NULL
);

ALTER TABLE CAD_ESFRC_PDID_TI
ADD PRIMARY KEY (ide_esfrc_pdid_ti);

CREATE INDEX XIF1ESFORCO_PEDIDO_TI ON CAD_ESFRC_PDID_TI
(
	ide_pdid_ti
);

CREATE INDEX XIF2ESFORCO_PEDIDO_TI ON CAD_ESFRC_PDID_TI
(
	ide_tip_esfrc_pdid_ti
);

CREATE TABLE CAD_ESTDO_PDID_TI
(
	ide_estdo_pdid_ti    INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	nom_estdo_pdid_ti    varchar(64) NOT NULL,
	sig_estdo_pdid_ti    char(3) NOT NULL
);

ALTER TABLE CAD_ESTDO_PDID_TI
ADD PRIMARY KEY (ide_estdo_pdid_ti);

CREATE UNIQUE INDEX XAK1ESTADO_PEDIDO_TI ON CAD_ESTDO_PDID_TI
(
	nom_estdo_pdid_ti
);

CREATE UNIQUE INDEX XAK2ESTADO_PEDIDO_TI ON CAD_ESTDO_PDID_TI
(
	sig_estdo_pdid_ti
);

CREATE TABLE CAD_ESTDO_PRBLM_TI
(
	ide_estdo_prblm_ti   INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	nom_estdo_prblm_ti   varchar(64) NOT NULL,
	sig_estdo_prblm_ti   char(3) NOT NULL
);

ALTER TABLE CAD_ESTDO_PRBLM_TI
ADD PRIMARY KEY (ide_estdo_prblm_ti);

CREATE UNIQUE INDEX XAK1ESTADO_PROBLEMA_TI ON CAD_ESTDO_PRBLM_TI
(
	nom_estdo_prblm_ti
);

CREATE UNIQUE INDEX XAK2ESTADO_PROBLEMA_TI ON CAD_ESTDO_PRBLM_TI
(
	sig_estdo_prblm_ti
);

CREATE TABLE CAD_FILA_DMNDA_TI
(
	ide_fila_dmnda_ti    INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	nom_fila_dmnda_ti    varchar(64) NOT NULL,
	nom_abrv_fila_dmnda_ti varchar(16) NOT NULL,
	des_fila_dmnda_ti    varchar(512) NULL
);

ALTER TABLE CAD_FILA_DMNDA_TI
ADD PRIMARY KEY (ide_fila_dmnda_ti);

CREATE UNIQUE INDEX XAK1FILA_DEMANDA_TI ON CAD_FILA_DMNDA_TI
(
	nom_fila_dmnda_ti
);

CREATE UNIQUE INDEX XAK2FILA_DEMANDA_TI ON CAD_FILA_DMNDA_TI
(
	nom_abrv_fila_dmnda_ti
);

CREATE TABLE CAD_FNC_DADOS_PNT_FNC
(
	qtd_tip_reg          INTEGER NULL,
	ide_fnc_dados_pnt_fnc integer NOT NULL,
	ide_tip_fnc_dados    INTEGER NULL
);

ALTER TABLE CAD_FNC_DADOS_PNT_FNC
ADD PRIMARY KEY (ide_fnc_dados_pnt_fnc);

CREATE INDEX XIF2FUNCAO_DADOS_PONTOS_FUNCAO ON CAD_FNC_DADOS_PNT_FNC
(
	ide_tip_fnc_dados
);

CREATE TABLE CAD_FNC_TRS_PNT_FNC
(
	qtd_arq_refdo        INTEGER NULL,
	ide_fnc_trs_pnt_fnc  integer NOT NULL,
	ide_tip_fnc_trs      INTEGER NULL
);

ALTER TABLE CAD_FNC_TRS_PNT_FNC
ADD PRIMARY KEY (ide_fnc_trs_pnt_fnc);

CREATE INDEX XIF2FUNCAO_TRANSACAO_PONTOS_FUNCAO ON CAD_FNC_TRS_PNT_FNC
(
	ide_tip_fnc_trs
);

CREATE TABLE CAD_GRP_DADOS_PNT_FNC
(
	ide_grp_dados_pnt_fnc INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_tip_fnc          INTEGER NULL,
	ide_contgm_aplic     INTEGER NULL
);

ALTER TABLE CAD_GRP_DADOS_PNT_FNC
ADD PRIMARY KEY (ide_grp_dados_pnt_fnc);

CREATE INDEX XIF1GRUPO_DADOS_PONTO_FUNCAO ON CAD_GRP_DADOS_PNT_FNC
(
	ide_contgm_aplic
);

CREATE INDEX XIF2GRUPO_DADOS_PONTO_FUNCAO ON CAD_GRP_DADOS_PNT_FNC
(
	ide_tip_fnc
);

CREATE TABLE CAD_GRP_ESTDO_PDID_TI
(
	ide_grp_estdo_pdid_ti INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	nom_grp_estdo_pdid_ti VARCHAR(20) NOT NULL,
	sig_grp_estdo_pdid_ti VARCHAR(20) NOT NULL
);

ALTER TABLE CAD_GRP_ESTDO_PDID_TI
ADD PRIMARY KEY (ide_grp_estdo_pdid_ti);

CREATE UNIQUE INDEX XAK1GRUPO_ESTADO_PEDIDO_TI ON CAD_GRP_ESTDO_PDID_TI
(
	nom_grp_estdo_pdid_ti
);

CREATE UNIQUE INDEX XAK2GRUPO_ESTADO_PEDIDO_TI ON CAD_GRP_ESTDO_PDID_TI
(
	sig_grp_estdo_pdid_ti
);

CREATE TABLE CAD_GRP_OPECL
(
	ide_grp_opecl        INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_grp_opecl_super  INTEGER NULL,
	nom_grp_opecl        varchar(64) NOT NULL,
	nom_abrv_grp_opecl   varchar(16) NOT NULL
);

ALTER TABLE CAD_GRP_OPECL
ADD PRIMARY KEY (ide_grp_opecl);

CREATE INDEX XIF1GRUPO_OPERACIONAL ON CAD_GRP_OPECL
(
	ide_grp_opecl_super
);

CREATE UNIQUE INDEX XAK1GRUPO_OPERACIONAL ON CAD_GRP_OPECL
(
	nom_grp_opecl,	ide_grp_opecl_super
);

CREATE UNIQUE INDEX XAK2GRUPO_OPERACIONAL ON CAD_GRP_OPECL
(
	nom_abrv_grp_opecl,	ide_grp_opecl_super
);

CREATE TABLE CAD_ITM_CONTGM_PNT_FNC
(
	ide_itm_contgm_pnt_fnc integer NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_contgm_pnt_fnc   INTEGER NULL,
	ide_tip_fnc          INTEGER NULL,
	nom_fnc              varchar(128) NULL,
	sig_tip_manut_fnc    char(1) NULL CONSTRAINT sig_tip_manut_fnc CHECK ( sig_tip_manut_fnc IN ('I', 'A', 'R') ),
	qtd_tip_dados        INTEGER NULL,
	des_comen_itm_contgm_pnt_fnc LONG VARCHAR NULL
);

ALTER TABLE CAD_ITM_CONTGM_PNT_FNC
ADD PRIMARY KEY (ide_itm_contgm_pnt_fnc);

CREATE INDEX XIF3ITEM_CONTAGEM_PONTOS_FUNCAO ON CAD_ITM_CONTGM_PNT_FNC
(
	ide_contgm_pnt_fnc
);

CREATE INDEX XIF4ITEM_CONTAGEM_PONTOS_FUNCAO ON CAD_ITM_CONTGM_PNT_FNC
(
	ide_tip_fnc
);

CREATE TABLE CAD_NOTES_CONSULTA
(
	num_pedido           INTEGER NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_carga_gde        INTEGER NULL,
	ide_status_carga     INTEGER NULL,
	cod_status           VARCHAR(16) NULL,
	nom_resposta         VARCHAR(128) NULL,
	dat_criacao          TIMESTAMP NULL,
	dat_resposta         TIMESTAMP NULL
);

CREATE INDEX XIF3NOTES_CONSULTA ON CAD_NOTES_CONSULTA
(
	ide_carga_gde
);

CREATE TABLE CAD_NOTES_EXECUTOR
(
	num_pedido           INTEGER NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_carga_gde        INTEGER NULL,
	ide_status_carga     INTEGER NULL,
	nom_executor         VARCHAR(128) NULL
);

CREATE INDEX XIF3NOTES_EXECUTOR ON CAD_NOTES_EXECUTOR
(
	ide_carga_gde
);

CREATE TABLE CAD_NOTES_HOMOLOGACAO
(
	num_pedido           INTEGER NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_carga_gde        INTEGER NULL,
	ide_status_carga     INTEGER NULL,
	num_homologacao      INTEGER NULL,
	cod_status           VARCHAR(16) NULL,
	des_resp_homologacao VARCHAR(128) NULL,
	dat_criacao          TIMESTAMP NULL,
	dat_resposta         TIMESTAMP NULL,
	dat_inicio_homologacao TIMESTAMP NULL,
	dat_fim_homologacao  TIMESTAMP NULL
);

CREATE INDEX XIF3NOTES_HOMOLOGACAO ON CAD_NOTES_HOMOLOGACAO
(
	ide_carga_gde
);

CREATE TABLE CAD_NOTES_PEDIDO
(
	nome_codigo_interno_notes VARCHAR(32) NOT NULL,
	ide_carga_gde        INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_status_carga     INTEGER NULL,
	num_pedido           INTEGER NULL,
	cod_area_pedido      VARCHAR(16) NULL,
	cod_area_atribuida   VARCHAR(16) NULL,
	cod_depto_pedido     VARCHAR(16) NULL,
	cod_depto_atribuido  VARCHAR(16) NULL,
	des_assunto          VARCHAR(256) NULL,
	des_sistema          VARCHAR(64) NULL,
	des_outro_sistema    VARCHAR(64) NULL,
	des_projeto          VARCHAR(32) NULL,
	cod_estado_completo  VARCHAR(32) NULL,
	des_tipo_pedido_form VARCHAR(32) NULL,
	cod_lotacao_solicitante VARCHAR(32) NULL,
	nom_solicitante      VARCHAR(128) NULL,
	nom_responsavel      VARCHAR(128) NULL,
	nom_gerente          VARCHAR(128) NULL,
	nom_executor         VARCHAR(128) NULL,
	nom_atribuidor       VARCHAR(128) NULL,
	nom_concluidor       VARCHAR(128) NULL,
	nom_cancelamento     VARCHAR(128) NULL,
	nom_finalizador      VARCHAR(128) NULL,
	dat_solicitacao      TIMESTAMP NULL,
	dat_recebimento      TIMESTAMP NULL,
	dat_limite           TIMESTAMP NULL,
	dat_priorizacao      TIMESTAMP NULL,
	dat_inicio_pre_analise TIMESTAMP NULL,
	dat_inicio_estimativa BINARY(8) NULL,
	dat_fim_estimativa   TIMESTAMP NULL,
	dat_atribuicao       TIMESTAMP NULL,
	dat_imp_terminada    TIMESTAMP NULL,
	data_conclusao       TIMESTAMP NULL,
	dat_cancelamento     TIMESTAMP NULL,
	dat_finalizacao      TIMESTAMP NULL,
	dat_projeto          TIMESTAMP NULL,
	dat_encaminhamento_gerente TIMESTAMP NULL,
	des_complexidade     VARCHAR(32) NULL,
	hor_conclusao        FLOAT NULL,
	hor_fechamento       FLOAT NULL,
	num_prioridade       INTEGER NULL,
	num_homologacoes     INTEGER NULL,
	num_validacoes       INTEGER NULL,
	nom_fila             VARCHAR(32) NULL
);

ALTER TABLE CAD_NOTES_PEDIDO
ADD PRIMARY KEY (nome_codigo_interno_notes,ide_carga_gde);

CREATE INDEX XIF3NOTES_PEDIDO ON CAD_NOTES_PEDIDO
(
	ide_carga_gde
);

CREATE TABLE CAD_NOTES_VALIDACAO
(
	num_pedido           INTEGER NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_carga_gde        INTEGER NULL,
	ide_status_carga     INTEGER NULL,
	num_validacao        INTEGER NULL,
	cod_status           VARCHAR(16) NULL,
	des_resp_validacao   VARCHAR(128) NULL,
	dat_criacao          TIMESTAMP NULL,
	dat_resposta         TIMESTAMP NULL
);

CREATE INDEX XIF3NOTES_VALIDACAO ON CAD_NOTES_VALIDACAO
(
	ide_carga_gde
);

CREATE TABLE CAD_PDID_TI
(
	ide_pdid_ti          INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_orgm             INTEGER NOT NULL,
	nom_cod_itrno_pdid   varchar(32) NULL,
	num_pdid             INTEGER NOT NULL,
	ide_tip_pdid_ti      INTEGER NULL,
	ide_orgao_patrcdr    INTEGER NULL,
	ide_ult_trans_estdo_pdid_ti INTEGER NULL,
	ide_categ_opecl_ti   INTEGER NULL,
	ide_categ_prdt_ti    INTEGER NULL,
	nom_login_solic      varchar(16) NULL,
	dat_solic            BINARY(8) NULL,
	nom_login_fechmnt    varchar(16) NULL,
	dat_fechmnt          BINARY(8) NULL,
	des_assnt            varchar(256) NULL,
	des_pdid             LONG VARCHAR NULL
);

ALTER TABLE CAD_PDID_TI
ADD PRIMARY KEY (ide_pdid_ti);

CREATE INDEX XIF1PEDIDO_TI ON CAD_PDID_TI
(
	ide_tip_pdid_ti
);

CREATE INDEX XIF2PEDIDO_TI ON CAD_PDID_TI
(
	ide_ult_trans_estdo_pdid_ti
);

CREATE INDEX XIF3PEDIDO_TI ON CAD_PDID_TI
(
	ide_categ_opecl_ti
);

CREATE INDEX XIF4PEDIDO_TI ON CAD_PDID_TI
(
	ide_categ_prdt_ti
);

CREATE UNIQUE INDEX XAK1PEDIDO_TI ON CAD_PDID_TI
(
	ide_orgm,	num_pdid
);

CREATE UNIQUE INDEX XAK2PEDIDO_TI ON CAD_PDID_TI
(
	nom_cod_itrno_pdid
);

CREATE TABLE CAD_PRBLM_TI
(
	ide_prblm_ti         INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	nom_cod_itrno_prblm  VARCHAR(20) NULL,
	num_prblm            INTEGER NOT NULL,
	ide_categ_opecl_ti   INTEGER NULL,
	ide_categ_prdt_ti    INTEGER NULL,
	nom_login_reg        varchar(16) NULL,
	dat_reg              BINARY(8) NULL,
	nom_login_fechmnt    varchar(16) NULL,
	dat_fechmnt          BINARY(8) NULL
);

ALTER TABLE CAD_PRBLM_TI
ADD PRIMARY KEY (ide_prblm_ti);

CREATE INDEX XIF1PROBLEMA_TI ON CAD_PRBLM_TI
(
	ide_categ_prdt_ti
);

CREATE INDEX XIF2PROBLEMA_TI ON CAD_PRBLM_TI
(
	ide_categ_opecl_ti
);

CREATE TABLE CAD_PROCS_ELEMTAR_PNT_FNC
(
	ide_procs_elemtar_pnt_fnc INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_tip_fnc          INTEGER NULL,
	ide_contgm_aplic     INTEGER NULL
);

ALTER TABLE CAD_PROCS_ELEMTAR_PNT_FNC
ADD PRIMARY KEY (ide_procs_elemtar_pnt_fnc);

CREATE INDEX XIF1PROCESSO_ELEMENTAR_PONTO_FUNCAO ON CAD_PROCS_ELEMTAR_PNT_FNC
(
	ide_contgm_aplic
);

CREATE INDEX XIF2PROCESSO_ELEMENTAR_PONTO_FUNCAO ON CAD_PROCS_ELEMTAR_PNT_FNC
(
	ide_tip_fnc
);

CREATE TABLE CAD_PROCS_ITRNO_GDE
(
	ide_procs_itrno_GDE  INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	nom_procs_itrno_GDE  varchar(64) NOT NULL,
	dat_procs_itrno_GDE  BINARY(8) NOT NULL,
	val_procs_itrno_GDE  LONG VARCHAR NULL
);

ALTER TABLE CAD_PROCS_ITRNO_GDE
ADD PRIMARY KEY (ide_procs_itrno_GDE);

CREATE UNIQUE INDEX XAK1PROCESSAMENTO_INTERNO_GDE ON CAD_PROCS_ITRNO_GDE
(
	nom_procs_itrno_GDE,	dat_procs_itrno_GDE
);

CREATE TABLE CAD_REMEDY_HPD_AUDIT_LOG_SYSTEM
(
	entry_id             VARCHAR(32) NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_carga_gde        INTEGER NULL,
	ide_status_carga     INTEGER NULL,
	original_request_id  VARCHAR(20) NULL,
	des_submiter         VARCHAR(20) NULL,
	des_audit_user       VARCHAR(20) NULL,
	create_date          TIMESTAMP NULL,
	des_log              VARCHAR(20) NULL,
	des_fields_changed   VARCHAR(20) NULL
);

CREATE INDEX XIF1REMEDY_HPD_AUDIT_LOG_SYSTEM ON CAD_REMEDY_HPD_AUDIT_LOG_SYSTEM
(
	ide_carga_gde
);

CREATE INDEX XIF2REMEDY_HPD_AUDIT_LOG_SYSTEM ON CAD_REMEDY_HPD_AUDIT_LOG_SYSTEM
(
	ide_status_carga
);

CREATE TABLE CAD_REMEDY_HPD_HELP_DESK
(
	entry_id             VARCHAR(32) NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_carga_gde        INTEGER NULL,
	ide_status_carga     INTEGER NULL,
	login_id             VARCHAR(32) NULL,
	incident_number      VARCHAR(32) NULL,
	assignee_login_id    VARCHAR(32) NULL,
	assignee             VARCHAR(32) NULL,
	assigned_group       VARCHAR(32) NULL,
	create_date          TIMESTAMP NULL,
	last_resolved_date   TIMESTAMP NULL,
	closed_date          TIMESTAMP NULL,
	status               INTEGER NULL,
	department           VARCHAR(32) NULL,
	detailed_description LONG VARCHAR NULL,
	product_categorization_tier_1 VARCHAR(64) NULL,
	product_categorization_tier_2 VARCHAR(64) NULL,
	product_categorization_tier_3 VARCHAR(64) NULL,
	operational_categorization_tier_1 VARCHAR(64) NULL,
	operational_categorization_tier_2 VARCHAR(64) NULL,
	operational_categorization_tier_3 VARCHAR(64) NULL,
	urgency              INTEGER NULL,
	description          varchar(256) NULL
);

CREATE INDEX XIF1REMEDY_HPD_HELP_DESK ON CAD_REMEDY_HPD_HELP_DESK
(
	ide_carga_gde
);

CREATE INDEX XIF2REMEDY_HPD_HELP_DESK ON CAD_REMEDY_HPD_HELP_DESK
(
	ide_status_carga
);

CREATE TABLE CAD_REMEDY_PBM_PROBLEM_INVESTIGATION
(
	entry_id             VARCHAR(32) NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_carga_gde        INTEGER NULL,
	ide_status_carga     INTEGER NULL,
	problem_investigation_id varchar(32) NOT NULL,
	submitter            VARCHAR(32) NULL,
	first_name           varchar(32) NULL,
	last_name            varchar(32) NULL,
	assigned_group_pblm_mgr varchar(64) NULL,
	assignee_login_id    VARCHAR(16) NULL,
	assignee             VARCHAR(32) NULL,
	assigned_group       VARCHAR(64) NULL,
	create_date          TIMESTAMP NULL,
	description          LONG VARCHAR NULL,
	detailed_description LONG VARCHAR NULL,
	product_categorization_tier_1 VARCHAR(64) NULL,
	product_categorization_tier_2 VARCHAR(64) NULL,
	product_categorization_tier_3 VARCHAR(64) NULL,
	operational_categorization_tier_1 VARCHAR(64) NULL,
	operational_categorization_tier_2 VARCHAR(64) NULL,
	operational_categorization_tier_3 VARCHAR(64) NULL,
	urgency              INTEGER NULL,
	investigation_status INTEGER NULL,
	temporary_workaround LONG VARCHAR NULL
);

CREATE INDEX XIF1REMEDY_PBM_PROBLEM_INVESTIGATION ON CAD_REMEDY_PBM_PROBLEM_INVESTIGATION
(
	ide_carga_gde
);

CREATE INDEX XIF2REMEDY_PBM_PROBLEM_INVESTIGATION ON CAD_REMEDY_PBM_PROBLEM_INVESTIGATION
(
	ide_status_carga
);

CREATE TABLE CAD_STATUS_CARGA
(
	ide_status_carga     INTEGER NOT NULL,
	cod_status           VARCHAR(16) NULL
);

ALTER TABLE CAD_STATUS_CARGA
ADD PRIMARY KEY (ide_status_carga);

CREATE TABLE CAD_TIP_CONTGM_PNT_FNC
(
	ide_tip_contgm_pnt_fnc INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	nom_tip_contgm_pnt_fnc varchar(16) NOT NULL,
	sig_tip_contgm_pnt_fnc char(6) NOT NULL
);

ALTER TABLE CAD_TIP_CONTGM_PNT_FNC
ADD PRIMARY KEY (ide_tip_contgm_pnt_fnc);

CREATE UNIQUE INDEX XAK1TIPO_CONTAGEM_PONTOS_FUNCAO ON CAD_TIP_CONTGM_PNT_FNC
(
	nom_tip_contgm_pnt_fnc
);

CREATE TABLE CAD_TIP_DADO_PNT_FNC
(
	ide_tip_dado_pnt_fnc INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	nom_tip_dado_pnt_fnc VARCHAR(64) NOT NULL,
	des_comen_tip_dado_pnt_fnc LONG VARCHAR NULL,
	ide_grp_dados_pnt_fnc INTEGER NULL,
	ide_procs_elemtar_pnt_fnc INTEGER NULL
);

ALTER TABLE CAD_TIP_DADO_PNT_FNC
ADD PRIMARY KEY (ide_tip_dado_pnt_fnc);

CREATE INDEX XIF1TIPO_DADO_PONTO_FUNCAO ON CAD_TIP_DADO_PNT_FNC
(
	ide_grp_dados_pnt_fnc
);

CREATE INDEX XIF2TIPO_DADO_PONTO_FUNCAO ON CAD_TIP_DADO_PNT_FNC
(
	ide_procs_elemtar_pnt_fnc
);

CREATE UNIQUE INDEX XAK1TIPO_DADO_PONTO_FUNCAO ON CAD_TIP_DADO_PNT_FNC
(
	ide_grp_dados_pnt_fnc,	nom_tip_dado_pnt_fnc
);

CREATE TABLE CAD_TIP_ESFRC_PDID_TI
(
	ide_tip_esfrc_pdid_ti INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	nom_tip_esfrc_pdid_ti varchar(64) NOT NULL,
	nom_abrv_tip_esfrc_pdid_TI varchar(16) NOT NULL,
	num_ord_exibc        INTEGER NULL
);

ALTER TABLE CAD_TIP_ESFRC_PDID_TI
ADD PRIMARY KEY (ide_tip_esfrc_pdid_ti);

CREATE UNIQUE INDEX XAK1TIPO_ESFORCO_PEDIDO_TI ON CAD_TIP_ESFRC_PDID_TI
(
	nom_tip_esfrc_pdid_ti
);

CREATE UNIQUE INDEX XAK2TIPO_ESFORCO_PEDIDO_TI ON CAD_TIP_ESFRC_PDID_TI
(
	nom_abrv_tip_esfrc_pdid_TI
);

CREATE TABLE CAD_TIP_FNC_PNT_FNC
(
	ide_tip_fnc          INTEGER NOT NULL,
	ide_tip_fnc_super    INTEGER NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	nom_tip_fnc          varchar(64) NULL,
	nom_abrv_tip_fnc     varchar(16) NULL
);

ALTER TABLE CAD_TIP_FNC_PNT_FNC
ADD PRIMARY KEY (ide_tip_fnc);

CREATE TABLE CAD_TIP_PDID_TI
(
	ide_tip_pdid_ti      INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_tip_pdid_ti_super INTEGER NULL,
	nom_tip_pdid_ti      varchar(64) NOT NULL,
	nom_abrv_tip_pdid_ti varchar(16) NOT NULL
);

ALTER TABLE CAD_TIP_PDID_TI
ADD PRIMARY KEY (ide_tip_pdid_ti);

CREATE INDEX XIF1TIPO_PEDIDO_TI ON CAD_TIP_PDID_TI
(
	ide_tip_pdid_ti_super
);

CREATE UNIQUE INDEX XAK2TIPO_PEDIDO_TI ON CAD_TIP_PDID_TI
(
	nom_abrv_tip_pdid_ti,	ide_tip_pdid_ti_super
);

CREATE UNIQUE INDEX XAK1_CAD_TIP_PDID_TI ON CAD_TIP_PDID_TI
(
	nom_tip_pdid_ti,	ide_tip_pdid_ti_super
);

CREATE TABLE CAD_TIP_REG_PNT_FNC
(
	ide_tip_reg_pnt_fnc  INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	nom_tip_reg_pnt_fnc  VARCHAR(64) NOT NULL,
	des_comen_tip_reg_pnt_fnc LONG VARCHAR NULL,
	ide_grp_dados_pnt_fnc INTEGER NULL
);

ALTER TABLE CAD_TIP_REG_PNT_FNC
ADD PRIMARY KEY (ide_tip_reg_pnt_fnc);

CREATE INDEX XIF1TIPO_REGISTRO_PONTO_FUNCAO ON CAD_TIP_REG_PNT_FNC
(
	ide_grp_dados_pnt_fnc
);

CREATE UNIQUE INDEX XAK1TIPO_REGISTRO_PONTO_FUNCAO ON CAD_TIP_REG_PNT_FNC
(
	ide_grp_dados_pnt_fnc,	nom_tip_reg_pnt_fnc
);

CREATE TABLE CAD_TRANS_ESTDO_PDID_TI
(
	ide_trans_estdo_pdid_ti INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_pdid_ti          INTEGER NOT NULL,
	ide_estdo_pdid_ti    INTEGER NOT NULL,
	ide_grp_dsignd       INTEGER NULL,
	dat_trans            BINARY(8) NULL,
	nom_login_resp       varchar(16) NULL,
	nom_login_dsignd     varchar(64) NULL,
	ide_orgm             INTEGER NOT NULL
);

ALTER TABLE CAD_TRANS_ESTDO_PDID_TI
ADD PRIMARY KEY (ide_trans_estdo_pdid_ti);

CREATE INDEX XIF1TRANSICAO_ESTADO_PEDIDO_TI ON CAD_TRANS_ESTDO_PDID_TI
(
	ide_pdid_ti
);

CREATE INDEX XIF2TRANSICAO_ESTADO_PEDIDO_TI ON CAD_TRANS_ESTDO_PDID_TI
(
	ide_estdo_pdid_ti
);

CREATE INDEX XIF3TRANSICAO_ESTADO_PEDIDO_TI ON CAD_TRANS_ESTDO_PDID_TI
(
	ide_grp_dsignd
);

CREATE TABLE CAD_TRANS_ESTDO_PRBLM_TI
(
	ide_trans_estdo_prblm_ti INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_estdo_prblm_ti   INTEGER NOT NULL,
	ide_prblm_ti         INTEGER NOT NULL,
	dat_trans            BINARY(8) NULL,
	nom_login_resp       varchar(16) NULL
);

ALTER TABLE CAD_TRANS_ESTDO_PRBLM_TI
ADD PRIMARY KEY (ide_trans_estdo_prblm_ti);

CREATE INDEX XIF1TRANSICAO_ESTADO_PROBLEMA_TI ON CAD_TRANS_ESTDO_PRBLM_TI
(
	ide_estdo_prblm_ti
);

CREATE INDEX XIF2TRANSICAO_ESTADO_PROBLEMA_TI ON CAD_TRANS_ESTDO_PRBLM_TI
(
	ide_prblm_ti
);

CREATE TABLE CTL_CARGA_GDE
(
	ide_carga_gde        INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_orgm             INTEGER NOT NULL,
	ind_incremental      CHAR(1) NOT NULL DEFAULT 'N' CONSTRAINT ind_incremental CHECK ( [ind_incremental] ='N' or [ind_incremental] = 'S' ),
	dat_inicio_extracao  BINARY(8) NULL,
	dat_fim_extracao     BINARY(8) NULL,
	dat_inicio_transformacao BINARY(8) NULL,
	dat_fim_transformacao BINARY(8) NULL,
	dat_inicio_sincronizacao BINARY(8) NULL,
	dat_fim_sincronizacao VARCHAR(20) NULL,
	des_comentario       LONG VARCHAR NULL
);

ALTER TABLE CTL_CARGA_GDE
ADD PRIMARY KEY (ide_carga_gde);

CREATE UNIQUE INDEX XAK1CONTROLE_CARGA_GDE ON CTL_CARGA_GDE
(
	ide_orgm,	dat_inicio_extracao
);

CREATE TABLE HIS_NOTES_CONSULTA
(
	num_pedido           INTEGER NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_carga_gde        INTEGER NULL,
	ide_status_carga     INTEGER NULL,
	cod_status           VARCHAR(16) NULL,
	nom_resposta         VARCHAR(128) NULL,
	dat_criacao          TIMESTAMP NULL,
	dat_resposta         TIMESTAMP NULL
);

CREATE INDEX XIF1HISTORICO_NOTES_CONSULTA ON HIS_NOTES_CONSULTA
(
	ide_status_carga
);

CREATE INDEX XIF2HISTORICO_NOTES_CONSULTA ON HIS_NOTES_CONSULTA
(
	ide_carga_gde
);

CREATE TABLE HIS_NOTES_EXECUTOR
(
	num_pedido           INTEGER NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_carga_gde        INTEGER NULL,
	ide_status_carga     INTEGER NULL,
	nom_executor         VARCHAR(128) NULL
);

CREATE INDEX XIF1HISTORICO_NOTES_EXECUTOR ON HIS_NOTES_EXECUTOR
(
	ide_status_carga
);

CREATE INDEX XIF2HISTORICO_NOTES_EXECUTOR ON HIS_NOTES_EXECUTOR
(
	ide_carga_gde
);

CREATE TABLE HIS_NOTES_HOMOLOGACAO
(
	num_pedido           INTEGER NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_carga_gde        INTEGER NULL,
	ide_status_carga     INTEGER NULL,
	num_homologacao      INTEGER NULL,
	cod_status           VARCHAR(16) NULL,
	des_resp_homologacao VARCHAR(128) NULL,
	dat_criacao          TIMESTAMP NULL,
	dat_resposta         TIMESTAMP NULL,
	dat_inicio_homologacao TIMESTAMP NULL,
	dat_fim_homologacao  TIMESTAMP NULL
);

CREATE INDEX XIF1HISTORICO_NOTES_HOMOLOGACAO ON HIS_NOTES_HOMOLOGACAO
(
	ide_status_carga
);

CREATE INDEX XIF2HISTORICO_NOTES_HOMOLOGACAO ON HIS_NOTES_HOMOLOGACAO
(
	ide_carga_gde
);

CREATE TABLE HIS_NOTES_PEDIDO
(
	nome_codigo_interno_notes VARCHAR(32) NOT NULL,
	ide_carga_gde        INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_status_carga     INTEGER NULL,
	num_pedido           INTEGER NULL,
	cod_area_pedido      VARCHAR(16) NULL,
	cod_area_atribuida   VARCHAR(16) NULL,
	cod_depto_pedido     VARCHAR(16) NULL,
	cod_depto_atribuido  VARCHAR(16) NULL,
	des_assunto          VARCHAR(256) NULL,
	des_sistema          VARCHAR(64) NULL,
	des_outro_sistema    VARCHAR(64) NULL,
	des_projeto          VARCHAR(32) NULL,
	cod_estado_completo  VARCHAR(32) NULL,
	des_tipo_pedido_form VARCHAR(32) NULL,
	cod_lotacao_solicitante VARCHAR(32) NULL,
	nom_solicitante      VARCHAR(128) NULL,
	nom_responsavel      VARCHAR(128) NULL,
	nom_gerente          VARCHAR(128) NULL,
	nom_executor         VARCHAR(128) NULL,
	nom_atribuidor       VARCHAR(128) NULL,
	nom_concluidor       VARCHAR(128) NULL,
	nom_cancelamento     VARCHAR(128) NULL,
	nom_finalizador      VARCHAR(128) NULL,
	dat_solicitacao      TIMESTAMP NULL,
	dat_recebimento      TIMESTAMP NULL,
	dat_limite           TIMESTAMP NULL,
	dat_priorizacao      TIMESTAMP NULL,
	dat_inicio_pre_analise TIMESTAMP NULL,
	dat_inicio_estimativa TIMESTAMP NULL,
	dat_fim_estimativa   TIMESTAMP NULL,
	dat_atribuicao       TIMESTAMP NULL,
	dat_imp_terminada    TIMESTAMP NULL,
	dat_conclusao        TIMESTAMP NULL,
	dat_cancelamento     TIMESTAMP NULL,
	dat_finalizacao      TIMESTAMP NULL,
	dat_projeto          TIMESTAMP NULL,
	dat_encaminhamento_gerente TIMESTAMP NULL,
	des_complexidade     VARCHAR(32) NULL,
	hor_conclusao        FLOAT NULL,
	hor_fechamento       FLOAT NULL,
	num_prioridade       INTEGER NULL,
	num_homologacoes     INTEGER NULL,
	num_validacoes       INTEGER NULL,
	nom_fila             VARCHAR(32) NULL
);

ALTER TABLE HIS_NOTES_PEDIDO
ADD PRIMARY KEY (nome_codigo_interno_notes,ide_carga_gde);

CREATE INDEX XIF1HISTORICO_NOTES_PEDIDO ON HIS_NOTES_PEDIDO
(
	ide_status_carga
);

CREATE INDEX XIF2HISTORICO_NOTES_PEDIDO ON HIS_NOTES_PEDIDO
(
	ide_carga_gde
);

CREATE TABLE HIS_NOTES_VALIDACAO
(
	num_pedido           INTEGER NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_carga_gde        INTEGER NULL,
	ide_status_carga     INTEGER NULL,
	num_validacao        INTEGER NULL,
	cod_status           VARCHAR(16) NULL,
	des_resp_validacao   VARCHAR(128) NULL,
	dat_criacao          TIMESTAMP NULL,
	dat_resposta         TIMESTAMP NULL
);

CREATE INDEX XIF1HISTORICO_NOTES_VALIDACAO ON HIS_NOTES_VALIDACAO
(
	ide_status_carga
);

CREATE INDEX XIF2HISTORICO_NOTES_VALIDACAO ON HIS_NOTES_VALIDACAO
(
	ide_carga_gde
);

CREATE TABLE HIS_REMEDY_HPD_AUDIT_LOG_SYSTEM
(
	entry_id             VARCHAR(32) NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_carga_gde        INTEGER NULL,
	ide_status_carga     INTEGER NULL,
	original_request_id  VARCHAR(20) NULL,
	des_submiter         VARCHAR(20) NULL,
	des_audit_user       VARCHAR(20) NULL,
	create_date          TIMESTAMP NULL,
	des_log              VARCHAR(20) NULL,
	des_fields_changed   VARCHAR(20) NULL
);

CREATE INDEX XIF1HISTORICO_REMEDY_HPD_AUDIT_LOG_SYSTEM ON HIS_REMEDY_HPD_AUDIT_LOG_SYSTEM
(
	ide_carga_gde
);

CREATE INDEX XIF2HISTORICO_REMEDY_HPD_AUDIT_LOG_SYSTEM ON HIS_REMEDY_HPD_AUDIT_LOG_SYSTEM
(
	ide_status_carga
);

CREATE TABLE HIS_REMEDY_HPD_HELP_DESK
(
	entry_id             VARCHAR(32) NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_carga_gde        INTEGER NULL,
	ide_status_carga     INTEGER NULL,
	login_id             VARCHAR(32) NULL,
	incident_number      VARCHAR(32) NULL,
	assignee_login_id    VARCHAR(32) NULL,
	assignee             VARCHAR(32) NULL,
	assigned_group       VARCHAR(32) NULL,
	create_date          TIMESTAMP NULL,
	last_resolved_date   TIMESTAMP NULL,
	closed_date          TIMESTAMP NULL,
	status               INTEGER NULL,
	department           VARCHAR(32) NULL,
	detailed_description LONG VARCHAR NULL,
	product_categorization_tier_1 VARCHAR(64) NULL,
	product_categorization_tier_2 VARCHAR(64) NULL,
	product_categorization_tier_3 VARCHAR(64) NULL,
	operational_categorization_tier_1 VARCHAR(64) NULL,
	operational_categorization_tier_2 VARCHAR(64) NULL,
	operational_categorization_tier_3 VARCHAR(64) NULL,
	urgency              INTEGER NULL,
	description          varchar(256) NULL
);

CREATE INDEX XIF1HISTORICO_REMEDY_HPD_HELP_DESK ON HIS_REMEDY_HPD_HELP_DESK
(
	ide_carga_gde
);

CREATE INDEX XIF2HISTORICO_REMEDY_HPD_HELP_DESK ON HIS_REMEDY_HPD_HELP_DESK
(
	ide_status_carga
);

CREATE TABLE HIS_REMEDY_PBM_PROBLEM_INVESTIGATION
(
	entry_id             VARCHAR(32) NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	ide_carga_gde        INTEGER NULL,
	ide_status_carga     INTEGER NULL,
	problem_investigation_id varchar(32) NOT NULL,
	submitter            VARCHAR(32) NULL,
	first_name           varchar(32) NULL,
	last_name            varchar(32) NULL,
	assigned_group_pblm_mgr varchar(64) NULL,
	assignee_login_id    VARCHAR(16) NULL,
	assignee             VARCHAR(32) NULL,
	assigned_group       VARCHAR(64) NULL,
	create_date          BINARY(8) NULL,
	description          LONG VARCHAR NULL,
	detailed_description LONG VARCHAR NULL,
	product_categorization_tier_1 VARCHAR(64) NULL,
	product_categorization_tier_2 VARCHAR(64) NULL,
	product_categorization_tier_3 VARCHAR(64) NULL,
	operational_categorization_tier_1 VARCHAR(64) NULL,
	operational_categorization_tier_2 VARCHAR(64) NULL,
	operational_categorization_tier_3 VARCHAR(64) NULL,
	urgency              INTEGER NULL,
	investigation_status INTEGER NULL,
	temporary_workaround LONG VARCHAR NULL
);

CREATE INDEX XIF1HISTORICO_REMEDY_PBM_PROBLEM_INVESTIGATION ON HIS_REMEDY_PBM_PROBLEM_INVESTIGATION
(
	ide_carga_gde
);

CREATE INDEX XIF2HISTORICO_REMEDY_PBM_PROBLEM_INVESTIGATION ON HIS_REMEDY_PBM_PROBLEM_INVESTIGATION
(
	ide_status_carga
);

CREATE TABLE REL_AGRUP_ESTDO_PDID_TI
(
	ide_estdo_pdid_ti    INTEGER NOT NULL,
	ide_grp_estdo_pdid_ti INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL
);

ALTER TABLE REL_AGRUP_ESTDO_PDID_TI
ADD PRIMARY KEY (ide_estdo_pdid_ti,ide_grp_estdo_pdid_ti);

CREATE INDEX XIF1AGRUPAMENTO_ESTADO_PEDIDO_TI ON REL_AGRUP_ESTDO_PDID_TI
(
	ide_estdo_pdid_ti
);

CREATE INDEX XIF2AGRUPAMENTO_ESTADO_PEDIDO_TI ON REL_AGRUP_ESTDO_PDID_TI
(
	ide_grp_estdo_pdid_ti
);

CREATE TABLE REL_PDID_TI_CICLO_FILA_DMNDA_TI
(
	ide_pdid_ti          INTEGER NOT NULL,
	ide_ciclo_fila_dmnda_ti INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL,
	des_comen            varchar(512) NULL,
	num_priorzc          INTEGER NULL
);

ALTER TABLE REL_PDID_TI_CICLO_FILA_DMNDA_TI
ADD PRIMARY KEY (ide_pdid_ti,ide_ciclo_fila_dmnda_ti);

CREATE INDEX XIF1PEDIDO_TI_CICLO_FILA_DEMANDA_TI ON REL_PDID_TI_CICLO_FILA_DMNDA_TI
(
	ide_pdid_ti
);

CREATE INDEX XIF2PEDIDO_TI_CICLO_FILA_DEMANDA_TI ON REL_PDID_TI_CICLO_FILA_DMNDA_TI
(
	ide_ciclo_fila_dmnda_ti
);

CREATE TABLE REL_PRBLM_PDID_TI
(
	ide_prblm_ti         INTEGER NOT NULL,
	ide_pdid_ti          INTEGER NOT NULL,
	ide_user_ult_atualz  CHAR(32) NULL,
	dat_ult_atualz       BINARY(8) NULL
);

ALTER TABLE REL_PRBLM_PDID_TI
ADD PRIMARY KEY (ide_prblm_ti,ide_pdid_ti);

CREATE INDEX XIF1PROBLEMA_PEDIDO_TI ON REL_PRBLM_PDID_TI
(
	ide_prblm_ti
);

CREATE INDEX XIF2PROBLEMA_PEDIDO_TI ON REL_PRBLM_PDID_TI
(
	ide_pdid_ti
);

ALTER TABLE CAD_ARQ_REFDO_PNT_FNC
ADD CONSTRAINT R_963 FOREIGN KEY (ide_procs_elemtar_pnt_fnc) REFERENCES CAD_PROCS_ELEMTAR_PNT_FNC (ide_procs_elemtar_pnt_fnc);

ALTER TABLE CAD_CATEG_OPECL_TI
ADD CONSTRAINT R_2787 FOREIGN KEY (ide_categ_opecl_ti_super) REFERENCES CAD_CATEG_OPECL_TI (ide_categ_opecl_ti);

ALTER TABLE CAD_CATEG_PRDT_TI
ADD CONSTRAINT R_2786 FOREIGN KEY (ide_categ_prdt_ti_super) REFERENCES CAD_CATEG_PRDT_TI (ide_categ_prdt_ti);

ALTER TABLE CAD_CICLO_FILA_DMNDA_TI
ADD CONSTRAINT R_2811 FOREIGN KEY (ide_fila_dmnda_ti) REFERENCES CAD_FILA_DMNDA_TI (ide_fila_dmnda_ti);

ALTER TABLE CAD_CNSLT_PDID_TI
ADD CONSTRAINT R_2871 FOREIGN KEY (ide_pdid_ti) REFERENCES CAD_PDID_TI (ide_pdid_ti);

ALTER TABLE CAD_CONTGM_APLIC
ADD CONSTRAINT R_2977 FOREIGN KEY (ide_categ_prdt_ti) REFERENCES CAD_CATEG_PRDT_TI (ide_categ_prdt_ti);

ALTER TABLE CAD_CONTGM_APLIC
ADD CONSTRAINT R_962 FOREIGN KEY (ide_contgm_aplic) REFERENCES CAD_CONTGM_PNT_FNC (ide_contgm_pnt_fnc)
		ON DELETE CASCADE;

ALTER TABLE CAD_CONTGM_PNT_FNC
ADD CONSTRAINT R_961 FOREIGN KEY (ide_tip_contgm_pnt_fnc) REFERENCES CAD_TIP_CONTGM_PNT_FNC (ide_tip_contgm_pnt_fnc);

ALTER TABLE CAD_CONTGM_PROJ_MLHRIA
ADD CONSTRAINT R_2974 FOREIGN KEY (ide_contgm_proj_mlhria) REFERENCES CAD_CONTGM_PNT_FNC (ide_contgm_pnt_fnc)
		ON DELETE CASCADE;

ALTER TABLE CAD_CONTGM_PROJ_MLHRIA
ADD CONSTRAINT R_2976 FOREIGN KEY (ide_pdid_ti) REFERENCES CAD_PDID_TI (ide_pdid_ti);

ALTER TABLE CAD_ESFRC_PDID_TI
ADD CONSTRAINT R_2813 FOREIGN KEY (ide_pdid_ti) REFERENCES CAD_PDID_TI (ide_pdid_ti);

ALTER TABLE CAD_ESFRC_PDID_TI
ADD CONSTRAINT R_2819 FOREIGN KEY (ide_tip_esfrc_pdid_ti) REFERENCES CAD_TIP_ESFRC_PDID_TI (ide_tip_esfrc_pdid_ti);

ALTER TABLE CAD_FNC_DADOS_PNT_FNC
ADD CONSTRAINT R_2969 FOREIGN KEY (ide_fnc_dados_pnt_fnc) REFERENCES CAD_ITM_CONTGM_PNT_FNC (ide_itm_contgm_pnt_fnc)
		ON DELETE CASCADE;

ALTER TABLE CAD_FNC_DADOS_PNT_FNC
ADD CONSTRAINT R_967 FOREIGN KEY (ide_tip_fnc_dados) REFERENCES CAD_TIP_FNC_PNT_FNC (ide_tip_fnc);

ALTER TABLE CAD_FNC_TRS_PNT_FNC
ADD CONSTRAINT R_2970 FOREIGN KEY (ide_fnc_trs_pnt_fnc) REFERENCES CAD_ITM_CONTGM_PNT_FNC (ide_itm_contgm_pnt_fnc)
		ON DELETE CASCADE;

ALTER TABLE CAD_FNC_TRS_PNT_FNC
ADD CONSTRAINT R_966 FOREIGN KEY (ide_tip_fnc_trs) REFERENCES CAD_TIP_FNC_PNT_FNC (ide_tip_fnc);

ALTER TABLE CAD_GRP_DADOS_PNT_FNC
ADD CONSTRAINT R_2988 FOREIGN KEY (ide_contgm_aplic) REFERENCES CAD_CONTGM_APLIC (ide_contgm_aplic);

ALTER TABLE CAD_GRP_DADOS_PNT_FNC
ADD CONSTRAINT R_964 FOREIGN KEY (ide_tip_fnc) REFERENCES CAD_TIP_FNC_PNT_FNC (ide_tip_fnc);

ALTER TABLE CAD_GRP_OPECL
ADD CONSTRAINT R_2794 FOREIGN KEY (ide_grp_opecl_super) REFERENCES CAD_GRP_OPECL (ide_grp_opecl);

ALTER TABLE CAD_ITM_CONTGM_PNT_FNC
ADD CONSTRAINT R_2965 FOREIGN KEY (ide_contgm_pnt_fnc) REFERENCES CAD_CONTGM_PNT_FNC (ide_contgm_pnt_fnc);

ALTER TABLE CAD_ITM_CONTGM_PNT_FNC
ADD CONSTRAINT R_2966 FOREIGN KEY (ide_contgm_pnt_fnc) REFERENCES CAD_CONTGM_PNT_FNC (ide_contgm_pnt_fnc);

ALTER TABLE CAD_ITM_CONTGM_PNT_FNC
ADD CONSTRAINT R_959 FOREIGN KEY (ide_tip_fnc) REFERENCES CAD_TIP_FNC_PNT_FNC (ide_tip_fnc);

ALTER TABLE CAD_NOTES_CONSULTA
ADD CONSTRAINT FK_CAD_STATUS_CARGA FOREIGN KEY (ide_status_carga) REFERENCES CAD_STATUS_CARGA (ide_status_carga);

ALTER TABLE CAD_NOTES_CONSULTA
ADD CONSTRAINT R_863 FOREIGN KEY (ide_carga_gde) REFERENCES CTL_CARGA_GDE (ide_carga_gde);

ALTER TABLE CAD_NOTES_EXECUTOR
ADD CONSTRAINT FK_CAD_STATUS_CARGA FOREIGN KEY (ide_status_carga) REFERENCES CAD_STATUS_CARGA (ide_status_carga);

ALTER TABLE CAD_NOTES_EXECUTOR
ADD CONSTRAINT R_862 FOREIGN KEY (ide_carga_gde) REFERENCES CTL_CARGA_GDE (ide_carga_gde);

ALTER TABLE CAD_NOTES_HOMOLOGACAO
ADD CONSTRAINT FK_CAD_STATUS_CARGA FOREIGN KEY (ide_status_carga) REFERENCES CAD_STATUS_CARGA (ide_status_carga);

ALTER TABLE CAD_NOTES_HOMOLOGACAO
ADD CONSTRAINT R_861 FOREIGN KEY (ide_carga_gde) REFERENCES CTL_CARGA_GDE (ide_carga_gde);

ALTER TABLE CAD_NOTES_PEDIDO
ADD CONSTRAINT FK_CAD_STATUS_CARGA FOREIGN KEY (ide_status_carga) REFERENCES CAD_STATUS_CARGA (ide_status_carga);

ALTER TABLE CAD_NOTES_PEDIDO
ADD CONSTRAINT R_859 FOREIGN KEY (ide_carga_gde) REFERENCES CTL_CARGA_GDE (ide_carga_gde);

ALTER TABLE CAD_NOTES_VALIDACAO
ADD CONSTRAINT FK_CAD_STATUS_CARGA FOREIGN KEY (ide_status_carga) REFERENCES CAD_STATUS_CARGA (ide_status_carga);

ALTER TABLE CAD_NOTES_VALIDACAO
ADD CONSTRAINT R_860 FOREIGN KEY (ide_carga_gde) REFERENCES CTL_CARGA_GDE (ide_carga_gde);

ALTER TABLE CAD_PDID_TI
ADD CONSTRAINT R_2760 FOREIGN KEY (ide_tip_pdid_ti) REFERENCES CAD_TIP_PDID_TI (ide_tip_pdid_ti);

ALTER TABLE CAD_PDID_TI
ADD CONSTRAINT R_2812 FOREIGN KEY (ide_ult_trans_estdo_pdid_ti) REFERENCES CAD_TRANS_ESTDO_PDID_TI (ide_trans_estdo_pdid_ti);

ALTER TABLE CAD_PDID_TI
ADD CONSTRAINT R_932 FOREIGN KEY (ide_categ_opecl_ti) REFERENCES CAD_CATEG_OPECL_TI (ide_categ_opecl_ti);

ALTER TABLE CAD_PDID_TI
ADD CONSTRAINT R_933 FOREIGN KEY (ide_categ_prdt_ti) REFERENCES CAD_CATEG_PRDT_TI (ide_categ_prdt_ti);

ALTER TABLE CAD_PRBLM_TI
ADD CONSTRAINT R_934 FOREIGN KEY (ide_categ_prdt_ti) REFERENCES CAD_CATEG_PRDT_TI (ide_categ_prdt_ti);

ALTER TABLE CAD_PRBLM_TI
ADD CONSTRAINT R_935 FOREIGN KEY (ide_categ_opecl_ti) REFERENCES CAD_CATEG_OPECL_TI (ide_categ_opecl_ti);

ALTER TABLE CAD_PROCS_ELEMTAR_PNT_FNC
ADD CONSTRAINT R_2986 FOREIGN KEY (ide_contgm_aplic) REFERENCES CAD_CONTGM_APLIC (ide_contgm_aplic);

ALTER TABLE CAD_PROCS_ELEMTAR_PNT_FNC
ADD CONSTRAINT R_965 FOREIGN KEY (ide_tip_fnc) REFERENCES CAD_TIP_FNC_PNT_FNC (ide_tip_fnc);

ALTER TABLE CAD_REMEDY_HPD_AUDIT_LOG_SYSTEM
ADD CONSTRAINT R_924 FOREIGN KEY (ide_carga_gde) REFERENCES CTL_CARGA_GDE (ide_carga_gde);

ALTER TABLE CAD_REMEDY_HPD_AUDIT_LOG_SYSTEM
ADD CONSTRAINT R_925 FOREIGN KEY (ide_status_carga) REFERENCES CAD_STATUS_CARGA (ide_status_carga);

ALTER TABLE CAD_REMEDY_HPD_HELP_DESK
ADD CONSTRAINT R_920 FOREIGN KEY (ide_carga_gde) REFERENCES CTL_CARGA_GDE (ide_carga_gde);

ALTER TABLE CAD_REMEDY_HPD_HELP_DESK
ADD CONSTRAINT R_921 FOREIGN KEY (ide_status_carga) REFERENCES CAD_STATUS_CARGA (ide_status_carga);

ALTER TABLE CAD_REMEDY_PBM_PROBLEM_INVESTIGATION
ADD CONSTRAINT R_928 FOREIGN KEY (ide_carga_gde) REFERENCES CTL_CARGA_GDE (ide_carga_gde);

ALTER TABLE CAD_REMEDY_PBM_PROBLEM_INVESTIGATION
ADD CONSTRAINT R_929 FOREIGN KEY (ide_status_carga) REFERENCES CAD_STATUS_CARGA (ide_status_carga);

ALTER TABLE CAD_TIP_DADO_PNT_FNC
ADD CONSTRAINT R_2982 FOREIGN KEY (ide_grp_dados_pnt_fnc) REFERENCES CAD_GRP_DADOS_PNT_FNC (ide_grp_dados_pnt_fnc);

ALTER TABLE CAD_TIP_DADO_PNT_FNC
ADD CONSTRAINT R_2990 FOREIGN KEY (ide_procs_elemtar_pnt_fnc) REFERENCES CAD_PROCS_ELEMTAR_PNT_FNC (ide_procs_elemtar_pnt_fnc);

ALTER TABLE CAD_TIP_PDID_TI
ADD CONSTRAINT R_2785 FOREIGN KEY (ide_tip_pdid_ti_super) REFERENCES CAD_TIP_PDID_TI (ide_tip_pdid_ti);

ALTER TABLE CAD_TIP_REG_PNT_FNC
ADD CONSTRAINT R_2983 FOREIGN KEY (ide_grp_dados_pnt_fnc) REFERENCES CAD_GRP_DADOS_PNT_FNC (ide_grp_dados_pnt_fnc);

ALTER TABLE CAD_TRANS_ESTDO_PDID_TI
ADD CONSTRAINT R_2770 FOREIGN KEY (ide_pdid_ti) REFERENCES CAD_PDID_TI (ide_pdid_ti);

ALTER TABLE CAD_TRANS_ESTDO_PDID_TI
ADD CONSTRAINT R_2771 FOREIGN KEY (ide_estdo_pdid_ti) REFERENCES CAD_ESTDO_PDID_TI (ide_estdo_pdid_ti);

ALTER TABLE CAD_TRANS_ESTDO_PDID_TI
ADD CONSTRAINT R_2772 FOREIGN KEY (ide_grp_dsignd) REFERENCES CAD_GRP_OPECL (ide_grp_opecl);

ALTER TABLE CAD_TRANS_ESTDO_PRBLM_TI
ADD CONSTRAINT R_2888 FOREIGN KEY (ide_estdo_prblm_ti) REFERENCES CAD_ESTDO_PRBLM_TI (ide_estdo_prblm_ti);

ALTER TABLE CAD_TRANS_ESTDO_PRBLM_TI
ADD CONSTRAINT R_2889 FOREIGN KEY (ide_prblm_ti) REFERENCES CAD_PRBLM_TI (ide_prblm_ti);

ALTER TABLE HIS_NOTES_CONSULTA
ADD CONSTRAINT R_872 FOREIGN KEY (ide_status_carga) REFERENCES CAD_STATUS_CARGA (ide_status_carga);

ALTER TABLE HIS_NOTES_CONSULTA
ADD CONSTRAINT R_873 FOREIGN KEY (ide_carga_gde) REFERENCES CTL_CARGA_GDE (ide_carga_gde);

ALTER TABLE HIS_NOTES_EXECUTOR
ADD CONSTRAINT R_870 FOREIGN KEY (ide_status_carga) REFERENCES CAD_STATUS_CARGA (ide_status_carga);

ALTER TABLE HIS_NOTES_EXECUTOR
ADD CONSTRAINT R_871 FOREIGN KEY (ide_carga_gde) REFERENCES CTL_CARGA_GDE (ide_carga_gde);

ALTER TABLE HIS_NOTES_HOMOLOGACAO
ADD CONSTRAINT R_868 FOREIGN KEY (ide_status_carga) REFERENCES CAD_STATUS_CARGA (ide_status_carga);

ALTER TABLE HIS_NOTES_HOMOLOGACAO
ADD CONSTRAINT R_869 FOREIGN KEY (ide_carga_gde) REFERENCES CTL_CARGA_GDE (ide_carga_gde);

ALTER TABLE HIS_NOTES_PEDIDO
ADD CONSTRAINT R_864 FOREIGN KEY (ide_status_carga) REFERENCES CAD_STATUS_CARGA (ide_status_carga);

ALTER TABLE HIS_NOTES_PEDIDO
ADD CONSTRAINT R_865 FOREIGN KEY (ide_carga_gde) REFERENCES CTL_CARGA_GDE (ide_carga_gde);

ALTER TABLE HIS_NOTES_VALIDACAO
ADD CONSTRAINT R_866 FOREIGN KEY (ide_status_carga) REFERENCES CAD_STATUS_CARGA (ide_status_carga);

ALTER TABLE HIS_NOTES_VALIDACAO
ADD CONSTRAINT R_867 FOREIGN KEY (ide_carga_gde) REFERENCES CTL_CARGA_GDE (ide_carga_gde);

ALTER TABLE HIS_REMEDY_HPD_AUDIT_LOG_SYSTEM
ADD CONSTRAINT R_926 FOREIGN KEY (ide_carga_gde) REFERENCES CTL_CARGA_GDE (ide_carga_gde);

ALTER TABLE HIS_REMEDY_HPD_AUDIT_LOG_SYSTEM
ADD CONSTRAINT R_927 FOREIGN KEY (ide_status_carga) REFERENCES CAD_STATUS_CARGA (ide_status_carga);

ALTER TABLE HIS_REMEDY_HPD_HELP_DESK
ADD CONSTRAINT R_922 FOREIGN KEY (ide_carga_gde) REFERENCES CTL_CARGA_GDE (ide_carga_gde);

ALTER TABLE HIS_REMEDY_HPD_HELP_DESK
ADD CONSTRAINT R_923 FOREIGN KEY (ide_status_carga) REFERENCES CAD_STATUS_CARGA (ide_status_carga);

ALTER TABLE HIS_REMEDY_PBM_PROBLEM_INVESTIGATION
ADD CONSTRAINT R_930 FOREIGN KEY (ide_carga_gde) REFERENCES CTL_CARGA_GDE (ide_carga_gde);

ALTER TABLE HIS_REMEDY_PBM_PROBLEM_INVESTIGATION
ADD CONSTRAINT R_931 FOREIGN KEY (ide_status_carga) REFERENCES CAD_STATUS_CARGA (ide_status_carga);

ALTER TABLE REL_AGRUP_ESTDO_PDID_TI
ADD CONSTRAINT R_2881 FOREIGN KEY (ide_estdo_pdid_ti) REFERENCES CAD_ESTDO_PDID_TI (ide_estdo_pdid_ti);

ALTER TABLE REL_AGRUP_ESTDO_PDID_TI
ADD CONSTRAINT R_2883 FOREIGN KEY (ide_grp_estdo_pdid_ti) REFERENCES CAD_GRP_ESTDO_PDID_TI (ide_grp_estdo_pdid_ti);

ALTER TABLE REL_PDID_TI_CICLO_FILA_DMNDA_TI
ADD CONSTRAINT R_2790 FOREIGN KEY (ide_pdid_ti) REFERENCES CAD_PDID_TI (ide_pdid_ti);

ALTER TABLE REL_PDID_TI_CICLO_FILA_DMNDA_TI
ADD CONSTRAINT R_2809 FOREIGN KEY (ide_ciclo_fila_dmnda_ti) REFERENCES CAD_CICLO_FILA_DMNDA_TI (ide_ciclo_fila_dmnda_ti);

ALTER TABLE REL_PRBLM_PDID_TI
ADD CONSTRAINT R_2884 FOREIGN KEY (ide_prblm_ti) REFERENCES CAD_PRBLM_TI (ide_prblm_ti);

ALTER TABLE REL_PRBLM_PDID_TI
ADD CONSTRAINT R_2886 FOREIGN KEY (ide_pdid_ti) REFERENCES CAD_PDID_TI (ide_pdid_ti);

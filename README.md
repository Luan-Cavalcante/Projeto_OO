

<h1 style="text-align: center;">Gererenciador de Pagamentos de República Universitária</h1>

<h3 style="text-align: center;">Projeto Final da Disciplina de Orientação a Objetos</h3>

<h5 style="text-align: left;">Turma: A - 1.2021 - Professor: Dr. André Luiz Peron Martins Lanna</h5>

<h4 style="text-align: center;">Universidade de Brasília <img src="https://raw.githubusercontent.com/JhonathanNicolas/Projeto_OO/master/imgs/unb_logo.png" width="25" height="15">
</h4 >


## Integrantes
- Davi Matheus Garcia Pedroza - 160070040
- Genilson Silva de Araújo - 202045482
- Iago Carvalho Cavalcante - 180018621
- Jhonathan Nicolas Moreira Silva - 160031621
- Luan Vasco Cavalcante - 190111836
- Pedro Henrique Yamaguti - 190094508

## Features

- Cadastro de Residentes
- Cadastro de Categorias e subcategorias
- Cadastro de despesas
- Tratamento de exceções para diversas situações
- Cálculo da dispersa por residente baseado no método igualitário e/ou proporcional.

O Gerenciador de pagamentos de república tem o interesse de ajudar o usuário a mapear despesas dentro da república universitária, informando suas categorias, subcategorias e quanto cada residente deve pagar ao final do mês considerando o método igualitário ou proporcional.

## UML

Link para a UML editável: 
>https://drive.google.com/file/d/13SuR3UysYN9rx-EQOwAMbz1r00mUBjDj/view?usp=sharing

 - PDF: https://github.com/Luan-Cavalcante/Projeto_OO/blob/master/UML.pdf 

## Exceções
>**CategoriaNaoInformadaException**: Trata casos onde a categoria não é informada no cadastro.

>**DataNaoInformadaException**: Trata casos onde a data não é informada no cadastro.

>**DescricaoNaoInformadaException**: Trata casos quando a descrição da categoria ou subcategoria não é informada.

>**ListadeResidentesVaziaException**: Trata casos quando o não é informado residentes no cadastro

>**NroPagamentosDiferenteNroResidentesAException**: Trata casos quando o número de pagamentos(parcela por pessoa), por alguma razão é maior que o número de residentes


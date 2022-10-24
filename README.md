# Zero Glosa - MVP
## Descrição do Processo / Problema

[Glosas](https://pt.wikipedia.org/wiki/Glosa_m%C3%A9dica) são faturamentos não recebidos ou recusados nas organizações de saúde, por problemas de comunicação entre clínicas / hospitais e convênios. Em geral, as glosas acontecem quando as informações sobre um atendimento, fornecidas pelo prestador, não batem com o registro no plano de saúde ou estão fora do fora previamente acordado entre as partes.

O objetivo do seguinte projeto é criar uma solução para esse problema de comunicação entre as partes e assim reduzir ao máximo a geração de glosa.

## Análise de Requisitos

O produto consiste em uma aplicação capaz de buscar as informações dos demonstrativos de contas e de pagamentos e extrair os valores de faturamento e de glosa a partir desses demonstrativos.

Após uma reunião com a cliente foi realizado o levantamento dos requisitos para o projeto.
Como **requisitos funcionais** foram identificados:

- Realizar login com chave de acesso corporativo único (email) e senha.
- Buscar os demonstrativos de contas faturadas do Hospital.
- Buscar os demonstrativos de pagamento dos Convênios.
- Extrair valor do faturamento e de glosa dos demonstrativos.
- Detalhar os demonstrativos a nível de Itens.
- Detectar as diferenças em nomenclatura e códigos de produtos entre Hospital e Demonstrativos do Convênio.
- Identificar itens que não foram conciliados.
- Identificar contas com glosa que estão dentro do período de contestação.
- Identificar contas com glosa total.
- Identificar contas inadimplentes.
- Filtrar contas conforme os identificadores.

Como **requisitos não funcionais** foram identificados:

- O produto final será um sistema Web.
- O produto seguirá o modelo de arquitetura MVC.
- As linguagens utilizadas no fronted serão TypeScript e JavaScript.
- A linguagem utilizada no backend será Groovy.
- O framework a ser utilizado no backend será Springboot.

package persistingdata

import com.opencsv.bean.CsvBindByName

class GuiaConvenio {
    @CsvBindByName(column = "convenio")
    def convenio

    @CsvBindByName(column = "data_pagamento")
    def data_pagamento

    @CsvBindByName(column = "numero_protocolo")
    def numero_protocolo

    @CsvBindByName(column = "matricula")
    def matricula

    @CsvBindByName(column = "nome")
    def nome

    @CsvBindByName(column = "numero_guia")
    def numero_guia

    @CsvBindByName(column = "numero_guia_prestador")
    def numero_guia_prestador

    @CsvBindByName(column = "senha")
    def senha

    @CsvBindByName(column = "codigo")
    def codigo

    @CsvBindByName(column = "descricao")
    def descricao

    @CsvBindByName(column = "valor_apresentado")
    def valor_apresentado

    @CsvBindByName(column = "valor_pago")
    def valor_pago

    @CsvBindByName(column = "valor_glosa")
    def valor_glosa

    @CsvBindByName(column = "descricao_motivo")
    def descricao_motivo

    @CsvBindByName(column = "codigo_motivo")
    def codigo_motivo

    @CsvBindByName(column = "data_pagamento")
    def data_pagamento_2

    static constraints = {
    }

    @Override
    String toString() {
        return "Convenio: " + convenio + "\n" +
                "Data pagamento: " + data_pagamento + "\n" +
                "Numero protocolo: " + numero_protocolo + "\n" +
                "Matricula: " + matricula + "\n" +
                "Nome: " + nome + "\n" +
                "Numero guia: " + numero_guia + "\n" +
                "Numero guia_prestador: " + numero_guia_prestador + "\n" +
                "Senha: " + senha + "\n" +
                "Codigo: " + codigo + "\n" +
                "Descricao: " + descricao + "\n" +
                "Valor apresentado: " + valor_apresentado + "\n" +
                "Valor pago: " + valor_pago + "\n" +
                "Valor glosa: "+ valor_glosa + "\n" +
                "Descricao motivo: " + descricao_motivo + "\n" +
                "Codigo motivo: " + codigo_motivo + "\n" +
                "data_pagamento_2: " + data_pagamento_2 + "\n"
    }
}

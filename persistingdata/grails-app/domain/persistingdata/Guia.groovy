package persistingdata

import com.opencsv.bean.CsvBindByName

class Guia {
    @CsvBindByName(column = "prestador")
    def prestador

    @CsvBindByName(column = "data_faturamento")
    def data_faturamento

    @CsvBindByName(column = "remessa")
    def remessa

    @CsvBindByName(column = "numero_remessa")
    def numero_remessa

    @CsvBindByName(column = "matricula")
    def matricula

    @CsvBindByName(column = "nome")
    def nome

    @CsvBindByName(column = "numero_guia")
    def numero_guia

    @CsvBindByName(column = "senha")
    def senha

    @CsvBindByName(column = "codigo")
    def codigo

    @CsvBindByName(column = "descricao")
    def descricao

    @CsvBindByName(column = "valor_cobrado")
    def valor_cobrado

    @CsvBindByName(column = "data_atendimento")
    def data_atendimento

    static constraints = {
    }

    def getPrestador() {
        return prestador
    }

    void setPrestador(prestador) {
        this.prestador = prestador
    }

    def getDataFaturamento() {
        return data_faturamento
    }

    void setDataFaturamento(data_faturamento) {
        this.data_faturamento = data_faturamento
    }

    def getRemessa() {
        if (remessa)
            return remessa
        return numero_remessa
    }

    void setRemessa(remessa) {
        this.remessa = remessa
    }

    void setNumeroRemessa(numero_remessa) {
        this.numero_remessa = numero_remessa
    }

    def getMatricula() {
        return matricula
    }

    void setMatricula(matricula) {
        this.matricula = matricula
    }

    def getNome() {
        return nome
    }

    void setNome(nome) {
        this.nome = nome
    }

    def getNumeroGuia() {
        return numero_guia
    }

    void setNumeroGuia(numero_guia) {
        this.numero_guia = numero_guia
    }

    def getSenha() {
        return senha
    }

    void setSenha(senha) {
        this.senha = senha
    }

    def getCodigo() {
        return codigo
    }

    void setCodigo(codigo) {
        this.codigo = codigo
    }

    def getDescricao() {
        return descricao
    }

    void setDescricao(descricao) {
        this.descricao = descricao
    }

    def getValorCobrado() {
        return valor_cobrado
    }

    void setValorCobrado(valor_cobrado) {
        this.valor_cobrado = valor_cobrado
    }

    def getDataAtendimento() {
        return data_atendimento
    }

    void setDataAtendimento(data_atendimento) {
        this.data_atendimento = data_atendimento
    }

    @Override
    String toString() {
        return "\nPrestador: " + prestador + "\n" +
               "Data faturamento: " + data_faturamento + "\n"+
               "Remsessa: " + getRemessa() + "\n" +
               "Matricula: " + matricula + "\n" +
               "Nome: " + nome + "\n" +
               "Numero Guia: " + numero_guia + "\n" +
               "Senha: " + senha + "\n" +
               "Codigo: " + codigo + "\n" +
               "Descricao: " + descricao + "\n" +
               "Valor cobrado: " + valor_cobrado + "\n" +
               "Data atendimento: " + data_atendimento + "\n"
    }
}

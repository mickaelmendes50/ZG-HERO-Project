package persistingdata

class Demonstrativo {
    List<GuiaConvenio> guias

    List<GuiaConvenio> getGuias() {
        return guias
    }

    void setGuias(List<GuiaConvenio> guias) {
        this.guias = guias.collect()
    }

    static constraints = {
    }

    @Override
    String toString() {
        String str = ""
        for (guia in this.guias) {
            str += guia.toString() + "\n"
        }
        return str
    }
}

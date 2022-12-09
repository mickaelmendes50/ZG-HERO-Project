package persistingdata

class Fatura {
    List<Guia> guias

    List<Guia> getGuias() {
        return guias
    }

    void setGuias(List<Guia> guias) {
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

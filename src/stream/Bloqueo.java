package stream;

class Bloqueo {
    private String hotCodigo;
    private String codigoBloqueo;

    public Bloqueo() {
    }

    public Bloqueo(String hotCodigo, String codigoBloqueo) {
        this.hotCodigo = hotCodigo;
        this.codigoBloqueo = codigoBloqueo;
    }

    public String getHotCodigo() {
        return hotCodigo;
    }

    public void setHotCodigo(String hotCodigo) {
        this.hotCodigo = hotCodigo;
    }

    public String getCodigoBloqueo() {
        return codigoBloqueo;
    }

    public void setCodigoBloqueo(String codigoBloqueo) {
        this.codigoBloqueo = codigoBloqueo;
    }
}

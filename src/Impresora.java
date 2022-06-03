import java.util.ArrayList;

public class Impresora {
    private boolean estado;
    private ArrayList<DocumentoOfimatico> colaImpresion = new ArrayList<DocumentoOfimatico>();

    public Impresora() {
        this.estado = false;
    }

    public void addWork(DocumentoOfimatico documentoOfimatico) {
        if (this.estado) {
            colaImpresion.add(documentoOfimatico);
        } else {
            System.out.println("Documento rechazado. Impresora apagada");
        }
    }

    public int sizeCola() {
        return colaImpresion.size();
    }

    public boolean isEstado() {
        return estado;
    }

    public void printerUp() {
        this.estado = true;
    }

    public void printerDown() {
        this.estado = false;
    }

    public DocumentoOfimatico imprimir() {

        return colaImpresion.remove(0);

    }


    @Override
    public String toString() {
        return "colaImpresion=" + colaImpresion ;
    }
}

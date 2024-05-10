import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaOrdenadaTest {
    private ListaOrdenada<Medico> listaMedicos;
    @BeforeEach
    public void setUp() {
        listaMedicos = new ListaOrdenada<>();
    }
    @DisplayName("Verifico que un nodo se inserta en la lista correctamente")
    @Test
    void insertar() {
        Medico medico1 = new Medico(53655862,"Pepito","Cardiología");
        Nodo<Medico> nodoMedico1 = new Nodo<>("medico1", medico1);
        listaMedicos.insertar(nodoMedico1);
        Nodo<Medico> primerNodo = listaMedicos.getPrimero();
        assertEquals(medico1, primerNodo.getDato());
    }
    @DisplayName("Verifico si se agregaron correctamente")
    @Test
    void insertarMedicosenFormaAlfabetica() {
        Medico medico1 = new Medico(53655862,"Aepito","Cardiología");
        Medico medico2 = new Medico(53655862,"Cepito","Cardiología");
        Medico medico3 = new Medico(53655862,"Abpito","Cardiología");
        Medico medico4 = new Medico(53655862,"Bepito","Cardiología");

        Nodo<Medico> nodoMedico1 = new Nodo<>("medico1", medico1);
        Nodo<Medico> nodoMedico2 = new Nodo<>("medico2", medico2);
        Nodo<Medico> nodoMedico3 = new Nodo<>("medico3", medico3);
        Nodo<Medico> nodoMedico4 = new Nodo<>("medico4", medico4);

        listaMedicos.insertar(nodoMedico1);
        listaMedicos.insertar(nodoMedico2);
        listaMedicos.insertar(nodoMedico3);
        listaMedicos.insertar(nodoMedico4);
        Nodo<Medico> segundoNodo = listaMedicos.getPrimero().getSiguiente();
        assertEquals(medico2, segundoNodo.getDato());
    }
}
package test;

import dao.impl.DaoEnMemoria;
import model.Odontologo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.OdontologosService;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologosServiceTestMemoria {

        OdontologosService odontologosService = new OdontologosService(new DaoEnMemoria());
    @Test
    @DisplayName("Testear que un odontologo fue cargado correctamente ")
    void caso1(){
        //Dado
        Odontologo odontologo1 = new Odontologo(789, "pepito", "perez");
        Odontologo odontologo2 = new Odontologo(7899, "luis", "lopez");
        //cuando
        Odontologo odontologoDesdeDb1 = odontologosService.guardarOdontolog(odontologo1);
        Odontologo odontologoDesdeDb2 = odontologosService.guardarOdontolog(odontologo2);
        List<Odontologo> odontologos = odontologosService.buscarTodos();
        // entonces
        assertEquals(2, odontologos.size());
    }


}



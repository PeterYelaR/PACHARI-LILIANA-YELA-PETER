package service;

import dao.IDao;
import model.Odontologo;

import java.util.List;

public class OdontologosService {
    private IDao<Odontologo> odontologoIDao;

    public OdontologosService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public Odontologo guardarOdontolog(Odontologo odontologo){
        return odontologoIDao.guardar(odontologo);
    }
    public List<Odontologo> buscarTodos(){
        return odontologoIDao.buscarTodos();
    }
}

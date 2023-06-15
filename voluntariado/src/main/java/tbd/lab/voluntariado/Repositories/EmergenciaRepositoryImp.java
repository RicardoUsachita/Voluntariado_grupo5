package tbd.lab.voluntariado.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import tbd.lab.voluntariado.Models.Emergencia;

import java.util.List;

@Repository
public class EmergenciaRepositoryImp implements EmergenciaRepository {
    //Implementacion de firmas a traves del uso de sql2o para la conexion con la DB.
    @Autowired
    private Sql2o sql2o;

    /**
     * @return {@value} int cantidad de emergencias
     * @throws Exception si no se puede obtener la cantidad de emergencias
     * @see tbd.lab.voluntariado.Repositories.EmergenciaRepository#countEmergencias()
     */
    @Override
    public int countEmergencias(){
        int total = 0;
        String sql = "SELECT COUNT(*) FROM emergencia";
        try (Connection conn = sql2o.open()) {
            total = conn.createQuery(sql).executeScalar(Integer.class);
            return total;
        }
    }

    /**
     * @return {@value} int nuevo id
     * @throws Exception si no se puede obtener el id
     * @see tbd.lab.voluntariado.Repositories.EmergenciaRepository#newId()
     */
    @Override
    public int newId(){
        int id = 0;
        String sql = "SELECT MAX(id) FROM emergencia";
        try (Connection conn = sql2o.open()) {
            id = conn.createQuery(sql).executeScalar(Integer.class);
            return id;
        }
    }

    /**
     * @return {@value} List<Emergencia> lista de emergencias
     * @throws Exception si no se puede obtener la lista de emergencias
     * @see tbd.lab.voluntariado.Repositories.EmergenciaRepository#getAll()
     */
    @Override
    public List<Emergencia> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM emergencia ORDER BY Emergencia.id ASC")
                    .executeAndFetch(Emergencia.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * @param id {@value} long id de emergencia
     * @return {@value} List<Emergencia> id lista de emergencias
     * @throws Exception si no se puede obtener la lista de emergencias
     * @see tbd.lab.voluntariado.Repositories.EmergenciaRepository#showEmergenciaById(long id)
     */
    @Override
    public List<Emergencia> showEmergenciaById(long id){
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM emergencia WHERE emergencia.id = :id")
                    .addParameter("id", id)
                    .executeAndFetch(Emergencia.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * @param emergencia {@value} Emergencia emergencia
     * @return {@value} Emergencia emergencia
     * @throws Exception si no se puede crear la emergencia
     * @see tbd.lab.voluntariado.Repositories.EmergenciaRepository#createEmergencia(Emergencia emergencia)
     */
    @Override
    public Emergencia createEmergencia(Emergencia emergencia){
        Connection conn = sql2o.open();
        String SQL_INSERT = "INSERT INTO emergencia(nombre, descripcion, fecha,reqs_grupales, reqs_individuales,longitude,latitude)" +
                "VALUES(:nombre2, :descripcion2, :fecha2, :reqs_grupales2, :reqs_individuales2, :longitude2, :latitude2)";
        try{
            conn.createQuery(SQL_INSERT)
                    .addParameter("nombre2", emergencia.getNombre())
                    .addParameter("descripcion2", emergencia.getDescripcion())
                    .addParameter("fecha2", emergencia.getFecha())
                    .addParameter("reqs_grupales2", emergencia.getReqs_grupales())
                    .addParameter("reqs_individuales2", emergencia.getReqs_individuales())
                    .addParameter("longitude2", emergencia.getLongitude())
                    .addParameter("latitude2", emergencia.getLatitude())
                    .executeUpdate();
            emergencia.setId(newId());
            return emergencia;
        } catch(Exception e) {
            System.out.println(e.getMessage() + e.getLocalizedMessage() + "No se pudo crear la emergencia\n");
            return null;
        }
    }


    /**
     * @param id {@value} long id de emergencia
     * @return void
     * @throws Exception si no se puede eliminar la emergencia
     * @see tbd.lab.voluntariado.Repositories.EmergenciaRepository#deleteEmergencia(long id)
     */
    @Override
    public void deleteEmergenciaById(long id){
        Connection conn = sql2o.open();
        String SQL_DELETE = "DELETE FROM emergencia WHERE emergencia.id = :id";

        try{
            conn.createQuery(SQL_DELETE).addParameter("id", id).executeUpdate();

        } catch(Exception e) {
            System.out.println(e.getMessage() + e.getLocalizedMessage() + "No se pudo borrar la emergencia\n");
        }
    }

    /**
     * @param emergencia {@value} Emergencia emergencia
     * @return {@value} Emergencia emergencia
     * @throws Exception si no se puede actualizar la emergencia
     * @see tbd.lab.voluntariado.Repositories.EmergenciaRepository#updateEmergencia(Emergencia emergencia)
     */
    @Override
    public void updateEmergencia(Emergencia emergencia){

        String SQL_UPDATE = "UPDATE emergencia SET nombre = :nombre2, descripcion = :descripcion2, fecha = :fecha2, reqs_grupales = :reqs_grupales2, reqs_individuales = :reqs_individuales2, longitude = :longitude2, latitude = :latitude2, id = :id2 WHERE id = :id2";
        try(Connection conn = sql2o.open()) {

            conn.createQuery(SQL_UPDATE)
                    .addParameter("nombre2", emergencia.getNombre())
                    .addParameter("descripcion2", emergencia.getDescripcion())
                    .addParameter("fecha2", emergencia.getFecha())
                    .addParameter("reqs_grupales2", emergencia.getReqs_grupales())
                    .addParameter("reqs_individuales2", emergencia.getReqs_individuales())
                    .addParameter("longitude2", emergencia.getLongitude())
                    .addParameter("latitude2", emergencia.getLatitude())
                    .addParameter("id2", emergencia.getId())
                    .executeUpdate();

        } catch(Exception e) {
            System.out.println(e.getMessage() + e.getLocalizedMessage() + "No se pudo actualizar la emergencia\n");
        }
    }




}

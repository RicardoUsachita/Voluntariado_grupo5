package tbd.lab.voluntariado.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import tbd.lab.voluntariado.Models.Institucion;

import java.util.List;


@Repository
public class InstitucionRepositoryImp implements InstitucionRepository{

    //Implementacion de firmas a traves del uso de sql2o para la conexion con la DB.
    @Autowired
    private Sql2o sql2o;
    /**
     * @return {@value} int cantidad de instituciones
     * @throws Exception si no se puede obtener la cantidad de instituciones
     * @see tbd.lab.voluntariado.Repositories.InstitucionRepository#countInstituciones()
     */
    @Override
    public int countInstituciones(){
        int total = 0;
        String sql = "SELECT COUNT(*) FROM institucion";
        try (Connection conn = sql2o.open()) {
            total = conn.createQuery(sql).executeScalar(Integer.class);
            return total;
        }
    }

    /**
     * @return {@value} int nuevo id
     * @throws Exception si no se puede obtener el id
     * @see tbd.lab.voluntariado.Repositories.InstitucionRepository#newId()
     */
    @Override
    public int newId(){
        int id = 0;
        String sql = "SELECT MAX(id) FROM institucion";
        try (Connection conn = sql2o.open()) {
            id = conn.createQuery(sql).executeScalar(Integer.class);
            return id;
        }
    }

    /**
     * @return {@value} List<Institucion> lista de instituciones
     * @throws Exception si no se puede obtener la lista de instituciones
     * @see tbd.lab.voluntariado.Repositories.InstitucionRepository#getAll()
     */
    @Override
    public List<Institucion> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM institucion ORDER BY institucion.id ASC")
                    .executeAndFetch(Institucion.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * @param id {@value} int id de la institucion
     * @return {@value} Institucion institucion
     * @throws Exception si no se puede obtener la institucion
     * @see tbd.lab.voluntariado.Repositories.InstitucionRepository#getById(int)
     */
    @Override
    public List<Institucion> showInstitucionById(long id){
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM institucion WHERE institucion.id = :id")
                    .addParameter("id", id)
                    .executeAndFetch(Institucion.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * @param nombre {@value} String nombre de la institucion
     * @return {@value} List<Institucion> lista de instituciones
     * @throws Exception si no se puede obtener la lista de instituciones
     * @see tbd.lab.voluntariado.Repositories.InstitucionRepository#getByNombre(String)
     */
    @Override
    public Institucion createInstitucion(Institucion institucion){
        Connection conn = sql2o.open();
        String SQL_INSERT = "INSERT INTO institucion ( nombre, usuario, password, correo, numero) VALUES ( :nombre2, :usuario2, :password2, :correo2, :numero2)";

        try{

            conn.createQuery(SQL_INSERT)
                    .addParameter("nombre2", institucion.getNombre())
                    .addParameter("usuario2",institucion.getUsuario())
                    .addParameter("password2",institucion.getPassword())
                    .addParameter("correo2", institucion.getCorreo())
                    .addParameter("numero2", institucion.getNumero())
                    .executeUpdate();

            institucion.setId(newId());
            return institucion;

        } catch(Exception e) {
            System.out.println(e.getMessage() + e.getLocalizedMessage() + "No se pudo crear la institucion\n");
            return null;
        }
    }

    /**
     * @param institucion {@value} Institucion institucion
     * @return {@value} Institucion institucion
     * @throws Exception si no se puede actualizar la institucion
     * @see tbd.lab.voluntariado.Repositories.InstitucionRepository#updateInstitucion(Institucion)
     */
    @Override
    public void deleteInstitucionById(long id){
        Connection conn = sql2o.open();
        String SQL_DELETE = "DELETE FROM institucion WHERE institucion.id = :id";

        try{
            conn.createQuery(SQL_DELETE).addParameter("id", id).executeUpdate();

        } catch(Exception e) {
            System.out.println(e.getMessage() + e.getLocalizedMessage() + "No se pudo borrar la institucion\n");
        }
    }

    /**
     * @param institucion {@value} Institucion institucion
     * @return {@value} Institucion institucion
     * @throws Exception si no se puede actualizar la institucion
     * @see tbd.lab.voluntariado.Repositories.InstitucionRepository#updateInstitucion(Institucion)
     */
    @Override
    public void updateInstitucion(Institucion institucion){

        String SQL_UPDATE = "UPDATE institucion SET nombre = :nombre2, usuario = :usuario2, password = :password2, correo = :correo2, numero = :numero2 WHERE id = :id2";


        try(Connection conn = sql2o.open()) {

            conn.createQuery(SQL_UPDATE)
                    .addParameter("id2", institucion.getId())
                    .addParameter("nombre2", institucion.getNombre())
                    .addParameter("usuario2", institucion.getUsuario())
                    .addParameter("password2", institucion.getPassword())
                    .addParameter("correo2", institucion.getCorreo())
                    .addParameter("numero2", institucion.getNumero())
                    .executeUpdate();

        } catch(Exception e) {
            System.out.println(e.getMessage() + e.getLocalizedMessage() + "No se pudo actualizar la institucion\n");
        }
    }


}

import bl.HibernateUtil;
import entity.Audios;
import org.hibernate.Session;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

public class Exemple {
    public static void main(String[] args) throws SQLException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Audios audios = new Audios();
        audios.setAudio("seconddssssfg");
        audios.setDate(new Timestamp(new Date().getTime()));
        audios.setName("SecondAudio");
        session.save(audios);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
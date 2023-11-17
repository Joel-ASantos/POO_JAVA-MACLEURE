package poo.dao;
import org.hibernate.cfg.Configuration;
import poo.model.Pessoa;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PessoaDAO {
    private static final SessionFactory sessionFactory;

    static{
        try{
            Configuration configuration = new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
        }catch (Exception e){
            throw new ExceptionInInitializerError(e);
        }
    }

    public void close(){
        sessionFactory.close();
    }

    public Pessoa getPessoaId(long id){
        Pessoa p = null;
        try{
            Session session = sessionFactory.openSession();
            p = session.get(Pessoa.class,id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return p;
    }

    public void salvarPessoa(Pessoa p){
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(p);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
package inheritence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Add_Shape {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();

		Shape sh=new Shape();
		sh.setX(2);
		sh.setY(5);
		
		Circle c=new Circle();
		c.setX(12);
		c.setY(10);
		c.setRadius(4);
		
        Square s=new Square();
        s.setSide(13);
        s.setX(10);
        s.setY(4);
        
        Rectangle r=new Rectangle();
        r.setX(16);
        r.setY(14);
        r.setBreath(8);
        r.setLength(4);
       
        
        em.getTransaction().begin();
        em.persist(sh);
        em.persist(c);
        em.persist(s);
        em.persist(r);
        em.getTransaction().commit();
        em.close();
        emf.close();

	}

}

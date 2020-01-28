package com.revature.books;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.revature.books.models.Book;
import com.revature.books.models.Genre;

public class Driver {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sf = configuration.buildSessionFactory(ssrb.build());
		
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Query q = session.createQuery("from Author");
		for(Object b : q.list()) {
			System.out.println(b);
		}
		
		
		session.getTransaction().commit();
		sf.close();
		
		//hibernateDemo(sf);
	}
	
	private static void hibernateDemo(SessionFactory sf) {

		Session session = sf.getCurrentSession();
		// Start a DB transaction:
		session.beginTransaction();

		Book bookFromDb = (Book) session.get(Book.class, 1);

		bookFromDb.setTitle("Different Title");

		System.out.println(bookFromDb);

		Book b = new Book("The English Patient");
		b.setPageCount(400);

		session.persist(b);
		// session.persist(bookFromDb);

		// Session CRUD methods:
		// R: **more important**
		// session.get() gets an object immediately (eager)
		// session.load() gets an object lazily
		// C: **more important**
		// session.save() immediately inserts an object, returns id
		// Will accept non-null ids for transient objects
		// session.persist() inserts as part of a transaction, returns void
		// Expects ids to be null for transient objects
		// U:
		// session.update() updates the given object in DB,
		// Overwriting object with db state if necessary
		// session.merge() updates the given object in DB,
		// Overwriting db with ob state if necessary

		System.out.println("getting book 2");
		session.get(Book.class, 2);
		System.out.println("loading book 3");
		Book loadedBook = (Book) session.load(Book.class, 3);

		System.out.println("using book 3");
		System.out.println(loadedBook);

		// Uses HQL:
		Query getAllBooks = session.createQuery("from Book");
		System.out.println(getAllBooks.list());

		// more HQL:
		// :length works like a ? in a PreparedStatement
		Query getAllLongBooks = session.createQuery("from Book where pageCount > :length");
		getAllLongBooks.setInteger("length", 400);
		System.out.println(getAllLongBooks.list());

		// Criteria: OO way of retrieving records. Use Restrictions to apply
		// filters similar to a WHERE clause, and Projections to aggregate.
		Criteria getAllBooksCriteria = session.createCriteria(Book.class);
		System.out.println("Criteria: " + getAllBooksCriteria.list());
		
		//Limit our results to just long books:
		System.out.println(
				getAllBooksCriteria.add(Restrictions.gt("pageCount", 400)).list()
				);
		
		//Let's get all authors with HQL:
		Query getAllAuthors = session.createQuery("from Author");
		System.out.println(getAllAuthors.list());
		
		//Let's get all genres with a Criteria:
		Criteria getAllGenres = session.createCriteria(Genre.class);
		System.out.println(getAllGenres.list());

		// Commit the DB transaction
		session.getTransaction().commit();
		sf.close();

	}

}

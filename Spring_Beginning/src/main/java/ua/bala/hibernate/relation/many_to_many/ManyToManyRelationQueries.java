package ua.bala.hibernate.relation.many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.bala.hibernate.relation.many_to_many.entity.Child;
import ua.bala.hibernate.relation.many_to_many.entity.Section;

public class ManyToManyRelationQueries {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Child.class)
            .addAnnotatedClass(Section.class)
            .buildSessionFactory();

        saveMethod(factory);
    }

    private static void saveMethod(SessionFactory factory) {
        try (factory; Session session = factory.getCurrentSession()) {

//            Section section = new Section("Football");
//            Child child = new Child("Ihor", 7);
//            Child child1 = new Child("Sergei", 9);
//            Child child2 = new Child("Andrei", 8);
//            section.addChildToSection(child);
//            section.addChildToSection(child1);
//            section.addChildToSection(child2);

            Section section1 = new Section("Volleyball");
            Section section2 = new Section("Math");
            Section section3 = new Section("Chess");
            Child child3 = new Child("Dima", 7);

            child3.addSectionToChild(section1);
            child3.addSectionToChild(section2);
            child3.addSectionToChild(section3);


            session.beginTransaction();

//            session.save(section);
            session.save(child3);
//            session.save(section1); // non cascade.all
//            session.save(section2); // non cascade.all
//            session.save(section3); // non cascade.all
//            // OR
//            session.persist(child3);

            session.getTransaction().commit();
        }
    }

    private static void readMethod(SessionFactory factory) {
        try (factory; Session session = factory.getCurrentSession();) {
            session.beginTransaction();

//            Section sec = session.get(Section.class, 1);
//            System.out.println(sec);
//            System.out.println(sec.getChildren());

            Child child = session.get(Child.class, 4);
            System.out.println(child);
            System.out.println(child.getSections());

            session.getTransaction().commit();

        }
    }

    private static void deleteMethod(SessionFactory factory) {
        try (factory; Session session = factory.getCurrentSession();) {
            session.beginTransaction();

//            Section sec = session.get(Section.class, 1);
//            session.delete(sec);

            Child child = session.get(Child.class, 4);
            session.delete(child);

            session.getTransaction().commit();

        }
    }

}

package DAO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.RiigiAdminYksus;

public class CreateDB {

    public static void main(String[] args) {
        insertData();
        //displayData();
    }

	private static void insertData() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-hsql-unit");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        RiigiAdminYksus r1 = looYksus("Mart Potter", "R1", "Eesti Vabariik", "Eesti Vabariik "
        		+ "on riik Põhja-Euroopas. Eesti piirneb põhjas üle Soome lahe "
        		+ "Soome Vabariigiga, läänes üle Läänemere Rootsi Kuningriigiga, lõunas Läti "
        		+ "Vabariigiga ja idas Vene Föderatsiooniga. Eesti pindala on tänapäeval 45 227"
        		+ "ruutkilomeetrit");
        
        em.persist(r1);
        
        em.flush(); //kirjuta kõik värk baasi maha vahepeal
        
        //peame asja baasist refreshima, et täidakse ära selle subordinates kollektsiooni
        em.refresh(r1);
        //em.refresh(p2);
        //em.refresh(p3);
        //em.refresh(p4);
        
        //lisame alluvad
        //p1.getSubordinates().add(p2);
        //p2.getSubordinates().add(p3);
        //p3.getSubordinates().add(p4);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
	}

	private static RiigiAdminYksus looYksus(String avaja, String kood, String nimetus, String kommentaar) {
		//alt+shift+m
		RiigiAdminYksus r = new RiigiAdminYksus();
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		Date kuup2ev = new Date();
		
        r.setAvaja(avaja);
        r.setAvatud(kuup2ev);
        r.setMuutja(avaja);
        r.setMuudetud(kuup2ev);
        r.setSulgeja(null);
        r.setSuletud(null);
        r.setKood(kood);
        r.setNimetus(nimetus);
        r.setKommentaar(kommentaar);
        r.setAlates(kuup2ev);
        r.setKuni(null);
        return r;
	}
	
	private static void displayData() {
/*
EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-hsql-unit");
        EntityManager em = emf.createEntityManager();
        
        //alustame lugemisest
        Person person = em.find(Person.class,  1L); // 1 (int) Long = id
        
        System.out.println(person);
        
        //prindime kogu puu
        
        dumpData(person, 0);
        
        
        em.close();
        emf.close();
        */
	}
/*
	private static void dumpData(Person person, int level) {
		/*System.out.println(level + " " + person);
		
		for (Person sub : person.getSubordinates()) {
			dumpData(sub, level + 1);
		}
	
	}
	
*/
	
}

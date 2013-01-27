package model;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestData {
	private static void insert() {
		
		String kommentaar1 = "Eesti Vabariik on riik Põhja-Euroopas. Eesti piirneb põhjas üle Soome lahe Soome Vabariigiga, läänes üle Läänemere Rootsi Kuningriigiga, lõunas Läti Vabariigiga ja idas Vene Föderatsiooniga. Eesti pindala on tänapäeval 45 227 ruutkilomeetrit.";
		String kommentaar2 = "Viljandimaa piirneb läänes Pärnu, põhjas Järva, kirdes Jõgevamaaga, idas Tartu ja kagus Valga maakonnaga ning lõunas Lätiga.";
		String kommentaar3 = "Linn Lõuna-Eestis. Viljandi on Viljandi maakonna halduskeskus. Linn asub Sakala kõrgustikul, Viljandi järve kaldal. Viljandist on Tallinnasse 164 km, Tartusse 81 km ja Pärnusse 97 km.";
		String kommentaar4 = "Asub ca 1 km kaugusel Viiratsi alevikust, Väluste teeääres..";
		String kommentaar5 = "Asub ca 1 km kaugusel Viiratsi alevikust, Väluste teeääres.";
		String kommentaar6 = "Asub Abja-Paluojast mõne kilomeetri kaugusel ja kuulub Ilveste suguvõsale juba 1763. aastast alates. Selle pindala on 82 hektarit.";
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-hsql-unit");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        AdminAlluvus adminAlluvus1 = new AdminAlluvus();
        AdminAlluvus adminAlluvus2 = new AdminAlluvus();
        AdminAlluvus adminAlluvus3 = new AdminAlluvus();
        AdminAlluvus adminAlluvus4 = new AdminAlluvus();
        AdminAlluvus adminAlluvus5 = new AdminAlluvus();
        AdminAlluvus adminAlluvus6 = new AdminAlluvus();
        AdminAlluvus adminAlluvus7 = new AdminAlluvus();
        AdminAlluvus adminAlluvus8 = new AdminAlluvus();
        AdminAlluvus adminAlluvus9 = new AdminAlluvus();
        AdminAlluvus adminAlluvus10 = new AdminAlluvus();
        
        VoimalikAlluvus voimalikAlluvus1 = new VoimalikAlluvus();
        VoimalikAlluvus voimalikAlluvus2 = new VoimalikAlluvus();
        VoimalikAlluvus voimalikAlluvus3 = new VoimalikAlluvus();
        VoimalikAlluvus voimalikAlluvus4 = new VoimalikAlluvus();
        VoimalikAlluvus voimalikAlluvus5 = new VoimalikAlluvus();
       
        RiigiAdminYksus riigiAdminYksus1 = new RiigiAdminYksus("Mart Potter", new Date(), "Mart Potter", new Date(), null, null,
        		"R1", "Eesti Vabariik", kommentaar1, new Date(), null);
        RiigiAdminYksus riigiAdminYksus2 = new RiigiAdminYksus("Mart Potter", new Date(), "Mart Potter", new Date(), null, null,
        		"M1", "Viljandi maakond", kommentaar2, new Date(), null);
        RiigiAdminYksus riigiAdminYksus3 = new RiigiAdminYksus("Mart Potter", new Date(), "Mart Potter", new Date(), null, null,
        		"L1", "Viljandi linn", kommentaar3, new Date(), null);
        RiigiAdminYksus riigiAdminYksus4 = new RiigiAdminYksus("Mart Potter", new Date(), "Mart Potter", new Date(), null, null,
        		"V1", "Viiratsi vald", kommentaar4, new Date(), null);
        RiigiAdminYksus riigiAdminYksus5 = new RiigiAdminYksus("Mart Potter", new Date(), "Mart Potter", new Date(), null, null,
        		"K1", "Verilaske küla", kommentaar5, new Date(), null);
        RiigiAdminYksus riigiAdminYksus6 = new RiigiAdminYksus("Mart Potter", new Date(), "Mart Potter", new Date(), null, null,
        		"T1", "Ärma talu", kommentaar6, new Date(), null);
        RiigiAdminYksus riigiAdminYksus7 = new RiigiAdminYksus("Mart Potter", new Date(), "Mart Potter", new Date(), null, null,
        		"M2", "Harju maakond", null, new Date(), null);
        RiigiAdminYksus riigiAdminYksus8 = new RiigiAdminYksus("Mart Potter", new Date(), "Mart Potter", new Date(), null, null,
        		"M3", "Tartu maakond", null, new Date(), null);
        RiigiAdminYksus riigiAdminYksus9 = new RiigiAdminYksus("Mart Potter", new Date(), "Mart Potter", new Date(), null, null,
        		"L2", "Tallinn", "Eesti pealinn", new Date(), null);
        RiigiAdminYksus riigiAdminYksus10 = new RiigiAdminYksus("Mart Potter", new Date(), "Mart Potter", new Date(), null, null,
        		"L3", "Tartu", "Haridusmeka", new Date(), null);
        RiigiAdminYksus riigiAdminYksus11 = new RiigiAdminYksus("Mart Potter", new Date(), "Mart Potter", new Date(), null, null,
        		"V2", "Rae vald", null, new Date(), null);

        
        RiigiAdminYksuseLiik riigiAdminYksuseLiik1 = new RiigiAdminYksuseLiik("Mart Potter",new Date(), "Mart Potter", new Date(), null, null, "R", "Riik", null, new Date(), null);
        RiigiAdminYksuseLiik riigiAdminYksuseLiik2 = new RiigiAdminYksuseLiik("Mart Potter",new Date(), "Mart Potter", new Date(), null, null, "M", "Maakond", "Suurim haldusüksus riigis", new Date(), null);
        RiigiAdminYksuseLiik riigiAdminYksuseLiik3 = new RiigiAdminYksuseLiik("Mart Potter",new Date(), "Mart Potter", new Date(), null, null, "L", "Linn", null, new Date(), null);
        RiigiAdminYksuseLiik riigiAdminYksuseLiik4 = new RiigiAdminYksuseLiik("Mart Potter",new Date(), "Mart Potter", new Date(), null, null, "V", "Vald", null, new Date(), null);
        RiigiAdminYksuseLiik riigiAdminYksuseLiik5 = new RiigiAdminYksuseLiik("Mart Potter",new Date(), "Mart Potter", new Date(), null, null, "K", "Küla", null, new Date(), null);
        RiigiAdminYksuseLiik riigiAdminYksuseLiik6 = new RiigiAdminYksuseLiik("Mart Potter",new Date(), "Mart Potter", new Date(), null, null, "T", "Talu", null, new Date(), null);
        
        em.persist(adminAlluvus1);
        em.persist(adminAlluvus2);
        em.persist(adminAlluvus3);
        em.persist(adminAlluvus4);
        em.persist(adminAlluvus5);
        em.persist(adminAlluvus6);
        em.persist(adminAlluvus7);
        em.persist(adminAlluvus8);
        em.persist(adminAlluvus9);
        em.persist(adminAlluvus10);
        
        em.persist(voimalikAlluvus1);
        em.persist(voimalikAlluvus2);
        em.persist(voimalikAlluvus3);
        em.persist(voimalikAlluvus4);
        em.persist(voimalikAlluvus5);
        
        em.persist(riigiAdminYksus1);
        em.persist(riigiAdminYksus2);
        em.persist(riigiAdminYksus3);
        em.persist(riigiAdminYksus4);
        em.persist(riigiAdminYksus5);
        em.persist(riigiAdminYksus6);
        
        em.persist(riigiAdminYksuseLiik1);
        em.persist(riigiAdminYksuseLiik2);
        em.persist(riigiAdminYksuseLiik3);
        em.persist(riigiAdminYksuseLiik4);
        em.persist(riigiAdminYksuseLiik5);
        em.persist(riigiAdminYksuseLiik6);
        
        em.flush();
        
        em.refresh(adminAlluvus1);
        em.refresh(adminAlluvus2);
        em.refresh(adminAlluvus3);
        em.refresh(adminAlluvus4);
        em.refresh(adminAlluvus5);
        em.refresh(adminAlluvus6);
        em.refresh(adminAlluvus7);
        em.refresh(adminAlluvus8);
        em.refresh(adminAlluvus9);
        em.refresh(adminAlluvus10);
        
        em.refresh(voimalikAlluvus1);
        em.refresh(voimalikAlluvus2);
        em.refresh(voimalikAlluvus3);
        em.refresh(voimalikAlluvus4);
        em.refresh(voimalikAlluvus5);
        
        em.refresh(riigiAdminYksus1);
        em.refresh(riigiAdminYksus2);
        em.refresh(riigiAdminYksus3);
        em.refresh(riigiAdminYksus4);
        em.refresh(riigiAdminYksus5);
        em.refresh(riigiAdminYksus6);
        em.refresh(riigiAdminYksus7);
        em.refresh(riigiAdminYksus8);
        em.refresh(riigiAdminYksus9);
        em.refresh(riigiAdminYksus10);
        em.refresh(riigiAdminYksus11);
        
        em.refresh(riigiAdminYksuseLiik1);
        em.refresh(riigiAdminYksuseLiik2);
        em.refresh(riigiAdminYksuseLiik3);
        em.refresh(riigiAdminYksuseLiik4);
        
        adminAlluvus1.getRiigi_admin_yksuse_alluva_id().add(riigiAdminYksus1);
        adminAlluvus1.getRiigi_admin_yksuse_alluva_id().add(riigiAdminYksus2);
        adminAlluvus1.getRiigi_admin_yksuse_id().add(riigiAdminYksus1);
        adminAlluvus1.getRiigi_admin_yksuse_id().add(riigiAdminYksus2);
        
        
        voimalikAlluvus1.getRiigi_admin_yksuse_liik_id().add(riigiAdminYksuseLiik1);
        voimalikAlluvus1.getRiigi_admin_yksuse_alluva_liik_id().add(riigiAdminYksuseLiik2);
        voimalikAlluvus2.getRiigi_admin_yksuse_liik_id().add(riigiAdminYksuseLiik2);
        voimalikAlluvus2.getRiigi_admin_yksuse_alluva_liik_id().add(riigiAdminYksuseLiik3);
        voimalikAlluvus3.getRiigi_admin_yksuse_liik_id().add(riigiAdminYksuseLiik2);
        voimalikAlluvus3.getRiigi_admin_yksuse_alluva_liik_id().add(riigiAdminYksuseLiik4);
        voimalikAlluvus4.getRiigi_admin_yksuse_liik_id().add(riigiAdminYksuseLiik4);
        voimalikAlluvus4.getRiigi_admin_yksuse_alluva_liik_id().add(riigiAdminYksuseLiik5);
        voimalikAlluvus5.getRiigi_admin_yksuse_liik_id().add(riigiAdminYksuseLiik5);
        voimalikAlluvus5.getRiigi_admin_yksuse_alluva_liik_id().add(riigiAdminYksuseLiik6);

        adminAlluvus1.getRiigi_admin_yksuse_id().add(riigiAdminYksus1);
        adminAlluvus1.getRiigi_admin_yksuse_alluva_id().add(riigiAdminYksus2);
        adminAlluvus2.getRiigi_admin_yksuse_id().add(riigiAdminYksus2);
        adminAlluvus2.getRiigi_admin_yksuse_alluva_id().add(riigiAdminYksus3);
        adminAlluvus3.getRiigi_admin_yksuse_id().add(riigiAdminYksus2);
        adminAlluvus3.getRiigi_admin_yksuse_alluva_id().add(riigiAdminYksus4);
        adminAlluvus4.getRiigi_admin_yksuse_id().add(riigiAdminYksus4);
        adminAlluvus4.getRiigi_admin_yksuse_alluva_id().add(riigiAdminYksus5);
        adminAlluvus5.getRiigi_admin_yksuse_id().add(riigiAdminYksus5);
        adminAlluvus5.getRiigi_admin_yksuse_alluva_id().add(riigiAdminYksus6);
        adminAlluvus6.getRiigi_admin_yksuse_id().add(riigiAdminYksus1);
        adminAlluvus6.getRiigi_admin_yksuse_alluva_id().add(riigiAdminYksus7);
        adminAlluvus7.getRiigi_admin_yksuse_id().add(riigiAdminYksus1);
        adminAlluvus7.getRiigi_admin_yksuse_alluva_id().add(riigiAdminYksus8);
        adminAlluvus8.getRiigi_admin_yksuse_id().add(riigiAdminYksus8);
        adminAlluvus8.getRiigi_admin_yksuse_alluva_id().add(riigiAdminYksus10);
        adminAlluvus9.getRiigi_admin_yksuse_id().add(riigiAdminYksus7);
        adminAlluvus9.getRiigi_admin_yksuse_alluva_id().add(riigiAdminYksus9);
        adminAlluvus10.getRiigi_admin_yksuse_id().add(riigiAdminYksus7);
        adminAlluvus10.getRiigi_admin_yksuse_alluva_id().add(riigiAdminYksus11);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
	}

}
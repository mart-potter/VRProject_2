package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class RiigiAdminYksuseLiik {
	@Id
    @GeneratedValue
    @Column(name = "id")
    private int riigi_admin_yksuse_liik_id;
	
	@Column(nullable = false)
	private String avaja;
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date avatud;
	
	@Column(nullable = false)
	private String muutja;
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date muudetud;
	
	private String sulgeja;
	@Temporal(TemporalType.DATE)
	private Date suletud;
	
	@Column(nullable = false)
	private String kood;
	@Column(nullable = false)
	private String nimetus;
	private String kommentaar;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date alates;
	@Temporal(TemporalType.DATE)
	private Date kuni;
	
	public RiigiAdminYksuseLiik() {}
	
	public RiigiAdminYksuseLiik(String avaja, Date avatud, String muutja, Date muudetud, String sulgeja, Date suletud,
		   String kood, String nimetus, String kommentaar, Date alates, Date kuni) {
			
			setAvaja(avaja);
			setAvatud(avatud);
			setMuutja(muutja);
			setMuudetud(muudetud);
			setSulgeja(sulgeja);
			setSuletud(suletud);
			setKood(kood);
			setNimetus(nimetus);
			setKommentaar(kommentaar);
			setAlates(alates);
			setKuni(kuni);
		
	}
	
	public String getAvaja() {
		return avaja;
	}

	public void setAvaja(String avaja) {
		this.avaja = avaja;
	}

	public Date getAvatud() {
		return avatud;
	}

	public void setAvatud(Date avatud) {
		this.avatud = avatud;
	}

	public String getMuutja() {
		return muutja;
	}

	public void setMuutja(String muutja) {
		this.muutja = muutja;
	}

	public Date getMuudetud() {
		return muudetud;
	}

	public void setMuudetud(Date muudetud) {
		this.muudetud = muudetud;
	}

	public String getSulgeja() {
		return sulgeja;
	}

	public void setSulgeja(String sulgeja) {
		this.sulgeja = sulgeja;
	}

	public Date getSuletud() {
		return suletud;
	}

	public void setSuletud(Date suletud) {
		this.suletud = suletud;
	}

	public String getKood() {
		return kood;
	}

	public void setKood(String kood) {
		this.kood = kood;
	}

	public String getNimetus() {
		return nimetus;
	}

	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
	}

	public String getKommentaar() {
		return kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}

	public Date getAlates() {
		return alates;
	}

	public void setAlates(Date alates) {
		this.alates = alates;
	}

	public Date getKuni() {
		return kuni;
	}

	public void setKuni(Date kuni) {
		this.kuni = kuni;
	}

}

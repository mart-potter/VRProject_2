package model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class VoimalikAlluvus {
	@Id
    @GeneratedValue
    @Column(name = "id")
    private int voimalik_alluvus_id;
	
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
	private Collection<RiigiAdminYksuseLiik> riigi_admin_yksuse_liik_id;
	@Column(nullable = false)
	private Collection<RiigiAdminYksuseLiik> riigi_admin_yksuse_alluva_liik_id;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date alates;
	@Temporal(TemporalType.DATE)
	private Date kuni;
	
	private String kommentaar;
	
	public VoimalikAlluvus() {}
	
	public VoimalikAlluvus(String avaja, Date avatud, String muutja, Date muudetud, String sulgeja, Date suletud,
			   String kommentaar, Date alates, Date kuni, Collection<RiigiAdminYksuseLiik> riigi_admin_yksuse_liik_id,
			   Collection<RiigiAdminYksuseLiik> riigi_admin_yksuse_alluva_liik_id) {
		setAvaja(avaja);
		setAvatud(avatud);
		setMuutja(muutja);
		setMuudetud(muudetud);
		setSulgeja(sulgeja);
		setSuletud(suletud);
		setKommentaar(kommentaar);
		setAlates(alates);
		setKuni(kuni);
		setRiigi_admin_yksuse_liik_id(riigi_admin_yksuse_liik_id);
		setRiigi_admin_yksuse_alluva_liik_id(riigi_admin_yksuse_alluva_liik_id);
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
	public Collection<RiigiAdminYksuseLiik> getRiigi_admin_yksuse_liik_id() {
		return riigi_admin_yksuse_liik_id;
	}
	public void setRiigi_admin_yksuse_liik_id(
			Collection<RiigiAdminYksuseLiik> riigi_admin_yksuse_liik_id) {
		this.riigi_admin_yksuse_liik_id = riigi_admin_yksuse_liik_id;
	}
	public Collection<RiigiAdminYksuseLiik> getRiigi_admin_yksuse_alluva_liik_id() {
		return riigi_admin_yksuse_alluva_liik_id;
	}
	public void setRiigi_admin_yksuse_alluva_liik_id(
			Collection<RiigiAdminYksuseLiik> riigi_admin_yksuse_alluva_liik_id) {
		this.riigi_admin_yksuse_alluva_liik_id = riigi_admin_yksuse_alluva_liik_id;
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

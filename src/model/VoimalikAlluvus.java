package model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class VoimalikAlluvus {
	@Id
    @GeneratedValue
    @Column(name = "id")
    private int voimalik_alluvus_id;
	
	@Column(nullable = false)
	private Collection<RiigiAdminYksuseLiik> riigi_admin_yksuse_liik_id;
	
	@Column(nullable = false)
	private Collection<RiigiAdminYksuseLiik> riigi_admin_yksuse_alluva_liik_id;
	
	public VoimalikAlluvus() {}
	
	public VoimalikAlluvus(Collection<RiigiAdminYksuseLiik> riigi_admin_yksuse_liik_id,
			   Collection<RiigiAdminYksuseLiik> riigi_admin_yksuse_alluva_liik_id) {
		setRiigi_admin_yksuse_liik_id(riigi_admin_yksuse_liik_id);
		setRiigi_admin_yksuse_alluva_liik_id(riigi_admin_yksuse_alluva_liik_id);
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
}

package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class VoimalikAlluvus {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int voimalik_alluvus_id;

	@Column(nullable = false)
	@ManyToOne
	private RiigiAdminYksuseLiik riigi_admin_yksuse_liik_id;

	@Column(nullable = false)
	@ManyToOne
	private RiigiAdminYksuseLiik riigi_admin_yksuse_alluva_liik_id;

	public VoimalikAlluvus() {
	}

	public VoimalikAlluvus(RiigiAdminYksuseLiik riigi_admin_yksuse_liik_id,
			RiigiAdminYksuseLiik riigi_admin_yksuse_alluva_liik_id) {
		setRiigi_admin_yksuse_liik_id(riigi_admin_yksuse_liik_id);
		setRiigi_admin_yksuse_alluva_liik_id(riigi_admin_yksuse_alluva_liik_id);
	}

	public RiigiAdminYksuseLiik getRiigi_admin_yksuse_liik_id() {
		return riigi_admin_yksuse_liik_id;
	}

	public void setRiigi_admin_yksuse_liik_id(
			RiigiAdminYksuseLiik riigi_admin_yksuse_liik_id) {
		this.riigi_admin_yksuse_liik_id = riigi_admin_yksuse_liik_id;
	}

	public RiigiAdminYksuseLiik getRiigi_admin_yksuse_alluva_liik_id() {
		return riigi_admin_yksuse_alluva_liik_id;
	}

	public void setRiigi_admin_yksuse_alluva_liik_id(
			RiigiAdminYksuseLiik riigi_admin_yksuse_alluva_liik_id) {
		this.riigi_admin_yksuse_alluva_liik_id = riigi_admin_yksuse_alluva_liik_id;
	}
}

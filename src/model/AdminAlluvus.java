package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class AdminAlluvus {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int admin_alluvus_id;

	@Column(nullable = false)
	@ManyToOne
	private RiigiAdminYksus riigi_admin_yksuse_id;
	@Column(nullable = false)
	@ManyToOne
	private RiigiAdminYksus riigi_admin_yksuse_alluva_id;

	public AdminAlluvus() {
	}

	public AdminAlluvus(RiigiAdminYksus riigi_admin_yksuse_id,
			RiigiAdminYksus riigi_admin_yksuse_alluva_id) {
		setRiigi_admin_yksuse_id(riigi_admin_yksuse_id);
		setRiigi_admin_yksuse_alluva_id(riigi_admin_yksuse_alluva_id);
	}

	public RiigiAdminYksus getRiigi_admin_yksuse_id() {
		return riigi_admin_yksuse_id;
	}

	public void setRiigi_admin_yksuse_id(RiigiAdminYksus riigi_admin_yksuse_id) {
		this.riigi_admin_yksuse_id = riigi_admin_yksuse_id;
	}

	public RiigiAdminYksus getRiigi_admin_yksuse_alluva_id() {
		return riigi_admin_yksuse_alluva_id;
	}

	public void setRiigi_admin_yksuse_alluva_id(RiigiAdminYksus riigi_admin_yksuse_alluva_id) {
		this.riigi_admin_yksuse_alluva_id = riigi_admin_yksuse_alluva_id;
	}
}

package model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class AdminAlluvus {
	@Id
    @GeneratedValue
    @Column(name = "id")
    private int admin_alluvus_id;
			
	@Column(nullable = false)
	private Collection<RiigiAdminYksus> riigi_admin_yksuse_id;
	@Column(nullable = false)
	private Collection<RiigiAdminYksus> riigi_admin_yksuse_alluva_id;
	
	public AdminAlluvus() {}
	
	public AdminAlluvus(Collection<RiigiAdminYksus> riigi_admin_yksuse_id,
			   Collection<RiigiAdminYksus> riigi_admin_yksuse_alluva_id) {
		setRiigi_admin_yksuse_id(riigi_admin_yksuse_id);
		setRiigi_admin_yksuse_alluva_id(riigi_admin_yksuse_alluva_id);
	}

	public Collection<RiigiAdminYksus> getRiigi_admin_yksuse_id() {
		return riigi_admin_yksuse_id;
	}
	public void setRiigi_admin_yksuse_id(
			Collection<RiigiAdminYksus> riigi_admin_yksuse_id) {
		this.riigi_admin_yksuse_id = riigi_admin_yksuse_id;
	}
	public Collection<RiigiAdminYksus> getRiigi_admin_yksuse_alluva_id() {
		return riigi_admin_yksuse_alluva_id;
	}
	public void setRiigi_admin_yksuse_alluva_id(
			Collection<RiigiAdminYksus> riigi_admin_yksuse_alluva_id) {
		this.riigi_admin_yksuse_alluva_id = riigi_admin_yksuse_alluva_id;
	}
}

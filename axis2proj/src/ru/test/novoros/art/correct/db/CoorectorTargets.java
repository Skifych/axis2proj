package ru.test.novoros.art.correct.db;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "correctorTargets")
public class CoorectorTargets {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id;
 
    @Column(name = "activeTarget")
    private boolean activeTarget;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "target", nullable = false)
    private Users target;
    
    @Column(name = "destroed")
    private boolean destroed;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "corrector", nullable = false)
    private Users corrector;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "commander", nullable = false)
    private Users commander;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isActiveTarget() {
		return activeTarget;
	}

	public void setActiveTarget(boolean activeTarget) {
		this.activeTarget = activeTarget;
	}

	public Users getTarget() {
		return target;
	}

	public void setTarget(Users target) {
		this.target = target;
	}

	public Users getCorrector() {
		return corrector;
	}

	public void setCorrector(Users corrector) {
		this.corrector = corrector;
	}

	public Users getCommander() {
		return commander;
	}

	public void setCommander(Users commander) {
		this.commander = commander;
	}

	public boolean isDestroed() {
		return destroed;
	}

	public void setDestroed(boolean destroed) {
		this.destroed = destroed;
	}
    
    
}

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
@Table(name = "fireNow")
public class FireNow {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id;
 
    @Column(name = "recivedHits")
    private boolean recivedHits;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "corrector", nullable = false)
    private Users corrector;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "target", nullable = false)
    private Targets target;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "hitId", nullable = false)
    private Hits hitId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isRecivedHits() {
		return recivedHits;
	}

	public void setRecivedHits(boolean recivedHits) {
		this.recivedHits = recivedHits;
	}

	public Users getCorrector() {
		return corrector;
	}

	public void setCorrector(Users corrector) {
		this.corrector = corrector;
	}

	public Targets getTarget() {
		return target;
	}

	public void setTarget(Targets target) {
		this.target = target;
	}

	public Hits getHitId() {
		return hitId;
	}

	public void setHitId(Hits hitId) {
		this.hitId = hitId;
	}
    
    
}

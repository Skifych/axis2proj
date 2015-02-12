package ru.test.novoros.art.correct.db;
import java.util.Date;

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
@Table(name = "hits")
public class Hits {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id;
 
    @Column(name = "activeTarget")
    private boolean activeTarget;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "corrector", nullable = false)
    private Users corrector;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "target", nullable = false)
    private Targets target;
    
    @Column(name = "posX")
    private float posX;
    
    @Column(name = "posY")
    private float posY;
    
    @Column(name = "date")
    private Date date;

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

	public float getPosX() {
		return posX;
	}

	public void setPosX(float posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(float posY) {
		this.posY = posY;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
    
    
    
}

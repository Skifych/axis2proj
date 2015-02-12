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
@Table(name = "targets")
public class Targets {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id;
 
    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "targetTypes", nullable = false)
    private TargetTypes targetType;
    
    @Column(name = "posX")
    private float posX;
    
    @Column(name = "posY")
    private float posY;
    
    @Column(name = "comment")
    private String comment;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TargetTypes getTargetType() {
		return targetType;
	}

	public void setTargetType(TargetTypes targetType) {
		this.targetType = targetType;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}


    
}

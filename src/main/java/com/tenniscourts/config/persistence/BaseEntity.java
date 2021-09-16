package com.tenniscourts.config.persistence;

import com.tenniscourts.audit.CustomAuditEntityListener;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@EqualsAndHashCode
@EntityListeners(CustomAuditEntityListener.class)
public class BaseEntity<ID> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

    @Column
    private String ipNumberUpdate;

    @Column
    private Long userCreate;

    @Column
    private Long userUpdate;

    @Column
    @LastModifiedDate
    private LocalDateTime dateUpdate;

    @Column
    private String ipNumberCreate;

    @Column
    @CreatedDate
    private LocalDateTime dateCreate;

	public LocalDateTime setDateUpdate(LocalDateTime now) {
		return dateUpdate;
		
	}

	public Long getUserUpdate() {
		return userUpdate;
	}

	public Long setUserUpdate(Long userSystemId) {
		return userUpdate;
		
	}
	public String getIpNumberUpdate() {
		return ipNumberUpdate;
	}

	public String setIpNumberUpdate(String hostAddress) {
		return ipNumberCreate;
		
	}

	public LocalDateTime setDateCreate(LocalDateTime now) {
		return dateCreate;
		
	}
	public Long getUserCreate() {
		return userCreate;
	}

	public Long setUserCreate(Long userSystemId) {
		return userCreate;
		
	}
	public String getIpNumberCreate() {
		return ipNumberCreate;
	}

	public String setIpNumberCreate(String hostAddress) {
		return ipNumberCreate; 
		
	}

}

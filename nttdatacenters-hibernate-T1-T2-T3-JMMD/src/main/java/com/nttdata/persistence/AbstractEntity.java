package com.nttdata.persistence;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity {

	public abstract Long getId();

	public abstract void setId(Long id);

}

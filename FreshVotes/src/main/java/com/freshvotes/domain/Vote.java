package com.freshvotes.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Vote {
	
	private VoteId pk;
	private boolean upvotes;

	public boolean isUpvotes() {
		return upvotes;
	}

	public void setUpvotes(boolean upvotes) {
		this.upvotes = upvotes;
	}

	@EmbeddedId
	public VoteId getPk() {
		return pk;
	}

	public void setPk(VoteId pk) {
		this.pk = pk;
	}

}

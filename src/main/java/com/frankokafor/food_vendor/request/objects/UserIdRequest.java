package com.frankokafor.food_vendor.request.objects;

import java.util.List;

public class UserIdRequest {
	private List<Long> userIds;

	public List<Long> getUserIds() {
		return userIds;
	}

	public void setUserIds(List<Long> userIds) {
		this.userIds = userIds;
	}
}

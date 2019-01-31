package com.yfy.app.security;

import com.yfy.backend.data.entity.User;

@FunctionalInterface
public interface CurrentUser {

	User getUser();
}

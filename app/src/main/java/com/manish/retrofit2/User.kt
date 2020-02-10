package com.manish.retrofit2

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("node_id")
	val gistsUrl: String? = null,
	val reposUrl: String? = null,
	val followingUrl: String? = null,
	val bio: Any? = null,
	val createdAt: String? = null,
	val login: String? = null,
	val type: String? = null,
	val blog: String? = null,
	val subscriptionsUrl: String? = null,
	val updatedAt: String? = null,
	val siteAdmin: Boolean? = null,
	val company: Any? = null,
	val id: Int? = null,
	val publicRepos: Int? = null,
	val gravatarId: String? = null,
	val email: Any? = null,
	val organizationsUrl: String? = null,
	val hireable: Any? = null,
	val starredUrl: String? = null,
	val followersUrl: String? = null,
	val publicGists: Int? = null,
	val url: String? = null,
	val receivedEventsUrl: String? = null,
	val followers: Int? = null,
	val avatar_url: String? = null,
	val eventsUrl: String? = null,
	val htmlUrl: String? = null,
	val following: Int? = null,
	val name: String? = null,
	val location: String? = null,
	val nodeId: String? = null
)

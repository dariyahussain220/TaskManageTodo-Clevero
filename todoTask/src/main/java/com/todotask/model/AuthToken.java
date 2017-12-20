package com.todotask.model;

import javax.persistence.Table;

@Table(name = "authToken")
public class AuthToken {

    /*
     * public enum Caller { user(USER.PASSENGER_APP),
     * INSPECTOR(Seller.INSPECTOR_APP), ADMIN; private final Seller seller;
     * 
     * private Caller() { this(null); }
     * 
     * private Caller(Seller seller) { this.seller = seller; }
     * 
     * public Seller seller() { return seller; } }
     * 
     * @Id private String token; private Caller caller; private long userId;
     * 
     * @JsonIgnore private Timestamp createdOn, expiresOn;
     * 
     * public AuthToken() { }
     * 
     * public AuthToken(User user) { userId = user.getId(); caller =
     * Caller.PASSENGER; token = UUID.randomUUID().toString(); }
     * 
     * public AuthToken(Inspector inspector) { userId = inspector.getId(); caller =
     * Caller.INSPECTOR; token = UUID.randomUUID().toString(); }
     * 
     * public AuthToken(Admin admin) { userId = admin.getId(); caller =
     * Caller.ADMIN; token = UUID.randomUUID().toString(); }
     * 
     * @Id public String getToken() { return token; }
     * 
     * public void setToken(String token) { this.token = token; }
     * 
     * public long getUserId() { return userId; }
     * 
     * public void setUserId(long userId) { this.userId = userId; }
     * 
     * @JsonIgnore public Timestamp getCreatedOn() { return createdOn; }
     * 
     * public void setCreatedOn(Timestamp createdOn) { this.createdOn = createdOn; }
     * 
     * @JsonIgnore public Timestamp getExpiresOn() { return expiresOn; }
     * 
     * public void setExpiresOn(Timestamp expiresOn) { this.expiresOn = expiresOn; }
     * 
     * public Caller getCaller() { return caller; }
     * 
     * public void setCaller(Caller caller) { this.caller = caller; }
     */
}

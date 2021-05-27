package com.myinfosysprogram.model.response;

import java.lang.System;

@androidx.room.Entity(tableName = "user_rows")
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001:\u0003\'()B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001c\u0010!\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001c\u0010$\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014\u00a8\u0006*"}, d2 = {"Lcom/myinfosysprogram/model/response/UserRows;", "", "()V", "address", "Lcom/myinfosysprogram/model/response/UserRows$Address;", "getAddress", "()Lcom/myinfosysprogram/model/response/UserRows$Address;", "setAddress", "(Lcom/myinfosysprogram/model/response/UserRows$Address;)V", "company", "Lcom/myinfosysprogram/model/response/UserRows$Company;", "getCompany", "()Lcom/myinfosysprogram/model/response/UserRows$Company;", "setCompany", "(Lcom/myinfosysprogram/model/response/UserRows$Company;)V", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "name", "getName", "setName", "phone", "getPhone", "setPhone", "username", "getUsername", "setUsername", "website", "getWebsite", "setWebsite", "Address", "Company", "Geo", "app_debug"})
public final class UserRows {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String username;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String email;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    private com.myinfosysprogram.model.response.UserRows.Address address;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String phone;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String website;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    private com.myinfosysprogram.model.response.UserRows.Company company;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.myinfosysprogram.model.response.UserRows.Address getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.Nullable()
    com.myinfosysprogram.model.response.UserRows.Address p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhone() {
        return null;
    }
    
    public final void setPhone(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWebsite() {
        return null;
    }
    
    public final void setWebsite(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.myinfosysprogram.model.response.UserRows.Company getCompany() {
        return null;
    }
    
    public final void setCompany(@org.jetbrains.annotations.Nullable()
    com.myinfosysprogram.model.response.UserRows.Company p0) {
    }
    
    public UserRows() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/myinfosysprogram/model/response/UserRows$Geo;", "", "()V", "lat", "", "getLat", "()Ljava/lang/String;", "setLat", "(Ljava/lang/String;)V", "lng", "getLng", "setLng", "app_debug"})
    public static final class Geo {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String lat;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String lng;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLat() {
            return null;
        }
        
        public final void setLat(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLng() {
            return null;
        }
        
        public final void setLng(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public Geo() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/myinfosysprogram/model/response/UserRows$Address;", "", "()V", "city", "", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", "geo", "Lcom/myinfosysprogram/model/response/UserRows$Geo;", "getGeo", "()Lcom/myinfosysprogram/model/response/UserRows$Geo;", "setGeo", "(Lcom/myinfosysprogram/model/response/UserRows$Geo;)V", "street", "getStreet", "setStreet", "suite", "getSuite", "setSuite", "zipcode", "getZipcode", "setZipcode", "app_debug"})
    public static final class Address {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String street;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String suite;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String city;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String zipcode;
        @org.jetbrains.annotations.Nullable()
        private com.myinfosysprogram.model.response.UserRows.Geo geo;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStreet() {
            return null;
        }
        
        public final void setStreet(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSuite() {
            return null;
        }
        
        public final void setSuite(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCity() {
            return null;
        }
        
        public final void setCity(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getZipcode() {
            return null;
        }
        
        public final void setZipcode(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.myinfosysprogram.model.response.UserRows.Geo getGeo() {
            return null;
        }
        
        public final void setGeo(@org.jetbrains.annotations.Nullable()
        com.myinfosysprogram.model.response.UserRows.Geo p0) {
        }
        
        public Address() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/myinfosysprogram/model/response/UserRows$Company;", "", "()V", "bs", "", "getBs", "()Ljava/lang/String;", "setBs", "(Ljava/lang/String;)V", "catchPhrase", "getCatchPhrase", "setCatchPhrase", "name", "getName", "setName", "app_debug"})
    public static final class Company {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String catchPhrase;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String bs;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCatchPhrase() {
            return null;
        }
        
        public final void setCatchPhrase(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBs() {
            return null;
        }
        
        public final void setBs(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public Company() {
            super();
        }
    }
}
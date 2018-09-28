package com.atwa.taxineum.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class LoginRequest {

    private LoginRequest() {
        // This class is not publicly instantiable
    }

    public static class ServerLoginRequest {
        @Expose
        @SerializedName("email")
        private String email;

        @Expose
        @SerializedName("password")
        private String password;

        public ServerLoginRequest(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;

            ServerLoginRequest that = (ServerLoginRequest) object;

            if (email != null ? !email.equals(that.email) : that.email != null) return false;
            return password != null ? password.equals(that.password) : that.password == null;

        }

        @Override
        public int hashCode() {
            int result = email != null ? email.hashCode() : 0;
            result = 31 * result + (password != null ? password.hashCode() : 0);
            return result;
        }
    }

    public static class FacebookLoginRequest {
        @Expose
        @SerializedName("fb_user_id")
        private String fbUserId;

        public FacebookLoginRequest(String fbUserId) {
            this.fbUserId = fbUserId;
        }

        public String getFbUserId() {
            return fbUserId;
        }

        public void setFbUserId(String fbUserId) {
            this.fbUserId = fbUserId;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof FacebookLoginRequest)) return false;

            FacebookLoginRequest that = (FacebookLoginRequest) o;

            return getFbUserId() != null ? getFbUserId().equals(that.getFbUserId()) : that.getFbUserId() == null;
        }

        @Override
        public int hashCode() {
            return getFbUserId() != null ? getFbUserId().hashCode() : 0;
        }
    }
}

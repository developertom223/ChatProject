package com.yzx.chat.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/**
 * Created by YZX on 2017年11月17日.
 * 每一个不曾起舞的日子,都是对生命的辜负.
 */


public class UserBean implements Parcelable, Cloneable {
    private String userID;
    private String telephone;
    private String nickname;
    private String avatar;
    private String signature;
    private String location;
    private String birthday;
    private int sex;

    public boolean isEmpty() {
        return (TextUtils.isEmpty(userID) || TextUtils.isEmpty(telephone) || TextUtils.isEmpty(nickname));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof UserBean)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        UserBean user = (UserBean) obj;
        return userID != null && userID.equals(user.getUserID());
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.userID);
        dest.writeString(this.telephone);
        dest.writeString(this.nickname);
        dest.writeString(this.avatar);
        dest.writeString(this.signature);
        dest.writeString(this.location);
        dest.writeString(this.birthday);
        dest.writeInt(this.sex);
    }

    public UserBean() {
    }

    protected UserBean(Parcel in) {
        this.userID = in.readString();
        this.telephone = in.readString();
        this.nickname = in.readString();
        this.avatar = in.readString();
        this.signature = in.readString();
        this.location = in.readString();
        this.birthday = in.readString();
        this.sex = in.readInt();
    }

    public static final Creator<UserBean> CREATOR = new Creator<UserBean>() {
        @Override
        public UserBean createFromParcel(Parcel source) {
            return new UserBean(source);
        }

        @Override
        public UserBean[] newArray(int size) {
            return new UserBean[size];
        }
    };
}

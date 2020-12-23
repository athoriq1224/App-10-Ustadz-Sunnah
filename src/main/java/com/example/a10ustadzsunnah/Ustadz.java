package com.example.a10ustadzsunnah;

import android.os.Parcel;
import android.os.Parcelable;

public class Ustadz implements Parcelable {
    private String name;
    private String detail;
    private int photo;

    protected Ustadz(Parcel in) {
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Ustadz> CREATOR = new Creator<Ustadz>() {
        @Override
        public Ustadz createFromParcel(Parcel in) {
            return new Ustadz(in);
        }

        @Override
        public Ustadz[] newArray(int size) {
            return new Ustadz[size];
        }
    };

    public Ustadz() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(detail);
        parcel.writeInt(photo);
    }
}

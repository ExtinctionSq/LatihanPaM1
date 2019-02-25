package com.example.latihanpam1;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {
    private int nim;
    private String nama,alamat;
    private Double ipk;

    public Student(int nim, String nama, String alamat, Double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.ipk = ipk;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Double getIpk() {
        return ipk;
    }

    public void setIpk(Double ipk) {
        this.ipk = ipk;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeInt(this.nim);
        dest.writeString(this.alamat);
        dest.writeValue(this.ipk);
    }

    protected Student(Parcel in) {
        this.nama = in.readString();
        this.nim = in.readInt();
        this.alamat = in.readString();
        this.ipk = (Double) in.readValue(Double.class.getClassLoader());
    }

    public static final Parcelable.Creator<Student> CREATOR = new Parcelable.Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel source) {
            return new Student(source);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };
}

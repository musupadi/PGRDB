package com.destiny.punishinggrayravenguide.Model.Indonesia;

import android.content.Context;

import com.destiny.punishinggrayravenguide.Model.Model;

import java.util.ArrayList;

public class BeritaDataID {
    public static String[][] data = new String[][]{
            {"1",
                    "Punishing Gray Raven Database Dibuka",
                    "https://lh4.googleusercontent.com/J43TLuc_IBpKviY88jgwaP8-bs5vSJs3c0soD-7_o3jcUoNP7i5Z-AsjkQI46kBhNQEZAAmMpaLlukFbYWV_WGo1BZ5iq77ebafMR6ICvh38uv0IJBq6yvKqVGr_laktWaa1hDkqcA=w206-h167",
                    "Aplikasi Punishing Gray Raven Database Dibuat pada tanggal 23 - Agustus - 2021 oleh grup Whatsapp https://chat.whatsapp.com/BsVJp9TqwaMAyeNs8WOUTW",
                    "03 - 12 - 2021"
            },

    };
    public static ArrayList<Model> getListData(){
        Model model = null;
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            model = new Model();
            model.setId(aData[0]);
            model.setNama(aData[1]);
            model.setGambar(aData[2]);
            model.setDeskripsi(aData[3]);
            model.setTanggal(aData[4]);
            list.add(model);
        }

        return list;
    }
}

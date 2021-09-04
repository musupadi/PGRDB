package com.destiny.punishinggrayravenguide.Model.English;

import com.destiny.punishinggrayravenguide.Model.Model;

import java.util.ArrayList;


public class BeritaDataEN {
    public static String[][] data = new String[][]{
            {"1",
                    "Punishing Gray Raven Penambahan Weaponm",
                    "https://lh4.googleusercontent.com/J43TLuc_IBpKviY88jgwaP8-bs5vSJs3c0soD-7_o3jcUoNP7i5Z-AsjkQI46kBhNQEZAAmMpaLlukFbYWV_WGo1BZ5iq77ebafMR6ICvh38uv0IJBq6yvKqVGr_laktWaa1hDkqcA=w206-h167",
                    "Fixed typos and changed future content to Tips & Tricks and opened the Weapons module to find out Complete Data about Weapons",
                    "03 - 9 - 2021"
            },
            {"2",
                    "Punishing Gray Raven Indonesia Addition Language",
                    "https://lh4.googleusercontent.com/J43TLuc_IBpKviY88jgwaP8-bs5vSJs3c0soD-7_o3jcUoNP7i5Z-AsjkQI46kBhNQEZAAmMpaLlukFbYWV_WGo1BZ5iq77ebafMR6ICvh38uv0IJBq6yvKqVGr_laktWaa1hDkqcA=w206-h167",
                    "Fixed typo and changed Artwork to Settings to change Language",
                    "28 - 8 - 2021"
            },
            {"3",
                    "Punishing Gray Raven Database Open",
                    "https://lh4.googleusercontent.com/J43TLuc_IBpKviY88jgwaP8-bs5vSJs3c0soD-7_o3jcUoNP7i5Z-AsjkQI46kBhNQEZAAmMpaLlukFbYWV_WGo1BZ5iq77ebafMR6ICvh38uv0IJBq6yvKqVGr_laktWaa1hDkqcA=w206-h167",
                    "Punishing Gray Raven Database App Created on 23 - August - 2021 by the group Whatsapp https://chat.whatsapp.com/BsVJp9TqwaMAyeNs8WOUTW",
                    "23 - 8 - 2021"
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

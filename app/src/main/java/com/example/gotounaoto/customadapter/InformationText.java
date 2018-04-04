package com.example.gotounaoto.customadapter;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by gotounaoto on 2018/04/04.
 */

public class InformationText {

    //SettingUserAdapterで使う

    private String first_text;

    private String second_text;

    private int id;
    //adapterから取得したときのidを示すためのやつ

    private float text_size;

    public InformationText(String first_text, String second_text, int id, float text_size){
        this.first_text = first_text;
        this.second_text = second_text;
        this.id = id;
        this.text_size = text_size;
    }

    public InformationText(String first_text, String second_text, float text_size){
        this.first_text = first_text;
        this.second_text = second_text;
        this.text_size = text_size;
    }

    public String getFirst_text(){return  first_text;}

    public String getSecond_text(){return  second_text;}

    public float getText_size(){return text_size;}

}

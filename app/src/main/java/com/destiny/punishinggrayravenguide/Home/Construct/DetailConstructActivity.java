package com.destiny.punishinggrayravenguide.Home.Construct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.destiny.punishinggrayravenguide.R;

public class DetailConstructActivity extends AppCompatActivity {
    String ID,GAMBAR,NAME,MODEL,PROFESSION_CLASS,ELEMENT,CV,SERIAL,AFFILATION,KELAS,IREDORB,REDORB,IYELLOWORB,YELLOWORB,IBLUEORB,BLUEORB;
    String QTE,PROFESSION,AWAKENING,LEADER,CORE,ULTIMATE,SS,SSS,SSSPLUS,HINT;

    LinearLayout linearRedOrb,linearRedOrbVisible;
    ImageView ivUpDownRedOrb;
    Boolean RedOrb = false;

    LinearLayout linearYellowOrb,linearYellowOrbVisible;
    ImageView ivUpDownYellowOrb;
    Boolean YellowOrb = false;

    LinearLayout linearBlueOrb,linearBlueOrbVisible;
    ImageView ivUpDownBlueOrb;
    Boolean BlueOrb = false;

    LinearLayout linearBasicAttack,linearBasicAttackVisible;
    ImageView ivUpDownBasicAttack;
    Boolean BasicAttack = false;

    LinearLayout linearQTE,linearQTEVisible;
    ImageView ivUpDownQTE;
    Boolean QTEs = false;

    LinearLayout linearProfession,linearProfessionVisible;
    ImageView ivUpDownProfession;
    Boolean Profession = false;

    LinearLayout linearAwakening,linearAwakeningVisible;
    ImageView ivUpDownAwakening;
    Boolean Awakening = false;

    LinearLayout linearLeader,linearLeaderVisible;
    ImageView ivUpDownLeader;
    Boolean Leader = false;

    LinearLayout linearCore,linearCoreVisible;
    ImageView ivUpDownCore;
    Boolean Core = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_construct);

        Declaration();

        Intent intent = getIntent();
        ID = intent.getExtras().getString("ID");
        GAMBAR = intent.getExtras().getString("GAMBAR");
        NAME = intent.getExtras().getString("NAME");
        MODEL = intent.getExtras().getString("MODEL");
        PROFESSION_CLASS = intent.getExtras().getString("PROFESSION_CLASS");
        ELEMENT = intent.getExtras().getString("ELEMENT");
        CV = intent.getExtras().getString("CV");
        SERIAL = intent.getExtras().getString("SERIAL");
        AFFILATION = intent.getExtras().getString("AFFILATION");
        KELAS = intent.getExtras().getString("KELAS");
        IREDORB = intent.getExtras().getString("IREDORB");
        REDORB = intent.getExtras().getString("REDORB");
        YELLOWORB = intent.getExtras().getString("YELLOWORB");
        IBLUEORB = intent.getExtras().getString("IBLUEORB");
        BLUEORB = intent.getExtras().getString("IBLUEORB");
        QTE = intent.getExtras().getString("QTE");
        PROFESSION = intent.getExtras().getString("PROFESSION");
        AWAKENING = intent.getExtras().getString("AWAKENING");
        LEADER = intent.getExtras().getString("LEADER");
        CORE = intent.getExtras().getString("CORE");
        ULTIMATE = intent.getExtras().getString("ULTIMATE");
        SS= intent.getExtras().getString("SS");
        SSS = intent.getExtras().getString("SSS");
        SSSPLUS = intent.getExtras().getString("SSSPLUS");
        HINT = intent.getExtras().getString("HINT");


        OnClick();
    }
    private void OnClick(){
        linearRedOrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RedOrb){
                    ivUpDownRedOrb.setImageResource(R.drawable.down_white);
                    linearRedOrbVisible.setVisibility(View.GONE);
                    RedOrb = false;
                }else{
                    ivUpDownRedOrb.setImageResource(R.drawable.up_white);
                    linearRedOrbVisible.setVisibility(View.VISIBLE);
                    RedOrb = true;
                }
            }
        });
        linearYellowOrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (YellowOrb){
                    ivUpDownYellowOrb.setImageResource(R.drawable.down_white);
                    linearYellowOrbVisible.setVisibility(View.GONE);
                    YellowOrb = false;
                }else{
                    ivUpDownYellowOrb.setImageResource(R.drawable.up_white);
                    linearYellowOrbVisible.setVisibility(View.VISIBLE);
                    YellowOrb = true;
                }
            }
        });
        linearBlueOrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BlueOrb){
                    ivUpDownBlueOrb.setImageResource(R.drawable.down_white);
                    linearBlueOrbVisible.setVisibility(View.GONE);
                    BlueOrb = false;
                }else{
                    ivUpDownBlueOrb.setImageResource(R.drawable.up_white);
                    linearBlueOrbVisible.setVisibility(View.VISIBLE);
                    BlueOrb = true;
                }
            }
        });
        linearBasicAttack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BasicAttack){
                    ivUpDownBasicAttack.setImageResource(R.drawable.down_white);
                    linearBasicAttackVisible.setVisibility(View.GONE);
                    BasicAttack = false;
                }else{
                    ivUpDownBasicAttack.setImageResource(R.drawable.up_white);
                    linearBasicAttackVisible.setVisibility(View.VISIBLE);
                    BasicAttack = true;
                }
            }
        });
        linearQTE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (QTEs){
                    ivUpDownQTE.setImageResource(R.drawable.down_white);
                    linearQTEVisible.setVisibility(View.GONE);
                    QTEs = false;
                }else{
                    ivUpDownQTE.setImageResource(R.drawable.up_white);
                    linearQTEVisible.setVisibility(View.VISIBLE);
                    QTEs = true;
                }
            }
        });
        linearProfession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Profession){
                    ivUpDownProfession.setImageResource(R.drawable.down_white);
                    linearProfessionVisible.setVisibility(View.GONE);
                    Profession = false;
                }else{
                    ivUpDownProfession.setImageResource(R.drawable.up_white);
                    linearProfessionVisible.setVisibility(View.VISIBLE);
                    Profession = true;
                }
            }
        });
        linearAwakening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Awakening){
                    ivUpDownAwakening.setImageResource(R.drawable.down_white);
                    linearAwakeningVisible.setVisibility(View.GONE);
                    Awakening = false;
                }else{
                    ivUpDownAwakening.setImageResource(R.drawable.up_white);
                    linearAwakeningVisible.setVisibility(View.VISIBLE);
                    Awakening = true;
                }
            }
        });
        linearLeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Leader){
                    ivUpDownLeader.setImageResource(R.drawable.down_white);
                    linearLeaderVisible.setVisibility(View.GONE);
                    Leader = false;
                }else{
                    ivUpDownLeader.setImageResource(R.drawable.up_white);
                    linearLeaderVisible.setVisibility(View.VISIBLE);
                    Leader = true;
                }
            }
        });
        linearCore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Core){
                    ivUpDownCore.setImageResource(R.drawable.down_white);
                    linearCoreVisible.setVisibility(View.GONE);
                    Core = false;
                }else{
                    ivUpDownCore.setImageResource(R.drawable.up_white);
                    linearCoreVisible.setVisibility(View.VISIBLE);
                    Core = true;
                }
            }
        });

    }
    private void Declaration(){
        //Red
        linearRedOrb = findViewById(R.id.LinearRedOrb);
        linearRedOrbVisible = findViewById(R.id.LinearRedOrbVisible);
        ivUpDownRedOrb = findViewById(R.id.ivUpDownRedOrb);
        //Yellow
        linearYellowOrb = findViewById(R.id.LinearYellowOrb);
        linearYellowOrbVisible = findViewById(R.id.LinearYellowOrbVisible);
        ivUpDownYellowOrb = findViewById(R.id.ivUpDownYellowOrb);
        //Blue
        linearBlueOrb = findViewById(R.id.linearBlueOrb);
        linearBlueOrbVisible = findViewById(R.id.LinearBlueOrbVisible);
        ivUpDownBlueOrb = findViewById(R.id.ivUpDownBlueOrb);
        //Basic Attack
        linearBasicAttack = findViewById(R.id.LinearBasicAttack);
        linearBasicAttackVisible = findViewById(R.id.LinearBasicAttackVisible);
        ivUpDownBasicAttack = findViewById(R.id.ivUpDownBasicAttack);
        //QTE
        linearQTE = findViewById(R.id.LinearQTE);
        linearQTEVisible = findViewById(R.id.LinearQTEVisible);
        ivUpDownQTE = findViewById(R.id.ivUpDownQTE);
        //PROFESSION
        linearProfession = findViewById(R.id.LinearProfession);
        linearProfessionVisible = findViewById(R.id.LinearProfessionVisible);
        ivUpDownProfession = findViewById(R.id.ivUpDownProfession);
        //Awakening
        linearAwakening = findViewById(R.id.LinearAwakening);
        linearAwakeningVisible = findViewById(R.id.LinearAwakeningVisible);
        ivUpDownAwakening = findViewById(R.id.ivUpDownAwakening);
        //Awakening
        linearLeader = findViewById(R.id.LinearLeader);
        linearLeaderVisible = findViewById(R.id.LinearLeaderVisible);
        ivUpDownLeader = findViewById(R.id.ivUpDownLeader);
        //Core
        linearCore = findViewById(R.id.LinearCore);
        linearCoreVisible = findViewById(R.id.LinearCoreVisible);
        ivUpDownCore = findViewById(R.id.ivUpDownCore);
    }

//    i.putExtra("IBUILD1MEMO1", p.getIBuild1Memo1());
//        i.putExtra("BUILD1MEMO1", p.getBuild1Memo2());
//        i.putExtra("IBUILD1MEMO2", p.getIBuild1Memo2());
//        i.putExtra("BUILD1MEMO2", p.getBuild1Memo2());
//        i.putExtra("RESONANCE1_1", p.getResonance1_1());
//        i.putExtra("RESONANCE1_2", p.getResonance1_2());
//        i.putExtra("REMARKS1", p.getRemarks1());
//        i.putExtra("IBUILD2MEMO1", p.getIBuild2Memo1());
//        i.putExtra("BUILD2MEMO1", p.getBuild2Memo1());
//        i.putExtra("IBUILD2MEMO2", p.getIBuild2Memo1());
//        i.putExtra("BUILD2MEMO2", p.getBuild2Memo2());
//        i.putExtra("RESONANCE2_1", p.getResonance2_1());
//        i.putExtra("RESONANCE2_2", p.getResonance2_2());
//        i.putExtra("REMARKS2", p.getRemarks2());
//        i.putExtra("IBUILD3MEMO1", p.getIBuild3Memo1());
//        i.putExtra("BUILD3MEMO1", p.getBuild3Memo1());
//        i.putExtra("IBUILD3MEMO2", p.getIBuild3Memo2());
//        i.putExtra("BUILD3MEMO2", p.getBuild3Memo2());
//        i.putExtra("RESONANCE3_1", p.getResonance3_1());
//        i.putExtra("RESONANCE3_2", p.getResonance3_2());
//        i.putExtra("REMARKS3", p.getRemarks3());
}
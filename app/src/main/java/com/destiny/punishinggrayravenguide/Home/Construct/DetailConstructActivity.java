package com.destiny.punishinggrayravenguide.Home.Construct;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.destiny.punishinggrayravenguide.R;

public class DetailConstructActivity extends AppCompatActivity {
    ImageView Gambar;
    RelativeLayout Back;
    TextView tvDetailNama;

    String ID,GAMBAR,NAME,MODEL,PROFESSION_CLASS,ELEMENT,CV,SERIAL,AFFILATION,KELAS,IREDORB,REDORB,IYELLOWORB,YELLOWORB,IBLUEORB,BLUEORB;
    String QTE,PROFESSION,AWAKENING,LEADER,CORE,ULTIMATE,SS,SSS,SSSPLUS,HINT;
    String IBUILD1MEMO1,BUILD1MEMO1,IBUILD1MEMO2,BUILD1MEMO2,RESONANCE1_1,RESONANCE1_2,REMARKS1,ROLE1;
    String IBUILD2MEMO1,BUILD2MEMO1,IBUILD2MEMO2,BUILD2MEMO2,RESONANCE2_1,RESONANCE2_2,REMARKS2,ROLE2;
    String IBUILD3MEMO1,BUILD3MEMO1,IBUILD3MEMO2,BUILD3MEMO2,RESONANCE3_1,RESONANCE3_2,REMARKS3,ROLE3;
    //Build 1
    LinearLayout linearBuild1,linearBuild1Visible;
    ImageView ivUpDownBuild1;
    Boolean Build1 = false;
    ImageView IBuild1Memo1,IBuild1Memo2;
    TextView B1Memo1,B1Memo2;
    TextView B1Reso1,B1Reso2;
    TextView Remarks1,Role1;

    //Build 2
    LinearLayout WholeBuild2;
    CardView cardB2Reso2;
    LinearLayout linearBuild2,linearBuild2Visible;
    ImageView ivUpDownBuild2;
    Boolean Build2 = false;
    ImageView IBuild2Memo1,IBuild2Memo2;
    TextView B2Memo1,B2Memo2;
    TextView B2Reso1,B2Reso2;
    TextView Remarks2,Role2;

    //Build 3
    LinearLayout WholeBuild3;
    CardView cardB3Reso2;
    LinearLayout linearBuild3,linearBuild3Visible;
    ImageView ivUpDownBuild3;
    Boolean Build3 = false;
    ImageView IBuild3Memo1,IBuild3Memo2;
    TextView B3Memo1,B3Memo2;
    TextView B3Reso1,B3Reso2;
    TextView Remarks3,Role3;

    //Skill
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

    LinearLayout linearUltimate,linearUltimateVisible;
    ImageView ivUpDownUltimate;
    Boolean Ultimate = false;

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
        IYELLOWORB = intent.getExtras().getString("IYELLOWORB");
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

        //Build 1
        IBUILD1MEMO1 = intent.getExtras().getString("IBUILD1MEMO1");
        BUILD1MEMO1 = intent.getExtras().getString("BUILD1MEMO1");
        IBUILD1MEMO2 = intent.getExtras().getString("IBUILD1MEMO2");
        BUILD1MEMO2 = intent.getExtras().getString("BUILD1MEMO2");
        RESONANCE1_1 = intent.getExtras().getString("RESONANCE1_1");
        RESONANCE1_2 = intent.getExtras().getString("RESONANCE1_2");
        REMARKS1 = intent.getExtras().getString("REMARKS1");
        ROLE1 = intent.getExtras().getString("ROLE1");

        //Build 2
        IBUILD2MEMO1 = intent.getExtras().getString("IBUILD2MEMO1");
        BUILD2MEMO1 = intent.getExtras().getString("BUILD2MEMO1");
        IBUILD2MEMO2 = intent.getExtras().getString("IBUILD2MEMO2");
        BUILD2MEMO2 = intent.getExtras().getString("BUILD2MEMO2");
        RESONANCE2_1 = intent.getExtras().getString("RESONANCE2_1");
        RESONANCE2_2 = intent.getExtras().getString("RESONANCE2_2");
        REMARKS2 = intent.getExtras().getString("REMARKS2");
        ROLE2 = intent.getExtras().getString("ROLE2");

        //Build 2
        IBUILD3MEMO1 = intent.getExtras().getString("IBUILD3MEMO1");
        BUILD3MEMO1 = intent.getExtras().getString("BUILD3MEMO1");
        IBUILD3MEMO2 = intent.getExtras().getString("IBUILD3MEMO2");
        BUILD3MEMO2 = intent.getExtras().getString("BUILD3MEMO2");
        RESONANCE3_1 = intent.getExtras().getString("RESONANCE3_1");
        RESONANCE3_2 = intent.getExtras().getString("RESONANCE3_2");
        REMARKS3 = intent.getExtras().getString("REMARKS3");
        ROLE3 = intent.getExtras().getString("ROLE3");

        BuildMemo1();
        BuildMemo2();
        BuildMemo3();

        Glide.with(this)
                .load(GAMBAR)
                .apply(new RequestOptions().override(200, 200))
                .into(Gambar);
        tvDetailNama.setText(NAME+" "+MODEL);
        OnClick();


    }
    private void BuildMemo1(){
        Glide.with(this)
                .load(IBUILD1MEMO1)
                .apply(new RequestOptions().override(200, 200))
                .into(IBuild1Memo1);
        Glide.with(this)
                .load(IBUILD1MEMO2)
                .apply(new RequestOptions().override(200, 200))
                .into(IBuild1Memo2);
        B1Memo1.setText(BUILD1MEMO1);
        B1Memo2.setText(BUILD1MEMO2);
        B1Reso1.setText(RESONANCE1_1);
        B1Reso2.setText(RESONANCE1_2);
        Role1.setText(ROLE1);
        Remarks1.setText(REMARKS1);
    }
    private void BuildMemo2(){
        if (IBUILD2MEMO1.equals("-")){
            WholeBuild2.setVisibility(View.GONE);
        }else{
            Glide.with(this)
                    .load(IBUILD2MEMO1)
                    .apply(new RequestOptions().override(200, 200))
                    .into(IBuild2Memo1);
            Glide.with(this)
                    .load(IBUILD2MEMO2)
                    .apply(new RequestOptions().override(200, 200))
                    .into(IBuild2Memo2);
            B2Memo1.setText(BUILD2MEMO1);
            B2Memo2.setText(BUILD2MEMO2);
            if (RESONANCE2_2.equals("-")){
                B2Reso1.setText(RESONANCE2_1);
                cardB2Reso2.setVisibility(View.GONE);
            }else{
                B2Reso1.setText(RESONANCE2_1);
                B2Reso2.setText(RESONANCE2_2);
            }

            Role2.setText(ROLE2);
            Remarks2.setText(REMARKS2);
        }
        Glide.with(this)
                .load(IBUILD2MEMO1)
                .apply(new RequestOptions().override(200, 200))
                .into(IBuild2Memo1);
        Glide.with(this)
                .load(IBUILD2MEMO2)
                .apply(new RequestOptions().override(200, 200))
                .into(IBuild2Memo2);
        B2Memo1.setText(BUILD2MEMO1);
        B2Memo2.setText(BUILD2MEMO2);
        B2Reso1.setText(RESONANCE2_1);
        B2Reso2.setText(RESONANCE2_2);
        Role2.setText(ROLE2);
        Remarks2.setText(REMARKS2);
    }
    private void BuildMemo3(){
        if (ROLE3.equals("-")){
            WholeBuild3.setVisibility(View.GONE);
        }else{
            Glide.with(this)
                    .load(IBUILD3MEMO1)
                    .apply(new RequestOptions().override(200, 200))
                    .into(IBuild3Memo1);
            Glide.with(this)
                    .load(IBUILD3MEMO2)
                    .apply(new RequestOptions().override(200, 200))
                    .into(IBuild3Memo2);
            B3Memo1.setText(BUILD3MEMO1);
            B3Memo2.setText(BUILD3MEMO2);
            if (RESONANCE3_2.equals("-")){
                B3Reso1.setText(RESONANCE3_1);
                cardB3Reso2.setVisibility(View.GONE);
            }else{
                B3Reso1.setText(RESONANCE3_1);
                B3Reso2.setText(RESONANCE3_2);
            }

            Role3.setText(ROLE3);
            Remarks3.setText(REMARKS3);
        }
        Glide.with(this)
                .load(IBUILD2MEMO1)
                .apply(new RequestOptions().override(200, 200))
                .into(IBuild2Memo1);
        Glide.with(this)
                .load(IBUILD2MEMO2)
                .apply(new RequestOptions().override(200, 200))
                .into(IBuild2Memo2);
        B2Memo1.setText(BUILD2MEMO1);
        B2Memo2.setText(BUILD2MEMO2);
        B2Reso1.setText(RESONANCE2_1);
        B2Reso2.setText(RESONANCE2_2);
        Role2.setText(ROLE2);
        Remarks2.setText(REMARKS2);
    }
    private void OnClick(){
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        linearRedOrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RedOrb){
                    ivUpDownRedOrb.setImageResource(R.drawable.down_primary);
                    linearRedOrbVisible.setVisibility(View.GONE);
                    RedOrb = false;
                }else{
                    ivUpDownRedOrb.setImageResource(R.drawable.up_primary);
                    linearRedOrbVisible.setVisibility(View.VISIBLE);
                    RedOrb = true;
                }
            }
        });
        linearYellowOrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (YellowOrb){
                    ivUpDownYellowOrb.setImageResource(R.drawable.down_primary);
                    linearYellowOrbVisible.setVisibility(View.GONE);
                    YellowOrb = false;
                }else{
                    ivUpDownYellowOrb.setImageResource(R.drawable.up_primary);
                    linearYellowOrbVisible.setVisibility(View.VISIBLE);
                    YellowOrb = true;
                }
            }
        });
        linearBlueOrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BlueOrb){
                    ivUpDownBlueOrb.setImageResource(R.drawable.down_primary);
                    linearBlueOrbVisible.setVisibility(View.GONE);
                    BlueOrb = false;
                }else{
                    ivUpDownBlueOrb.setImageResource(R.drawable.up_primary);
                    linearBlueOrbVisible.setVisibility(View.VISIBLE);
                    BlueOrb = true;
                }
            }
        });
        linearBasicAttack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BasicAttack){
                    ivUpDownBasicAttack.setImageResource(R.drawable.down_primary);
                    linearBasicAttackVisible.setVisibility(View.GONE);
                    BasicAttack = false;
                }else{
                    ivUpDownBasicAttack.setImageResource(R.drawable.up_primary);
                    linearBasicAttackVisible.setVisibility(View.VISIBLE);
                    BasicAttack = true;
                }
            }
        });
        linearQTE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (QTEs){
                    ivUpDownQTE.setImageResource(R.drawable.down_primary);
                    linearQTEVisible.setVisibility(View.GONE);
                    QTEs = false;
                }else{
                    ivUpDownQTE.setImageResource(R.drawable.up_primary);
                    linearQTEVisible.setVisibility(View.VISIBLE);
                    QTEs = true;
                }
            }
        });
        linearProfession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Profession){
                    ivUpDownProfession.setImageResource(R.drawable.down_primary);
                    linearProfessionVisible.setVisibility(View.GONE);
                    Profession = false;
                }else{
                    ivUpDownProfession.setImageResource(R.drawable.up_primary);
                    linearProfessionVisible.setVisibility(View.VISIBLE);
                    Profession = true;
                }
            }
        });
        linearAwakening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Awakening){
                    ivUpDownAwakening.setImageResource(R.drawable.down_primary);
                    linearAwakeningVisible.setVisibility(View.GONE);
                    Awakening = false;
                }else{
                    ivUpDownAwakening.setImageResource(R.drawable.up_primary);
                    linearAwakeningVisible.setVisibility(View.VISIBLE);
                    Awakening = true;
                }
            }
        });
        linearLeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Leader){
                    ivUpDownLeader.setImageResource(R.drawable.down_primary);
                    linearLeaderVisible.setVisibility(View.GONE);
                    Leader = false;
                }else{
                    ivUpDownLeader.setImageResource(R.drawable.up_primary);
                    linearLeaderVisible.setVisibility(View.VISIBLE);
                    Leader = true;
                }
            }
        });
        linearCore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Core){
                    ivUpDownCore.setImageResource(R.drawable.down_primary);
                    linearCoreVisible.setVisibility(View.GONE);
                    Core = false;
                }else{
                    ivUpDownCore.setImageResource(R.drawable.up_primary);
                    linearCoreVisible.setVisibility(View.VISIBLE);
                    Core = true;
                }
            }
        });
        linearUltimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Ultimate){
                    ivUpDownUltimate.setImageResource(R.drawable.down_primary);
                    linearUltimateVisible.setVisibility(View.GONE);
                    Ultimate = false;
                }else{
                    ivUpDownUltimate.setImageResource(R.drawable.up_primary);
                    linearUltimateVisible.setVisibility(View.VISIBLE);
                    Ultimate = true;
                }
            }
        });
        linearBuild1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build1){
                    ivUpDownBuild1.setImageResource(R.drawable.down_primary);
                    linearBuild1Visible.setVisibility(View.GONE);
                    Build1 = false;
                }else{
                    ivUpDownBuild1.setImageResource(R.drawable.up_primary);
                    linearBuild1Visible.setVisibility(View.VISIBLE);
                    Build1 = true;
                }
            }
        });
        linearBuild2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build2){
                    ivUpDownBuild2.setImageResource(R.drawable.down_primary);
                    linearBuild2Visible.setVisibility(View.GONE);
                    Build2 = false;
                }else{
                    ivUpDownBuild2.setImageResource(R.drawable.up_primary);
                    linearBuild2Visible.setVisibility(View.VISIBLE);
                    Build2 = true;
                }
            }
        });
        linearBuild3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build3){
                    ivUpDownBuild3.setImageResource(R.drawable.down_primary);
                    linearBuild3Visible.setVisibility(View.GONE);
                    Build3 = false;
                }else{
                    ivUpDownBuild3.setImageResource(R.drawable.up_primary);
                    linearBuild3Visible.setVisibility(View.VISIBLE);
                    Build3 = true;
                }
            }
        });
    }
    private void Declaration(){
        //Build1
        linearBuild1 = findViewById(R.id.LinearBuild1);
        linearBuild1Visible = findViewById(R.id.LinearBuild1Visible);
        ivUpDownBuild1 = findViewById(R.id.ivUpDownBuild1);
        IBuild1Memo1 = findViewById(R.id.ivB1Memory1);
        IBuild1Memo2 = findViewById(R.id.ivB1Memory2);
        B1Memo1 = findViewById(R.id.tvB1Memory1);
        B1Memo2 = findViewById(R.id.tvB1Memory2);
        B1Reso1 = findViewById(R.id.tvB1Resonance1);
        B1Reso2 = findViewById(R.id.tvB1Resonance2);
        Role1 = findViewById(R.id.tvRole1);
        Remarks1 = findViewById(R.id.tvRemarks);

        //Build2
        WholeBuild2 = findViewById(R.id.linearWholeBuild2);
        cardB2Reso2 = findViewById(R.id.cardB2Reso2);
        linearBuild2 = findViewById(R.id.LinearBuild2);
        linearBuild2Visible = findViewById(R.id.LinearBuild2Visible);
        ivUpDownBuild2 = findViewById(R.id.ivUpDownBuild2);
        IBuild2Memo1 = findViewById(R.id.ivB2Memory1);
        IBuild2Memo2 = findViewById(R.id.ivB2Memory2);
        B2Memo1 = findViewById(R.id.tvB2Memory1);
        B2Memo2 = findViewById(R.id.tvB2Memory2);
        B2Reso1 = findViewById(R.id.tvB2Resonance1);
        B2Reso2 = findViewById(R.id.tvB2Resonance2);
        Role2 = findViewById(R.id.tvRole2);
        Remarks2 = findViewById(R.id.tvRemarks2);

        //Build3
        WholeBuild3 = findViewById(R.id.linearWholeBuild3);
        cardB3Reso2 = findViewById(R.id.cardB3Reso2);
        linearBuild3 = findViewById(R.id.LinearBuild3);
        linearBuild3Visible = findViewById(R.id.LinearBuild3Visible);
        ivUpDownBuild3 = findViewById(R.id.ivUpDownBuild3);
        IBuild3Memo1 = findViewById(R.id.ivB3Memory1);
        IBuild3Memo2 = findViewById(R.id.ivB3Memory2);
        B3Memo1 = findViewById(R.id.tvB3Memory1);
        B3Memo2 = findViewById(R.id.tvB3Memory2);
        B3Reso1 = findViewById(R.id.tvB3Resonance1);
        B3Reso2 = findViewById(R.id.tvB3Resonance2);
        Role3 = findViewById(R.id.tvRole3);
        Remarks3 = findViewById(R.id.tvRemarks3);

        Back = findViewById(R.id.relativeBack);
        Gambar = findViewById(R.id.ivImage);
        tvDetailNama = findViewById(R.id.tvNamaDetail);
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

        //Core
        linearUltimate = findViewById(R.id.LinearUltimate);
        linearUltimateVisible = findViewById(R.id.LinearUltimateVisible);
        ivUpDownUltimate = findViewById(R.id.ivUpDownUltimate);
    }


}
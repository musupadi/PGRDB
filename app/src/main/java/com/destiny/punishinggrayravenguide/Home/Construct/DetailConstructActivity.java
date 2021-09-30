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
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.destiny.punishinggrayravenguide.R;

public class DetailConstructActivity extends AppCompatActivity {
    ImageView Gambar;
    TextView Name,Model,Element,Professions,CVs,Kelas;
    RelativeLayout Back;
    TextView tvDetailNama;

    String ID,GAMBAR,NAME,MODEL,PROFESSION_CLASS,ELEMENT,CV,SERIAL,AFFILATION,KELAS,IREDORB,REDORB,IYELLOWORB,YELLOWORB,IBLUEORB,BLUEORB;
    String BASIC_ATTACK,QTE,PROFESSION,AWAKENING,LEADER,CORE,ULTIMATE,SS,SSS,SSSPLUS,HINT;
    String IBUILD1MEMO1,BUILD1MEMO1,IBUILD1MEMO2,BUILD1MEMO2,IBUILD1MEMO3,BUILD1MEMO3,RESONANCE1_1,RESONANCE1_2,REMARKS1,ROLE1;
    String IBUILD2MEMO1,BUILD2MEMO1,IBUILD2MEMO2,BUILD2MEMO2,IBUILD2MEMO3,BUILD2MEMO3,RESONANCE2_1,RESONANCE2_2,REMARKS2,ROLE2;
    String IBUILD3MEMO1,BUILD3MEMO1,IBUILD3MEMO2,BUILD3MEMO2,IBUILD3MEMO3,BUILD3MEMO3,RESONANCE3_1,RESONANCE3_2,REMARKS3,ROLE3;
    String IBUILD4MEMO1,BUILD4MEMO1,IBUILD4MEMO2,BUILD4MEMO2,IBUILD4MEMO3,BUILD4MEMO3,RESONANCE4_1,RESONANCE4_2,REMARKS4,ROLE4;
    String WEAPON_NAME,WEAPON_IMAGE,WEAPON_ABILITY;

    //Build 1
    LinearLayout linearBuild1,linearBuild1Visible;
    CardView card2B1Memo,card3B1Memo;
    ImageView ivUpDownBuild1;
    Boolean Build1 = false;
    ImageView IBuild1Memo1,IBuild1Memo2,IBuild1Memo3;
    TextView B1Memo1,B1Memo2,B1Memo3;
    TextView B1Reso1,B1Reso2;
    TextView Remarks1,Role1;

    //Build 2
    LinearLayout WholeBuild2;
    CardView card2B2Memo,card3B2Memo;
    CardView cardB2Reso2;
    LinearLayout linearBuild2,linearBuild2Visible;
    ImageView ivUpDownBuild2;
    Boolean Build2 = false;
    ImageView IBuild2Memo1,IBuild2Memo2,IBuild2Memo3;
    TextView B2Memo1,B2Memo2,B2Memo3;
    TextView B2Reso1,B2Reso2;
    TextView Remarks2,Role2;

    //Build 3
    LinearLayout WholeBuild3;
    CardView card2B3Memo,card3B3Memo;
    CardView cardB3Reso2;
    LinearLayout linearBuild3,linearBuild3Visible;
    ImageView ivUpDownBuild3;
    Boolean Build3 = false;
    ImageView IBuild3Memo1,IBuild3Memo2,IBuild3Memo3;
    TextView B3Memo1,B3Memo2,B3Memo3;
    TextView B3Reso1,B3Reso2;
    TextView Remarks3,Role3;

    //Build 4
    LinearLayout WholeBuild4;
    CardView card2B4Memo,card3B4Memo;
    CardView cardB4Reso2;
    LinearLayout linearBuild4,linearBuild4Visible;
    ImageView ivUpDownBuild4;
    Boolean Build4 = false;
    ImageView IBuild4Memo1,IBuild4Memo2,IBuild4Memo3;
    TextView B4Memo1,B4Memo2,B4Memo3;
    TextView B4Reso1,B4Reso2;
    TextView Remarks4,Role4;

    //Signature Weapon
    TextView SignatureWeapon;
    LinearLayout linearWeapon,linearWeaponVisible;
    ImageView ivUpDownWeapon,ivWeapon;
    Boolean Weapon = false;
    TextView tvWeapon;

    //Skill
    LinearLayout linearRedOrb,linearRedOrbVisible;
    ImageView ivUpDownRedOrb,ivRedOrb;
    Boolean RedOrb = false;
    TextView tvRedOrb;

    LinearLayout linearYellowOrb,linearYellowOrbVisible;
    ImageView ivUpDownYellowOrb,ivYellowOrb;
    Boolean YellowOrb = false;
    TextView tvYellowOrb;

    LinearLayout linearBlueOrb,linearBlueOrbVisible;
    ImageView ivUpDownBlueOrb,ivBlueOrb;
    Boolean BlueOrb = false;
    TextView tvBlueOrb;

    LinearLayout linearBasicAttack,linearBasicAttackVisible;
    ImageView ivUpDownBasicAttack;
    Boolean BasicAttack = false;
    TextView tvBasicAttack;

    LinearLayout linearQTE,linearQTEVisible;
    ImageView ivUpDownQTE;
    Boolean QTEs = false;
    TextView tvQTE;

    LinearLayout linearProfession,linearProfessionVisible;
    ImageView ivUpDownProfession;
    Boolean Profession = false;
    TextView tvProfessionSkill;

    LinearLayout linearAwakening,linearAwakeningVisible;
    ImageView ivUpDownAwakening;
    Boolean Awakening = false;
    TextView tvAwakening;

    LinearLayout linearLeader,linearLeaderVisible;
    ImageView ivUpDownLeader;
    Boolean Leader = false;
    TextView tvLeader;

    LinearLayout linearCore,linearCoreVisible;
    ImageView ivUpDownCore;
    Boolean Core = false;
    TextView tvCore;

    LinearLayout linearUltimate,linearUltimateVisible;
    ImageView ivUpDownUltimate;
    Boolean Ultimate = false;
    TextView tvUltimate;

    LinearLayout linearSSSkill,linearSSSkillVisible;
    ImageView ivUpDownSSSkill;
    Boolean SSSkill = false;
    TextView tvSSSkill;

    LinearLayout linearSSSSkill,linearSSSSkillVisible;
    ImageView ivUpDownSSSSkill;
    Boolean SSSSkill = false;
    TextView tvSSSSkill;

    LinearLayout linearSSSPlusSkill,linearSSSPlusSkillVisible;
    ImageView ivUpDownSSSPlusSkill;
    Boolean SSSPlusSkill = false;
    TextView tvSSSPlusSkill;

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
        BLUEORB = intent.getExtras().getString("BLUEORB");
        BASIC_ATTACK = intent.getExtras().getString("BASIC_ATTACK");
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
        IBUILD1MEMO3 = intent.getExtras().getString("IBUILD1MEMO3");
        BUILD1MEMO3 = intent.getExtras().getString("BUILD1MEMO3");
        RESONANCE1_1 = intent.getExtras().getString("RESONANCE1_1");
        RESONANCE1_2 = intent.getExtras().getString("RESONANCE1_2");
        REMARKS1 = intent.getExtras().getString("REMARKS1");
        ROLE1 = intent.getExtras().getString("ROLE1");

        //Build 2
        IBUILD2MEMO1 = intent.getExtras().getString("IBUILD2MEMO1");
        BUILD2MEMO1 = intent.getExtras().getString("BUILD2MEMO1");
        IBUILD2MEMO2 = intent.getExtras().getString("IBUILD2MEMO2");
        BUILD2MEMO2 = intent.getExtras().getString("BUILD2MEMO2");
        IBUILD2MEMO3 = intent.getExtras().getString("IBUILD2MEMO3");
        BUILD2MEMO3 = intent.getExtras().getString("BUILD2MEMO3");
        RESONANCE2_1 = intent.getExtras().getString("RESONANCE2_1");
        RESONANCE2_2 = intent.getExtras().getString("RESONANCE2_2");
        REMARKS2 = intent.getExtras().getString("REMARKS2");
        ROLE2 = intent.getExtras().getString("ROLE2");

        //Build 3
        IBUILD3MEMO1 = intent.getExtras().getString("IBUILD3MEMO1");
        BUILD3MEMO1 = intent.getExtras().getString("BUILD3MEMO1");
        IBUILD3MEMO2 = intent.getExtras().getString("IBUILD3MEMO2");
        BUILD3MEMO2 = intent.getExtras().getString("BUILD3MEMO2");
        IBUILD3MEMO3 = intent.getExtras().getString("IBUILD3MEMO3");
        BUILD3MEMO3 = intent.getExtras().getString("BUILD3MEMO3");
        RESONANCE3_1 = intent.getExtras().getString("RESONANCE3_1");
        RESONANCE3_2 = intent.getExtras().getString("RESONANCE3_2");
        REMARKS3 = intent.getExtras().getString("REMARKS3");
        ROLE3 = intent.getExtras().getString("ROLE3");

        //Build 4
        IBUILD4MEMO1 = intent.getExtras().getString("IBUILD4MEMO1");
        BUILD4MEMO1 = intent.getExtras().getString("BUILD4MEMO1");
        IBUILD4MEMO2 = intent.getExtras().getString("IBUILD4MEMO2");
        BUILD4MEMO2 = intent.getExtras().getString("BUILD4MEMO2");
        IBUILD4MEMO3 = intent.getExtras().getString("IBUILD4MEMO3");
        BUILD4MEMO3 = intent.getExtras().getString("BUILD4MEMO3");
        RESONANCE4_1 = intent.getExtras().getString("RESONANCE4_1");
        RESONANCE4_2 = intent.getExtras().getString("RESONANCE4_2");
        REMARKS4 = intent.getExtras().getString("REMARKS4");
        ROLE4 = intent.getExtras().getString("ROLE4");

        WEAPON_NAME = intent.getExtras().getString("WEAPON_NAME");
        WEAPON_IMAGE = intent.getExtras().getString("WEAPON_IMAGE");
        WEAPON_ABILITY = intent.getExtras().getString("WEAPON_ABILITY");


        GetData();
        BuildMemo1();
        BuildMemo2();
        BuildMemo3();
        BuildMemo4();
        Skill();

        OnClick();


    }
    private void GetData(){
//        Glide.with(this)
//                .load(GAMBAR)
//                .apply(new RequestOptions().override(200, 200))
//                .into(Gambar);
        Gambar.setImageResource(Integer.parseInt(GAMBAR));
        tvDetailNama.setText(NAME+" "+MODEL);
        Name.setText(NAME);
        Model.setText(MODEL);
        Element.setText(ELEMENT);
        Professions.setText(PROFESSION_CLASS);
        CVs.setText(CV);
        Kelas.setText(KELAS);
        SignatureWeapon.setText(WEAPON_NAME);
        ivWeapon.setImageResource(Integer.parseInt(WEAPON_IMAGE));
        tvWeapon.setText(WEAPON_ABILITY);
    }
    private void Skill(){
        //RedOrb
        ivRedOrb.setImageResource(Integer.parseInt(IREDORB));
        tvRedOrb.setText(REDORB);
        //YellowOrb
        ivYellowOrb.setImageResource(Integer.parseInt(IYELLOWORB));
        tvYellowOrb.setText(YELLOWORB);
        //BlueOrb
        ivBlueOrb.setImageResource(Integer.parseInt(IBLUEORB));
        tvBlueOrb.setText(BLUEORB);
        tvBasicAttack.setText(BASIC_ATTACK);
        tvQTE.setText(QTE);
        tvProfessionSkill.setText(PROFESSION);
        tvAwakening.setText(AWAKENING);
        tvLeader.setText(LEADER);
        tvCore.setText(CORE);
        tvUltimate.setText(ULTIMATE);
        tvSSSkill.setText(SS);
        tvSSSSkill.setText(SSS);
        tvSSSPlusSkill.setText(SSSPLUS);
    }
    private void BuildMemo1(){
        IBuild1Memo1.setImageResource(Integer.parseInt(IBUILD1MEMO1));
        B1Memo1.setText(BUILD1MEMO1);
        if (BUILD1MEMO2.equals("-")){
            card2B1Memo.setVisibility(View.GONE);
        }else{
            IBuild1Memo2.setImageResource(Integer.parseInt(IBUILD1MEMO2));
            B1Memo2.setText(BUILD1MEMO2);
        }
        if (BUILD1MEMO3.equals("-")){
            card3B1Memo.setVisibility(View.GONE);
        }else{
            IBuild1Memo3.setImageResource(Integer.parseInt(IBUILD1MEMO3));
            B1Memo3.setText(BUILD1MEMO3);
        }
        B1Reso1.setText(RESONANCE1_1);
        B1Reso2.setText(RESONANCE1_2);
        Role1.setText(ROLE1);
        Remarks1.setText(REMARKS1);
    }
    private void BuildMemo2(){
        if (IBUILD2MEMO1.equals("-")){
            WholeBuild2.setVisibility(View.GONE);
        }else{
            IBuild2Memo1.setImageResource(Integer.parseInt(IBUILD2MEMO1));
            B2Memo1.setText(BUILD2MEMO1);
            if (BUILD2MEMO2.equals("-")){
                card2B2Memo.setVisibility(View.GONE);
            }else{
                IBuild2Memo2.setImageResource(Integer.parseInt(IBUILD2MEMO2));
                B2Memo2.setText(BUILD2MEMO2);
            }
            if (BUILD2MEMO3.equals("-")){
                card3B2Memo.setVisibility(View.GONE);
            }else{
                IBuild2Memo3.setImageResource(Integer.parseInt(IBUILD2MEMO3));
                B2Memo3.setText(BUILD2MEMO3);
            }
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
    }
    private void BuildMemo3(){
        if (ROLE3.equals("-")){
            WholeBuild3.setVisibility(View.GONE);
        }else {
            IBuild3Memo1.setImageResource(Integer.parseInt(IBUILD3MEMO1));
            B3Memo1.setText(BUILD3MEMO1);
            if (BUILD3MEMO2.equals("-")) {
                card2B3Memo.setVisibility(View.GONE);
            } else {
                IBuild3Memo2.setImageResource(Integer.parseInt(IBUILD3MEMO2));
                B3Memo2.setText(BUILD3MEMO2);
            }
            if (BUILD3MEMO3.equals("-")) {
                card3B3Memo.setVisibility(View.GONE);
            } else {
                IBuild3Memo3.setImageResource(Integer.parseInt(IBUILD3MEMO3));
                B3Memo3.setText(BUILD3MEMO3);
            }
            if (RESONANCE3_2.equals("-")) {
                B3Reso1.setText(RESONANCE3_1);
                cardB3Reso2.setVisibility(View.GONE);
            } else {
                B3Reso1.setText(RESONANCE3_1);
                B3Reso2.setText(RESONANCE3_2);
            }
            Role3.setText(ROLE3);
            Remarks3.setText(REMARKS3);
        }
    }
    private void BuildMemo4(){
        if (ROLE4.equals("-")){
            WholeBuild4.setVisibility(View.GONE);
        }else {
            IBuild4Memo1.setImageResource(Integer.parseInt(IBUILD4MEMO1));
            B4Memo1.setText(BUILD4MEMO1);
            if (BUILD4MEMO2.equals("-")) {
                card2B4Memo.setVisibility(View.GONE);
            } else {
                IBuild4Memo2.setImageResource(Integer.parseInt(IBUILD4MEMO2));
                B4Memo2.setText(BUILD4MEMO2);
            }
            if (BUILD4MEMO3.equals("-")) {
                card3B4Memo.setVisibility(View.GONE);
            } else {
                IBuild4Memo3.setImageResource(Integer.parseInt(IBUILD4MEMO3));
                B4Memo3.setText(BUILD4MEMO3);
            }
            if (RESONANCE4_2.equals("-")) {
                B4Reso1.setText(RESONANCE4_1);
                cardB4Reso2.setVisibility(View.GONE);
            } else {
                B4Reso1.setText(RESONANCE4_1);
                B4Reso2.setText(RESONANCE4_2);
            }
            Role4.setText(ROLE4);
            Remarks4.setText(REMARKS4);
        }
    }
    private void OnClick(){
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        linearWeapon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Weapon){
                    ivUpDownWeapon.setImageResource(R.drawable.down_primary);
                    linearWeaponVisible.setVisibility(View.GONE);
                    Weapon = false;
                }else{
                    ivUpDownWeapon.setImageResource(R.drawable.up_primary);
                    linearWeaponVisible.setVisibility(View.VISIBLE);
                    Weapon = true;
                }
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
        linearBuild4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build4){
                    ivUpDownBuild4.setImageResource(R.drawable.down_primary);
                    linearBuild4Visible.setVisibility(View.GONE);
                    Build4 = false;
                }else{
                    ivUpDownBuild4.setImageResource(R.drawable.up_primary);
                    linearBuild4Visible.setVisibility(View.VISIBLE);
                    Build4 = true;
                }
            }
        });
        linearSSSkill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (SSSkill){
                    ivUpDownSSSkill.setImageResource(R.drawable.down_primary);
                    linearSSSkillVisible.setVisibility(View.GONE);
                    SSSkill = false;
                }else{
                    ivUpDownSSSkill.setImageResource(R.drawable.up_primary);
                    linearSSSkillVisible.setVisibility(View.VISIBLE);
                    SSSkill = true;
                }
            }
        });
        linearSSSSkill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (SSSSkill){
                    ivUpDownSSSSkill.setImageResource(R.drawable.down_primary);
                    linearSSSSkillVisible.setVisibility(View.GONE);
                    SSSSkill = false;
                }else{
                    ivUpDownSSSSkill.setImageResource(R.drawable.up_primary);
                    linearSSSSkillVisible.setVisibility(View.VISIBLE);
                    SSSSkill = true;
                }
            }
        });
        linearSSSPlusSkill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (SSSPlusSkill){
                    ivUpDownSSSPlusSkill.setImageResource(R.drawable.down_primary);
                    linearSSSPlusSkillVisible.setVisibility(View.GONE);
                    SSSPlusSkill = false;
                }else{
                    ivUpDownSSSPlusSkill.setImageResource(R.drawable.up_primary);
                    linearSSSPlusSkillVisible.setVisibility(View.VISIBLE);
                    SSSPlusSkill = true;
                }
            }
        });
    }
    private void Declaration(){
        Name = findViewById(R.id.tvNama);
        Model = findViewById(R.id.tvModel);
        Element = findViewById(R.id.tvElement);
        Professions = findViewById(R.id.tvProfession);
        CVs = findViewById(R.id.tvCV);
        Kelas = findViewById(R.id.tvClass);

        //Build1
        card2B1Memo = findViewById(R.id.card2B1Memo);
        card3B1Memo = findViewById(R.id.card3B1Memo);
        IBuild1Memo3 = findViewById(R.id.ivB1Memory3);
        B1Memo3 = findViewById(R.id.tvB1Memory3);
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
        card2B2Memo = findViewById(R.id.card2B2Memo);
        card3B2Memo = findViewById(R.id.card3B2Memo);
        IBuild2Memo3 = findViewById(R.id.ivB2Memory3);
        B2Memo3 = findViewById(R.id.tvB2Memory3);
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
        card2B3Memo = findViewById(R.id.card2B3Memo);
        card3B3Memo = findViewById(R.id.card3B3Memo);
        IBuild3Memo3 = findViewById(R.id.ivB3Memory3);
        B3Memo3 = findViewById(R.id.tvB3Memory3);
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

        //Build4
        card2B4Memo = findViewById(R.id.card2B4Memo);
        card3B4Memo = findViewById(R.id.card3B4Memo);
        IBuild4Memo3 = findViewById(R.id.ivB4Memory3);
        B4Memo3 = findViewById(R.id.tvB4Memory3);
        WholeBuild4 = findViewById(R.id.linearWholeBuild4);
        cardB4Reso2 = findViewById(R.id.cardB4Reso2);
        linearBuild4 = findViewById(R.id.LinearBuild4);
        linearBuild4Visible = findViewById(R.id.LinearBuild4Visible);
        ivUpDownBuild4 = findViewById(R.id.ivUpDownBuild4);
        IBuild4Memo1 = findViewById(R.id.ivB4Memory1);
        IBuild4Memo2 = findViewById(R.id.ivB4Memory2);
        B4Memo1 = findViewById(R.id.tvB4Memory1);
        B4Memo2 = findViewById(R.id.tvB4Memory2);
        B4Reso1 = findViewById(R.id.tvB4Resonance1);
        B4Reso2 = findViewById(R.id.tvB4Resonance2);
        Role4 = findViewById(R.id.tvRole4);
        Remarks4 = findViewById(R.id.tvRemarks4);

        Back = findViewById(R.id.relativeBack);
        Gambar = findViewById(R.id.ivImage);
        tvDetailNama = findViewById(R.id.tvNamaDetail);

        //Weapon
        SignatureWeapon = findViewById(R.id.tvWeapon);
        linearWeapon = findViewById(R.id.LinearSignatureWeapon);
        linearWeaponVisible = findViewById(R.id.LinearSignatureWeaponVisible);
        ivUpDownWeapon = findViewById(R.id.ivUpDownSignatureWeapon);
        ivWeapon = findViewById(R.id.ivSignatureWeapon);
        tvWeapon = findViewById(R.id.tvSignatureWeapon);
        //Red
        linearRedOrb = findViewById(R.id.LinearRedOrb);
        linearRedOrbVisible = findViewById(R.id.LinearRedOrbVisible);
        ivUpDownRedOrb = findViewById(R.id.ivUpDownRedOrb);
        ivRedOrb = findViewById(R.id.ivRedOrb);
        tvRedOrb = findViewById(R.id.tvRedOrb);
        //Yellow
        linearYellowOrb = findViewById(R.id.LinearYellowOrb);
        linearYellowOrbVisible = findViewById(R.id.LinearYellowOrbVisible);
        ivUpDownYellowOrb = findViewById(R.id.ivUpDownYellowOrb);
        ivYellowOrb = findViewById(R.id.ivYellowOrb);
        tvYellowOrb = findViewById(R.id.tvYellowOrb);
        //Blue
        linearBlueOrb = findViewById(R.id.linearBlueOrb);
        linearBlueOrbVisible = findViewById(R.id.LinearBlueOrbVisible);
        ivUpDownBlueOrb = findViewById(R.id.ivUpDownBlueOrb);
        ivBlueOrb = findViewById(R.id.ivBlueOrb);
        tvBlueOrb = findViewById(R.id.tvBlueOrb);


        //Basic Attack
        linearBasicAttack = findViewById(R.id.LinearBasicAttack);
        linearBasicAttackVisible = findViewById(R.id.LinearBasicAttackVisible);
        ivUpDownBasicAttack = findViewById(R.id.ivUpDownBasicAttack);
        tvBasicAttack = findViewById(R.id.tvBasicAttack);
        //QTE
        linearQTE = findViewById(R.id.LinearQTE);
        linearQTEVisible = findViewById(R.id.LinearQTEVisible);
        ivUpDownQTE = findViewById(R.id.ivUpDownQTE);
        tvQTE = findViewById(R.id.tvQTE);
        //PROFESSION
        linearProfession = findViewById(R.id.LinearProfession);
        linearProfessionVisible = findViewById(R.id.LinearProfessionVisible);
        ivUpDownProfession = findViewById(R.id.ivUpDownProfession);
        tvProfessionSkill = findViewById(R.id.tvProfessionSkill);
        //Awakening
        linearAwakening = findViewById(R.id.LinearAwakening);
        linearAwakeningVisible = findViewById(R.id.LinearAwakeningVisible);
        ivUpDownAwakening = findViewById(R.id.ivUpDownAwakening);
        tvAwakening = findViewById(R.id.tvAwakening);
        //Leader
        linearLeader = findViewById(R.id.LinearLeader);
        linearLeaderVisible = findViewById(R.id.LinearLeaderVisible);
        ivUpDownLeader = findViewById(R.id.ivUpDownLeader);
        tvLeader = findViewById(R.id.tvLeader);
        //Core
        linearCore = findViewById(R.id.LinearCore);
        linearCoreVisible = findViewById(R.id.LinearCoreVisible);
        ivUpDownCore = findViewById(R.id.ivUpDownCore);
        tvCore = findViewById(R.id.tvCore);

        //Ultimate
        linearUltimate = findViewById(R.id.LinearUltimate);
        linearUltimateVisible = findViewById(R.id.LinearUltimateVisible);
        ivUpDownUltimate = findViewById(R.id.ivUpDownUltimate);
        tvUltimate = findViewById(R.id.tvUltimate);

        //SSSkill
        linearSSSkill = findViewById(R.id.LinearSSSkill);
        linearSSSkillVisible = findViewById(R.id.LinearSSSkillVisible);
        ivUpDownSSSkill = findViewById(R.id.ivUpDownSSSkill);
        tvSSSkill = findViewById(R.id.tvSSSkill);

        //SSSSkill
        linearSSSSkill = findViewById(R.id.LinearSSSSkill);
        linearSSSSkillVisible = findViewById(R.id.LinearSSSSkillVisible);
        ivUpDownSSSSkill = findViewById(R.id.ivUpDownSSSSkill);
        tvSSSSkill = findViewById(R.id.tvSSSSkill);

        //SSSPlusSkill
        linearSSSPlusSkill = findViewById(R.id.LinearSSSPlusSkill);
        linearSSSPlusSkillVisible = findViewById(R.id.LinearSSSPlusSkillVisible);
        ivUpDownSSSPlusSkill = findViewById(R.id.ivUpDownSSSPlusSkill);
        tvSSSPlusSkill = findViewById(R.id.tvSSSPlusSkill);
    }



}
package com.destiny.punishinggrayravenguide.Feedback;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.destiny.punishinggrayravenguide.R;
import com.destiny.punishinggrayravenguide.SharedPreference.LocaleHelper;

import io.paperdb.Paper;

public class FeedbackFragment extends Fragment {


    Button WA,Facebook;
    TextView tvFeedback;
    public FeedbackFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feedback, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvFeedback=view.findViewById(R.id.tvFeedback);
        WA=view.findViewById(R.id.btnWhatsapp);
        Facebook=view.findViewById(R.id.btnFacebook);
        String language = Paper.book().read("language");
        if(language == null)
            Paper.book().write("language","en");
        Context context = LocaleHelper.setLocale(getActivity(),language);
        Resources resources = context.getResources();
        tvFeedback.setText(resources.getString(R.string.feedback_text));
        WA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String text = "Hello ";
                    String toNumber = "6281384215205";

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+toNumber +"&text="+text));
                    startActivity(intent);


                } catch (Exception e) {
                    Toast.makeText(getActivity(), "WhatsApp Not Installed", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Feedback ini Sedang proses pembuatan", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
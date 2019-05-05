package com.example.win10.agungpermanaputra;


import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class f_profile extends Fragment {

    ImageButton call;
    ImageButton ig;
    ImageButton mail;
    ImageButton lokasi;
    Button about;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_f_profile, container, false);
        View call = (ImageButton) rootView.findViewById(R.id.btn_call);
        View ig = (ImageButton) rootView.findViewById(R.id.btn_ig);
        View mail = (ImageButton) rootView.findViewById(R.id.btn_mail);
        View about = (Button) rootView.findViewById(R.id.btn_about);

        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String instagram = "https://www.instagram.com/bogangpermana/?hl=id";
                Intent bukainstagram = new Intent(Intent.ACTION_VIEW);
                bukainstagram.setData(Uri.parse(instagram));
                startActivity(bukainstagram);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panggil = "083829665794";
                TextUtils.isEmpty(panggil);
                String dial = "tel:" + panggil;
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"boganggembok@gmail.com"});
                try {
                    startActivity(Intent.createChooser(intent, "Ingin Mengirim Email?"));
                } catch (android.content.ActivityNotFoundException ex) {
                }
            }
            });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.custom_dialog);
                dialog.setTitle("TWOH.Co");

                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("AgungPermanaPutra Apps Version 1");
                ImageView image = (ImageView) dialog.findViewById(R.id.iv_icon);
                image.setImageResource(R.drawable.logo);

                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
                return rootView;
}
}





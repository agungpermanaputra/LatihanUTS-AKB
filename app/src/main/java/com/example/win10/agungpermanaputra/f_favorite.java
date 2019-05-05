package com.example.win10.agungpermanaputra;


import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;


/**
 * A simple {@link Fragment} subclass.
 */
public class f_favorite extends Fragment {

    private static final String isPlaying = "media is playing";
    MediaPlayer player;
    Button btn1, btn2, btn3, btn4, btn5, btn_v1;
    VideoView videoshow;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_f_favorite, container, false);

        btn_v1 = (Button) view.findViewById(R.id.btn_vd1);
        videoshow = (VideoView) view.findViewById(R.id.video);
        btn_v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri letakvideo = Uri.parse("android:resource://" + getActivity().getPackageName()+"/" + R.raw.videoplay1);
                videoshow.setVideoURI(letakvideo);
                videoshow.start();
            }
        });


        btn1 = (Button) view.findViewById(R.id.btn_msk1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(1);
            }

        });

        btn2 = (Button) view.findViewById(R.id.btn_msk2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(2);
            }

        });

        btn3 = (Button) view.findViewById(R.id.btn_msk3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(3);
            }

        });

        btn4 = (Button) view.findViewById(R.id.btn_msk4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(4);
            }

        });

        btn5 = (Button) view.findViewById(R.id.btn_msk5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(5);
            }

        });
        return view;
    }

    public void onPause() {
        try {
            super.onPause();
            player.pause();
        } catch (Exception e) {

        }
    }

    private void playSound(int arg) {
        try {
            if (player.isPlaying()) {
                player.stop();
                player.release();
            }
        } catch (Exception e) {
            Toast.makeText(getActivity(), "Song In", Toast.LENGTH_LONG).show();
        }

        if (arg == 1) {

            Toast.makeText(getActivity(), isPlaying + "Andmesh Kamaleng (Jangan Rubah Takdirku)", Toast.LENGTH_LONG).show();
            Toast.makeText(getActivity(), "Move Fragment to stop song", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(getContext(), R.raw.musik1);

        } else if (arg == 2) {
            Toast.makeText(getActivity(), isPlaying + "Andmesh Kamaleng (Cinta Luar Biasa)", Toast.LENGTH_LONG).show();
            Toast.makeText(getActivity(), "Move Fragment to stop song", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(getContext(), R.raw.musik2);

        } else if (arg == 3) {
            Toast.makeText(getActivity(), isPlaying + "Armada (Harusnya Aku)", Toast.LENGTH_LONG).show();
            Toast.makeText(getActivity(), "Move Fragment to stop song", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(getContext(), R.raw.musik3);

        } else if (arg == 4) {
            Toast.makeText(getActivity(), isPlaying + "Danilla (Senja Diambang Pilu)", Toast.LENGTH_LONG).show();
            Toast.makeText(getActivity(), "Move Fragment to stop song", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(getContext(), R.raw.musik4);

        } else if (arg == 5) {
            Toast.makeText(getActivity(), isPlaying + "Danilla (Ada di sana)", Toast.LENGTH_LONG).show();
            Toast.makeText(getActivity(), "Move Fragment to stop song", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(getContext(), R.raw.musik5);
        }

        player.setLooping(true);
        player.start();
    }
}
package com.example.win10.agungpermanaputra;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import adapter.GalleryAdapter;
import model.GalleryModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class f_gallery extends Fragment {

    RecyclerView recycle;
    GalleryModel[] images;
    NestedScrollView scroll;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_f_gallery, container, false);

        recycle = (RecyclerView) root.findViewById(R.id.recyclerview);
        GridLayoutManager layout = new GridLayoutManager(getActivity(), 2) {
            @Override
            public boolean canScrollHorizontally() {
                return false;
            }

            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };

        recycle.setNestedScrollingEnabled(false);
        recycle.setLayoutManager(layout);

        GalleryModel gal1 = new GalleryModel(R.drawable.gal1);
        GalleryModel gal2 = new GalleryModel(R.drawable.gal2);
        GalleryModel gal3 = new GalleryModel(R.drawable.gal3);
        GalleryModel gal4 = new GalleryModel(R.drawable.gal4);
        GalleryModel gal5 = new GalleryModel(R.drawable.gal5);
        GalleryModel gal6 = new GalleryModel(R.drawable.gal6);

        images = new GalleryModel[]{gal1, gal2, gal3, gal4, gal5, gal6};
        GalleryAdapter myAdapter = new GalleryAdapter(getActivity(), images);
        recycle.setAdapter(myAdapter);

        return root;
    }

}


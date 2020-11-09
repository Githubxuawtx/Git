<<<<<<< HEAD
<<<<<<< HEAD
package com.example.fragmentapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NewsContentFragment extends Fragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.news_content_frag, container, false);
        return view;
    }

    public void refresh(String newsTitle, String newsContent){
        View visibilityLayout = view.findViewById(R.id.visibility_layout);
        visibilityLayout.setVisibility(View.VISIBLE);
        TextView newsTitleText = view.findViewById(R.id.news_title);
        TextView newsContentText = view.findViewById(R.id.news_content);
        newsTitleText.setText(newsTitle);
        newsContentText.setText(newsContent);
    }
}
=======
=======
>>>>>>> f173405ede714da93af9ff830d4ea51bc578b80d
package com.example.fragmentapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NewsContentFragment extends Fragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.news_content_frag, container, false);
        return view;
    }

    public void refresh(String newsTitle, String newsContent){
        View visibilityLayout = view.findViewById(R.id.visibility_layout);
        visibilityLayout.setVisibility(View.VISIBLE);
        TextView newsTitleText = view.findViewById(R.id.news_title);
        TextView newsContentText = view.findViewById(R.id.news_content);
        newsTitleText.setText(newsTitle);
        newsContentText.setText(newsContent);
    }
}
<<<<<<< HEAD
>>>>>>> f173405ede714da93af9ff830d4ea51bc578b80d
=======
>>>>>>> f173405ede714da93af9ff830d4ea51bc578b80d

package com.xiang.discussactivityandfragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/7/27.
 */
public class myFragment extends Fragment {
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i("sss", "Fragment    onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("sss", "Fragment    onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("sss", "Fragment    onCreateView");
        return inflater.inflate(R.layout.fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i("sss", "Fragment    onViewCreated");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("sss", "Fragment    onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("sss", "Fragment    onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("sss", "Fragment    onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("sss", "Fragment    onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("sss", "Fragment    onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("sss", "Fragment    onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("sss", "Fragment    onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("sss", "Fragment    onDetach");
    }
}

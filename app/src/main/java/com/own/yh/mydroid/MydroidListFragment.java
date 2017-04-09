package com.own.yh.mydroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by yh on 2017/4/9.
 */

public class MydroidListFragment extends Fragment {

    private RecyclerView mListViewer;
    private List<Model> models;

    public static Fragment newInstance() {
        return new MydroidListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main_layout, container, false);

        mListViewer = (RecyclerView) v.findViewById(R.id.fragment_recycler_view);
        mListViewer.setLayoutManager(new LinearLayoutManager(getActivity()));
        mListViewer.setAdapter(new ListFragmentAdapter(models));

        return v;
    }

    private class ListFragmentHolder extends RecyclerView.ViewHolder {

        public ListFragmentHolder(View itemView) {
            super(itemView);
        }

        public void onBindView() {

        }
    }

    private class ListFragmentAdapter extends RecyclerView.Adapter<ListFragmentHolder>{
        private List<Model> adapterModel;

        public ListFragmentAdapter(List<Model> models) {
            adapterModel = models;
        }

        @Override
        public ListFragmentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            View v = inflater.inflate(R.layout.card_viewer_main_list_layout, parent, false);
            return new ListFragmentHolder(v);
        }

        @Override
        public void onBindViewHolder(ListFragmentHolder holder, int position) {
                holder.onBindView();
        }

        @Override
        public int getItemCount() {
            return adapterModel.size();
        }
    }

}

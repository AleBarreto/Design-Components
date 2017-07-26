package ale.br.com.workingnavigationbottom.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ale.br.com.workingnavigationbottom.R;

/**
 * Created by Alessandro on 26/07/2017.
 */

public class FragmentBottom extends Fragment {

    public static FragmentBottom newInstance() {
        return new FragmentBottom();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bottom,container,false);
    }
}

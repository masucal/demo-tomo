package jp.tomo.test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author tyabata
 */
public class HogeFragment extends Fragment{

    @Override
    public View onCreateView( final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState ) {

        final View view = inflater.inflate( R.layout.fragment_hoge, container, false );
        return view;
    }
}

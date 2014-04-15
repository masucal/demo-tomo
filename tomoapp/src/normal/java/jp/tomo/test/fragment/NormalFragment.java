package jp.tomo.test.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import jp.tomo.test.R;

/**
 * 無料
 *
 * @author tyabata
 */
public class NormalFragment extends Fragment{

    @Override
    public View onCreateView( final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState ) {

        final View view = inflater.inflate( R.layout.fragment_hoge, container, false );

        final Button btn = ( Button ) view.findViewById( R.id.button_pay );
        btn.setText( "無料版" );

        return view;
    }
}

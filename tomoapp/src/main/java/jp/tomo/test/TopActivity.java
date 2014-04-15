package jp.tomo.test;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.widget.TextView;

import jp.tomo.test.fragment.NormalFragment;

public class TopActivity extends FragmentActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_top );

        //flavor表示
        final TextView view = ( TextView ) findViewById( R.id.text_flavor );
        view.setText( " 現在 : " + BuildConfig.FLAVOR );

        //Flavorで切り替えてるFragment
        final NormalFragment fragment = new NormalFragment();

        final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace( R.id.hoge_fragment, fragment );
        transaction.commit();
    }
}
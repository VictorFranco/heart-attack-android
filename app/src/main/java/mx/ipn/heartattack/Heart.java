package mx.ipn.heartattack;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by vfran_000 on 2018.
 */

public class Heart extends Fragment implements View.OnClickListener{
    RelativeLayout btn_m,btn_a,btn_f;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.content_heart, container,false);

        btn_m=(RelativeLayout)view.findViewById(R.id.btn_modelo);
        btn_a=(RelativeLayout)view.findViewById(R.id.btn_anatomy);
        btn_f=(RelativeLayout)view.findViewById(R.id.btn_fisionomy);

        FragmentManager fm=getFragmentManager();
        fm.beginTransaction().replace(R.id.relative_heart,new Model()).commit();

        btn_m.setOnClickListener(this);
        btn_a.setOnClickListener(this);
        btn_f.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        FragmentManager fm=getFragmentManager();

        if (v.getId()==R.id.btn_modelo){
            fm.beginTransaction().replace(R.id.relative_heart,new Model()).commit();
        }
        if(v.getId()==R.id.btn_anatomy){
            fm.beginTransaction().replace(R.id.relative_heart,new Anatomy()).commit();
        }
        if(v.getId()==R.id.btn_fisionomy){
            fm.beginTransaction().replace(R.id.relative_heart,new Fisionomy()).commit();
        }
    }
}
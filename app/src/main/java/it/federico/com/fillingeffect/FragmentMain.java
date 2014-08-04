package it.federico.com.fillingeffect;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import it.federico.com.fillingeffect.views.Scroller;


public class FragmentMain extends Fragment {

    private Scroller mScroller;

    public static FragmentMain newInstance() {
        FragmentMain fragment = new FragmentMain();
        return fragment;
    }

    public FragmentMain() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = createView(inflater, container);
        buildViews();
        return view;
    }

    private void buildViews() {
        mScroller.initializeScrollView(0);
    }

    private View createView(final LayoutInflater inflater, final ViewGroup container) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        mScroller = (Scroller) view.findViewById(R.id.scroller);
        return view;
    }


}

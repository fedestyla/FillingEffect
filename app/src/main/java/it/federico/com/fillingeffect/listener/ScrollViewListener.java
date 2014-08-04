package it.federico.com.fillingeffect.listener;


import it.federico.com.fillingeffect.views.ObservableScrollView;

public interface ScrollViewListener {

    void onScrollChanged(ObservableScrollView scrollView, int x, int y, int oldX, int oldY);
    
    void onEndScroll(ObservableScrollView scrollView);

}

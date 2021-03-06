package dev_pc.testunsplashapi.ui.activity.user_activity;

import androidx.fragment.app.Fragment;

import com.hannesdorfmann.mosby3.mvp.MvpView;

public interface IUser {

    interface View extends MvpView{
        void showPhotos(Fragment photos);
        void showLikes(Fragment likes);
        void showCollections(Fragment collections);
    }
    interface Presenter{

    }
}

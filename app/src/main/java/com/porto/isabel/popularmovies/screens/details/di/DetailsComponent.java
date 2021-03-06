package com.porto.isabel.popularmovies.screens.details.di;

import com.porto.isabel.popularmovies.screens.details.presentation.DetailsActivity;
import com.porto.isabel.popularmovies.di.AppComponent;

import dagger.Component;

@DetailsScope
@Component(modules = {DetailsModule.class},
        dependencies = {AppComponent.class})
public interface DetailsComponent {

    void inject(DetailsActivity activity);

}

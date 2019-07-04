package com.example.bionintelligence.presentation.splash;

import com.example.bionintelligence.domain.repositories.PutDatabaseRepository;

import java.util.concurrent.TimeUnit;

import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class SplashPresenterImpl implements SplashPresenter {
    private PutDatabaseRepository putDatabaseRepository;
    private SplashView splashView;
    private CompositeDisposable compositeDisposable;

    SplashPresenterImpl(PutDatabaseRepository putDatabaseRepository) {
        this.putDatabaseRepository = putDatabaseRepository;
        compositeDisposable = new CompositeDisposable();
    }

    @Override
    public void attachView(SplashView splashView) {
        this.splashView = splashView;
    }

    @Override
    public void checkLocalData() {
        boolean isDatabaseFull = putDatabaseRepository.getLocalData();
        compositeDisposable.add(Single.just(isDatabaseFull)
                .flatMapCompletable(isDBFull -> isDBFull ?
                        Completable.complete() :
                        putDatabaseRepository.addStartDataFromDb())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .delay(1500, TimeUnit.MILLISECONDS)
                .subscribe(() -> splashView.goToMainActivity(), Throwable::printStackTrace));
    }

    @Override
    public void detachView() {
        splashView = null;
        compositeDisposable.dispose();
    }
}

package com.example.bionintelligence.data.database.start;

import com.example.bionintelligence.App;
import com.example.bionintelligence.R;
import com.example.bionintelligence.data.database.dao.CalculatorDao;
import com.example.bionintelligence.data.database.dao.CultureDao;
import com.example.bionintelligence.data.database.dao.KUsvDao;
import com.example.bionintelligence.data.database.dao.MethodsK2ODao;
import com.example.bionintelligence.data.database.dao.MethodsNDao;
import com.example.bionintelligence.data.database.dao.MethodsP2O5Dao;
import com.example.bionintelligence.data.database.dao.PHDao;
import com.example.bionintelligence.data.database.dao.ProductiveInfoDao;
import com.example.bionintelligence.data.database.dao.PhasesDao;
import com.example.bionintelligence.data.database.dao.PhasesImgDao;
import com.example.bionintelligence.data.database.dao.PrecipitationRequirementsDao;
import com.example.bionintelligence.data.database.dao.SoilFactorsDao;
import com.example.bionintelligence.data.database.dao.TestCultureDao;
import com.example.bionintelligence.data.database.dao.VinosDao;
import com.example.bionintelligence.data.database.dao.WaterConsumptionDao;
import com.example.bionintelligence.data.model.CalculatorModel;
import com.example.bionintelligence.data.model.CultureModel;
import com.example.bionintelligence.data.model.KUsvModel;
import com.example.bionintelligence.data.model.MethodsK2OModel;
import com.example.bionintelligence.data.model.MethodsNModel;
import com.example.bionintelligence.data.model.MethodsP2O5Model;
import com.example.bionintelligence.data.model.PHModel;
import com.example.bionintelligence.data.model.PhasesImgModel;
import com.example.bionintelligence.data.model.ProductiveInfoModel;
import com.example.bionintelligence.data.model.PhasesModel;
import com.example.bionintelligence.data.model.PrecipitationRequirementsModel;
import com.example.bionintelligence.data.model.SoilFactorsModel;
import com.example.bionintelligence.data.model.TestCultureModel;
import com.example.bionintelligence.data.model.TestPhasesModel;
import com.example.bionintelligence.data.model.VinosModel;
import com.example.bionintelligence.data.model.WaterConsumptionModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.reactivex.Completable;
import io.reactivex.schedulers.Schedulers;

//Убрать это и сделать базу в assets/databases/
public class AddStartData {

    public static void addAllData() {
        setCultureData();
        setCalculatorData();
        setPrecipitationRequirementsData();
        setMethodsK20();
        setMethodsP2O5();
        setMethodsN();
        setPHData();
        setPrecipitationRequirementsData();
        setSoilFactorsData();
        setVinosData();
        setWaterConsumptionData();
        setKUsvData();
        setPhasesImageData();
        setPhasesData();
        setPhasesInfo();
        setTestCultureModel();
    }

    private static void setSoilFactorsData() {
        SoilFactorsDao soilFactorsDao = App.getInstance().getDatabase().soilFactorsDao();

        List<SoilFactorsModel> soilFactorsList = new ArrayList<>();
        soilFactorsList.add(new SoilFactorsModel(15, 30, 350, 20, 4, 3,
                0.25, 0.17, 6.05, 0.02, 0.1, 0.43, 2.15, 3.5, 7, 145));


        Completable.fromAction(() -> soilFactorsDao.insertList(soilFactorsList))
                .subscribeOn(Schedulers.io())
                .subscribe();
    }

    private static void setKUsvData() {
        KUsvDao kUsvDao =
                App.getInstance().getDatabase().kUsvDao();

        List<KUsvModel> kUsvList = new ArrayList<>();
        kUsvList.add(new KUsvModel(1, 0.6, 0.25, 0.13, 0.06, 0.125, 0.6));
        kUsvList.add(new KUsvModel(2, 0.6, 0.27, 0.2, 0.06, 0.13, 0.6));
        kUsvList.add(new KUsvModel(3, 0.5, 0.2, 0.14, 0.12, 0.25, 0.35));
        kUsvList.add(new KUsvModel(4, 0.65, 0.25, 0.13, 0.06, 0.1, 0.35));
        kUsvList.add(new KUsvModel(5, 0.5, 0.2, 0.13, 0.12, 0.23, 0.5));
        kUsvList.add(new KUsvModel(6, 0.6, 0.25, 0.13, 0.07, 0.01, 0.5));
        kUsvList.add(new KUsvModel(7, 0.45, 0.27, 0.13, 0.06, 0.13, 0.69));
        kUsvList.add(new KUsvModel(8, 0.45, 0.27, 0.13, 0.06, 0.13, 0.69));
        kUsvList.add(new KUsvModel(9, 0.6, 0.25, 0.13, 0.06, 0.125, 0.6));
        //нету данных по нуту
        kUsvList.add(new KUsvModel(10, 0.65, 0.25, 0.13, 0.06, 0.1, 0.75));

        Completable.fromAction(() -> kUsvDao.insertList(kUsvList))
                .subscribeOn(Schedulers.io())
                .subscribe();
    }


    private static void setMethodsK20() {
        MethodsK2ODao methodsK2ODao =
                App.getInstance().getDatabase().methodsK2ODao();

        List<MethodsK2OModel> methodsK2OList = new ArrayList<>();
        methodsK2OList.add(new MethodsK2OModel("Очень низкое", 40, -1, 20, -1, 100, -1, 2.295, 4.985));
        methodsK2OList.add(new MethodsK2OModel("Низкое", 41, 80, 21, 40, 101, 200, 2.474, 4.812));
        methodsK2OList.add(new MethodsK2OModel("Среднее", 81, 120, 41, 80, 201, 300, 2.468, 4.702));
        methodsK2OList.add(new MethodsK2OModel("Повышенное", 121, 170, 81, 120, 301, 400, 2.577, 4.404));
        methodsK2OList.add(new MethodsK2OModel("Высокое", 171, 250, 121, 180, 401, 600, 2.338, 3.310));
        methodsK2OList.add(new MethodsK2OModel("Очень высокое", 251, -1, 181, -1, 601, -1, 2.400, 3.333));

        Completable.fromAction(() -> methodsK2ODao.insertList(methodsK2OList))
                .subscribeOn(Schedulers.io())
                .subscribe();
    }

    private static void setMethodsP2O5() {
        MethodsP2O5Dao methodsP2O5Dao =
                App.getInstance().getDatabase().methodsP2O5Dao();

        List<MethodsP2O5Model> methodsP2O5List = new ArrayList<>();
        methodsP2O5List.add(new MethodsP2O5Model("Очень низкое", 25, -1, 20, -1, 10, -1, 0.400, 0.526));
        methodsP2O5List.add(new MethodsP2O5Model("Низкое", 26, 50, 21, 50, 11, 15, 0.353, 0.372));
        methodsP2O5List.add(new MethodsP2O5Model("Среднее", 51, 100, 51, 100, 16, 30, 0.305, 0.341));
        methodsP2O5List.add(new MethodsP2O5Model("Повышенное", 101, 150, 101, 150, 31, 45, 0.303, 0.315));
        methodsP2O5List.add(new MethodsP2O5Model("Высокое", 151, 250, 151, 200, 46, 60, 0.265, 0.305));
        methodsP2O5List.add(new MethodsP2O5Model("Очень высокое", 251, -1, 201, -1, 61, -1, 0.243, 0.300));

        Completable.fromAction(() -> methodsP2O5Dao.insertList(methodsP2O5List))
                .subscribeOn(Schedulers.io())
                .subscribe();
    }

    private static void setMethodsN() {
        MethodsNDao methodsNDao =
                App.getInstance().getDatabase().methodsNDao();

        List<MethodsNModel> methodsNList = new ArrayList<>();
        methodsNList.add(new MethodsNModel("Очень низкое", 30, -1, 100, -1, 5, -1, 0.265, 0.081));
        methodsNList.add(new MethodsNModel("Низкое", 31, 40, 101, 150, 6, 8, 0.313, 0.095));
        methodsNList.add(new MethodsNModel("Среднее", 41, 50, 151, 200, 9, 15, 0.429, 0.116));
        methodsNList.add(new MethodsNModel("Повышенное", 51, 70, 201, 300, 16, 30, 0.598, 0.156));
        methodsNList.add(new MethodsNModel("Высокое", 71, 100, 301, 500, 31, 60, 0.852, 0.193));
        methodsNList.add(new MethodsNModel("Очень высокое", 101, -1, 501, -1, 61, -1, 1.046, 0.207));

        Completable.fromAction(() -> methodsNDao.insertList(methodsNList))
                .subscribeOn(Schedulers.io())
                .subscribe();
    }


    private static void setPHData() {
        PHDao phDao =
                App.getInstance().getDatabase().phDao();

        List<PHModel> phList = new ArrayList<>();
        phList.add(new PHModel(4.0, 0.37, 0.3, 0.3, 0.2, 0.4, 0.3, 0.2, 0.2, 0.2, 0.2, 0.2, 0.8, 1));
        phList.add(new PHModel(4.1, 0.45, 0.31, 0.4, 0.22, 0.45, 0.4, 0.25, 0.23, 0.25, 0.22, 0.25, 0.19, 1));
        phList.add(new PHModel(4.2, 0.48, 0.32, 0.5, 0.25, 0.48, 0.5, 0.3, 0.25, 0.3, 0.25, 0.3, 0.2, 1));
        phList.add(new PHModel(4.3, 0.52, 0.33, 0.6, 0.27, 0.51, 0.6, 0.35, 0.27, 0.35, 0.3, 0.35, 0.25, 1));
        phList.add(new PHModel(4.4, 0.54, 0.34, 0.65, 0.33, 0.54, 0.65, 0.4, 0.3, 0.4, 0.35, 0.4, 0.3, 1));
        phList.add(new PHModel(4.5, 0.6, 0.35, 0.68, 0.35, 0.57, 0.68, 0.5, 0.32, 0.5, 0.4, 0.5, 0.35, 1));
        phList.add(new PHModel(4.6, 0.6, 0.36, 0.7, 0.39, 0.6, 0.70, 0.6, 0.35, 0.6, 0.45, 0.6, 0.4, 1));
        phList.add(new PHModel(4.7, 0.63, 0.37, 0.72, 0.40, 0.62, 0.72, 0.7, 0.37, 0.7, 0.5, 0.7, 0.41, 1));
        phList.add(new PHModel(4.8, 0.65, 0.38, 0.74, 0.42, 0.64, 0.74, 0.8, 0.39, 0.8, 0.55, 0.8, 0.42, 1));
        phList.add(new PHModel(4.9, 0.75, 0.39, 0.75, 0.44, 0.66, 0.75, 0.9, 0.41, 0.9, 0.6, 0.9, 0.43, 1));
        phList.add(new PHModel(5.0, 0.77, 0.39, 0.76, 0.47, 0.68, 0.76, 1, 0.43, 1, 0.65, 1, 0.44, 1));
        phList.add(new PHModel(5.1, 0.79, 0.39, 0.77, 0.5, 0.71, 0.77, 0.75, 0.45, 0.75, 0.75, 0.75, 0.45, 0.98));
        phList.add(new PHModel(5.2, 0.8, 0.39, 0.78, 0.52, 0.73, 0.78, 0.8, 0.47, 0.8, 0.8, 0.8, 0.46, 0.96));
        phList.add(new PHModel(5.3, 0.81, 0.4, 0.79, 0.54, 0.75, 0.79, 0.95, 0.48, 0.95, 0.95, 0.95, 0.47, 0.94));
        phList.add(new PHModel(5.4, 0.83, 0.43, 0.81, 0.58, 0.78, 0.80, 1, 0.49, 1, 1, 0.97, 0.48, 0.92));
        phList.add(new PHModel(5.5, 0.85, 0.45, 0.84, 0.6, 0.8, 0.81, 1, 0.5, 1, 1, 0.99, 0.49, 0.9));
        phList.add(new PHModel(5.6, 0.87, 0.48, 0.87, 0.64, 0.83, 0.82, 1, 0.53, 1, 1, 1, 0.52, 0.88));
        phList.add(new PHModel(5.7, 0.9, 0.5, 0.9, 0.68, 0.86, 0.83, 1, 0.55, 1, 1, 1, 0.5, 0.86));
        phList.add(new PHModel(5.8, 0.93, 0.53, 0.93, 0.72, 0.89, 0.84, 1, 0.6, 1, 1, 1, 0.51, 0.84));
        phList.add(new PHModel(5.9, 0.98, 0.55, 0.95, 0.74, 0.92, 0.85, 1, 0.65, 1, 1, 1, 0.52, 0.82));
        phList.add(new PHModel(6, 1, 0.6, 0.98, 0.76, 0.93, 0.86, 1, 0.67, 1, 1, 1, 0.53, 0.8));
        phList.add(new PHModel(6.1, 1, 0.68, 1, 0.82, 0.94, 0.9, 1, 0.73, 1, 0.98, 1, 0.54, 0.78));
        phList.add(new PHModel(6.2, 1, 0.72, 1, 0.85, 0.95, 0.95, 1, 0.77, 1, 0.97, 1, 0.55, 0.76));
        phList.add(new PHModel(6.3, 1, 0.78, 1, 0.89, 0.96, 1, 1, 0.82, 1, 0.95, 1, 0.65, 0.74));
        phList.add(new PHModel(6.4, 1, 0.88, 1, 0.92, 0.97, 1, 1, 0.86, 1, 0.93, 1, 0.7, 0.72));
        phList.add(new PHModel(6.5, 1, 0.98, 1, 0.94, 0.98, 1, 1, 0.9, 1, 0.86, 1, 0.75, 0.70));
        phList.add(new PHModel(6.6, 1, 1, 1, 0.95, 0.99, 1, 1, 0.94, 1, 0.83, 1, 0.8, 0.68));
        phList.add(new PHModel(6.7, 1, 1, 1, 0.97, 1, 1, 1, 0.98, 1, 0.78, 1, 0.85, 0.66));
        phList.add(new PHModel(6.8, 1, 1, 1, 0.99, 1, 1, 1, 1, 1, 0.74, 1, 0.9, 0.64));
        phList.add(new PHModel(6.9, 1, 1, 1, 0.99, 1, 1, 1, 1, 1, 0.7, 1, 0.95, 0.62));
        phList.add(new PHModel(7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.68, 1, 1, 0.6));
        phList.add(new PHModel(7.1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.66, 1, 1, 0.58));
        phList.add(new PHModel(7.2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.64, 0.98, 1, 0.56));
        phList.add(new PHModel(7.3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.62, 0.95, 1, 0.54));
        phList.add(new PHModel(7.4, 1, 1, 1, 1, 1, 1, 0.95, 1, 0.95, 0.60, 0.93, 0.95, 0.52));
        phList.add(new PHModel(7.5, 1, 1, 1, 1, 1, 1, 0.9, 1, 0.9, 0.58, 0.9, 0.9, 0.5));
        phList.add(new PHModel(7.6, 1, 1, 1, 0.95, 1, 1, 0.85, 1, 0.85, 0.56, 0.85, 0.85, 0.48));
        phList.add(new PHModel(7.7, 1, 0.87, 1, 0.92, 0.98, 1, 0.85, 1, 0.85, 0.54, 0.85, 0.80, 0.46));
        phList.add(new PHModel(7.8, 1, 0.85, 1, 0.9, 0.95, 1, 0.8, 1, 0.8, 0.52, 0.8, 0.75, 0.44));
        phList.add(new PHModel(7.9, 1, 0.7, 1, 0.88, 0.91, 1, 0.75, 1, 0.75, 0.5, 0.75, 0.7, 0.42));
        phList.add(new PHModel(8, 1, 0.65, 1, 0.87, 0.89, 1, 0.7, 1, 0.7, 0.5, 0.7, 0.65, 0.4));
        phList.add(new PHModel(8.1, 0.95, 0.6, 1, 0.85, 0.86, 1, 0.68, 1, 0.68, 0.48, 0.68, 0.6, 0.38));
        phList.add(new PHModel(8.2, 0.9, 0.55, 1, 0.83, 0.83, 1, 0.65, 1, 0.65, 0.46, 0.65, 0.58, 0.36));
        phList.add(new PHModel(8.3, 0.85, 0.55, 1, 0.82, 0.82, 1, 0.68, 1, 0.68, 0.44, 0.68, 0.55, 0.34));
        phList.add(new PHModel(8.4, 0.85, 0.55, 1, 0.8, 0.8, 1, 0.65, 1, 0.65, 0.4, 0.65, 0.53, 0.33));
        phList.add(new PHModel(8.5, 0.75, 0.5, 1, 0.79, 0.79, 1, 0.63, 1, 0.63, 0.38, 0.63, 0.5, 0.32));
        phList.add(new PHModel(8.6, 0.7, 0.6, 1, 0.77, 0.77, 1, 0.6, 1, 0.6, 0.35, 0.6, 0.56, 0.31));
        phList.add(new PHModel(8.7, 0.65, 0.7, 1, 0.75, 0.75, 1, 0.58, 1, 0.58, 0.31, 0.58, 0.68, 0.30));
        phList.add(new PHModel(8.8, 0.65, 0.8, 1, 0.74, 0.74, 1, 0.55, 1, 0.55, 0.28, 0.55, 0.75, 0.29));
        phList.add(new PHModel(8.9, 0.6, 0.9, 1, 0.73, 0.73, 1, 0.53, 1, 0.53, 0.27, 0.53, 0.8, 0.28));
        phList.add(new PHModel(9, 0.55, 0.95, 1, 0.7, 0.7, 1, 0.5, 1, 0.5, 0.25, 0.5, 0.9, 0.27));
        phList.add(new PHModel(9.1, 0.5, 1, 1, 0.69, 0.69, 1, 0.48, 1, 0.48, 0.25, 0.48, 0.95, 0.27));
        phList.add(new PHModel(9.2, 0.45, 1, 1, 0.67, 0.67, 1, 0.46, 1, 0.46, 0.25, 0.46, 1, 0.27));
        phList.add(new PHModel(9.3, 0.4, 1, 1, 0.67, 0.67, 1, 0.44, 1, 0.44, 0.24, 0.44, 1, 0.27));
        phList.add(new PHModel(9.4, 0.45, 1, 1, 0.65, 0.65, 1, 0.41, 1, 0.41, 0.23, 0.41, 1, 0.27));
        phList.add(new PHModel(9.5, 0.35, 1, 1, 0.62, 0.62, 1, 0.38, 1, 0.38, 0.23, 0.38, 1, 0.27));
        phList.add(new PHModel(9.6, 0.35, 1, 1, 0.59, 0.59, 1, 0.36, 1, 0.36, 0.22, 0.36, 1, 0.27));
        phList.add(new PHModel(9.7, 0.3, 1, 1, 0.57, 0.57, 1, 0.35, 1, 0.35, 0.22, 0.35, 1, 0.27));
        phList.add(new PHModel(9.8, 0.25, 1, 1, 0.55, 0.55, 1, 0.35, 1, 0.35, 0.21, 0.35, 1, 0.27));
        phList.add(new PHModel(9.9, 0.25, 1, 1, 0.52, 0.52, 1, 0.34, 1, 0.34, 0.2, 0.34, 1, 0.27));
        phList.add(new PHModel(10, 0.2, 1, 1, 0.49, 0.49, 1, 0.33, 1, 0.33, 0.2, 0.33, 1, 0.27));

        Completable.fromAction(() -> phDao.insertList(phList))
                .subscribeOn(Schedulers.io())
                .subscribe();
    }

    private static void setPrecipitationRequirementsData() {
        PrecipitationRequirementsDao precipitationRequirementsDao =
                App.getInstance().getDatabase().precipitationRequirementsDao();

        List<PrecipitationRequirementsModel> precipitationRequirementsModelList = new ArrayList<>();
        precipitationRequirementsModelList.add(new PrecipitationRequirementsModel(1, 261));
        precipitationRequirementsModelList.add(new PrecipitationRequirementsModel(2, 170));
        precipitationRequirementsModelList.add(new PrecipitationRequirementsModel(3, -96));
        precipitationRequirementsModelList.add(new PrecipitationRequirementsModel(4, 698));
        precipitationRequirementsModelList.add(new PrecipitationRequirementsModel(5, -55.75));
        precipitationRequirementsModelList.add(new PrecipitationRequirementsModel(6, 442));
        precipitationRequirementsModelList.add(new PrecipitationRequirementsModel(7, 592.45));
        precipitationRequirementsModelList.add(new PrecipitationRequirementsModel(8, 396.8));
        precipitationRequirementsModelList.add(new PrecipitationRequirementsModel(9, 255));
        precipitationRequirementsModelList.add(new PrecipitationRequirementsModel(10, 638));

        Completable.fromAction(() -> precipitationRequirementsDao.insertList(precipitationRequirementsModelList))
                .subscribeOn(Schedulers.io())
                .subscribe();
    }

    private static void setVinosData() {
        VinosDao vinosDao =
                App.getInstance().getDatabase().vinosDao();

        List<VinosModel> vinosList = new ArrayList<>();
        vinosList.add(new VinosModel(1, 3.13, 0.9, 2.15, 0.67, 0.35, 0.55));
        vinosList.add(new VinosModel(2, 2.21, 0.81, 2.2, 0.6, 0.21, 0.35));
        vinosList.add(new VinosModel(3, 3.37, 0.25, 0.68, 0.35, 0.1, 0.14));
        vinosList.add(new VinosModel(4, 3.85, 1.82, 3.9, 0.62, 0.36, 0.71));
        vinosList.add(new VinosModel(5, 0.5, 0.39, 1.1, 0.3, 0.05, 0.09));
        vinosList.add(new VinosModel(6, 5.1, 2.1, 7, 0.5, 0.1, 0.6));
        vinosList.add(new VinosModel(7, 5.85, 2.71, 4.9, 1.24, 0.68, 1.08));
        vinosList.add(new VinosModel(8, 5.7, 2.75, 5, 1.24, 0.68, 0.82));
        vinosList.add(new VinosModel(9, 3.44, 1.08, 2.38, 0.57, 0.26, 0.44));
        vinosList.add(new VinosModel(10, 4.33, 3.5, 5.8, 2, 0.7, 1.15));

        Completable.fromAction(() -> vinosDao.insertList(vinosList))
                .subscribeOn(Schedulers.io())
                .subscribe();
    }

    private static void setWaterConsumptionData() {
        WaterConsumptionDao waterConsumptionDao =
                App.getInstance().getDatabase().waterConsumptionDao();

        List<WaterConsumptionModel> waterConsumptionModelList = new ArrayList<>();
        waterConsumptionModelList.add(new WaterConsumptionModel(1, 135));
        waterConsumptionModelList.add(new WaterConsumptionModel(2, 450));
        waterConsumptionModelList.add(new WaterConsumptionModel(3, 70));
        waterConsumptionModelList.add(new WaterConsumptionModel(4, 280));
        waterConsumptionModelList.add(new WaterConsumptionModel(5, 375));
        waterConsumptionModelList.add(new WaterConsumptionModel(6, 195));
        waterConsumptionModelList.add(new WaterConsumptionModel(7, 245));
        waterConsumptionModelList.add(new WaterConsumptionModel(8, 180));
        waterConsumptionModelList.add(new WaterConsumptionModel(9, 133));
        waterConsumptionModelList.add(new WaterConsumptionModel(10, 260));

        Completable.fromAction(() -> waterConsumptionDao.insertList(waterConsumptionModelList))
                .subscribeOn(Schedulers.io())
                .subscribe();
    }

    private static void setCalculatorData() {
        CalculatorDao calculatorDao =
                App.getInstance().getDatabase().calculatorDao();
        CalculatorModel calculatorModel =
                new CalculatorModel(0, 0, 0, 0, 0, 0, 0);

        Completable.fromAction(() -> calculatorDao.insert(calculatorModel))
                .subscribeOn(Schedulers.io())
                .subscribe();
    }




    private static void setPhasesImageData() {
        PhasesImgDao phasesImageDao = App.getInstance().getDatabase().phasesImgDao();

        List<PhasesImgModel> list = new ArrayList<>();
        list.add(new PhasesImgModel(1, R.drawable.phase_winter_wheat1, R.drawable.phase_winter_wheat2, R.drawable.phase_winter_wheat3, R.drawable.phase_winter_wheat4, 0, 0));
        list.add(new PhasesImgModel(2, R.drawable.phase_corn1, R.drawable.phase_corn2, R.drawable.phase_corn3, 0, 0, 0));
        list.add(new PhasesImgModel(3, R.drawable.phase_sugar_beet1, R.drawable.phase_sugar_beet2, R.drawable.phase_sugar_beet3, R.drawable.phase_sugar_beet4, R.drawable.phase_sugar_beet5, 0));
        list.add(new PhasesImgModel(4, R.drawable.phase_soy1, R.drawable.phase_soy2, R.drawable.phase_soy3, 0, 0, 0));
        list.add(new PhasesImgModel(5, R.drawable.phase_potatoes1, R.drawable.phase_potatoes2, R.drawable.phase_potatoes3, R.drawable.phase_potatoes4, R.drawable.phase_potatoes5, R.drawable.phase_potatoes6));
        list.add(new PhasesImgModel(6, R.drawable.phase_sun_flower1, R.drawable.phase_sun_flower2, R.drawable.phase_sun_flower3, 0, 0, 0));
        list.add(new PhasesImgModel(7, R.drawable.phase_winter_rape1, R.drawable.phase_winter_rape2, R.drawable.phase_winter_rape3, R.drawable.phase_winter_rape4, 0, 0));
        list.add(new PhasesImgModel(8, R.drawable.phase_spring_rape1, R.drawable.phase_spring_rape2, R.drawable.phase_spring_rape3, 0, 0, 0));
        list.add(new PhasesImgModel(9, R.drawable.phase_spring_wheat1, R.drawable.phase_spring_wheat2, R.drawable.phase_spring_wheat3, R.drawable.phase_spring_wheat4, 0, 0));
        list.add(new PhasesImgModel(10, R.drawable.phase_chickpea1, R.drawable.phase_chickpea2, R.drawable.phase_chickpea3, 0, 0, 0));

        Completable.fromAction(() -> phasesImageDao.insertList(list))
                .subscribeOn(Schedulers.io())
                .subscribe();
    }


    private static void setPhasesInfo() {
        ProductiveInfoDao productiveInfoDao = App.getInstance().getDatabase().phaseInfoDao();

        List<ProductiveInfoModel> listInfo = new ArrayList<>();
        listInfo.add(new ProductiveInfoModel(1, 10, 30, 120));
        listInfo.add(new ProductiveInfoModel(2, 10, 40, 150));
        listInfo.add(new ProductiveInfoModel(3, 50, 250, 800));
        listInfo.add(new ProductiveInfoModel(4, 5, 10, 50));
        listInfo.add(new ProductiveInfoModel(5, 50, 250, 800));
        listInfo.add(new ProductiveInfoModel(6, 5, 15, 50));
        listInfo.add(new ProductiveInfoModel(7, 10, 20, 70));
        listInfo.add(new ProductiveInfoModel(8, 5, 15, 50));
        listInfo.add(new ProductiveInfoModel(9, 10, 20, 100));
        listInfo.add(new ProductiveInfoModel(10, 5, 5, 45));

        Completable.fromAction(() -> productiveInfoDao.insertList(listInfo))
                .subscribeOn(Schedulers.io())
                .subscribe();
    }

    private static void setCultureData() {
        CultureDao cultureDao = App.getInstance().getDatabase().cultureDao();

        List<CultureModel> cultureList = new ArrayList<>();
        cultureList.add(new CultureModel("Озимая пшеница", R.drawable.img_winter_wheat));
        cultureList.add(new CultureModel("Кукуруза", R.drawable.img_corn));
        cultureList.add(new CultureModel("Сахарная свекла", R.drawable.img_sugar_beet));
        cultureList.add(new CultureModel("Соя", R.drawable.img_soy));
        cultureList.add(new CultureModel("Картофель", R.drawable.img_potatoes));
        cultureList.add(new CultureModel("Подсолнечник", R.drawable.img_sun_flower));
        cultureList.add(new CultureModel("Озимый рапс", R.drawable.img_rape));
        cultureList.add(new CultureModel("Яровой рапс", R.drawable.img_rape));
        cultureList.add(new CultureModel("Яровая пшеница", R.drawable.img_winter_wheat));
        cultureList.add(new CultureModel("Нут", R.drawable.img_chickpea));

        Completable.fromAction(() -> cultureDao.insertList(cultureList))
                .subscribeOn(Schedulers.io())
                .subscribe();
    }

    private static void setTestCultureModel() {
        TestCultureDao testCultureDao = App.getInstance().getDatabase().testCultureDao();


//        List<TestCultureModel> cultureList = new ArrayList<>();
//        cultureList.add(new TestCultureModel(1,"Озимая пшеница", R.drawable.img_winter_wheat, new TestPhasesModel(30, Arrays.asList(0.0, 0.0, 0.0, 0.0))));
//        cultureList.add(new TestCultureModel(1,"Озимая пшеница", R.drawable.img_winter_wheat, new TestPhasesModel(30, Arrays.asList(0.0, 0.0, 0.0, 0.0))));
    }

    private static void setPhasesData() {
        PhasesDao phasesDao = App.getInstance().getDatabase().phasesDao();

        List<PhasesModel> phasesList = new ArrayList<>();
        phasesList.add(new PhasesModel(1, 30, 0, 0, 0, 0, -1, -1));
        phasesList.add(new PhasesModel(1, 40, 0.2, 0.2, 0.3, 0.2, -1, -1));
        phasesList.add(new PhasesModel(1, 50, 0.4, 0.4, 0.6, 0.4, -1, -1));
        phasesList.add(new PhasesModel(1, 60, 0.8, 0.8, 1.2, 0.8, -1, -1));
        phasesList.add(new PhasesModel(1, 70, 1, 1, 1.5, 1, -1, -1));
        phasesList.add(new PhasesModel(1, 80, 1.3, 1.3, 2, 1.3, -1, -1));
        phasesList.add(new PhasesModel(1, 90, 1.8, 1.8, 2.7, 1.8, -1, -1));
        phasesList.add(new PhasesModel(1, 100, 2.4, 2.4, 3.6, 2.4, -1, -1));
        phasesList.add(new PhasesModel(1, 110, 3.1, 3.1, 4.6, 3.1, -1, -1));
        phasesList.add(new PhasesModel(1, 120, 4, 4, 6, 4, -1, -1));
        phasesList.add(new PhasesModel(2, 40, 0, 0, 0, -1, -1, -1));
        phasesList.add(new PhasesModel(2, 50, 0.4, 0.4, 0.4, -1, -1, -1));
        phasesList.add(new PhasesModel(2, 60, 0.8, 0.8, 0.8, -1, -1, -1));
        phasesList.add(new PhasesModel(2, 70, 1.2, 1.2, 1.2, -1, -1, -1));
        phasesList.add(new PhasesModel(2, 80, 1.5, 1.5, 1.5, -1, -1, -1));
        phasesList.add(new PhasesModel(2, 90, 2, 2, 2, -1, -1, -1));
        phasesList.add(new PhasesModel(2, 100, 2.4, 2.4, 2.4, -1, -1, -1));
        phasesList.add(new PhasesModel(2, 110, 2.8, 2.8, 2.8, -1, -1, -1));
        phasesList.add(new PhasesModel(2, 120, 3.3, 3.3, 3.3, -1, -1, -1));
        phasesList.add(new PhasesModel(2, 130, 4, 4, 4, -1, -1, -1));
        phasesList.add(new PhasesModel(2, 140, 4.3, 4.3, 4.3, -1, -1, -1));
        phasesList.add(new PhasesModel(2, 150, 4.9, 4.9, 4.9, -1, -1, -1));
        phasesList.add(new PhasesModel(3, 250, 0, 0, 0, 0, 0, -1));
        phasesList.add(new PhasesModel(3, 300, 0.2, 0.3, 0.5, 0.5, 0.3, -1));
        phasesList.add(new PhasesModel(3, 350, 0.3, 0.5, 0.7, 0.7, 0.5, -1));
        phasesList.add(new PhasesModel(3, 400, 0.7, 1, 1.4, 1.4, 1, -1));
        phasesList.add(new PhasesModel(3, 450, 1, 1.5, 2, 2, 1.5, -1));
        phasesList.add(new PhasesModel(3, 500, 1.3, 2, 2.6, 2.6, 2, -1));
        phasesList.add(new PhasesModel(3, 550, 1.7, 2.5, 3.4, 3.4, 2.5, -1));
        phasesList.add(new PhasesModel(3, 600, 2, 3, 4, 4, 3, -1));
        phasesList.add(new PhasesModel(3, 650, 2.3, 3.7, 4.5, 4.5, 3.7, -1));
        phasesList.add(new PhasesModel(3, 700, 2.7, 4.2, 5, 5, 4.2, -1));
        phasesList.add(new PhasesModel(3, 750, 3, 4.8, 5.5, 5.5, 4.8, -1));
        phasesList.add(new PhasesModel(3, 800, 3.3, 5.5, 6, 6, 5.5, -1));
        phasesList.add(new PhasesModel(4, 10, 0, 0, 0, -1, -1, -1));
        phasesList.add(new PhasesModel(4, 15, 0.4, 0.8, 0.4, -1, -1, -1));
        phasesList.add(new PhasesModel(4, 20, 0.8, 1.3, 0.8, -1, -1, -1));
        phasesList.add(new PhasesModel(4, 25, 1.5, 2, 1.5, -1, -1, -1));
        phasesList.add(new PhasesModel(4, 30, 2, 3, 2, -1, -1, -1));
        phasesList.add(new PhasesModel(4, 35, 2.7, 4, 2.7, -1, -1, -1));
        phasesList.add(new PhasesModel(4, 40, 3.5, 5, 3.5, -1, -1, -1));
        phasesList.add(new PhasesModel(4, 45, 4.4, 6, 4.4, -1, -1, -1));
        phasesList.add(new PhasesModel(4, 50, 5.3, 7, 5.3, -1, -1, -1));
        phasesList.add(new PhasesModel(5, 250, 0, 0, 0, 0, 0, 0));
        phasesList.add(new PhasesModel(5, 300, 0.6, 0.8, 1.1, 1.1, 1.1, 0.6));
        phasesList.add(new PhasesModel(5, 350, 1.2, 1.6, 2.2, 2.2, 2.2, 1.2));
        phasesList.add(new PhasesModel(5, 400, 1.8, 2.4, 3.2, 3.2, 3.2, 1.8));
        phasesList.add(new PhasesModel(5, 450, 2.4, 3.2, 4.1, 4.1, 4.1, 2.4));
        phasesList.add(new PhasesModel(5, 500, 3, 4, 5, 5, 5, 3));
        phasesList.add(new PhasesModel(5, 550, 3.7, 4.7, 5.7, 5.7, 5.7, 3.7));
        phasesList.add(new PhasesModel(5, 600, 4.3, 5.4, 6.4, 6.4, 6.4, 4.3));
        phasesList.add(new PhasesModel(5, 650, 5, 6, 7, 7, 7, 5));
        phasesList.add(new PhasesModel(5, 700, 5.6, 6.4, 7.6, 7.6, 7.6, 5.6));
        phasesList.add(new PhasesModel(5, 750, 6.3, 7.3, 8.1, 8.1, 8.1, 6.3));
        phasesList.add(new PhasesModel(5, 800, 7, 8, 8.5, 8.5, 8.5, 7));
        phasesList.add(new PhasesModel(6, 15, 0, 0, 0, -1, -1, -1));
        phasesList.add(new PhasesModel(6, 20, 0, 0.3, 0.5, -1, -1, -1));
        phasesList.add(new PhasesModel(6, 25, 1, 1, 1.4, -1, -1, -1));
        phasesList.add(new PhasesModel(6, 30, 1.5, 1.5, 2, -1, -1, -1));
        phasesList.add(new PhasesModel(6, 35, 2, 2, 3, -1, -1, -1));
        phasesList.add(new PhasesModel(6, 40, 3.1, 3.1, 4.5, -1, -1, -1));
        phasesList.add(new PhasesModel(6, 45, 4.2, 4.2, 6.5, -1, -1, -1));
        phasesList.add(new PhasesModel(6, 50, 5.5, 5.5, 8.3, -1, -1, -1));
        phasesList.add(new PhasesModel(7, 20, 0, 0, 0, 0, -1, -1));
        phasesList.add(new PhasesModel(7, 30, 1, 1, 1.3, 1, -1, -1));
        phasesList.add(new PhasesModel(7, 40, 2, 2, 3, 2, -1, -1));
        phasesList.add(new PhasesModel(7, 50, 3.2, 3.2, 4.6, 3.2, -1, -1));
        phasesList.add(new PhasesModel(7, 60, 4.3, 4.3, 6.3, 4.3, -1, -1));
        phasesList.add(new PhasesModel(7, 70, 5.4, 5.4, 8.1, 5.4, -1, -1));
        phasesList.add(new PhasesModel(8, 15, 0.4, 0.8, 0.4, -1, -1, -1));
        phasesList.add(new PhasesModel(8, 20, 0.8, 1.3, 0.8, -1, -1, -1));
        phasesList.add(new PhasesModel(8, 25, 1.5, 2.0, 1.5, -1, -1, -1));
        phasesList.add(new PhasesModel(8, 30, 2, 3, 2, -1, -1, -1));
        phasesList.add(new PhasesModel(8, 35, 2.7, 4, 2.7, -1, -1, -1));
        phasesList.add(new PhasesModel(8, 40, 3.5, 5, 3.5, -1, -1, -1));
        phasesList.add(new PhasesModel(8, 45, 4.4, 6, 4.4, -1, -1, -1));
        phasesList.add(new PhasesModel(8, 50, 5.3, 7, 5.3, -1, -1, -1));
        phasesList.add(new PhasesModel(9, 20, 0, 0, 0, 0, -1, -1));
        phasesList.add(new PhasesModel(9, 30, 0.2, 0.2, 0.3, 0.2, -1, -1));
        phasesList.add(new PhasesModel(9, 40, 0.4, 0.4, 0.6, 0.4, -1, -1));
        phasesList.add(new PhasesModel(9, 50, 0.8, 0.8, 1.2, 0.8, -1, -1));
        phasesList.add(new PhasesModel(9, 60, 1, 1, 1.5, 1, -1, -1));
        phasesList.add(new PhasesModel(9, 70, 1.3, 1.3, 2, 1.3, -1, -1));
        phasesList.add(new PhasesModel(9, 80, 1.8, 1.8, 2.7, 1.8, -1, -1));
        phasesList.add(new PhasesModel(9, 90, 2.4, 2.4, 3.6, 2.4, -1, -1));
        phasesList.add(new PhasesModel(9, 100, 3.1, 3.1, 4.6, 3.1, -1, -1));
        phasesList.add(new PhasesModel(10, 5, 0, 0, 0, -1, -1, -1));
        phasesList.add(new PhasesModel(10, 10, 0.4, 0.6, 0.4, -1, -1, -1));
        phasesList.add(new PhasesModel(10, 15, 0.8, 1.3, 0.8, -1, -1, -1));
        phasesList.add(new PhasesModel(10, 20, 1.5, 2, 1.5, -1, -1, -1));
        phasesList.add(new PhasesModel(10, 25, 2, 3, 2, -1, -1, -1));
        phasesList.add(new PhasesModel(10, 30, 2.5, 4, 2.5, -1, -1, -1));
        phasesList.add(new PhasesModel(10, 35, 3.3, 5, 3.3, -1, -1, -1));
        phasesList.add(new PhasesModel(10, 40, 4, 6, 4, -1, -1, -1));
        phasesList.add(new PhasesModel(10, 45, 5, 7, 5, -1, -1, -1));

        Completable.fromAction(() -> phasesDao.insertList(phasesList))
                .subscribeOn(Schedulers.io())
                .subscribe();
    }
}

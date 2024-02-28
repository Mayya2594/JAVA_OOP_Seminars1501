package Seminar_7_HW;


import Seminar_7_HW.Model.OperationModel;
import Seminar_7_HW.Presenter.Presenter;
import Seminar_7_HW.View.View;

public class Main {
    public static void main(String[] args) {
        Presenter<OperationModel> presenter = new Presenter<>(new View(), new OperationModel());
        presenter.startOperation();
    }
}

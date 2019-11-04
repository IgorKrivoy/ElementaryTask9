package task.service;


import task.model.PowModel;

public class PowService {

    public long pow(PowModel powModel) {
        long result = 1;
        for (int i = 1; i <= powModel.getPow(); i++) {
            result *= powModel.getNumber();
        }
        return result;
    }
}

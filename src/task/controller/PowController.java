package task.controller;

import task.util.*;
import task.service.*;
import task.model.*;

public class PowController {

    Input input = new Input();
    OutPut outPut = new OutPut();
    Validator validator = new Validator();
    PowService powService = new PowService();
    PowModel powModel;

    public void run() {
        while (true) {
            String[] strings;
            outPut.getStartInfo();
            strings = validator.getSplitArrayString(input.getString());
            try {
                powModel = new PowModel(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]));
                outPut.outResultForPow(powService.pow(powModel));
            } catch (Exception ex) {
                outPut.getInfoIncorrectData();
            }
            outPut.continuedRequest();
            if (!validator.continuedRequests(input.getString().toUpperCase())) {
                break;
            }
        }
    }
}

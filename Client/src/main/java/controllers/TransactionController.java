package controllers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import models.Id;

import java.util.List;

public class TransactionController {
    private String rootURL = "http://zipcode.rocks:8085";
//    private MessageController msgCtrl;
//    private IdController idCtrl;

    IdController idController = new IdController();
    public TransactionController(){

    }


    public TransactionController(MessageController msgCtrl, IdController idCtrl) {}

    public List<Id> getIds() {
        return null;
    }
    public void createIdObject(String idtoRegister, String githubName) {
        Id tid = new Id("", idtoRegister, githubName);
        //tid = idCtrl.postId(tid);
        idController.postId(tid);
    }

    public String makecall(String s, String get, String s1) {
        return null;
    }
}

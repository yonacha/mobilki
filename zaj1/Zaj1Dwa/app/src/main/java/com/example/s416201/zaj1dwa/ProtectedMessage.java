package com.example.s416201.zaj1dwa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by s416201 on 24.03.2018.
 */

public class ProtectedMessage {
    private String mess;
    private String pass;
    public ProtectedMessage(){}
    public ProtectedMessage(String x, String z){
    mess = x;
    pass = z;
}
public void SetMess(String y){
    mess = y;
}
public String GetMess(){
    return mess;
}
public void SetPass(String haslo){
    pass = haslo;
}
public String GetPass(){
    return pass;
}







}

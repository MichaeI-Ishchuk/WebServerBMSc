package company.dto;


/**
 * Created by nata on 15.06.2017.
 */


public class ResponseMessageDTO {

    String number;

    String time;

    String messageType;

    String timer;

    String status;

    String dbChange;

    String timerService;

    String inform1;

    String inform2;

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDbChange() {
        return dbChange;
    }

    public void setDbChange(String dbChange) {
        this.dbChange = dbChange;
    }

    public String getTimerService() {
        return timerService;
    }

    public void setTimerService(String timerService) {
        this.timerService = timerService;
    }

    public String getInform1() {
        return inform1;
    }

    public void setInform1(String inform1) {
        this.inform1 = inform1;
    }

    public String getInform2() {
        return inform2;
    }

    public void setInform2(String inform2) {
        this.inform2 = inform2;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ResponseMessageDTO() {
    }



}

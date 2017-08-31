import javafx.beans.property.SimpleStringProperty;

public class model {
    private SimpleStringProperty meet;
    private SimpleStringProperty detail;
    private SimpleStringProperty date;
    private SimpleStringProperty time;

    public model(String meet, String detail,String date, String time) {
        this.meet = new SimpleStringProperty (meet);
        this.detail = new SimpleStringProperty (detail);
        this.date = new SimpleStringProperty (date);
        this.time = new SimpleStringProperty (time);
    }

    public String getMeet() {
        return meet.get();
    }

    public SimpleStringProperty meetProperty() {
        return meet;
    }

    public String getDetail() {
        return detail.get();
    }

    public SimpleStringProperty detailProperty() {
        return detail;
    }

    public String getDate() {
        return date.get();
    }

    public void setMeet(String meet) {
        this.meet.set(meet);
    }

    public void setDetail(String detail) {
        this.detail.set(detail);
    }

    public void setDate(String date) {
        this.date.set(date);
    }

    public void setTime(String time) {
        this.time.set(time);
    }

    public SimpleStringProperty dateProperty() {

        return date;
    }

    public String getTime() {
        return time.get();
    }

    public SimpleStringProperty timeProperty() {
        return time;
    }
}

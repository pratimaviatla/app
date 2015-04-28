package dz.sbenkhaoua.mapper.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by sbenkhaoua on 28/04/15.
 */
@Table(name = "car_road")
@XmlRootElement
public class CarRoad {
    public CarRoad(){

    }
    @Id
    private String id;
    @Column(name = "car_id")
    private String carId;
    @Column(name = "road_id")
    private String roadId;
    @Column(name = "insert_date")
    private String insertDate;
    @Column(name = "leave_date")
    private String leaveDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getRoadId() {
        return roadId;
    }

    public void setRoadId(String roadId) {
        this.roadId = roadId;
    }

    public String getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(String insertDate) {
        this.insertDate = insertDate;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }
}

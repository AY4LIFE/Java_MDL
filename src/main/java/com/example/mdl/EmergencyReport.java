package com.example.mdl;

public class EmergencyReport {
private String type;
private String location;
private String priority;
public EmergencyReport(String type, String location, String priority){
    this.type = type;
    this.location = location;
    this.priority = priority;
}
public String getType() {
    return type;
}
public String getLocation() {
    return location;
}
public String getPriority() {
    return priority;
}
public void setType(String type) {
    this.type = type;
}
public void setLocation(String location) {
    this.location = location;
}
public void setPriority(String priority) {
    this.priority = priority;
}
}

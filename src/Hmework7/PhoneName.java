package Hmework7;

public enum PhoneName {

    APPLE("Apple"),
    SAMSUNG("Samsung"),
    HUAWEI("Huawei");

    private String value;

    PhoneName(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }


}

package org.example.Summary14_25_10_2024;

public class DataStorage implements Comparable<DataStorage>{
    Data data;
    Double weight;
    int version;
    boolean isActive;

    public DataStorage(Data data, Double weight, int version, boolean isActive) {
        this.data = data;
        this.weight = weight;
        this.version = version;
        this.isActive = isActive;
    }


    @Override
    public String toString() {
        return "\n\tDataStorage{" +
                "data=" + data +
                ", weight=" + weight +
                ", version=" + version +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public int compareTo(DataStorage o) {
        int result = data.compareTo(o.data);
        if(result == 0){
            if(weight.equals(o.weight)){
                if(version == o.version){
                    if(isActive == true && o.isActive == false){
                        result = 1;
                    } else if (isActive == true && o.isActive == true) {
                        result = 0;
                    }else if (isActive == false && o.isActive == false){
                        result = 0;
                    }else {
                        result = -1;
                    }
                }else {
                    result = version -o.version;
                }
            }else {
                if((weight - o.weight) >0){
                    result = 1;
                } else if ((weight - o.weight) == 0) {
                    result = 0;
                }else {
                    result = -1;
                }
            }
        }

        return result;
    }

   public static class Data implements Comparable<Data>{
        String data;
        int count;

        public Data(String data, int count) {
            this.data = data;
            this.count = count;
        }


        @Override
        public int compareTo(Data another) {
            int result = data.compareTo(another.data);
            if (result == 0) {
                result = count - another.count;
            }
            return result;
        }
       @Override
       public String toString() {
           return "Data{" +
                   "data='" + data + '\'' +
                   ", count=" + count +
                   '}';
       }

   }

}

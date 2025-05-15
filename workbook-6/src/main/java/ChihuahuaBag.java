import java.util.ArrayList;
import java.util.List;

public class ChihuahuaBag {
    List<Chihuahua> chihuahuaList = new ArrayList<>();

    void add(Chihuahua chihuahua){
        chihuahuaList.add(chihuahua);
    }

    public void print(){
        for (Chihuahua chihuahua : chihuahuaList){
            System.out.println(chihuahua.toString());
        }
    }
}

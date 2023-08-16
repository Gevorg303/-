package gentleman;

import java.util.ArrayList;
import java.util.List;

public abstract class Woman {
    private String name;
    private List<Gift> giftList;

    public Woman(String name) {
        this.name = name;
        this.giftList=new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Gift> getGiftList() {
        return giftList;
    }

    public void setGiftList(List<Gift> giftList) {
        this.giftList = giftList;
    }
}

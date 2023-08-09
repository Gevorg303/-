package gentleman;

public class Woman {
    private String name;
    private String whim; /*каприз*/

    public Woman(String name, String whim) {
        this.name = name;
        this.whim = whim;
    }

    public String getName() {
        return name;
    }

    public String getWhim() {
        return whim;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWhim(String whim) {
        this.whim = whim;
    }
}

package 设计模式.观察者.接口委托.delegate;

import java.util.HashSet;
import java.util.Set;

public class UpdateEventHandler {

    private Set<InterfaceFetchUpdate> toFetchUpdateSet;

    public UpdateEventHandler() {
        toFetchUpdateSet = new HashSet<>();
    }

    public void addHandler(InterfaceFetchUpdate handler) {
        toFetchUpdateSet.add(handler);
    }

    public void removeHandler(InterfaceFetchUpdate handler) {
        toFetchUpdateSet.remove(handler);
    }

    public void handleFetchUpdate() {
        for (InterfaceFetchUpdate fetchUpdate : toFetchUpdateSet) {
            fetchUpdate.fetchUpdate();
        }
    }

    public int getCount() {
        return toFetchUpdateSet.size();
    }
}

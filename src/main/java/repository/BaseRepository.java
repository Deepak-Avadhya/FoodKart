package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseRepository<K,V> {
    private Map<K,V> baseRepository = new HashMap<>();
    private List<V> baseList = new ArrayList<>();

    void add(K k,V v){
        baseRepository.put(k,v);
        baseList.add(v);
    }
    void remove(K k){
        if(!baseRepository.containsKey(k))return;
        V v = baseRepository.remove(k);
        baseList.remove(v);
    }
    public Map<K, V> getBaseRepository() {
        return baseRepository;
    }

    public void setBaseRepository(Map<K, V> baseRepository) {
        this.baseRepository = baseRepository;
    }

    public List<V> getBaseList() {
        return baseList;
    }

    public void setBaseList(List<V> baseList) {
        this.baseList = baseList;
    }
}

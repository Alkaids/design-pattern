package com.blackj.designpattern.build.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Program Name: design-pattern
 * <p>
 * Description: 观察者模式-抽象主题
 * <p>
 * Created by Zhang.Haixin on 2019-05-29 23:27
 *
 * @author Zhang.Haixin
 * @version 1.0
 */
public abstract class Novel {

    private List<Reader> readers = new ArrayList<>();

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    public void removeReader(Reader reader) {
        readers.remove(reader);
    }

    public void notifyReaders() {
        for (Reader reader: readers) {
            reader.read();
        }
    }
}

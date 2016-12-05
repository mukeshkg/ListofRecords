package org.dashboard.data;

import org.dashboard.domain.record;

import java.util.*;

/**
 * Created by thinklenovo on 12/4/2016.
 */
public class datahandler {

    List<record> records = new ArrayList<record>();

    public datahandler(){
    }

    public void add(record rec){

        records.add(rec);
    }

    public List getRecords(){

        return records;
    }

}


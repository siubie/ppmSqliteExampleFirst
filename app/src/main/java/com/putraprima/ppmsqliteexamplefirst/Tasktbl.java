package com.putraprima.ppmsqliteexamplefirst;

import com.orm.SugarRecord;

/**
 * Created by putraprima on 16/10/17.
 */

public class Tasktbl extends SugarRecord<Tasktbl>{
    public String task;         /* Columns of our Tasktbl Table*/
    public int priority;
    public long date;
    public int status;

    public Tasktbl() {
    }

    public Tasktbl(String task, int priority, long dateTime, int status) {
        this.task = task;
        this.priority = priority;
        this.date = dateTime;
        this.status = status;
    }
}

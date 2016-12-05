package org.dashboard.domain;

import java.util.UUID;
import java.util.Random;

/**
 * Created by thinklenovo on 12/4/2016.
 */
public class record {
    private long sequence;
    private String id;

    private String type;
    private String description;
    private float value;

    public record(long seq){

        Random rand = new Random();
        sequence = seq;

        id = UUID.randomUUID().toString();

        type = new String("benchmark");
        description = type;
        value = rand.nextFloat();
    }

    public record(long seq, String identity, String category, String desc, float val){

        sequence = seq;
        id = identity;
        type = category;
        description = desc;
        value = val;
    }


    public long getSequence() {
        return sequence;
    }

    public void setSequence(long sequence) {
        this.sequence = sequence;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}

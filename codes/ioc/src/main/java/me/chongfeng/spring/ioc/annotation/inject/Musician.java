package me.chongfeng.spring.ioc.annotation.inject;

import me.chongfeng.spring.ioc.annotation.inject.instrument.Instrument;

public class Musician implements Performer {
    private String name;
    private String song;
    private Instrument instrument;

    public Musician() {}

    public void perform() throws Exception {
        System.out.println(String.format("%s弹奏%s", name, song));
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}

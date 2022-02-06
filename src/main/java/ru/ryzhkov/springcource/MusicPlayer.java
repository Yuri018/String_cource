package ru.ryzhkov.springcource;

public class MusicPlayer {
    private Music music;

    // IoC используем Инверсию управления
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic () {
        System.out.println("Playing: " + music.getSong());
    }
}

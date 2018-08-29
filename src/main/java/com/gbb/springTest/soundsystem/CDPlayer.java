package com.gbb.springTest.soundsystem;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
  @Rule
  public final StandardOutputStreamLog log = new StandardOutputStreamLog();
  
  @Autowired
  private MediaPlayer player;
  
  @Test
  public void play() {
    player.play();
  }

}

package sample;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;

/**
 * Created by admin on 7/22/2016.
 */

//coz borderpane has regions
public class Player extends BorderPane {
    Media media;
    MediaPlayer player;
    MediaView view;
    Pane mpane;
    MediaBar bar;

    public Player(String file){
        media = new Media(file);
        player = new MediaPlayer(media);
        player.setAutoPlay(true);
        view = new MediaView(player);
        //player.setAutoPlay(true);
        view.setMediaPlayer(player);
        //player.play();
        mpane = new Pane();
        mpane.getChildren().add(view);

        setCenter(mpane);

        bar = new MediaBar(player);
        setBottom(bar);

        setStyle("-fx-background-color: #909398");
        player.play();
    }
}

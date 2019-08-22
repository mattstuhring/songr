package com.mattstuhring.songr.controllers;

import com.mattstuhring.songr.models.Album;
import com.mattstuhring.songr.models.AlbumRepository;
import com.mattstuhring.songr.models.Song;
import com.mattstuhring.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

//    @GetMapping("/songs/${id}")
//    public String getSongById(@PathVariable long id, Model m) {
//        Song s = songRepository.findById(id).get();
//        m.addAttribute("song", s);
//        return "song";
//    }

    @GetMapping("/songs")
    public String getAllSongs(Model m) {
        List<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "allSongs";
    }

    @PostMapping("/songs")
    public RedirectView addSong(String title, int length, int trackNumber, String album) {
        Album a = albumRepository.findByTitle(album);

        if (a != null) {
            Song m = new Song(title, length, trackNumber, a);
            songRepository.save(m);
        }

        return new RedirectView("/songs");
    }
}

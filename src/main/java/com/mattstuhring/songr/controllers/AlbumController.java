package com.mattstuhring.songr.controllers;

import com.mattstuhring.songr.models.Album;
import com.mattstuhring.songr.models.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String getAllAlbums(Model m) {
        List<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "allAlbums";
    }

    @PostMapping("/albums")
    public RedirectView addMovie(String title, String artist, int songCount, int length, String imageUrl) {
        Album m = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(m);
        return new RedirectView("/albums");
    }
}

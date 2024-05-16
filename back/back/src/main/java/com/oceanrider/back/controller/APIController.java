package com.oceanrider.back.controller;

import com.oceanrider.back.dto.FieldDTO;
import com.oceanrider.back.dto.PhotoDTO;
import com.oceanrider.back.dto.RecordsDTO;
import com.oceanrider.back.dto.ResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class APIController {

    @GetMapping("/spots")
    public ResponseDTO getRecords(){
        List<RecordsDTO> records = new ArrayList<>();

        // Premier enregistrement simulé
        FieldDTO field1 = new FieldDTO();
        PhotoDTO photoField1 = new PhotoDTO();
        field1.setInfluencers(Arrays.asList("recZL2HGx9jOB4RjE", "recKsS20suIqPhxrt", "rec8QMOQSb16PUhAO"));
        field1.setPeakSurfSeasonEnds("2024-09-01");
        field1.setDifficultyLevel(3);
        field1.setDestination("The Bubble");
        field1.setGeocode("eyJpIjoiVGhlIEJ1YmJsZSwgRnVlcnRldmVudHVyYSwgQ2FuYXJ5IElzbGFuZHMiLCJvIjp7InN0YXR1cyI6Ik9LIiwiZm9ybWF0dGVkQWRkcmVzcyI6IjM1NjUwIExhIE9saXZhLCBMYXMgUGFsbWFzLCBTcGFpbiIsImxhdCI6MjguNzQ0OTA5MSwibG5nIjotMTMuOTQyMjc3OTk5OTk5OTg4fSwiZSI6MTUzNTMwNzAyMzk0N30=");
        field1.setSurfBreak(List.of("Reef Break"));
        field1.setMagicSeaweedLink("https://magicseaweed.com/Canary-Islands-Surf-Forecast/5/");
        field1.setPeakSurfSeasonBegins("2024-06-01");
        field1.setDestinationStateCountry("Fuerteventura, Canary Islands");
        field1.setAddress("The Bubble, Fuerteventura, Canary Islands");
        photoField1.setUrl("https://random.imagecdn.app/500/150");

        // Deuxième enregistrement simulé
        FieldDTO field2 = new FieldDTO();
        PhotoDTO photoField2 = new PhotoDTO();
        field2.setInfluencers(List.of("rec8QMOQSb16PUhAO"));
        field2.setPeakSurfSeasonEnds("2024-01-31");
        field2.setDifficultyLevel(2);
        field2.setDestination("Manu Bay");
        field2.setGeocode("eyJpIjoiTWFudSBCYXksIFJhZ2xhbiwgTmV3IFplYWxhbmQiLCJvIjp7InN0YXR1cyI6Ik9LIiwiZm9ybWF0dGVkQWRkcmVzcyI6Ik1hbnUgQmF5IFJkLCBSYWdsYW4gMzI5NywgTmV3IFplYWxhbmQiLCJsYXQiOi0zNy44MjE0NTkyLCJsbmciOjE3NC44MTIyMTYxOTk5OTk5N30sImUiOjE1MzUzMDcwMjYwNTJ9");
        field2.setSurfBreak(List.of("Point Break"));
        field2.setMagicSeaweedLink("https://magicseaweed.com/Raglan-Surf-Report/91/");
        field2.setPeakSurfSeasonBegins("2023-12-01");
        field2.setDestinationStateCountry("Raglan, New Zealand");
        field2.setAddress("Manu Bay, Raglan, New Zealand");
        photoField2.setUrl("https://random.imagecdn.app/500/150");

        // Création des RecordDTOs avec les FieldDTOs correspondants
        RecordsDTO record1 = new RecordsDTO("recDXE94mDyZRgXzZ", "2018-06-26T16:45:15.000Z", field1);
        RecordsDTO record2 = new RecordsDTO("recMjHQThfVYszJnp", "2018-06-26T16:51:23.000Z", field2);

        // Ajout des RecordDTOs à la liste
        records.add(record1);
        records.add(record2);

        // Création de la réponse
        return new ResponseDTO(records);
    }


}

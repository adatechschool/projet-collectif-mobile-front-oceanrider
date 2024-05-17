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
import java.util.Map;

@RestController
@RequestMapping("/api")
public class APIController {

    @GetMapping("/spots")
    public ResponseDTO getRecords(){
        List<RecordsDTO> records = new ArrayList<>();

        // Premier enregistrement simulé
        FieldDTO field1 = new FieldDTO();
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

        PhotoDTO photo1 = new PhotoDTO();
        photo1.setId("attTeLkqASgRZ5myv");
        photo1.setWidth(3992);
        photo1.setHeight(2992);
        photo1.setUrl("https://v5.airtableusercontent.com/v3/u/29/29/1715940000000/4xMn5gn_gnC4onkiRysuRw/1tB5TH1TSGIKB9iYZXb9O7ABrFgoc54uw3vCXV7_jSTDVQn_ozuJm0exmn9oj9IvBcfCIUvoLt7GByxeplBBGUQa79Rp0lzPkWXUh-aM5-d68FGAOCYqW-CXXT19TWVo/O_UkxMUKCCYLz7m0_QX8rUh3BOZFr67utRcemv7oRHM");
        photo1.setFilename("josh-withers-636290-unsplash.jpg");
        photo1.setSize(5985241);
        photo1.setType("image/jpeg");
        Map<String, PhotoDTO.Thumbnail> thumbnails = Map.of(
                "small", new PhotoDTO.Thumbnail("https://v5.airtableusercontent.com/v3/u/29/29/1715940000000/kns9i1zm3btUPF1LZeMVnQ/Mfieud6HUgnvAVOykqB4RfWdh6JsRYHDL_39OeZsk5Ooa3WeQ1SbLI0j0zdbqgvMS0jnfPYX23CStvl9Y5KeQ-Fn9D-XoTN9aFzSFiB8uTzXbesDu61Dh9t_cW9WVlNU/4Y7Xr3FS4b9cckXm7w4l4CKFR_ifyyLsRcjeZ6ibkEA", 48, 36),
                "large", new PhotoDTO.Thumbnail("https://v5.airtableusercontent.com/v3/u/29/29/1715940000000/ht_htjqI2fgJmtBNtTxhpQ/jlW-DtC5XAApnQNVRhJwSDWrB-H1Ax0hGT1mgRaa9wgT3tDBWOIYhMPpz-NAlvDpLD8b_PattJiQPhBtUkx6jJ9a0draxtJ4948Dwa-Wu6OjKjQG-1Kvre3rERIQFkEM/CMcsLZZar_dStkoXfGCj_GlC4WrZ3TZKDtBq9HtG9Qk", 683, 512),
                "full", new PhotoDTO.Thumbnail("https://v5.airtableusercontent.com/v3/u/29/29/1715940000000/yCieAwL38ph2FmbEAXMQ6Q/EzVJuITmIoyUYod_VTigRjX_uvHi30NY0Tx7ZFTn9iMcJzdKZVbyxgh0snRf6g63Gj_KkuchwZw9YsZxhdfm0h12t8aFO6BVU3bFCBqN0AhW-iIp3RuxEPr239xrtjx-/zgn7rveD9B35hx3-6pQD6ENyv5okaoqhxXNas4vZXWw", 3000, 2249)
        );
        photo1.setThumbnails(thumbnails);

        field1.setPhotos(List.of(photo1));


        // Deuxième enregistrement simulé
        FieldDTO field2 = new FieldDTO();
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
        PhotoDTO photo2 = new PhotoDTO();
        photo2.setId("attNYlgkGdhX0OpwM");
        photo2.setWidth(2614);
        photo2.setHeight(2268);
        photo2.setUrl("https://v5.airtableusercontent.com/v3/u/29/29/1715940000000/Yo23O88M0gOiR46IYc2gRA/9ml3zb0gqH0xNxQwYb3vmzb2KUNQR7t_sfU_F_hjyIYAihUtIdTTwFTIjo-ak1k-wCelnql3U7BII5Emh65kyZ_LAa343g4GArRHthPDH-F3vDru57JTxShcTwMftwFw/xE39EjqtTvMk7yRW_UaLx8tKtbqc8x13gQMjKOG7ZVQ");
        photo2.setFilename("holger-link-707884-unsplash.jpg");
        photo2.setSize(889937);
        photo2.setType("image2/jpeg");
        Map<String, PhotoDTO.Thumbnail> thumbnails2 = Map.of(
                "small", new PhotoDTO.Thumbnail("https://v5.airtableusercontent.com/v3/u/29/29/1715940000000/D2tAzJAf0c0gFCZv-wANhA/Z4lNYcatXAErbj1E58Czqhec5xW0DoPUq5_z2Zla3-EbYoIb3UWAce7k8t67P-Sxf8jneXB3hbsp3u1Eze6oxcAwA-m0UfzBh9CpXlzcGNQbomfeu1sA28YmQ0R31ZIC/w0nD2sfrtnF1Woumof5YQRd1TOqlmuqyZbsmSxYC1hM", 41, 36),
                "large", new PhotoDTO.Thumbnail( "https://v5.airtableusercontent.com/v3/u/29/29/1715940000000/hY5yP18vCA3-SN9VVMzSCQ/sxc-m8_aH_lSffa9ZgJ6-4N1oXQRkt2NvINWr77Mt89hlJmwvhe3Phj9-CfnqKDcOXLWfNR1QnxetRzT0bL_LspxhONwRwijcPIqzqTCeEJQBk8JexCw6aEmu7arr5H4/l-4tLm9SsaaJaZ29g6w-iioUJ8rrc1WA0Tt8rg75E8A", 590, 512),
                "full", new PhotoDTO.Thumbnail("https://v5.airtableusercontent.com/v3/u/29/29/1715940000000/qdmv-eN0UfoxJZyNeTciUw/KNPNvCxhfa2XVJh5Ds55wsx1rrQxdGxq4cnvpzV6gzofrlWhVtfgcvMeZoG40utK5vbCN39MmrTpY46iWETlzcGV2ocKEVfurrHpA-9wsy1RjZCnTIK5WqN2erszgwEy/yMu3nQ0LWnGT2LxN1-KjDYPvoXV_Ja2XvK6BjRfZMJg", 2614, 2249)
        );
        photo2.setThumbnails(thumbnails2);
        field2.setPhotos(List.of(photo2));


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

package com.module.example.controller;

import com.module.example.connection.GiftCertificate;
import com.module.example.connection.GiftCertificateDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cer")
public class CertificateController {
    private final GiftCertificateDao giftCertificatesService;

    public CertificateController(GiftCertificateDao giftCertificatesService) {
        this.giftCertificatesService = giftCertificatesService;
    }
    @GetMapping
    public List<GiftCertificate> get(){
        return giftCertificatesService.getAll();
    }

    @GetMapping(value = "/{id}")
    public GiftCertificate findById(@PathVariable int id) {
        return (GiftCertificate) giftCertificatesService.findById(id);
    }

}

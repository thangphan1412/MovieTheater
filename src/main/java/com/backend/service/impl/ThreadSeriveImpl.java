//package com.backend.service.impl;
//
//import com.backend.dto.Theater.TheaterRequest;
//import com.backend.entity.Theater;
//import com.backend.reponsitory.ThreatRespository;
//import com.backend.service.ThreadService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Optional;
//
//@Component
//public class ThreadSeriveImpl implements ThreadService {
//    @Autowired
//    private ThreatRespository threatRespository;
//    @Override
//    public List<Theater> getAllThreater() {
//        return threatRespository.findAll();
//    }
//
//
//
//    @Override
//    public Optional<Theater> getTheater(Long id) {
//        return threatRespository.findById(id);
//    }
//
//    @Override
//    public Theater create(TheaterRequest request) {
//        return null;
//    }
//}

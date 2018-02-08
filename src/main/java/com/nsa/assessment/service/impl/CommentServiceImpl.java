package com.nsa.assessment.service.impl;

import com.nsa.assessment.dao.CommentDAO;
import com.nsa.assessment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDAO commentDAO;
}

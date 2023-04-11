package com.hmis.service;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.hmis.domain.IdSequence;

@Service
public class NextSeqService {

	@Autowired
	MongoOperations mongoOperations;
	
    public int getNextSequence(String seqName)
    {
	   
	   IdSequence counter = mongoOperations.findAndModify(
            query(where("_id").is(seqName)),
            new Update().inc("seq",1),
            options().returnNew(true).upsert(true),
            IdSequence.class);
        return counter.getSeq();
    }
	   
}
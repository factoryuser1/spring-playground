package com.spring.playground;

import org.springframework.stereotype.Service;

@Service
public class CrewMemberService {

    String getSortedString(boolean sort){
        return sort
                ? "This is a list of the crewmembers sorted alphabetically"
                : "This is a list of the crewmembers unsorted";
    }

    String getMemberInfoFromId(String id){
        if(id.matches("\\d+")) {
            return "This is the record for crewmember " + id;
        } else {
            return "Please access a valid crewmember's id";
        }
    }

    String getMemberInfoFromBody(String name, int id){

        return String.format("%s has been added to the list of crewmembers with an id of %d", name, id);
    }
}


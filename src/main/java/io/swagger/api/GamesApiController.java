package io.swagger.api;

import io.swagger.model.GameSessionConfigRequest;
import io.swagger.model.GameSessionConfigResponse;
import io.swagger.model.GameSessionUpdateRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-13T13:11:45.557Z")

@Controller
public class GamesApiController implements GamesApi {

    private static final Logger log = LoggerFactory.getLogger(GamesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GamesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GameSessionConfigResponse> getGameSession(@ApiParam(value = "",required=true) @PathVariable("session_id") String sessionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GameSessionConfigResponse>(objectMapper.readValue("{  \"board\" : [ {    \"score\" : 8,    \"created\" : \"\",    \"session_id\" : \"session_id\",    \"modified\" : \"\",    \"board\" : {      \"number_of_mines\" : 8,      \"num_rows\" : 8,      \"num_cols\" : 8,      \"items\" : [ [ \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\" ], [ \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\" ] ]    },    \"status\" : { }  }, {    \"score\" : 8,    \"created\" : \"\",    \"session_id\" : \"session_id\",    \"modified\" : \"\",    \"board\" : {      \"number_of_mines\" : 8,      \"num_rows\" : 8,      \"num_cols\" : 8,      \"items\" : [ [ \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\" ], [ \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\" ] ]    },    \"status\" : { }  } ]}", GameSessionConfigResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GameSessionConfigResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GameSessionConfigResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GameSessionConfigResponse> startNewGameSession(@ApiParam(value = "Game session configuration to be created" ,required=true )  @Valid @RequestBody GameSessionConfigRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GameSessionConfigResponse>(objectMapper.readValue("{  \"board\" : [ {    \"score\" : 8,    \"created\" : \"\",    \"session_id\" : \"session_id\",    \"modified\" : \"\",    \"board\" : {      \"number_of_mines\" : 8,      \"num_rows\" : 8,      \"num_cols\" : 8,      \"items\" : [ [ \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\" ], [ \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\" ] ]    },    \"status\" : { }  }, {    \"score\" : 8,    \"created\" : \"\",    \"session_id\" : \"session_id\",    \"modified\" : \"\",    \"board\" : {      \"number_of_mines\" : 8,      \"num_rows\" : 8,      \"num_cols\" : 8,      \"items\" : [ [ \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\" ], [ \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\" ] ]    },    \"status\" : { }  } ]}", GameSessionConfigResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GameSessionConfigResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GameSessionConfigResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GameSessionConfigResponse> update(@ApiParam(value = "",required=true) @PathVariable("session_id") String sessionId,@ApiParam(value = "Game session updated" ,required=true )  @Valid @RequestBody GameSessionUpdateRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GameSessionConfigResponse>(objectMapper.readValue("{  \"board\" : [ {    \"score\" : 8,    \"created\" : \"\",    \"session_id\" : \"session_id\",    \"modified\" : \"\",    \"board\" : {      \"number_of_mines\" : 8,      \"num_rows\" : 8,      \"num_cols\" : 8,      \"items\" : [ [ \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\" ], [ \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\" ] ]    },    \"status\" : { }  }, {    \"score\" : 8,    \"created\" : \"\",    \"session_id\" : \"session_id\",    \"modified\" : \"\",    \"board\" : {      \"number_of_mines\" : 8,      \"num_rows\" : 8,      \"num_cols\" : 8,      \"items\" : [ [ \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\" ], [ \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"\" ] ]    },    \"status\" : { }  } ]}", GameSessionConfigResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GameSessionConfigResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GameSessionConfigResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.GameBoard;
import io.swagger.model.GameStatus;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GameBoardData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-13T13:11:45.557Z")

public class GameBoardData   {
  @JsonProperty("session_id")
  private String sessionId = null;

  @JsonProperty("status")
  private GameStatus status = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("modified")
  private OffsetDateTime modified = null;

  @JsonProperty("board")
  private GameBoard board = null;

  @JsonProperty("score")
  private Integer score = null;

  public GameBoardData sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * The game session ID. 
   * @return sessionId
  **/
  @ApiModelProperty(value = "The game session ID. ")


  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public GameBoardData status(GameStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GameStatus getStatus() {
    return status;
  }

  public void setStatus(GameStatus status) {
    this.status = status;
  }

  public GameBoardData created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The game session created datetime 
   * @return created
  **/
  @ApiModelProperty(example = "", value = "The game session created datetime ")

  @Valid

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public GameBoardData modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * The game session last modified datetime 
   * @return modified
  **/
  @ApiModelProperty(example = "", value = "The game session last modified datetime ")

  @Valid

  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public GameBoardData board(GameBoard board) {
    this.board = board;
    return this;
  }

  /**
   * Get board
   * @return board
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GameBoard getBoard() {
    return board;
  }

  public void setBoard(GameBoard board) {
    this.board = board;
  }

  public GameBoardData score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(example = "8", value = "")


  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameBoardData gameBoardData = (GameBoardData) o;
    return Objects.equals(this.sessionId, gameBoardData.sessionId) &&
        Objects.equals(this.status, gameBoardData.status) &&
        Objects.equals(this.created, gameBoardData.created) &&
        Objects.equals(this.modified, gameBoardData.modified) &&
        Objects.equals(this.board, gameBoardData.board) &&
        Objects.equals(this.score, gameBoardData.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, status, created, modified, board, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameBoardData {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    board: ").append(toIndentedString(board)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


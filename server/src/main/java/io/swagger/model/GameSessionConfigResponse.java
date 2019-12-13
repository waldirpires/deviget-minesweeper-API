package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.GameBoardData;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GameSessionConfigResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-13T13:11:45.557Z")

public class GameSessionConfigResponse   {
  @JsonProperty("board")
  @Valid
  private List<GameBoardData> board = null;

  public GameSessionConfigResponse board(List<GameBoardData> board) {
    this.board = board;
    return this;
  }

  public GameSessionConfigResponse addBoardItem(GameBoardData boardItem) {
    if (this.board == null) {
      this.board = new ArrayList<GameBoardData>();
    }
    this.board.add(boardItem);
    return this;
  }

  /**
   * Get board
   * @return board
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<GameBoardData> getBoard() {
    return board;
  }

  public void setBoard(List<GameBoardData> board) {
    this.board = board;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameSessionConfigResponse gameSessionConfigResponse = (GameSessionConfigResponse) o;
    return Objects.equals(this.board, gameSessionConfigResponse.board);
  }

  @Override
  public int hashCode() {
    return Objects.hash(board);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameSessionConfigResponse {\n");
    
    sb.append("    board: ").append(toIndentedString(board)).append("\n");
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


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GameSessionConfigRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-13T13:11:45.557Z")

public class GameSessionConfigRequest   {
  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("num_of_mines")
  private Integer numOfMines = null;

  public GameSessionConfigRequest size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * This attribute provides the size of the board.  Examples:  - ( 8) Easy: 8x8 - (16) Medium: 16x16 - (24) Difficult: 24x24 
   * @return size
  **/
  @ApiModelProperty(example = "8", value = "This attribute provides the size of the board.  Examples:  - ( 8) Easy: 8x8 - (16) Medium: 16x16 - (24) Difficult: 24x24 ")


  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public GameSessionConfigRequest numOfMines(Integer numOfMines) {
    this.numOfMines = numOfMines;
    return this;
  }

  /**
   * This attribute provides the number of mines on the board. 
   * @return numOfMines
  **/
  @ApiModelProperty(example = "10", value = "This attribute provides the number of mines on the board. ")


  public Integer getNumOfMines() {
    return numOfMines;
  }

  public void setNumOfMines(Integer numOfMines) {
    this.numOfMines = numOfMines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameSessionConfigRequest gameSessionConfigRequest = (GameSessionConfigRequest) o;
    return Objects.equals(this.size, gameSessionConfigRequest.size) &&
        Objects.equals(this.numOfMines, gameSessionConfigRequest.numOfMines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, numOfMines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameSessionConfigRequest {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    numOfMines: ").append(toIndentedString(numOfMines)).append("\n");
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


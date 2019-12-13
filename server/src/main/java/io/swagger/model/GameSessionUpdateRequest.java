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
 * GameSessionUpdateRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-13T13:11:45.557Z")

public class GameSessionUpdateRequest   {
  @JsonProperty("row")
  private Integer row = null;

  @JsonProperty("col")
  private Integer col = null;

  @JsonProperty("flag")
  private String flag = null;

  public GameSessionUpdateRequest row(Integer row) {
    this.row = row;
    return this;
  }

  /**
   * Get row
   * @return row
  **/
  @ApiModelProperty(example = "8", value = "")


  public Integer getRow() {
    return row;
  }

  public void setRow(Integer row) {
    this.row = row;
  }

  public GameSessionUpdateRequest col(Integer col) {
    this.col = col;
    return this;
  }

  /**
   * Get col
   * @return col
  **/
  @ApiModelProperty(example = "8", value = "")


  public Integer getCol() {
    return col;
  }

  public void setCol(Integer col) {
    this.col = col;
  }

  public GameSessionUpdateRequest flag(String flag) {
    this.flag = flag;
    return this;
  }

  /**
   * Ability to 'flag' a cell with a question mark or red flag 
   * @return flag
  **/
  @ApiModelProperty(value = "Ability to 'flag' a cell with a question mark or red flag ")


  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameSessionUpdateRequest gameSessionUpdateRequest = (GameSessionUpdateRequest) o;
    return Objects.equals(this.row, gameSessionUpdateRequest.row) &&
        Objects.equals(this.col, gameSessionUpdateRequest.col) &&
        Objects.equals(this.flag, gameSessionUpdateRequest.flag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(row, col, flag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameSessionUpdateRequest {\n");
    
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    col: ").append(toIndentedString(col)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
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


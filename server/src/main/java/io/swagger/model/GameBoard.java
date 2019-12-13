package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GameBoard
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-13T13:11:45.557Z")

public class GameBoard   {
  @JsonProperty("items")
  @Valid
  private List<List<String>> items = null;

  @JsonProperty("num_rows")
  private Integer numRows = null;

  @JsonProperty("num_cols")
  private Integer numCols = null;

  @JsonProperty("number_of_mines")
  private Integer numberOfMines = null;

  public GameBoard items(List<List<String>> items) {
    this.items = items;
    return this;
  }

  public GameBoard addItemsItem(List<String> itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<List<String>>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<List<String>> getItems() {
    return items;
  }

  public void setItems(List<List<String>> items) {
    this.items = items;
  }

  public GameBoard numRows(Integer numRows) {
    this.numRows = numRows;
    return this;
  }

  /**
   * Get numRows
   * @return numRows
  **/
  @ApiModelProperty(example = "8", value = "")


  public Integer getNumRows() {
    return numRows;
  }

  public void setNumRows(Integer numRows) {
    this.numRows = numRows;
  }

  public GameBoard numCols(Integer numCols) {
    this.numCols = numCols;
    return this;
  }

  /**
   * Get numCols
   * @return numCols
  **/
  @ApiModelProperty(example = "8", value = "")


  public Integer getNumCols() {
    return numCols;
  }

  public void setNumCols(Integer numCols) {
    this.numCols = numCols;
  }

  public GameBoard numberOfMines(Integer numberOfMines) {
    this.numberOfMines = numberOfMines;
    return this;
  }

  /**
   * This attribute provides the number of mines that exist in the current  board. 
   * @return numberOfMines
  **/
  @ApiModelProperty(example = "8", value = "This attribute provides the number of mines that exist in the current  board. ")


  public Integer getNumberOfMines() {
    return numberOfMines;
  }

  public void setNumberOfMines(Integer numberOfMines) {
    this.numberOfMines = numberOfMines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameBoard gameBoard = (GameBoard) o;
    return Objects.equals(this.items, gameBoard.items) &&
        Objects.equals(this.numRows, gameBoard.numRows) &&
        Objects.equals(this.numCols, gameBoard.numCols) &&
        Objects.equals(this.numberOfMines, gameBoard.numberOfMines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, numRows, numCols, numberOfMines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameBoard {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    numRows: ").append(toIndentedString(numRows)).append("\n");
    sb.append("    numCols: ").append(toIndentedString(numCols)).append("\n");
    sb.append("    numberOfMines: ").append(toIndentedString(numberOfMines)).append("\n");
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


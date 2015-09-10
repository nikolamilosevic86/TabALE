package ScientificDocumentClasses;

import java.util.LinkedList;

public class Cell {
	private String ID;
	private String Content;
	private String CellType;
	public LinkedList<String> Roles;
	private int RowNumber;
	private int ColumnNumber;
	private Cell HeaderRef;
	private Cell StubRef;
	private Cell SuperRowRef;
	private Cell HeadStubRef;
	public LinkedList<InputAnnotation> annotations;
	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return Content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		Content = content;
	}
	/**
	 * @return the cellType
	 */
	public String getCellType() {
		return CellType;
	}
	/**
	 * @param cellType the cellType to set
	 */
	public void setCellType(String cellType) {
		CellType = cellType;
	}
	/**
	 * @return the rowNumber
	 */
	public int getRowNumber() {
		return RowNumber;
	}
	/**
	 * @param rowNumber the rowNumber to set
	 */
	public void setRowNumber(int rowNumber) {
		RowNumber = rowNumber;
	}
	/**
	 * @return the columnNumber
	 */
	public int getColumnNumber() {
		return ColumnNumber;
	}
	/**
	 * @param columnNumber the columnNumber to set
	 */
	public void setColumnNumber(int columnNumber) {
		ColumnNumber = columnNumber;
	}
	/**
	 * @return the headerRef
	 */
	public Cell getHeaderRef() {
		return HeaderRef;
	}
	/**
	 * @param headerRef the headerRef to set
	 */
	public void setHeaderRef(Cell headerRef) {
		HeaderRef = headerRef;
	}
	/**
	 * @return the stubRef
	 */
	public Cell getStubRef() {
		return StubRef;
	}
	/**
	 * @param stubRef the stubRef to set
	 */
	public void setStubRef(Cell stubRef) {
		StubRef = stubRef;
	}
	/**
	 * @return the superRowRef
	 */
	public Cell getSuperRowRef() {
		return SuperRowRef;
	}
	/**
	 * @param superRowRef the superRowRef to set
	 */
	public void setSuperRowRef(Cell superRowRef) {
		SuperRowRef = superRowRef;
	}
	/**
	 * @return the headStubRef
	 */
	public Cell getHeadStubRef() {
		return HeadStubRef;
	}
	/**
	 * @param headStubRef the headStubRef to set
	 */
	public void setHeadStubRef(Cell headStubRef) {
		HeadStubRef = headStubRef;
	}

}

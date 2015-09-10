package ScientificDocumentClasses;

import java.util.LinkedList;

public class Table {
	private String TableOrder;
	private int TableNum;
	private String Caption;
	private String Footer;
	public LinkedList<Cell> Cells;
	private String StructureType;
	private String PragmaticType;
	private boolean hasXML;
	/**
	 * @return the tableOrder
	 */
	public String getTableOrder() {
		return TableOrder;
	}
	/**
	 * @param tableOrder the tableOrder to set
	 */
	public void setTableOrder(String tableOrder) {
		TableOrder = tableOrder;
	}
	/**
	 * @return the tableNum
	 */
	public int getTableNum() {
		return TableNum;
	}
	/**
	 * @param tableNum the tableNum to set
	 */
	public void setTableNum(int tableNum) {
		TableNum = tableNum;
	}
	/**
	 * @return the caption
	 */
	public String getCaption() {
		return Caption;
	}
	/**
	 * @param caption the caption to set
	 */
	public void setCaption(String caption) {
		Caption = caption;
	}
	/**
	 * @return the footer
	 */
	public String getFooter() {
		return Footer;
	}
	/**
	 * @param footer the footer to set
	 */
	public void setFooter(String footer) {
		Footer = footer;
	}
	/**
	 * @return the structureType
	 */
	public String getStructureType() {
		return StructureType;
	}
	/**
	 * @param structureType the structureType to set
	 */
	public void setStructureType(String structureType) {
		StructureType = structureType;
	}
	/**
	 * @return the pragmaticType
	 */
	public String getPragmaticType() {
		return PragmaticType;
	}
	/**
	 * @param pragmaticType the pragmaticType to set
	 */
	public void setPragmaticType(String pragmaticType) {
		PragmaticType = pragmaticType;
	}
	/**
	 * @return the hasXML
	 */
	public boolean isHasXML() {
		return hasXML;
	}
	/**
	 * @param hasXML the hasXML to set
	 */
	public void setHasXML(boolean hasXML) {
		this.hasXML = hasXML;
	}
	
	

}

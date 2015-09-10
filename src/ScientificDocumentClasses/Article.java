package ScientificDocumentClasses;

import java.util.LinkedList;

public class Article {
	private String PMID;
	private String PMCID;
	private String pissn;
	private String eissn;
	private String PaperTitle;
	public Author authors;
	public LinkedList<String> KeyWords;
	private Journal journal;
	private String ArticleAbstract;
	public LinkedList<Table> tables;
	/**
	 * @return the pMID
	 */
	public String getPMID() {
		return PMID;
	}
	/**
	 * @param pMID the pMID to set
	 */
	public void setPMID(String pMID) {
		PMID = pMID;
	}
	/**
	 * @return the pMCID
	 */
	public String getPMCID() {
		return PMCID;
	}
	/**
	 * @param pMCID the pMCID to set
	 */
	public void setPMCID(String pMCID) {
		PMCID = pMCID;
	}
	/**
	 * @return the pissn
	 */
	public String getPissn() {
		return pissn;
	}
	/**
	 * @param pissn the pissn to set
	 */
	public void setPissn(String pissn) {
		this.pissn = pissn;
	}
	/**
	 * @return the eissn
	 */
	public String getEissn() {
		return eissn;
	}
	/**
	 * @param eissn the eissn to set
	 */
	public void setEissn(String eissn) {
		this.eissn = eissn;
	}
	/**
	 * @return the paperTitle
	 */
	public String getPaperTitle() {
		return PaperTitle;
	}
	/**
	 * @param paperTitle the paperTitle to set
	 */
	public void setPaperTitle(String paperTitle) {
		PaperTitle = paperTitle;
	}
	/**
	 * @return the articleAbstract
	 */
	public String getArticleAbstract() {
		return ArticleAbstract;
	}
	/**
	 * @param articleAbstract the articleAbstract to set
	 */
	public void setArticleAbstract(String articleAbstract) {
		ArticleAbstract = articleAbstract;
	}
	/**
	 * @return the journal
	 */
	public Journal getJournal() {
		return journal;
	}
	/**
	 * @param journal the journal to set
	 */
	public void setJournal(Journal journal) {
		this.journal = journal;
	}
	

}

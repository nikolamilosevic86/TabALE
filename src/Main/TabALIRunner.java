/**
 * 
 */
package Main;

import ScientificDocumentClasses.Article;
import AnnotationReader.AnnotationReader;

/**
 * @author mbaxkhm4
 *
 */
public class TabALIRunner {
	public static Article currentArticle;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TabALI says hi and I love you");
		AnnotationReader r = new AnnotationReader();
		r.readAnnotation("AnnotatedSamples//17815.xml");

	}

}

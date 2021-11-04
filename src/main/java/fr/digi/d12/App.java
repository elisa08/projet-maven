package fr.digi.d12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{	private static final Logger LOG = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
    	String asciiArt = FigletFont.convertOneLine("hello");
    	System.out.println(asciiArt);
        LOG.info("Hello World!");
    }
}

package com.yworks.logging;

/**
 * The type Console logger.
 *
 * @author Michael Schroeder, yWorks GmbH http://www.yworks.com
 */
public class ConsoleLogger extends Logger {

    /**
     * Instantiates a new Console logger.
     */
    public ConsoleLogger() {
    register();
  }

  public void doLog( final String s ) {
    //System.out.println( s );
  }

  public void doErr( final String s ) {
    System.err.println( s );
  }

  public void doWarn( final String s ) {
    System.out.println( s );
  }

  public void doWarnToLog( String s ) {
  }

  public void doShrinkLog( String s ) {
    System.out.println( s );
  }

  public void doErr( String s, Throwable ex ) {
    System.out.println( s );
    ex.printStackTrace();
  }

  public void close() {
    unregister();
  }
}

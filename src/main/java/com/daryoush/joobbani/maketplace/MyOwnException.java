package com.daryoush.joobbani.maketplace;

public class MyOwnException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyOwnException () {

    }

    public MyOwnException (String message) {
        System.out.println(message);
    }

    public MyOwnException (Throwable cause) {
        super (cause);
    }

    public MyOwnException (String message, Throwable cause) {
        super (message, cause);
    }
}

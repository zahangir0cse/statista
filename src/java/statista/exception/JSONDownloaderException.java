/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statista.exception;

public class JSONDownloaderException extends Exception{
    public JSONDownloaderException() {
    }

    public JSONDownloaderException(String message) {
        super(message);
    }

    public JSONDownloaderException(String message, Throwable cause) {
        super(message, cause);
    }

    public JSONDownloaderException(Throwable cause) {
        super(cause);
    }
}
package alpaca.exceptions;

/**
 * Represents an exception when the file is corrupted
 */
public class InvalidFileException extends Exception{
    @Override
    public String toString () {
        return "Baa-baa-baa, file is corrupted\n";
    }
}

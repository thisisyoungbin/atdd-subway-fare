package wooteco.subway.exception;

public class DuplicatedException extends RuntimeException {
    public DuplicatedException(String msg) {
        super(msg);
    }
}

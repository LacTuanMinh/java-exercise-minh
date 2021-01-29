package coaching.validation.validator;

import coaching.validation.Violation;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

/**
 * Validate input data with annotation-based approach
 */
public interface Validator {

    /**
     * Validate data
     *
     * @param data Input data
     * @return HashCollisionExample of violation instances
     */
    Collection<Violation> validate(Object data) throws InvocationTargetException, IllegalAccessException;
}
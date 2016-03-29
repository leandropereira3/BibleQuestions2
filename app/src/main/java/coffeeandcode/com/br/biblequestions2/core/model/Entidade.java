/**
 *
 */
package coffeeandcode.com.br.biblequestions2.core.model;

import android.database.Cursor;

/**
 * @author Leandro
 */
public interface Entidade {

    Integer getId();

    void convertTo(Cursor cursor);
}

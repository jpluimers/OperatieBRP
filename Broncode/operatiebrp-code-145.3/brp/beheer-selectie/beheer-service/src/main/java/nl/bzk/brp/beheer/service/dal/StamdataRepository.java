/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at www.github.com/MinBZK/operatieBRP.
 */

package nl.bzk.brp.beheer.service.dal;

import java.util.Collection;
import nl.bzk.brp.beheer.service.stamdata.StatischeStamdataDTO;

/**
 * Repository voor stamdata.
 */
public interface StamdataRepository {

    /**
     * Haal de statische stamdata van een tabel op.
     * @param tabel de tabel
     * @return de statische stamdata
     */
    Collection<StatischeStamdataDTO> getStatischeStamdata(String tabel);
}

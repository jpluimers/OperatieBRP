/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at www.github.com/MinBZK/operatieBRP.
 */

package nl.bzk.brp.service.algemeen;

import nl.bzk.brp.domain.algemeen.Autorisatiebundel;
import nl.bzk.brp.domain.berichtmodel.VerwerkPersoonBericht;
import nl.bzk.brp.domain.internbericht.verzendingmodel.SynchronisatieBerichtGegevens;

/**
 * SynchronisatieBerichtGegevensFactory.
 */
public interface SynchronisatieBerichtGegevensFactory {
    /**
     * @param bericht bericht
     * @param autorisatiebundel autorisatiebundel
     * @param datumAanvangMaterielePeriode datumAanvangMaterielePeriode
     * @return afnemerBericht
     * @throws StapException stap exception
     */
    SynchronisatieBerichtGegevens maak(VerwerkPersoonBericht bericht, Autorisatiebundel autorisatiebundel,
                                       Integer datumAanvangMaterielePeriode) throws StapException;
}
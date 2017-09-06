package test.artifact;

import java.util.HashMap;
import java.util.Map;

/**

 * Utils for party derived relationships processing

 *

 * @author ukhilekvich

 * @since 6.2

 */


public class PartyDerivedRelationshipsUtils {

 

    private static Map<PartyType, Integer> DEFAULT_SORT_ORDER = new HashMap<PartyType, Integer>();

    static {

        DEFAULT_SORT_ORDER.put(PartyType.PersonParty, 0);

        DEFAULT_SORT_ORDER.put(PartyType.NonPersonParty, 1);

        DEFAULT_SORT_ORDER.put(PartyType.LocationParty, 2);

        DEFAULT_SORT_ORDER.put(PartyType.VehicleParty, 3);

    }

}

 



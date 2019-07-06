/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ISO15022MessageSet of the Data Model iso20022.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package iso20022;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties

* It provides of then following operations (getters and setters)
 */

@Description("industryMessageSet constructed according to the rules defined in ISO 15022-1 and ISO 15022-2 and that is stored in the ISO 15022 Catalogue of Messages")

public interface ISO15022MessageSet extends GenericEntity, iso20022.IndustryMessageSet {

	EntityType<ISO15022MessageSet> T = EntityTypes.T(ISO15022MessageSet.class);

	/* Constants for each property name. */

}

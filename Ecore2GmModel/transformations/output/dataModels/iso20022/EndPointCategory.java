/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EndPointCategory of the Data Model iso20022.
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
{@link endPoints}, 

* It provides of then following operations (getters and setters)
{@link getEndPoints},
{@link setEndPoints},
 */

@Description("Collection of MessageComponents that define the endpoints for a given category.")

public interface EndPointCategory extends GenericEntity, iso20022.TopLevelDictionaryEntry {

	EntityType<EndPointCategory> T = EntityTypes.T(EndPointCategory.class);

	/* Constants for each property name. */
	java.lang.String endPoints = "endPoints";

	@Description("MessageComponents that are considered to be end points.")
	
	java.util.List<iso20022.MessageElementContainer> getEndPoints();
	void setEndPoints(java.util.List<iso20022.MessageElementContainer> endPoints);

}

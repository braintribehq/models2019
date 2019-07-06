/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MultiplicityEntity of the Data Model iso20022.
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
{@link maxOccurs}, 
{@link minOccurs}, 

* It provides of then following operations (getters and setters)
{@link getMaxOccurs},
{@link getMinOccurs},
{@link setMaxOccurs},
{@link setMinOccurs},
 */

@Description("Any model entity where a multiplicity can be defined.")
 
@Abstract 

public interface MultiplicityEntity extends GenericEntity {

	EntityType<MultiplicityEntity> T = EntityTypes.T(MultiplicityEntity.class);

	/* Constants for each property name. */
	java.lang.String maxOccurs = "maxOccurs";
	java.lang.String minOccurs = "minOccurs";

	@Description("MaxOccurs is an integer with a value greater than or equal to the lower limit. If undefined an unlimited upper value is assumed.")
	@Mandatory
	java.lang.Integer getMaxOccurs();
	void setMaxOccurs(java.lang.Integer maxOccurs);
	@Description("MinOccurs is an integer with value greater than or equal to zero. If undefined a value of zero is assumed.")
	@Mandatory
	java.lang.Integer getMinOccurs();
	void setMinOccurs(java.lang.Integer minOccurs);
}

/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPermit of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link PredefinedType}, 
{@link Status}, 
{@link LongDescription}, 

* It provides of then following operations (getters and setters)
{@link getPredefinedType},
{@link getStatus},
{@link getLongDescription},
{@link setPredefinedType},
{@link setStatus},
{@link setLongDescription},
 */

@Description("")

public interface IfcPermit extends GenericEntity, ifc4.IfcControl {

	EntityType<IfcPermit> T = EntityTypes.T(IfcPermit.class);

	/* Constants for each property name. */
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String Status = "Status";
	java.lang.String LongDescription = "LongDescription";

	@Description("")
	@Mandatory
	ifc4.IfcPermitTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcPermitTypeEnum PredefinedType);
	@Description("")
	@Mandatory
	java.lang.String getStatus();
	void setStatus(java.lang.String Status);
	@Description("")
	@Mandatory
	java.lang.String getLongDescription();
	void setLongDescription(java.lang.String LongDescription);
}

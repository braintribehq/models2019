/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTypeProcess of the Data Model iai.
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
{@link Identification}, 
{@link LongDescription}, 
{@link ProcessType}, 
{@link OperatesOn}, 

* It provides of then following operations (getters and setters)
{@link getIdentification},
{@link getLongDescription},
{@link getProcessType},
{@link getOperatesOn},
{@link setIdentification},
{@link setLongDescription},
{@link setProcessType},
{@link setOperatesOn},
 */

@Description("")

public interface IfcTypeProcess extends GenericEntity, ifc4.IfcTypeObject, ifc4.IfcProcessSelect {

	EntityType<IfcTypeProcess> T = EntityTypes.T(IfcTypeProcess.class);

	/* Constants for each property name. */
	java.lang.String Identification = "Identification";
	java.lang.String LongDescription = "LongDescription";
	java.lang.String ProcessType = "ProcessType";
	java.lang.String OperatesOn = "OperatesOn";

	@Description("")
	@Mandatory
	java.lang.String getIdentification();
	void setIdentification(java.lang.String Identification);
	@Description("")
	@Mandatory
	java.lang.String getLongDescription();
	void setLongDescription(java.lang.String LongDescription);
	@Description("")
	@Mandatory
	java.lang.String getProcessType();
	void setProcessType(java.lang.String ProcessType);
	@Description("")
	
	java.util.List<ifc4.IfcRelAssignsToProcess> getOperatesOn();
	void setOperatesOn(java.util.List<ifc4.IfcRelAssignsToProcess> OperatesOn);

}

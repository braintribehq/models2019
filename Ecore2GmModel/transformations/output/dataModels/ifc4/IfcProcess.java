/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcProcess of the Data Model iai.
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
{@link IsPredecessorTo}, 
{@link IsSuccessorFrom}, 
{@link OperatesOn}, 

* It provides of then following operations (getters and setters)
{@link getIdentification},
{@link getLongDescription},
{@link getIsPredecessorTo},
{@link getIsSuccessorFrom},
{@link getOperatesOn},
{@link setIdentification},
{@link setLongDescription},
{@link setIsPredecessorTo},
{@link setIsSuccessorFrom},
{@link setOperatesOn},
 */

@Description("")

public interface IfcProcess extends GenericEntity, ifc4.IfcObject, ifc4.IfcProcessSelect {

	EntityType<IfcProcess> T = EntityTypes.T(IfcProcess.class);

	/* Constants for each property name. */
	java.lang.String Identification = "Identification";
	java.lang.String LongDescription = "LongDescription";
	java.lang.String IsPredecessorTo = "IsPredecessorTo";
	java.lang.String IsSuccessorFrom = "IsSuccessorFrom";
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
	
	java.util.List<ifc4.IfcRelSequence> getIsPredecessorTo();
	void setIsPredecessorTo(java.util.List<ifc4.IfcRelSequence> IsPredecessorTo);

	@Description("")
	
	java.util.List<ifc4.IfcRelSequence> getIsSuccessorFrom();
	void setIsSuccessorFrom(java.util.List<ifc4.IfcRelSequence> IsSuccessorFrom);

	@Description("")
	
	java.util.List<ifc4.IfcRelAssignsToProcess> getOperatesOn();
	void setOperatesOn(java.util.List<ifc4.IfcRelAssignsToProcess> OperatesOn);

}

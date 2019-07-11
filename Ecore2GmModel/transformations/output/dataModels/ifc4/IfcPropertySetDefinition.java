/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPropertySetDefinition of the Data Model iai.
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
{@link DefinesType}, 
{@link IsDefinedBy}, 
{@link DefinesOccurrence}, 

* It provides of then following operations (getters and setters)
{@link getDefinesType},
{@link getIsDefinedBy},
{@link getDefinesOccurrence},
{@link setDefinesType},
{@link setIsDefinedBy},
{@link setDefinesOccurrence},
 */

@Description("")

public interface IfcPropertySetDefinition extends GenericEntity, ifc4.IfcPropertyDefinition, ifc4.IfcPropertySetDefinitionSelect {

	EntityType<IfcPropertySetDefinition> T = EntityTypes.T(IfcPropertySetDefinition.class);

	/* Constants for each property name. */
	java.lang.String DefinesType = "DefinesType";
	java.lang.String IsDefinedBy = "IsDefinedBy";
	java.lang.String DefinesOccurrence = "DefinesOccurrence";

	@Description("")
	
	java.util.List<ifc4.IfcTypeObject> getDefinesType();
	void setDefinesType(java.util.List<ifc4.IfcTypeObject> DefinesType);

	@Description("")
	
	java.util.List<ifc4.IfcRelDefinesByTemplate> getIsDefinedBy();
	void setIsDefinedBy(java.util.List<ifc4.IfcRelDefinesByTemplate> IsDefinedBy);

	@Description("")
	
	java.util.List<ifc4.IfcRelDefinesByProperties> getDefinesOccurrence();
	void setDefinesOccurrence(java.util.List<ifc4.IfcRelDefinesByProperties> DefinesOccurrence);

}

/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTypeObject of the Data Model iai.
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
{@link ApplicableOccurrence}, 
{@link HasPropertySets}, 
{@link Types}, 

* It provides of then following operations (getters and setters)
{@link getApplicableOccurrence},
{@link getHasPropertySets},
{@link getTypes},
{@link setApplicableOccurrence},
{@link setHasPropertySets},
{@link setTypes},
 */

@Description("")

public interface IfcTypeObject extends GenericEntity, ifc4.IfcObjectDefinition {

	EntityType<IfcTypeObject> T = EntityTypes.T(IfcTypeObject.class);

	/* Constants for each property name. */
	java.lang.String ApplicableOccurrence = "ApplicableOccurrence";
	java.lang.String HasPropertySets = "HasPropertySets";
	java.lang.String Types = "Types";

	@Description("")
	@Mandatory
	java.lang.String getApplicableOccurrence();
	void setApplicableOccurrence(java.lang.String ApplicableOccurrence);
	@Description("")
	
	java.util.List<ifc4.IfcPropertySetDefinition> getHasPropertySets();
	void setHasPropertySets(java.util.List<ifc4.IfcPropertySetDefinition> HasPropertySets);

	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcRelDefinesByType> getTypes();
	void setTypes(java.util.List<ifc4.IfcRelDefinesByType> Types);

}

/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcSectionProperties of the Data Model iai.
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
{@link SectionType}, 
{@link StartProfile}, 
{@link EndProfile}, 

* It provides of then following operations (getters and setters)
{@link getSectionType},
{@link getStartProfile},
{@link getEndProfile},
{@link setSectionType},
{@link setStartProfile},
{@link setEndProfile},
 */

@Description("")

public interface IfcSectionProperties extends GenericEntity, ifc4.IfcPreDefinedProperties {

	EntityType<IfcSectionProperties> T = EntityTypes.T(IfcSectionProperties.class);

	/* Constants for each property name. */
	java.lang.String SectionType = "SectionType";
	java.lang.String StartProfile = "StartProfile";
	java.lang.String EndProfile = "EndProfile";

	@Description("")
	@Mandatory
	ifc4.IfcSectionTypeEnum getSectionType();
	void setSectionType(ifc4.IfcSectionTypeEnum SectionType);
	@Description("")
	@Mandatory
	ifc4.IfcProfileDef getStartProfile();
	void setStartProfile(ifc4.IfcProfileDef StartProfile);
	@Description("")
	@Mandatory
	ifc4.IfcProfileDef getEndProfile();
	void setEndProfile(ifc4.IfcProfileDef EndProfile);
}
